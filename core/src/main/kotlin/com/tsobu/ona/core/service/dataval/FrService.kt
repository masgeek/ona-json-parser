package com.tsobu.ona.core.service.dataval


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.dataval.FrDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.dataval.FrEntity
import com.tsobu.ona.database.repositories.dataval.FrRepo
import com.tsobu.ona.forms.dataval.FrForm
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
class FrService
constructor(
        transactionManager: PlatformTransactionManager,
        val frRepo: FrRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(FrService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()
    private val fileName = "dataVAL_FR.json"

    fun mapJsonFile() {
        log.info("Reading table data....")
        val frList = frRepo.findAllByOrderBySubmissionDateAsc()

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
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT

        val frData = frList.map { frEntity ->
            val frDto = modelMapper.map(frEntity, FrDto::class.java)
            frDto.submissionDate = myDateUtil.toDateTimeString(frEntity.submissionDate)
            frDto.startDate = myDateUtil.toDateTimeString(frEntity.startDate)
            frDto.endDate = myDateUtil.toDateTimeString(frEntity.endDate)
            frDto.todayDate = myDateUtil.toDateToString(frEntity.todayDate)
            frDto.harvestDate = myDateUtil.toDateToString(frEntity.harvestDate)
            frDto.plantingDate = myDateUtil.toDateToString(frEntity.plantingDate)
            frDto.dateWeeding1 = myDateUtil.toDateToString(frEntity.dateWeeding1)
            frDto.dateWeeding2 = myDateUtil.toDateToString(frEntity.dateWeeding2)
            frDto.dateWeeding3 = myDateUtil.toDateToString(frEntity.dateWeeding3)
            frDto.dateWeeding4 = myDateUtil.toDateToString(frEntity.dateWeeding4)
            frDto.dateWeeding5 = myDateUtil.toDateToString(frEntity.dateWeeding5)
            frDto.dateWeeding6 = myDateUtil.toDateToString(frEntity.dateWeeding6)
            frDto.dateWeeding7 = myDateUtil.toDateToString(frEntity.dateWeeding7)
            frDto.dateWeeding8 = myDateUtil.toDateToString(frEntity.dateWeeding8)
            frDto.dateWeeding9 = myDateUtil.toDateToString(frEntity.dateWeeding9)
            frDto.dateWeeding10 = myDateUtil.toDateToString(frEntity.dateWeeding10)

            frDto.gappingDate = myDateUtil.toDateToString(frEntity.gappingDate)

            frDto.dateFertilizer1 = myDateUtil.toDateToString(frEntity.dateFertilizer1)
            frDto.dateFertilizer2 = myDateUtil.toDateToString(frEntity.dateFertilizer2)
            frDto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = FrDto::class.java, data = frData, fileName = "dataVAL_FR", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<FrForm>>() {})

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
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT

        val frEntityData = ArrayList<FrEntity>()
        list.forEach { myVal ->
            //map and save to database
            val geoPoint = myDateUtil.splitGeoPoint(myVal.geopoint)
            val frEntity = modelMapper.map(myVal, FrEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                frEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    frEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    frEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    frEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            frEntity.uuid = myVal.formhubUuid
            frEntity.submissionDate = myDateUtil.convertToDateTime(myVal.submissionTime)
            frEntity.todayDate = myDateUtil.convertToDate(myVal.today)
            frEntity.startDate = myDateUtil.convertToDateTime(myVal.start)
            frEntity.endDate = myDateUtil.convertToDateTime(myVal.end)
            frEntity.plantingDate = myDateUtil.convertToDate(myVal.plantingDate)
            frEntity.harvestDate = myDateUtil.convertToDate(myVal.harvestDate)
            frEntity.instanceId = myVal.instanceId
            frEntity.controlKey = myVal.instanceId

            try {
                frEntityData.add(frEntity)
                log.info("Added data to table ${frEntity.controlKey} with surname as ${myVal.xformIdString}")
            } catch (ex: Exception) {
                log.error(ex.message, ex.stackTrace)
            }
        }

        frRepo.saveAll(frEntityData)

        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}