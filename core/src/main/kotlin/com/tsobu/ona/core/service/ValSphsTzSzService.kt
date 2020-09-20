package com.tsobu.ona.core.service


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.forms.valsphstz.Sz
import com.tsobu.ona.core.dto.json.ValSphsTzSzDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.valsphstz.SzEntity
import com.tsobu.ona.database.repositories.valsphstz.SzRepo
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
class ValSphsTzSzService
constructor(
        transactionManager: PlatformTransactionManager,
        val sphsTzSzRepo: SzRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(ValSphsTzSzService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()
    fun mapJsonFile() {
        log.info("Reading ValSphsTzSzDto table here")
        val scores = sphsTzSzRepo.findAll()

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

        val valSphssTzData = scores.map { sphsTzSzEntity ->
            val sphsTzSzDto = modelMapper.map(sphsTzSzEntity, ValSphsTzSzDto::class.java)
            sphsTzSzDto.submissionDate = myDateUtil.convertTimeToString(sphsTzSzEntity.submissionDate)
            sphsTzSzDto.startDate = myDateUtil.convertTimeToString(sphsTzSzEntity.startDate)
            sphsTzSzDto.endDate = myDateUtil.convertTimeToString(sphsTzSzEntity.endDate)
            sphsTzSzDto
        }
        writeCsvFile.writeCsv(pojoType = ValSphsTzSzDto::class.java, data = valSphssTzData, fileName = "VAL_SPHS_TZSZ")
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset(fileName: String) {
        val filePath = "${appConfig.globalProperties().folderPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<Sz>>() {})

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
            val valSphsTzSzEntity = modelMapper.map(myVal, SzEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                valSphsTzSzEntity.geoPointLatitude = geoPoint[0].toDouble()

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    valSphsTzSzEntity.geoPointLongitude = geoPoint[1].toDouble()
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    valSphsTzSzEntity.geoPointAltitude = geoPoint[2].toDouble()
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    valSphsTzSzEntity.geoPointAccuracy = geoPoint[3].toDouble()
                }
            }
            valSphsTzSzEntity.uuid = myVal.formhubUuid
            valSphsTzSzEntity.submissionDate = myDateUtil.convertToDateTime(myVal.submissionTime)
            valSphsTzSzEntity.todayDate = myDateUtil.convertToDate(myVal.today)
            valSphsTzSzEntity.startDate = myDateUtil.convertToDateTime(myVal.start)
            valSphsTzSzEntity.endDate = myDateUtil.convertToDateTime(myVal.end)
            valSphsTzSzEntity.plantingDate = myDateUtil.convertToDate(myVal.plantingDate)
            valSphsTzSzEntity.harvestDate = myDateUtil.convertToDate(myVal.harvestDate)
            valSphsTzSzEntity.instanceid = myVal.metaInstanceID
            valSphsTzSzEntity.controlKey = myVal.metaInstanceID

            try {
                val saved = sphsTzSzRepo.save(valSphsTzSzEntity)
                log.info("Added data to table ${saved.controlKey} with surname as ${saved.username}")
            } catch (ex: Exception) {
                log.error(ex.message, ex.stackTrace)
            }
        }


        log.info("Finished saving the data for $fileName------->")
    }
}