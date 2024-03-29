package com.tsobu.ona.core.service.valform


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.valdto.ValFrDto
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.`val`.ValFrEntity
import com.tsobu.ona.database.repositories.`val`.ValFrRepo
import com.tsobu.ona.forms.valform.ValFrForm
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
class ValFrService
constructor(
        transactionManager: PlatformTransactionManager,
        val valFrRepo: ValFrRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(ValFrService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    private val fileName = "VAL_FR.json"

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
        val valFrEntityList = valFrRepo.findAllByOrderBySubmissionDateAsc()


        val valFrData = valFrEntityList.map { valFrEntity ->
            val starchContentAcDto = modelMapper.map(valFrEntity, ValFrDto::class.java)
            starchContentAcDto.submissionDate = myDateUtil.toDateTimeString(valFrEntity.submissionDate)
            starchContentAcDto.todayDate = myDateUtil.toDateToString(valFrEntity.todayDate)
            starchContentAcDto.startDate = myDateUtil.toDateTimeString(valFrEntity.startDate)
            starchContentAcDto.endDate = myDateUtil.toDateTimeString(valFrEntity.endDate)
            starchContentAcDto.plantingDate = myDateUtil.toDateToString(valFrEntity.plantingDate)
            starchContentAcDto
        }


        writeCsvFile.writeCsv(classMap = ValFrDto::class.java, data = valFrData, fileName = "VAL_FR", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
        val list = objectMapper.readValue(file, object : TypeReference<List<ValFrForm>>() {})

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

        val valFrData = ArrayList<ValFrEntity>()
        list.forEach { valFrForm ->
            //map and save to database
            val valFrEntity = modelMapper.map(valFrForm, ValFrEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(valFrForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                valFrEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    valFrEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    valFrEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    valFrEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            valFrEntity.formHubUuId = valFrForm.formhubUuid
            valFrEntity.submissionDate = myDateUtil.convertToDateTime(valFrForm.submissionTime)
            valFrEntity.todayDate = myDateUtil.convertToDate(valFrForm.todayDate)
            valFrEntity.startDate = myDateUtil.convertToDateTime(valFrForm.startDate)
            valFrEntity.endDate = myDateUtil.convertToDateTime(valFrForm.endDate)
            valFrEntity.plantingDate = myDateUtil.convertToDate(valFrForm.plantingDate)
            valFrEntity.instanceId = valFrForm.instanceId
            valFrEntity.controlKey = valFrForm.instanceId

            valFrData.add(valFrEntity)
            log.info("Added data to table ${valFrEntity.controlKey} with surname as ${valFrForm.xformIdString}")
        }

        valFrRepo.saveAll(valFrData)

        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}