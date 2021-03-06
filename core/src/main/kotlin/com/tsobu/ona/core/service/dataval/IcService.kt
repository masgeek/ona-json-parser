package com.tsobu.ona.core.service.dataval


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.dataval.IcDto
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.dataval.IcEntity
import com.tsobu.ona.database.repositories.dataval.IcRepo
import com.tsobu.ona.forms.dataval.IcForm
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
class IcService
constructor(
        transactionManager: PlatformTransactionManager,
        val icRepo: IcRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(IcService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    val fileName = "dataVAL_IC.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val frList = icRepo.findAllByOrderBySubmissionDateAsc()

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


        val icData = frList.map { icEntity ->
            val icDto = modelMapper.map(icEntity, IcDto::class.java)
            icDto.submissionDate = myDateUtil.toDateTimeString(icEntity.submissionDate)
            icDto.startDate = myDateUtil.toDateTimeString(icEntity.startDate)
            icDto.endDate = myDateUtil.toDateTimeString(icEntity.endDate)

            icDto.todayDate = myDateUtil.toDateToString(icEntity.todayDate)
            icDto.dateCassavaHarvest = myDateUtil.toDateToString(icEntity.dateCassavaHarvest)
            icDto.dateMaizeHarvest = myDateUtil.toDateToString(icEntity.dateMaizeHarvest)
            icDto.cassavaGappingDate = myDateUtil.toDateToString(icEntity.cassavaGappingDate)

            icDto.plantingDate = myDateUtil.toDateToString(icEntity.plantingDate)
            icDto.dateWeeding1 = myDateUtil.toDateToString(icEntity.dateWeeding1)
            icDto.dateWeeding2 = myDateUtil.toDateToString(icEntity.dateWeeding2)
            icDto.dateWeeding3 = myDateUtil.toDateToString(icEntity.dateWeeding3)
            icDto.dateWeeding4 = myDateUtil.toDateToString(icEntity.dateWeeding4)
            icDto.dateWeeding5 = myDateUtil.toDateToString(icEntity.dateWeeding5)
            icDto.dateWeeding6 = myDateUtil.toDateToString(icEntity.dateWeeding6)
            icDto.dateWeeding7 = myDateUtil.toDateToString(icEntity.dateWeeding7)
            icDto.dateWeeding8 = myDateUtil.toDateToString(icEntity.dateWeeding8)
            icDto.dateWeeding9 = myDateUtil.toDateToString(icEntity.dateWeeding9)
            icDto.dateWeeding10 = myDateUtil.toDateToString(icEntity.dateWeeding10)

            icDto.maizeReseedingDate = myDateUtil.toDateToString(icEntity.maizeReseedingDate)
            icDto.maizeThinningDate = myDateUtil.toDateToString(icEntity.maizeThinningDate)

            icDto.dateFertilizer0 = myDateUtil.toDateToString(icEntity.dateFertilizer0)
            icDto.dateFertilizer1 = myDateUtil.toDateToString(icEntity.dateFertilizer1)
            icDto.dateFertilizer2 = myDateUtil.toDateToString(icEntity.dateFertilizer2)

            icDto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = IcDto::class.java, data = icData, fileName = "dataVAL_IC", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<IcForm>>() {})

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

        val icData = ArrayList<IcEntity>()
        list.forEach { icForm ->
            //map and save to database
            val geoPoint = myDateUtil.splitGeoPoint(icForm.geopoint)
            val icEntity = modelMapper.map(icForm, IcEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                icEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    icEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    icEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    icEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            icEntity.formHubUuId = icForm.formhubUuid
            icEntity.instanceid = icForm.instanceId
            icEntity.controlKey = icForm.instanceId

            icEntity.submissionDate = myDateUtil.convertToDateTime(icForm.submissionTime)
            icEntity.todayDate = myDateUtil.convertToDate(icForm.todayDate)
            icEntity.startDate = myDateUtil.convertToDateTime(icForm.startDate)
            icEntity.endDate = myDateUtil.convertToDateTime(icForm.endDate)
            icEntity.plantingDate = myDateUtil.convertToDate(icForm.plantingDate)
            icEntity.dateFertilizer0 = myDateUtil.convertToDate(icForm.dateFertilizer0)
            icEntity.dateFertilizer1 = myDateUtil.convertToDate(icForm.dateFertilizer1)
            icEntity.dateFertilizer2 = myDateUtil.convertToDate(icForm.dateFertilizer2)
            icEntity.dateCassavaHarvest = myDateUtil.convertToDate(icForm.dateCassavaHarvest)
            icEntity.dateMaizeHarvest = myDateUtil.convertToDate(icForm.dateMaizeHarvest)
            icEntity.cassavaGappingDate = myDateUtil.convertToDate(icForm.cassavaGappingDate)
            icEntity.maizeReseedingDate = myDateUtil.convertToDate(icForm.maizeReseedingDate)
            icEntity.maizeThinningDate = myDateUtil.convertToDate(icForm.maizeThinningDate)
            icEntity.dateWeeding1 = myDateUtil.convertToDate(icForm.dateWeeding1)
            icEntity.dateWeeding2 = myDateUtil.convertToDate(icForm.dateWeeding2)
            icEntity.dateWeeding3 = myDateUtil.convertToDate(icForm.dateWeeding3)
            icEntity.dateWeeding4 = myDateUtil.convertToDate(icForm.dateWeeding4)
            icEntity.dateWeeding5 = myDateUtil.convertToDate(icForm.dateWeeding5)
            icEntity.dateWeeding6 = myDateUtil.convertToDate(icForm.dateWeeding6)
            icEntity.dateWeeding7 = myDateUtil.convertToDate(icForm.dateWeeding7)



            log.info("Processing planting date for id ${icEntity.controlKey} with date as ${icForm.plantingDate}")
            icData.add(icEntity)
        }

        icRepo.saveAll(icData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}