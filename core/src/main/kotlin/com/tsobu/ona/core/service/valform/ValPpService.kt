package com.tsobu.ona.core.service.valform


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.`val`.ValPpDto
import com.tsobu.ona.core.dto.json.`val`.ValPpPwDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.`val`.ValPpEntity
import com.tsobu.ona.database.entities.`val`.ValPpPwEntity
import com.tsobu.ona.database.repositories.`val`.ValPpPwRepo
import com.tsobu.ona.database.repositories.`val`.ValPpRepo
import com.tsobu.ona.forms.valform.ValPpForm
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
class ValPpService
constructor(
        transactionManager: PlatformTransactionManager,
        val ppRepo: ValPpRepo,
        val pwRepo: ValPpPwRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(ValPpService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()

    private val fileName = "VAL_PP.json"

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
        val ppList = ppRepo.findAllByOrderBySubmissionDateAsc()
        val pwList = pwRepo.findAll()


        val valPpData = ppList.map { valPpEntity ->
            val valIcDto = modelMapper.map(valPpEntity, ValPpDto::class.java)
            valIcDto.submissionDate = myDateUtil.convertToDateTimeString(valPpEntity.submissionDate)
            valIcDto.start = myDateUtil.convertToDateTimeString(valPpEntity.startDate)
            valIcDto.end = myDateUtil.convertToDateTimeString(valPpEntity.endDate)
            valIcDto
        }

        val valPpPwData = pwList.map { pwEntity ->
            val pwDto = modelMapper.map(pwEntity, ValPpPwDto::class.java)
//            pwDto.parentKey = pwEntity.controlKey
            pwDto
        }


        writeCsvFile.writeCsv(classMap = ValPpDto::class.java, data = valPpData,
                fileName = "VAL_PP", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = ValPpPwDto::class.java, data = valPpPwData,
                fileName = "VAL_PP-PW", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
        val list = objectMapper.readValue(file, object : TypeReference<List<ValPpForm>>() {})

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

        val ppData = ArrayList<ValPpEntity>()
        val pwData = ArrayList<ValPpPwEntity>()
        list.forEach { ppForm ->
            //map and save to database
            val valPpEntity = modelMapper.map(ppForm, ValPpEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(ppForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                valPpEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    valPpEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    valPpEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    valPpEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            valPpEntity.uuid = ppForm.formhubUuid
            valPpEntity.submissionDate = myDateUtil.convertToDateTime(ppForm.submissionTime)
            valPpEntity.todayDate = myDateUtil.convertToDate(ppForm.today)
            valPpEntity.startDate = myDateUtil.convertToDateTime(ppForm.start)
            valPpEntity.endDate = myDateUtil.convertToDateTime(ppForm.end)
            valPpEntity.plantingDate = myDateUtil.convertToDate(ppForm.plantingDate)
            valPpEntity.instanceId = ppForm.metaInstanceID
            valPpEntity.controlKey = ppForm.metaInstanceID

            ppData.add(valPpEntity)

            val pwList = ppForm.valPpPwList
            var pwCounter = 1
            pwList.forEach { pwForm ->
                val pwEntity = modelMapper.map(pwForm, ValPpPwEntity::class.java)
                pwEntity.parentKey = valPpEntity.controlKey
                pwEntity.controlKey = "${pwEntity.parentKey}/PW[$pwCounter]"
                pwEntity.setOfPw = "${pwEntity.parentKey}/PW"
                pwCounter = pwCounter.plus(1)
                pwData.add(pwEntity)
            }

        }

        ppRepo.saveAll(ppData)
        pwRepo.saveAll(pwData)

        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}