package com.tsobu.ona.core.service.valform


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.`val`.ValPpTzDto
import com.tsobu.ona.core.dto.json.`val`.ValPpTzPwDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.`val`.ValPpTzEntity
import com.tsobu.ona.database.entities.`val`.ValPpTzPwEntity
import com.tsobu.ona.database.repositories.`val`.ValPpTzPwRepo
import com.tsobu.ona.database.repositories.`val`.ValPpTzRepo
import com.tsobu.ona.forms.valform.ValPpTzForm
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
class ValPpTzService
constructor(
        transactionManager: PlatformTransactionManager,
        val ppRepo: ValPpTzRepo,
        val pwRepo: ValPpTzPwRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(ValPpTzService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    private val fileName = "VAL_PP_TZ.json"

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
        val ppList = ppRepo.findAllByOrderBySubmissionDateAsc()
        val pwList = pwRepo.findAll()


        val ppTzData = ppList.map { ppTzEntity ->
            val ppTzDto = modelMapper.map(ppTzEntity, ValPpTzDto::class.java)
            ppTzDto.submissionDate = myDateUtil.toDateTimeString(ppTzEntity.submissionDate)
            ppTzDto.start = myDateUtil.toDateTimeString(ppTzEntity.startDate)
            ppTzDto.end = myDateUtil.toDateTimeString(ppTzEntity.endDate)
            ppTzDto.today = myDateUtil.toDateToString(ppTzEntity.todayDate)
            ppTzDto.plantingDate = myDateUtil.toDateToString(ppTzEntity.plantingDate)
            ppTzDto
        }

        val ppTzPwData = pwList.map { ppTzPwEntity ->
            val ppTzPwDto = modelMapper.map(ppTzPwEntity, ValPpTzPwDto::class.java)
            ppTzPwDto
        }


        writeCsvFile.writeCsv(classMap = ValPpTzDto::class.java, data = ppTzData,
                fileName = "VAL_PP_TZ", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = ValPpTzPwDto::class.java, data = ppTzPwData,
                fileName = "VAL_PP_TZ-PW", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
        val list = objectMapper.readValue(file, object : TypeReference<List<ValPpTzForm>>() {})

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

        val ppData = ArrayList<ValPpTzEntity>()
        val pwData = ArrayList<ValPpTzPwEntity>()
        list.forEach { ppForm ->
            //map and save to database
            val ppTzEntity = modelMapper.map(ppForm, ValPpTzEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(ppForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                ppTzEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    ppTzEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    ppTzEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    ppTzEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            ppTzEntity.formHubUuId = ppForm.formhubUuid
            ppTzEntity.submissionDate = myDateUtil.convertToDateTime(ppForm.submissionTime)
            ppTzEntity.todayDate = myDateUtil.convertToDate(ppForm.today)
            ppTzEntity.startDate = myDateUtil.convertToDateTime(ppForm.start)
            ppTzEntity.endDate = myDateUtil.convertToDateTime(ppForm.end)
            ppTzEntity.plantingDate = myDateUtil.convertToDate(ppForm.plantingDate)
            ppTzEntity.instanceId = ppForm.instanceId
            ppTzEntity.controlKey = ppForm.instanceId
            ppTzEntity.setOfPw = "${ppForm.instanceId}/PW"

            ppData.add(ppTzEntity)

            val pwList = ppForm.ppTzPwList
            var pwCounter = 1
            pwList.forEach { pwForm ->
                val pwEntity = modelMapper.map(pwForm, ValPpTzPwEntity::class.java)
                pwEntity.parentKey = ppTzEntity.controlKey
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