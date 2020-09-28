package com.tsobu.ona.core.service.dataval


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.forms.dataval.PpTzForm
import com.tsobu.ona.core.dto.json.dataval.FrDto
import com.tsobu.ona.core.dto.json.dataval.PpTzDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.dataval.PpEntity
import com.tsobu.ona.database.repositories.dataval.PpRepo
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
class PpService
constructor(
        transactionManager: PlatformTransactionManager,
        val ppRepo: PpRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(PpService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myUtils = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()

    fun mapJsonFile() {
        log.info("Reading table data....")
        val frList = ppRepo.findAllByOrderBySubmissionDateAsc()

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

        val ppData = frList.map { ppEntity ->
            val ppTzDto = modelMapper.map(ppEntity, PpTzDto::class.java)
            ppTzDto.submissionDate = myUtils.convertTimeToString(ppEntity.submissionDate)
            ppTzDto.startDate = myUtils.convertTimeToString(ppEntity.startDate)
            ppTzDto.endDate = myUtils.convertTimeToString(ppEntity.endDate)

            ppTzDto
        }


        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(pojoType = FrDto::class.java, data = ppData, fileName = "dataVAL_PP-", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset(fileName: String) {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<PpTzForm>>() {})

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
//        modelMapper.configuration.sourceNameTokenizer = NameTokenizers.CAMEL_CASE
        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val ppEntityData = ArrayList<PpEntity>()
        list.forEach { myVal ->
            //map and save to database
            val geoPoint = myUtils.splitGeoPoint(myVal.geopoint)
            val ppEntity = modelMapper.map(myVal, PpEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                ppEntity.geoPointLatitude = geoPoint[0]

                if (myUtils.indexExists(geoPoint, 1)) {
                    ppEntity.geoPointLongitude = geoPoint[1]
                }
                if (myUtils.indexExists(geoPoint, 2)) {
                    ppEntity.geoPointAltitude = geoPoint[2]
                }
                if (myUtils.indexExists(geoPoint, 3)) {
                    ppEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            ppEntity.uuid = myVal.formhubUuid
            ppEntity.submissionDate = myUtils.convertToDateTime(myVal.submissionTime)
            ppEntity.todayDate = myUtils.convertToDate(myVal.today)
            ppEntity.startDate = myUtils.convertToDateTime(myVal.start)
            ppEntity.endDate = myUtils.convertToDateTime(myVal.end)
            ppEntity.harvestDate = myUtils.convertToDate(myVal.harvestDate)
            ppEntity.plantingDate = myUtils.convertToDate(myVal.plantingDate)
            ppEntity.instanceId = myVal.metaInstanceID
            ppEntity.controlKey = myVal.metaInstanceID


//            ppEntity.tuberizedMarketableRootsNrRecBpp3 = myVal.tuberizedMarketableRootsFwRecBpp3

            ppEntityData.add(ppEntity)

        }

        ppRepo.saveAll(ppEntityData)

        log.info("Finished saving the data for $fileName------->")
    }
}