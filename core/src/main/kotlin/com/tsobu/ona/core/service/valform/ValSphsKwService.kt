package com.tsobu.ona.core.service.valform


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.`val`.ValSphsKwDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.`val`.ValSphsKwEntity
import com.tsobu.ona.database.repositories.`val`.ValSphsKwRepo
import com.tsobu.ona.forms.valform.ValSphsKwForm
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
class ValSphsKwService
constructor(
        transactionManager: PlatformTransactionManager,
        val kwRepo: ValSphsKwRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(ValSphsKwService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    private val fileName = "VAL_SPHS_KW.json"

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
//        modelMapper.configuration.isAmbiguityIgnored = false
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT

        val filePath = "${appConfig.globalProperties().outputPath}"
        val kwList = kwRepo.findAllByOrderBySubmissionDateAsc()


        val treatData = kwList.map { kwEntity ->
            val kwDto = modelMapper.map(kwEntity, ValSphsKwDto::class.java)
            kwDto.submissionDate = myDateUtil.toDateTimeString(kwEntity.submissionDate)
            kwDto.start = myDateUtil.toDateTimeString(kwEntity.startDate)
            kwDto.end = myDateUtil.toDateTimeString(kwEntity.endDate)
            kwDto.today = myDateUtil.toDateToString(kwEntity.todayDate)
            kwDto.harvestDate = myDateUtil.toDateToString(kwEntity.harvestDate)
            kwDto.plantingDate = myDateUtil.toDateToString(kwEntity.plantingDate)

            kwDto
        }


        writeCsvFile.writeCsv(classMap = ValSphsKwDto::class.java, data = treatData, fileName = "VAL_SPHS_KW", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
        val list = objectMapper.readValue(file, object : TypeReference<List<ValSphsKwForm>>() {})

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
//        modelMapper.configuration.sourceNamingConvention = NamingConventions.NONE
//        modelMapper.configuration.destinationNamingConvention = NamingConventions.NONE
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val kwData = ArrayList<ValSphsKwEntity>()
        list.forEach { kwForm ->
            //map and save to database
            val kwEntity = modelMapper.map(kwForm, ValSphsKwEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(kwForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                kwEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    kwEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    kwEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    kwEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            kwEntity.formHubUuId = kwForm.formhubUuid
            kwEntity.submissionDate = myDateUtil.convertToDateTime(kwForm.submissionTime)
            kwEntity.todayDate = myDateUtil.convertToDate(kwForm.today)
            kwEntity.startDate = myDateUtil.convertToDateTime(kwForm.start)
            kwEntity.endDate = myDateUtil.convertToDateTime(kwForm.end)
            kwEntity.instanceId = kwForm.instanceId
            kwEntity.controlKey = kwForm.instanceId

            kwData.add(kwEntity)

        }

        kwRepo.saveAll(kwData)
        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}