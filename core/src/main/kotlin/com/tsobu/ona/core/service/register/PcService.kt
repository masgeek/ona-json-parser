package com.tsobu.ona.core.service.register


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.register.PcDto
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.register.PcEntity
import com.tsobu.ona.database.repositories.register.PcRepo
import com.tsobu.ona.forms.register.PcForm
import org.modelmapper.AbstractCondition
import org.modelmapper.Condition
import org.modelmapper.ModelMapper
import org.modelmapper.convention.MatchingStrategies
import org.modelmapper.spi.MappingContext
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.support.TransactionTemplate
import java.io.File
import java.io.IOException
import java.nio.file.Paths


@Service
class PcService
constructor(
    transactionManager: PlatformTransactionManager,
    val pcRepo: PcRepo,
    val appConfig: AppConfig
) {

    private val log = LoggerFactory.getLogger(PcService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    val fileName = "Register_PC.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val pcList = pcRepo.findAllByOrderBySubmissionDateAsc()

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


        val pcData = pcList.map { eaEntity ->
            val eaDto = modelMapper.map(eaEntity, PcDto::class.java)
            eaDto.submissionDate = myDateUtil.toDateTimeString(eaEntity.submissionDate)
            eaDto.start = myDateUtil.toDateTimeString(eaEntity.startDate)
            eaDto.end = myDateUtil.toDateTimeString(eaEntity.endDate)
            eaDto.today = myDateUtil.toDateToString(eaEntity.todayDate)
            eaDto
        }

        val fileSeparator = File.separator
        val filePath = "${appConfig.globalProperties().outputPath}${fileSeparator}sandman${fileSeparator}"
        writeCsvFile.writeCsv(classMap = PcDto::class.java, data = pcData, fileName = "Register_PC", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<PcForm>>() {})

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

        val pcData = ArrayList<PcEntity>()
        list.forEach { pcForm ->
            //map and save to database
            val geoPoint = myDateUtil.splitGeoPoint(pcForm.geopoint)
            val pcEntity = modelMapper.map(pcForm, PcEntity::class.java)
//            if (geoPoint.isNotEmpty()) {
//                frEntity.geoPointLatitude = geoPoint[0]
//
//                if (myDateUtil.indexExists(geoPoint, 1)) {
//                    frEntity.geoPointLongitude = geoPoint[1]
//                }
//                if (myDateUtil.indexExists(geoPoint, 2)) {
//                    frEntity.geoPointAltitude = geoPoint[2]
//                }
//                if (myDateUtil.indexExists(geoPoint, 3)) {
//                    frEntity.geoPointAccuracy = geoPoint[3]
//                }
//            }
//            pcEntity.formHubUuId = pcForm.formHubUuid
            pcEntity.submissionDate = myDateUtil.convertToDateTime(pcForm.submissionTime)
            pcEntity.todayDate = myDateUtil.convertToDate(pcForm.today)
            pcEntity.startDate = myDateUtil.convertToDateTime(pcForm.start)
            pcEntity.endDate = myDateUtil.convertToDateTime(pcForm.end)
            pcEntity.instanceId = pcForm.instanceId
            pcEntity.controlKey = pcForm.instanceId


            pcData.add(pcEntity)
            log.info("Added data to table ${pcEntity.controlKey} with surname as ${pcForm.xformIdString}")
        }

        pcRepo.saveAll(pcData)

        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}