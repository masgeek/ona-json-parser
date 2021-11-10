package com.tsobu.ona.core.service.register


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.register.ExDto
import com.tsobu.ona.core.dto.json.register.ExRepeatDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.register.ExEntity
import com.tsobu.ona.database.entities.register.ExRepeatEntity
import com.tsobu.ona.database.repositories.register.ExRepeatRepo
import com.tsobu.ona.database.repositories.register.ExRepo
import com.tsobu.ona.forms.register.ExForm
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
class ExService
constructor(
    transactionManager: PlatformTransactionManager,
    val exRepo: ExRepo,
    val exRepeatRepo: ExRepeatRepo,
    val appConfig: AppConfig
) {

    private val log = LoggerFactory.getLogger(ExService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    val fileName = "Register_EX.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val exList = exRepo.findAllByOrderBySubmissionDateAsc()
        val exRepeatList = exRepeatRepo.findAll()

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


        val exData = exList.map { eaEntity ->
            val eaDto = modelMapper.map(eaEntity, ExDto::class.java)
            eaDto.submissionDate = myDateUtil.toDateTimeString(eaEntity.submissionDate)
            eaDto.start = myDateUtil.toDateTimeString(eaEntity.startDate)
            eaDto.end = myDateUtil.toDateTimeString(eaEntity.endDate)
            eaDto.today = myDateUtil.toDateToString(eaEntity.todayDate)
            eaDto
        }

        val exRepeatData = exRepeatList.map { exRepeatEntity ->
            val exRepeatDto = modelMapper.map(exRepeatEntity, ExRepeatDto::class.java)
            exRepeatDto
        }

        val fileSeparator = File.separator
        val filePath = "${appConfig.globalProperties().outputPath}${fileSeparator}sandman${fileSeparator}"
        writeCsvFile.writeCsv(classMap = ExDto::class.java, data = exData, fileName = "Register_EX", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = ExRepeatDto::class.java, data = exRepeatData, fileName = "Register_EX-treatmentRepeat", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<ExForm>>() {})

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

        val exData = ArrayList<ExEntity>()
        val exRepeatData = ArrayList<ExRepeatEntity>()
        list.forEach { exForm ->
            //map and save to database
            val geoPoint = myDateUtil.splitGeoPoint(exForm.geopoint)
            val exEntity = modelMapper.map(exForm, ExEntity::class.java)
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
//            exEntity.formHubUuId = exForm.formHubUuid
            exEntity.submissionDate = myDateUtil.convertToDateTime(exForm.submissionTime)
            exEntity.todayDate = myDateUtil.convertToDate(exForm.today)
            exEntity.startDate = myDateUtil.convertToDateTime(exForm.start)
            exEntity.endDate = myDateUtil.convertToDateTime(exForm.end)
            exEntity.instanceId = exForm.instanceId
            exEntity.controlKey = exForm.instanceId
            exEntity.setOfTreatmentDetailsTreatmentRepeat = "${exForm.instanceId}/treatmentRepeat"

            val exList = exForm.exRepeat
            var exRepeatLabelCount = 1
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            exList.forEach { repeatForm ->
                val exRepeatEntity = modelMapper.map(repeatForm, ExRepeatEntity::class.java)

                exRepeatEntity.parentKey = exEntity.controlKey
                exRepeatEntity.controlKey = "${exEntity.controlKey}/treatmentRepeat[$exRepeatLabelCount]"
                exRepeatEntity.setOfTreatmentRepeat = "${exEntity.controlKey}/treatmentRepeat"

                exRepeatData.add(exRepeatEntity)
                exRepeatLabelCount = exRepeatLabelCount.plus(1)
            }

            exData.add(exEntity)
            log.info("Added data to table ${exEntity.controlKey} with surname as ${exForm.xformIdString}")
        }

        exRepeatRepo.saveAll(exRepeatData)
        exRepo.saveAll(exData)

        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}