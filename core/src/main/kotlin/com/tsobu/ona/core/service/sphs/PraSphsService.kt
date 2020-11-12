package com.tsobu.ona.core.service.sphs


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.sphs.PraSphsDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.sphs.PraSphsEntity
import com.tsobu.ona.database.repositories.sphs.PraSphsRepo
import com.tsobu.ona.forms.sphs.PraSphsForm
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
class PraSphsService
constructor(
        transactionManager: PlatformTransactionManager,
        val praSphsRepo: PraSphsRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(PraSphsService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    val fileName = "PRA_SPHS.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val acList = praSphsRepo.findAllByOrderBySubmissionDateAsc()

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


        val praSphsData = acList.map { praSphsEntity ->
            val praSphsDto = modelMapper.map(praSphsEntity, PraSphsDto::class.java)
            praSphsDto.submissionDate = myDateUtil.toDateTimeString(praSphsEntity.submissionDate)
            praSphsDto.startDate = myDateUtil.toDateTimeString(praSphsEntity.startDate)
            praSphsDto.endDate = myDateUtil.toDateTimeString(praSphsEntity.endDate)
            praSphsDto.today = myDateUtil.toDateToString(praSphsEntity.todayDate)
            praSphsDto
        }
        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = PraSphsDto::class.java, data = praSphsData,
                fileName = "PRA_SPHS", outPutPath = filePath)

    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<PraSphsForm>>() {})

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

        val praSphsData = ArrayList<PraSphsEntity>()
        list.forEach { praSphsForm ->
            val praSphsEntity = modelMapper.map(praSphsForm, PraSphsEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(praSphsForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                praSphsEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    praSphsEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    praSphsEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    praSphsEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            praSphsEntity.formHubUuId = praSphsForm.formhubUuid
            praSphsEntity.submissionDate = myDateUtil.convertToDateTime(praSphsForm.submissionTime)
            praSphsEntity.todayDate = myDateUtil.convertToDate(praSphsForm.today)
            praSphsEntity.startDate = myDateUtil.convertToDateTime(praSphsForm.start)
            praSphsEntity.endDate = myDateUtil.convertToDateTime(praSphsForm.end)
            praSphsEntity.instanceId = praSphsForm.instanceId
            praSphsEntity.controlKey = praSphsForm.instanceId

            praSphsData.add(praSphsEntity)
        }


        praSphsRepo.saveAll(praSphsData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}