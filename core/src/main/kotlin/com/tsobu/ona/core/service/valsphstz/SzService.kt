package com.tsobu.ona.core.service.valsphstz


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.valsphstz.SzDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.valsphstz.SzEntity
import com.tsobu.ona.database.repositories.valsphstz.SzRepo
import com.tsobu.ona.forms.valsphstz.SzForm
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
class SzService
constructor(
        transactionManager: PlatformTransactionManager,
        val szRepo: SzRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(SzService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()
    private val fileName = "VAL_SPHS_TZSZ.json"
    fun mapJsonFile() {
        log.info("Reading ValSphsTzSzDto table here")
        val scores = szRepo.findAll()

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
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT

        val valSphssTzData = scores.map { szEntity ->
            val szDto = modelMapper.map(szEntity, SzDto::class.java)
            szDto.submissionDate = myDateUtil.convertTimeToString(szEntity.submissionDate)
            szDto.startDate = myDateUtil.convertTimeToString(szEntity.startDate)
            szDto.endDate = myDateUtil.convertTimeToString(szEntity.endDate)
            szDto
        }
        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = SzDto::class.java, data = valSphssTzData, fileName = "VAL_SPHS_TZSZ", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<SzForm>>() {})

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
        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT

        list.forEach { myVal ->
            //map and save to database
            val geoPoint = myDateUtil.splitGeoPoint(myVal.geopoint)
            val szEntity = modelMapper.map(myVal, SzEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                szEntity.geoPointLatitude = geoPoint[0].toDouble()

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    szEntity.geoPointLongitude = geoPoint[1].toDouble()
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    szEntity.geoPointAltitude = geoPoint[2].toDouble()
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    szEntity.geoPointAccuracy = geoPoint[3].toDouble()
                }
            }
            szEntity.uuid = myVal.formhubUuid
            szEntity.submissionDate = myDateUtil.convertToDateTime(myVal.submissionTime)
            szEntity.todayDate = myDateUtil.convertToDate(myVal.today)
            szEntity.startDate = myDateUtil.convertToDateTime(myVal.start)
            szEntity.endDate = myDateUtil.convertToDateTime(myVal.end)
            szEntity.plantingDate = myDateUtil.convertToDate(myVal.plantingDate)
            szEntity.harvestDate = myDateUtil.convertToDate(myVal.harvestDate)
            szEntity.instanceid = myVal.metaInstanceID
            szEntity.controlKey = myVal.metaInstanceID

            try {
                val saved = szRepo.save(szEntity)
                log.info("Added data to table ${saved.controlKey} with surname as ${saved.username}")
            } catch (ex: Exception) {
                log.error(ex.message, ex.stackTrace)
            }
        }


        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}