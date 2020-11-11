package com.tsobu.ona.core.service.assign


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.assign.AssignFdAcDto
import com.tsobu.ona.core.dto.json.assign.AssignPaAcDto
import com.tsobu.ona.core.dto.json.assign.AssignPaAcPlantLabelingDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.assign.AssignPaAcEntity
import com.tsobu.ona.database.entities.assign.AssignPaAcPlantLabelingEntity
import com.tsobu.ona.database.repositories.assign.AssignPaAcPlantLabelingRepo
import com.tsobu.ona.database.repositories.assign.AssignPaAcRepo
import com.tsobu.ona.forms.assign.AssignPaAcForm
import org.modelmapper.AbstractCondition
import org.modelmapper.Condition
import org.modelmapper.ModelMapper
import org.modelmapper.convention.MatchingStrategies
import org.modelmapper.spi.MappingContext
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.support.TransactionTemplate
import java.io.IOException
import java.nio.file.Paths


@Service
class PaAcAssignService
constructor(
        transactionManager: PlatformTransactionManager,
        val paAcRepo: AssignPaAcRepo,
        val plantLabelingRepo: AssignPaAcPlantLabelingRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(PaAcAssignService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()

    private val fileName = "Assign_PA_AC.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val isStringBlank: Condition<*, *> = object : AbstractCondition<Any?, Any?>() {
            override fun applies(context: MappingContext<Any?, Any?>): Boolean {
                return if (context.source is String) {
                    null != context.source && "" != context.source
                } else {
                    context.source != null
                }
            }
        }

        modelMapper.configuration.propertyCondition = isStringBlank
        modelMapper.configuration.isSkipNullEnabled = true
        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val filePath = "${appConfig.globalProperties().outputPath}"
        val fdAcEntityList = paAcRepo.findAllByOrderBySubmissionDateAsc()
        val plantLabellingEntityList = plantLabelingRepo.findAll()


        val fdAcData = fdAcEntityList.map { assignPaAcEntity ->
            val assignPaAcDto = modelMapper.map(assignPaAcEntity, AssignPaAcDto::class.java)
            assignPaAcDto.submissionDate = myDateUtil.convertTimeToString(assignPaAcEntity.submissionDate)
            assignPaAcDto.start = myDateUtil.convertTimeToString(assignPaAcEntity.startDate)
            assignPaAcDto.end = myDateUtil.convertTimeToString(assignPaAcEntity.endDate)
            assignPaAcDto
        }

        val plantLabellingData = plantLabellingEntityList.map { plantLabelingEntity ->
            val plantLabelingDto = modelMapper.map(plantLabelingEntity, AssignPaAcPlantLabelingDto::class.java)
            plantLabelingDto
        }


        writeCsvFile.writeCsv(classMap = AssignPaAcDto::class.java,
                data = fdAcData,
                fileName = "Assign_PA_AC",
                outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = AssignPaAcPlantLabelingDto::class.java,
                data = plantLabellingData,
                fileName = "Assign_PA_AC-plantLabeling",
                outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<AssignPaAcForm>>() {})

        val isStringBlank: Condition<*, *> = object : AbstractCondition<Any?, Any?>() {
            override fun applies(context: MappingContext<Any?, Any?>): Boolean {
                return if (context.source is String) {
                    null != context.source && "" != context.source
                } else {
                    context.source != null
                }
            }
        }

        modelMapper.configuration.propertyCondition = isStringBlank
        modelMapper.configuration.isSkipNullEnabled = true
        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val paAcData = ArrayList<AssignPaAcEntity>()
        val plantLabelingData = ArrayList<AssignPaAcPlantLabelingEntity>()
        list.forEach { assignFdAcForm ->
            //map and save to database
            val assignPaAcEntity = modelMapper.map(assignFdAcForm, AssignPaAcEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(assignFdAcForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                assignPaAcEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    assignPaAcEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    assignPaAcEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    assignPaAcEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            assignPaAcEntity.uuid = assignFdAcForm.formhubUuId
            assignPaAcEntity.submissionDate = myDateUtil.convertToDateTime(assignFdAcForm.submissionTime)
            assignPaAcEntity.todayDate = myDateUtil.convertToDate(assignFdAcForm.today)
            assignPaAcEntity.startDate = myDateUtil.convertToDateTime(assignFdAcForm.start)
            assignPaAcEntity.endDate = myDateUtil.convertToDateTime(assignFdAcForm.end)
            assignPaAcEntity.instanceId = assignFdAcForm.metaInstanceId
            assignPaAcEntity.controlKey = assignFdAcForm.metaInstanceId

            assignPaAcEntity.setOfPlantLabeling = "${assignPaAcEntity.controlKey}/plantLabeling"

            paAcData.add(assignPaAcEntity)

            val plantLabelingList = assignFdAcForm.plantLabelingList
            var plantLabelingCount = 1
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            plantLabelingList?.forEach { labelingPaAcForm ->
                val plantLabelingEntity = modelMapper.map(labelingPaAcForm, AssignPaAcPlantLabelingEntity::class.java)
                plantLabelingEntity.parentKey = assignPaAcEntity.controlKey
                plantLabelingEntity.controlKey = "${assignPaAcEntity.controlKey}/plantLabeling[$plantLabelingCount]"
                plantLabelingEntity.setOfPlantLabeling = "${assignPaAcEntity.controlKey}/plantLabeling"

                plantLabelingCount = plantLabelingCount.plus(1)
                plantLabelingData.add(plantLabelingEntity)
            }
        }

        paAcRepo.saveAll(paAcData)
        plantLabelingRepo.saveAll(plantLabelingData)

        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}