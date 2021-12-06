package com.tsobu.ona.core.service.register

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.register.SgRegisterHhDto
import com.tsobu.ona.core.interfaces.IJsonProcessor
import com.tsobu.ona.core.service.akilimo.UptakeService
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.register.SgRegisterHhEntity
import com.tsobu.ona.database.repositories.register.SgRegisterHhRepo
import com.tsobu.ona.forms.register.SgRegisterHhForm
import org.modelmapper.AbstractCondition
import org.modelmapper.Condition
import org.modelmapper.ModelMapper
import org.modelmapper.convention.MatchingStrategies
import org.modelmapper.spi.MappingContext
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.io.File
import java.io.IOException
import java.nio.file.Paths

@Service
class SgRegisterHhService(
    val registerHhRepo: SgRegisterHhRepo,
    val appConfig: AppConfig
) : IJsonProcessor {

    private val log = LoggerFactory.getLogger(UptakeService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val writeCsvFile = CsvUtility()

    val fileName = "SG_Register_HH.json"

    override fun mapJsonFile() {
        log.info("Reading table data....")
        val registerList = registerHhRepo.findAllByOrderBySubmissionDateAsc()

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

        val fileSeparator = File.separator
        val filePath = "${appConfig.globalProperties().outputPath}${fileSeparator}EiA_SAA${fileSeparator}"
        val registerData = registerList.map { choiceValidationEntity ->
            val registerHhDto = modelMapper.map(choiceValidationEntity, SgRegisterHhDto::class.java)
            registerHhDto.submissionDate = myDateUtil.toDateTimeString(choiceValidationEntity.submissionDate)
            registerHhDto.end = myDateUtil.toDateTimeString(choiceValidationEntity.endDate)
            registerHhDto.start = myDateUtil.toDateTimeString(choiceValidationEntity.startDate)
            registerHhDto.today = myDateUtil.toDateToString(choiceValidationEntity.todayDate)
            registerHhDto
        }

        writeCsvFile.writeCsv(
            classMap = SgRegisterHhDto::class.java, data = registerData,
            fileName = "SG_Register_HH", outPutPath = filePath
        )
    }

    @Throws(IOException::class)
    override fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<SgRegisterHhForm>>() {})

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

        val registerData = ArrayList<SgRegisterHhEntity>()
        list.forEach { choiceValidationForm ->
            val geoPoint = myDateUtil.splitGeoPoint(choiceValidationForm.hhlocationGeopoint)

            val registerHhEntity = modelMapper.map(choiceValidationForm, SgRegisterHhEntity::class.java)
            registerHhEntity.instanceId = choiceValidationForm.instanceId
            registerHhEntity.controlKey = choiceValidationForm.instanceId
            registerHhEntity.formhubUuid = choiceValidationForm.formhubUuid

            registerHhEntity.submissionDate = myDateUtil.convertToDateTime(choiceValidationForm.submissionTime)
            registerHhEntity.todayDate = myDateUtil.convertToDate(choiceValidationForm.today)
            registerHhEntity.endDate = myDateUtil.convertToDateTime(choiceValidationForm.end)
            registerHhEntity.startDate = myDateUtil.convertToDateTime(choiceValidationForm.start)

            if (geoPoint.isNotEmpty()) {
                registerHhEntity.hhLocationGeopointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    registerHhEntity.hhLocationGeopointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    registerHhEntity.hhLocationGeopointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    registerHhEntity.hhLocationGeopointAccuracy = geoPoint[3]
                }
            }

            registerData.add(registerHhEntity)
        }

        registerHhRepo.saveAll(registerData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}