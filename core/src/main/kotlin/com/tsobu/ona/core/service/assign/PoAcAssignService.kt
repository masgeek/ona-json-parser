package com.tsobu.ona.core.service.assign


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.assign.AssignPoAcDto
import com.tsobu.ona.core.dto.json.assign.AssignPoAcPlotLabelingDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.assign.AssignPoAcEntity
import com.tsobu.ona.database.entities.assign.AssignPoAcPlotLabelingEntity
import com.tsobu.ona.database.repositories.assign.AssignPoAcPlotLabelingRepo
import com.tsobu.ona.database.repositories.assign.AssignPoAcRepo
import com.tsobu.ona.forms.assign.AssignPoAcForm
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
class PoAcAssignService
constructor(
        transactionManager: PlatformTransactionManager,
        val poAcRepo: AssignPoAcRepo,
        val plotLabelingRepo: AssignPoAcPlotLabelingRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(PoAcAssignService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    private val fileName = "Assign_PO_AC.json"
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
        modelMapper.configuration.isAmbiguityIgnored = false
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val filePath = "${appConfig.globalProperties().outputPath}"
        val fdAcEntityList = poAcRepo.findAllByOrderBySubmissionDateAsc()
        val plantLabellingEntityList = plotLabelingRepo.findAll()


        val fdAcData = fdAcEntityList.map { assignPaAcEntity ->
            val assignPaAcDto = modelMapper.map(assignPaAcEntity, AssignPoAcDto::class.java)
            assignPaAcDto.submissionDate = myDateUtil.toDateTimeString(assignPaAcEntity.submissionDate)
            assignPaAcDto.startDate = myDateUtil.toDateTimeString(assignPaAcEntity.startDate)
            assignPaAcDto.endDate = myDateUtil.toDateTimeString(assignPaAcEntity.endDate)
            assignPaAcDto.todayDate = myDateUtil.toDateToString(assignPaAcEntity.todayDate)
            assignPaAcDto
        }

        val plantLabellingData = plantLabellingEntityList.map { plantLabelingEntity ->
            val plantLabelingDto = modelMapper.map(plantLabelingEntity, AssignPoAcPlotLabelingDto::class.java)
            plantLabelingDto
        }


        writeCsvFile.writeCsv(classMap = AssignPoAcDto::class.java,
                data = fdAcData,
                fileName = "Assign_PO_AC",
                outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = AssignPoAcPlotLabelingDto::class.java,
                data = plantLabellingData,
                fileName = "Assign_PO_AC-plantLabeling",
                outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<AssignPoAcForm>>() {})

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
        modelMapper.configuration.isAmbiguityIgnored = false
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val poAcData = ArrayList<AssignPoAcEntity>()
        val plotLabelingData = ArrayList<AssignPoAcPlotLabelingEntity>()
        list.forEach { assignPoAcForm ->
            //map and save to database
            val assignPoAcEntity = modelMapper.map(assignPoAcForm, AssignPoAcEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(assignPoAcForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                assignPoAcEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    assignPoAcEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    assignPoAcEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    assignPoAcEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            assignPoAcEntity.formHubUuId = assignPoAcForm.formHubUuId
            assignPoAcEntity.submissionDate = myDateUtil.convertToDateTime(assignPoAcForm.submissionTime)
            assignPoAcEntity.todayDate = myDateUtil.convertToDate(assignPoAcForm.todayDate)
            assignPoAcEntity.startDate = myDateUtil.convertToDateTime(assignPoAcForm.startDate)
            assignPoAcEntity.endDate = myDateUtil.convertToDateTime(assignPoAcForm.endDate)
            assignPoAcEntity.instanceId = assignPoAcForm.instanceId
            assignPoAcEntity.controlKey = assignPoAcForm.instanceId

            assignPoAcEntity.setOfPlotLabeling = "${assignPoAcEntity.controlKey}/plotLabeling"

            poAcData.add(assignPoAcEntity)

            val plotLabelingList = assignPoAcForm.plotLabelingList
            var plotLabelingCount = 1
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            plotLabelingList?.forEach { labelingPoAcForm ->
                val plantLabelingEntity = modelMapper.map(labelingPoAcForm, AssignPoAcPlotLabelingEntity::class.java)
                plantLabelingEntity.parentKey = assignPoAcEntity.controlKey
                plantLabelingEntity.controlKey = "${assignPoAcEntity.controlKey}/plotLabeling[$plotLabelingCount]"
                plantLabelingEntity.setOfPlotLabeling = "${assignPoAcEntity.controlKey}/plotLabeling"

                plotLabelingCount = plotLabelingCount.plus(1)
                plotLabelingData.add(plantLabelingEntity)
            }
        }

        poAcRepo.saveAll(poAcData)
        plotLabelingRepo.saveAll(plotLabelingData)

        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}