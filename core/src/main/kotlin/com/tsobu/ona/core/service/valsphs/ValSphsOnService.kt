package com.tsobu.ona.core.service.valsphs


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.`val`.ValSphsOnDto
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.`val`.ValSphsOnEntity
import com.tsobu.ona.database.repositories.`val`.ValSphsOnRepo
import com.tsobu.ona.forms.valform.ValSphsOnForm
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
class ValSphsOnService
constructor(
        transactionManager: PlatformTransactionManager,
        val onRepo: ValSphsOnRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(ValSphsOnService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    private val fileName = "VAL_SPHS_ON.json"

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
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val filePath = "${appConfig.globalProperties().outputPath}"
        val kwList = onRepo.findAllByOrderBySubmissionDateAsc()


        val treatData = kwList.map { onEntity ->
            val ogDto = modelMapper.map(onEntity, ValSphsOnDto::class.java)
            ogDto.submissionDate = myDateUtil.toDateTimeString(onEntity.submissionDate)
            ogDto.startDate = myDateUtil.toDateTimeString(onEntity.startDate)
            ogDto.endDate = myDateUtil.toDateTimeString(onEntity.endDate)
            ogDto.todayDate = myDateUtil.toDateToString(onEntity.todayDate)
            ogDto.plantingDate = myDateUtil.toDateToString(onEntity.plantingDate)
            ogDto.harvestDate = myDateUtil.toDateToString(onEntity.harvestDate)

            ogDto
        }


        writeCsvFile.writeCsv(classMap = ValSphsOnDto::class.java, data = treatData,
                fileName = "VAL_SPHS_ON", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
        val list = objectMapper.readValue(file, object : TypeReference<List<ValSphsOnForm>>() {})

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

        val onData = ArrayList<ValSphsOnEntity>()
        list.forEach { ogForm ->
            //map and save to database
            val onEntity = modelMapper.map(ogForm, ValSphsOnEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(ogForm.geopoint)
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
            onEntity.formHubUuId = ogForm.formhubUuid
            onEntity.submissionDate = myDateUtil.convertToDateTime(ogForm.submissionTime)
            onEntity.todayDate = myDateUtil.convertToDate(ogForm.todayDate)
            onEntity.startDate = myDateUtil.convertToDateTime(ogForm.startDate)
            onEntity.endDate = myDateUtil.convertToDateTime(ogForm.endDate)
            onEntity.plantingDate = myDateUtil.convertToDateTime(ogForm.plantingDate)
            onEntity.harvestDate = myDateUtil.convertToDateTime(ogForm.harvestDate)
            onEntity.instanceId = ogForm.instanceId
            onEntity.controlKey = ogForm.instanceId

            onEntity.gpDif = ogForm.gpDif

            onData.add(onEntity)

        }

        onRepo.saveAll(onData)
        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}