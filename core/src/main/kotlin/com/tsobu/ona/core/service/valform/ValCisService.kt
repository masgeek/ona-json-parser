package com.tsobu.ona.core.service.valform


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.`val`.ValCisDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.`val`.ValCisEntity
import com.tsobu.ona.database.repositories.`val`.ValCisRepo
import com.tsobu.ona.forms.valform.ValCisForm
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
class ValCisService
constructor(
        transactionManager: PlatformTransactionManager,
        val valCisRepo: ValCisRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(ValCisService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()

    private val fileName = "VAL_CIS.json"

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
//        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val filePath = "${appConfig.globalProperties().outputPath}"
        val fdAcEntityList = valCisRepo.findAllByOrderBySubmissionDateAsc()


        val fdAcData = fdAcEntityList.map { valCisEntity ->
            val starchContentAcDto = modelMapper.map(valCisEntity, ValCisDto::class.java)
            starchContentAcDto.submissionDate = myDateUtil.toDateTimeString(valCisEntity.submissionDate)
            starchContentAcDto.start = myDateUtil.toDateTimeString(valCisEntity.startDate)
            starchContentAcDto.end = myDateUtil.toDateTimeString(valCisEntity.endDate)
            starchContentAcDto
        }


        writeCsvFile.writeCsv(classMap = ValCisDto::class.java, data = fdAcData,
                fileName = "VAL_CIS", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
        val list = objectMapper.readValue(file, object : TypeReference<List<ValCisForm>>() {})

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

        val valCisData = ArrayList<ValCisEntity>()
        list.forEach { valCisForm ->
            //map and save to database
            val valCisEntity = modelMapper.map(valCisForm, ValCisEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(valCisForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                valCisEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    valCisEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    valCisEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    valCisEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            valCisEntity.uuid = valCisForm.formhubUuid
            valCisEntity.submissionDate = myDateUtil.convertToDateTime(valCisForm.submissionTime)
            valCisEntity.todayDate = myDateUtil.convertToDate(valCisForm.today)
            valCisEntity.startDate = myDateUtil.convertToDateTime(valCisForm.start)
            valCisEntity.endDate = myDateUtil.convertToDateTime(valCisForm.end)
            valCisEntity.plantingDate = myDateUtil.convertToDate(valCisForm.plantingDate)
            valCisEntity.instanceId = valCisForm.metaInstanceID
            valCisEntity.controlKey = valCisForm.metaInstanceID

//            valCisEntity.costFertilizerAbText = valCisForm.costFertilizerAbText

            valCisData.add(valCisEntity)
            log.info("Added data to table ${valCisEntity.controlKey} with surname as ${valCisForm.xformIdString}")
        }

        valCisRepo.saveAll(valCisData)

        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}