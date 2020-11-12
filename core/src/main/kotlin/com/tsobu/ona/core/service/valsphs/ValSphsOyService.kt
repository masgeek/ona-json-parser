package com.tsobu.ona.core.service.valsphs


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.`val`.ValSphsOyDto
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.`val`.ValSphsOyEntity
import com.tsobu.ona.database.repositories.`val`.ValSphsOyRepo
import com.tsobu.ona.forms.valform.ValSphsOyForm
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
class ValSphsOyService
constructor(
        transactionManager: PlatformTransactionManager,
        val oyRepo: ValSphsOyRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(ValSphsOyService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    private val fileName = "VAL_SPHS_OY.json"

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
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val filePath = "${appConfig.globalProperties().outputPath}"
        val kwList = oyRepo.findAllByOrderBySubmissionDateAsc()


        val treatData = kwList.map { oyEntity ->
            val oyDto = modelMapper.map(oyEntity, ValSphsOyDto::class.java)
            oyDto.submissionDate = myDateUtil.toDateTimeString(oyEntity.submissionDate)
            oyDto.startDate = myDateUtil.toDateTimeString(oyEntity.startDate)
            oyDto.endDate = myDateUtil.toDateTimeString(oyEntity.endDate)
            oyDto.todayDate = myDateUtil.toDateToString(oyEntity.todayDate)
            oyDto.plantingDate = myDateUtil.toDateToString(oyEntity.plantingDate)
            oyDto.harvestDate = myDateUtil.toDateToString(oyEntity.harvestDate)

            oyDto
        }


        writeCsvFile.writeCsv(classMap = ValSphsOyDto::class.java, data = treatData,
                fileName = "VAL_SPHS_OY", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
        val list = objectMapper.readValue(file, object : TypeReference<List<ValSphsOyForm>>() {})

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

        val oyData = ArrayList<ValSphsOyEntity>()
        list.forEach { oyForm ->
            //map and save to database
            val onEntity = modelMapper.map(oyForm, ValSphsOyEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(oyForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                onEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    onEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    onEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    onEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            onEntity.formHubUuId = oyForm.formhubUuid
            onEntity.submissionDate = myDateUtil.convertToDateTime(oyForm.submissionTime)
            onEntity.todayDate = myDateUtil.convertToDate(oyForm.todayDate)
            onEntity.startDate = myDateUtil.convertToDateTime(oyForm.startDate)
            onEntity.endDate = myDateUtil.convertToDateTime(oyForm.endDate)
            onEntity.plantingDate = myDateUtil.convertToDate(oyForm.plantingDate)
            onEntity.harvestDate = myDateUtil.convertToDate(oyForm.harvestDate)

            onEntity.instanceId = oyForm.instanceId
            onEntity.controlKey = oyForm.instanceId

            onEntity.gpDif = oyForm.gpDif

            oyData.add(onEntity)

        }

        oyRepo.saveAll(oyData)
        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}