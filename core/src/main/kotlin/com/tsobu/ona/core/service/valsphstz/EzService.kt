package com.tsobu.ona.core.service.valsphstz


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.forms.valsphstz.EzForm
import com.tsobu.ona.core.dto.json.datavalsphs.SphsDto
import com.tsobu.ona.core.dto.json.valsphstz.EzDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.valsphstz.EzEntity
import com.tsobu.ona.database.entities.valsphstz.SzEntity
import com.tsobu.ona.database.repositories.valsphstz.EzRepo
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
class EzService
constructor(
        transactionManager: PlatformTransactionManager,
        val ezRepo: EzRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(EzService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()
    fun mapJsonFile() {
        log.info("Reading table data....")
        val ezList = ezRepo.findAllByOrderBySubmissionDateAsc()

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

        val ezData = ezList.map { ezEntity ->
            val sphsTzSzDto = modelMapper.map(ezEntity, EzDto::class.java)
            sphsTzSzDto.submissionDate = myDateUtil.convertTimeToString(ezEntity.submissionDate)
            sphsTzSzDto.startDate = myDateUtil.convertTimeToString(ezEntity.startDate)
            sphsTzSzDto.endDate = myDateUtil.convertTimeToString(ezEntity.endDate)
            sphsTzSzDto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(pojoType = EzDto::class.java, data = ezData, fileName = "VAL_SPHS_TZEZ",outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset(fileName: String) {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<EzForm>>() {})

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
            val ezEntity = modelMapper.map(myVal, EzEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                ezEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    ezEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    ezEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    ezEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            ezEntity.uuid = myVal.formhubUuid
            ezEntity.submissionDate = myDateUtil.convertToDateTime(myVal.submissionTime)
            ezEntity.todayDate = myDateUtil.convertToDate(myVal.today)
            ezEntity.startDate = myDateUtil.convertToDateTime(myVal.start)
            ezEntity.endDate = myDateUtil.convertToDateTime(myVal.end)
            ezEntity.plantingDate = myDateUtil.convertToDate(myVal.plantingDate)
            ezEntity.harvestDate = myDateUtil.convertToDate(myVal.harvestDate)
            ezEntity.instanceId = myVal.metaInstanceID
            ezEntity.controlKey = myVal.metaInstanceID


            try {
                val saved = ezRepo.save(ezEntity)
                log.info("Added data to table ${saved.controlKey} with surname as ${myVal.xformIdString}")
            } catch (ex: Exception) {
                log.error(ex.message, ex.stackTrace)
            }
        }


        log.info("Finished saving the data for $fileName------->")
    }
}