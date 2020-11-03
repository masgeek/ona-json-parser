package com.tsobu.ona.core.service.dataval


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.dataval.CisDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.dataval.CisEntity
import com.tsobu.ona.database.repositories.dataval.CisRepo
import com.tsobu.ona.forms.dataval.CisForm
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
class CisService
constructor(
        transactionManager: PlatformTransactionManager,
        val cisRepo: CisRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(CisService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()

    val fileName = "dataVAL_CIS.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val frList = cisRepo.findAllByOrderBySubmissionDateAsc()

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
//        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD


        val icData = frList.map { cisEntity ->
            val cisDto = modelMapper.map(cisEntity, CisDto::class.java)
            cisDto.submissionDate = myDateUtil.convertTimeToString(cisEntity.submissionDate)
            cisDto.startDate= myDateUtil.convertTimeToString(cisEntity.startDate)
            cisDto.endDate = myDateUtil.convertTimeToString(cisEntity.endDate)

            cisDto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = CisDto::class.java, data = icData, fileName = "dataVAL_CIS", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<CisForm>>() {})

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
//        modelMapper.configuration.isAmbiguityIgnored = true
//        modelMapper.configuration.sourceNamingConvention = NamingConventions.NONE
//        modelMapper.configuration.destinationNamingConvention = NamingConventions.NONE
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val icData = ArrayList<CisEntity>()
        list.forEach { cisForm ->
            //map and save to database
            val geoPoint = myDateUtil.splitGeoPoint(cisForm.geopoint)
            val cisEntity = modelMapper.map(cisForm, CisEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                cisEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    cisEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    cisEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    cisEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            cisEntity.uuid = cisForm.formhubUuid
            cisEntity.submissionDate = myDateUtil.convertToDateTime(cisForm.submissionTime)
            cisEntity.todayDate = myDateUtil.convertToDate(cisForm.today)
            cisEntity.startDate = myDateUtil.convertToDateTime(cisForm.start)
            cisEntity.endDate = myDateUtil.convertToDateTime(cisForm.end)
//            cisEntity.plantingDate = myDateUtil.convertToDate(cisForm.plantingDate)
            cisEntity.instanceID = cisForm.metaInstanceID
            cisEntity.controlKey = cisForm.metaInstanceID

//            cisEntity.eventValue = cisForm.eventValue

            try {
                icData.add(cisEntity)
            } catch (ex: Exception) {
                log.error(ex.message, ex.stackTrace)
            }
        }

//        cisRepo.saveAll(icData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}