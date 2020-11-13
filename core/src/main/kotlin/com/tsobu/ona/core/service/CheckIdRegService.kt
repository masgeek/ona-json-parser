package com.tsobu.ona.core.service


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.CheckIdRegDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.CheckIdRegEntity
import com.tsobu.ona.database.repositories.CheckIdRegRepo
import com.tsobu.ona.forms.CheckIdRegForm
import org.modelmapper.AbstractCondition
import org.modelmapper.Condition
import org.modelmapper.ModelMapper
import org.modelmapper.convention.MatchingStrategies
import org.modelmapper.spi.MappingContext
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.PlatformTransactionManager
import java.io.IOException
import java.nio.file.Paths


@Service
class CheckIdRegService
constructor(
        transactionManager: PlatformTransactionManager,
        val checkIdRegRepo: CheckIdRegRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(CheckIdRegService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val writeCsvFile = CsvUtility()

    private val fileName = "Check_ID_Registration.json"
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
        modelMapper.configuration.isAmbiguityIgnored = false
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val filePath = "${appConfig.globalProperties().outputPath}"
        val checkIdRegEntityList = checkIdRegRepo.findAllByOrderBySubmissionDateAsc()



        val tlAcData = checkIdRegEntityList.map { checkIdRegEntity ->
            val checkIdRegDto = modelMapper.map(checkIdRegEntity, CheckIdRegDto::class.java)
            checkIdRegDto.submissionDate = myDateUtil.toDateTimeString(checkIdRegEntity.submissionDate)
            checkIdRegDto.startDate = myDateUtil.toDateTimeString(checkIdRegEntity.startDate)
            checkIdRegDto.endDate = myDateUtil.toDateTimeString(checkIdRegEntity.endDate)
            checkIdRegDto.todayDate = myDateUtil.toDateToString(checkIdRegEntity.todayDate)
            checkIdRegDto
        }


        writeCsvFile.writeCsv(classMap = CheckIdRegDto::class.java,
                data = tlAcData,
                fileName = "Check_ID_Registration",
                outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<CheckIdRegForm>>() {})

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

        val checkIdRegData = ArrayList<CheckIdRegEntity>()
        list.forEach { checkIdRegForm ->
            //map and save to database
            val checkIdRegEntity = modelMapper.map(checkIdRegForm, CheckIdRegEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(checkIdRegForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                checkIdRegEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    checkIdRegEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    checkIdRegEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    checkIdRegEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            checkIdRegEntity.formHubUuId = checkIdRegForm.formhubUuid
            checkIdRegEntity.submissionDate = myDateUtil.convertToDateTime(checkIdRegForm.submissionTime)
            checkIdRegEntity.todayDate = myDateUtil.convertToDate(checkIdRegForm.todayDate)
            checkIdRegEntity.startDate = myDateUtil.convertToDateTime(checkIdRegForm.startDate)
            checkIdRegEntity.endDate = myDateUtil.convertToDateTime(checkIdRegForm.endDate)
            checkIdRegEntity.instanceId = checkIdRegForm.instanceId
            checkIdRegEntity.controlKey = checkIdRegForm.instanceId

            checkIdRegData.add(checkIdRegEntity)
        }

        checkIdRegRepo.saveAll(checkIdRegData)

        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}