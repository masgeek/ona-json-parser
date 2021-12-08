package com.tsobu.ona.core.service.monitor


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.monitor.NonDestructiveCassAcDto
import com.tsobu.ona.core.dto.json.monitor.NonDestructiveCassAcIdDto
import com.tsobu.ona.core.dto.json.monitor.NonDestructiveCassAcNdmDto
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.monitor.NonDestructiveCassAcEntity
import com.tsobu.ona.database.entities.monitor.NonDestructiveCassAcIdEntity
import com.tsobu.ona.database.entities.monitor.NonDestructiveCassAcNdmEntity
import com.tsobu.ona.database.repositories.monitor.NonDestructiveCassAcIdRepo
import com.tsobu.ona.database.repositories.monitor.NonDestructiveCassAcNdmRepo
import com.tsobu.ona.database.repositories.monitor.NonDestructiveCassAcRepo
import com.tsobu.ona.forms.monitor.NonDestructiveCassAcForm
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
class NonDestructiveCassService
constructor(
        transactionManager: PlatformTransactionManager,
        val cassAcRepo: NonDestructiveCassAcRepo,
        val cassAcIdRepo: NonDestructiveCassAcIdRepo,
        val cassAcNdmRepo: NonDestructiveCassAcNdmRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(NonDestructiveCassService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    val fileName = "Monitor_NonDestructive_Cassava_AC.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val confirmList = cassAcRepo.findAllByOrderBySubmissionDateAsc()
        val cassAcIdList = cassAcIdRepo.findAll()
        val casAcNdmList = cassAcNdmRepo.findAll()

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
//        modelMapper.configuration.isAmbiguityIgnored = false
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD


        val cassAcData = confirmList.map { assignAcEntity ->
            val cassAcDto = modelMapper.map(assignAcEntity, NonDestructiveCassAcDto::class.java)
            cassAcDto.submissionDate = myDateUtil.toDateTimeString(assignAcEntity.submissionDate)
            cassAcDto.startDate = myDateUtil.toDateTimeString(assignAcEntity.startDate)
            cassAcDto.endDate = myDateUtil.toDateTimeString(assignAcEntity.endDate)
            cassAcDto.todayDate = myDateUtil.toDateTimeString(assignAcEntity.todayDate)
            cassAcDto
        }

        val cassAcIdData = cassAcIdList.map { plotLabelingEntity ->
            val acIdRepo = modelMapper.map(plotLabelingEntity, NonDestructiveCassAcIdDto::class.java)
            acIdRepo
        }

        val cassAcidNdmData = casAcNdmList.map { plotLabelingEntity ->
            val cassAcNdmDto = modelMapper.map(plotLabelingEntity, NonDestructiveCassAcNdmDto::class.java)
            cassAcNdmDto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = NonDestructiveCassAcDto::class.java, data = cassAcData,
                fileName = "Monitor_NonDestructive_Cassava_AC", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = NonDestructiveCassAcIdDto::class.java, data = cassAcIdData,
                fileName = "Monitor_NonDestructive_Cassava_AC-ID", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = NonDestructiveCassAcNdmDto::class.java, data = cassAcidNdmData,
                fileName = "Monitor_NonDestructive_Cassava_AC-NDM", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        return
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<NonDestructiveCassAcForm>>() {})

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
//        modelMapper.configuration.isAmbiguityIgnored = false
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val cassAcData = ArrayList<NonDestructiveCassAcEntity>()
        val cassAcIdData = ArrayList<NonDestructiveCassAcIdEntity>()
        val cassAcNdmData = ArrayList<NonDestructiveCassAcNdmEntity>()
        list.forEach { acForm ->
            //map and save to database
            val geoPoint = myDateUtil.splitGeoPoint(acForm.geopoint)
            val poAcEntity = modelMapper.map(acForm, NonDestructiveCassAcEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                poAcEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    poAcEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    poAcEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    poAcEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            poAcEntity.formHubUuId = acForm.formhubUuid
            poAcEntity.submissionDate = myDateUtil.convertToDateTime(acForm.submissionTime)
            poAcEntity.todayDate = myDateUtil.convertToDate(acForm.todayDate)
            poAcEntity.startDate = myDateUtil.convertToDateTime(acForm.startDate)
            poAcEntity.endDate = myDateUtil.convertToDateTime(acForm.endDate)
            poAcEntity.instanceId = acForm.instanceId
            poAcEntity.controlKey = acForm.instanceId

            poAcEntity.setOfId = "${acForm.instanceId}/ID"

            //child data
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            val acIdList = acForm.acId
            var acIdCounter = 1
            acIdList.forEach { acIdForm ->
                val acIdEntity = modelMapper.map(acIdForm, NonDestructiveCassAcIdEntity::class.java)
                acIdEntity.parentKey = poAcEntity.controlKey
                acIdEntity.setOfId = poAcEntity.setOfId
                acIdEntity.controlKey = "${acForm.instanceId}/ID[$acIdCounter]"
                acIdEntity.setOfNdm = "${acForm.instanceId}/ID[$acIdCounter]/NDM"

                acIdCounter = acIdCounter.plus(1)
                cassAcIdData.add(acIdEntity)

                val ndmList = acIdForm.ndmList
                var acNdmCounter = 1
                ndmList.forEach { ndmForm ->
                    val ndmEntity = modelMapper.map(ndmForm, NonDestructiveCassAcNdmEntity::class.java)
                    ndmEntity.parentKey = acIdEntity.controlKey
                    ndmEntity.controlKey = "${acIdEntity.controlKey}/NDM[$acNdmCounter]"
                    ndmEntity.setOfNdm = "${acForm.instanceId}/ID[$acIdCounter]/NDM"

                    acNdmCounter = acNdmCounter.plus(1)
                    cassAcNdmData.add(ndmEntity)
                }
            }
            cassAcData.add(poAcEntity)
        }

        cassAcRepo.saveAll(cassAcData)
        cassAcIdRepo.saveAll(cassAcIdData)
        cassAcNdmRepo.saveAll(cassAcNdmData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}