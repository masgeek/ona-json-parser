package com.tsobu.ona.core.service.assign


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.assign.*
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.assign.AssignTlAcEntity
import com.tsobu.ona.database.repositories.assign.AssignTlAcRepo
import com.tsobu.ona.forms.assign.AssignTlAcForm
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
class TlAcAssignService
constructor(
        transactionManager: PlatformTransactionManager,
        val tlAcRepo: AssignTlAcRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(TlAcAssignService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    private val fileName = "Assign_TL_AC.json"
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
        val tlAcEntityList = tlAcRepo.findAllByOrderBySubmissionDateAsc()



        val tlAcData = tlAcEntityList.map { assignTlAcEntity ->
            val assignPaAcDto = modelMapper.map(assignTlAcEntity, AssignTlAcDto::class.java)
            assignPaAcDto.submissionDate = myDateUtil.toDateTimeString(assignTlAcEntity.submissionDate)
            assignPaAcDto.start = myDateUtil.toDateTimeString(assignTlAcEntity.startDate)
            assignPaAcDto.end = myDateUtil.toDateTimeString(assignTlAcEntity.endDate)
            assignPaAcDto.today = myDateUtil.toDateToString(assignTlAcEntity.todayDate)
            assignPaAcDto
        }


        writeCsvFile.writeCsv(classMap = AssignTlAcDto::class.java,
                data = tlAcData,
                fileName = "Assign_TL_AC",
                outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<AssignTlAcForm>>() {})

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

        val tlAcData = ArrayList<AssignTlAcEntity>()
        list.forEach { assignTlAcForm ->
            //map and save to database
            val tlAcEntity = modelMapper.map(assignTlAcForm, AssignTlAcEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(assignTlAcForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                tlAcEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    tlAcEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    tlAcEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    tlAcEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            tlAcEntity.uuid = assignTlAcForm.formhubUuId
            tlAcEntity.submissionDate = myDateUtil.convertToDateTime(assignTlAcForm.submissionTime)
            tlAcEntity.todayDate = myDateUtil.convertToDate(assignTlAcForm.today)
            tlAcEntity.startDate = myDateUtil.convertToDateTime(assignTlAcForm.start)
            tlAcEntity.endDate = myDateUtil.convertToDateTime(assignTlAcForm.end)
            tlAcEntity.instanceId = assignTlAcForm.metaInstanceId
            tlAcEntity.controlKey = assignTlAcForm.metaInstanceId

            tlAcData.add(tlAcEntity)
        }

        tlAcRepo.saveAll(tlAcData)

        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}