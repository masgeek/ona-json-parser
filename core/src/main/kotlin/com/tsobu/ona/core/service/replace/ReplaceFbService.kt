package com.tsobu.ona.core.service.replace


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.replace.ReplaceFbAcDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.replace.ReplaceFbAcEntity
import com.tsobu.ona.database.repositories.replace.ReplaceFbAcRepo
import com.tsobu.ona.forms.replace.ReplaceFbAcForm
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
class ReplaceFbService
constructor(
        transactionManager: PlatformTransactionManager,
        val acRepo: ReplaceFbAcRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(ReplaceFbService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    val fileName = "Replace_FB_AC.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val acList = acRepo.findAllByOrderBySubmissionDateAsc()

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


        val acData = acList.map { acEntity ->
            val acDto = modelMapper.map(acEntity, ReplaceFbAcDto::class.java)
            acDto.submissionDate = myDateUtil.toDateTimeString(acEntity.submissionDate)
            acDto.startDate = myDateUtil.toDateTimeString(acEntity.startDate)
            acDto.endDate = myDateUtil.toDateTimeString(acEntity.endDate)
            acDto.today = myDateUtil.toDateToString(acEntity.todayDate)
            acDto
        }
        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = ReplaceFbAcDto::class.java, data = acData,
                fileName = "Replace_FB_AC", outPutPath = filePath)

    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<ReplaceFbAcForm>>() {})

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

        val acData = ArrayList<ReplaceFbAcEntity>()
        list.forEach { acForm ->
            //map and save to database
            val acEntity = modelMapper.map(acForm, ReplaceFbAcEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(acForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                acEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    acEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    acEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    acEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            acEntity.formHubUuId = acForm.formhubUuid
            acEntity.submissionDate = myDateUtil.convertToDateTime(acForm.submissionTime)
            acEntity.todayDate = myDateUtil.convertToDate(acForm.today)
            acEntity.startDate = myDateUtil.convertToDateTime(acForm.start)
            acEntity.endDate = myDateUtil.convertToDateTime(acForm.end)
            acEntity.instanceId = acForm.instanceId
            acEntity.controlKey = acForm.instanceId

            acData.add(acEntity)
        }


        acRepo.saveAll(acData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}