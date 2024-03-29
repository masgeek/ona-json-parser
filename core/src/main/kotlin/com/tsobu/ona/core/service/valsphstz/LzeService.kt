package com.tsobu.ona.core.service.valsphstz


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.valsphstz.LzeDto
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.valsphstz.LzeEntity
import com.tsobu.ona.database.entities.valsphstz.SzEntity
import com.tsobu.ona.database.repositories.valsphstz.LzeRepo
import com.tsobu.ona.forms.valsphstz.LzeForm
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
class LzeService
constructor(
        transactionManager: PlatformTransactionManager,
        val lzeRepo: LzeRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(LzeService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()
    private val fileName = "VAL_SPHS_TZLZE.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val lzeList = lzeRepo.findAllByOrderBySubmissionDateAsc()

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

        val lzeData = lzeList.map { lzeEntity ->
            val lzeDto = modelMapper.map(lzeEntity, LzeDto::class.java)
            lzeDto.submissionDate = myDateUtil.toDateTimeString(lzeEntity.submissionDate)
            lzeDto.startDate = myDateUtil.toDateTimeString(lzeEntity.startDate)
            lzeDto.endDate = myDateUtil.toDateTimeString(lzeEntity.endDate)
            lzeDto.todayDate = myDateUtil.toDateToString(lzeEntity.todayDate)
            lzeDto.plantingDate = myDateUtil.toDateToString(lzeEntity.plantingDate)
            lzeDto.harvestDate = myDateUtil.toDateToString(lzeEntity.harvestDate)
            lzeDto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = LzeDto::class.java, data = lzeData, fileName = "VAL_SPHS_TZLZE", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<LzeForm>>() {})

        val data = ArrayList<SzEntity>()
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

        list.forEach { myVal ->
            //map and save to database
            val geoPoint = myDateUtil.splitGeoPoint(myVal.geopoint)
            val lzeEntity = modelMapper.map(myVal, LzeEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                lzeEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    lzeEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    lzeEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    lzeEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            lzeEntity.formHubUuId = myVal.formHubUuid
            lzeEntity.submissionDate = myDateUtil.convertToDateTime(myVal.submissionTime)
            lzeEntity.todayDate = myDateUtil.convertToDate(myVal.todayDate)
            lzeEntity.startDate = myDateUtil.convertToDateTime(myVal.startDate)
            lzeEntity.endDate = myDateUtil.convertToDateTime(myVal.endDate)
            lzeEntity.plantingDate = myDateUtil.convertToDate(myVal.plantingDate)
            lzeEntity.harvestDate = myDateUtil.convertToDate(myVal.harvestDate)
            lzeEntity.instanceId = myVal.instanceId
            lzeEntity.controlKey = myVal.instanceId


            try {
                val saved = lzeRepo.save(lzeEntity)
                log.info("Added data to table ${saved.controlKey} with surname as ${myVal.xformIdString}")
            } catch (ex: Exception) {
                log.error(ex.message, ex.stackTrace)
            }
        }


        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}