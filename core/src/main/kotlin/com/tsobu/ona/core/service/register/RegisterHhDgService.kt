package com.tsobu.ona.core.service.register

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.register.RegisterHhDgDto
import com.tsobu.ona.core.interfaces.IJsonProcessor
import com.tsobu.ona.core.service.akilimo.UptakeService
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.register.RegisterHhDgEntity
import com.tsobu.ona.database.repositories.register.RegisterHhDgRepo
import com.tsobu.ona.forms.register.RegisterHhDgForm
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
class RegisterHhDgService(
    val registerHhDgRepo: RegisterHhDgRepo,
    val appConfig: AppConfig
) : IJsonProcessor {

    private val log = LoggerFactory.getLogger(UptakeService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val writeCsvFile = CsvUtility()

    val fileName = "Register_HH_DG.json"

    override fun mapJsonFile() {
        log.info("Reading table data....")
        val registerList = registerHhDgRepo.findAllByOrderBySubmissionDateAsc()

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
        val filePath = "${appConfig.globalProperties().outputPath}${fileSeparator}DG${fileSeparator}"
        val registerData = registerList.map { choiceValidationEntity ->
            val registerHhDgDto = modelMapper.map(choiceValidationEntity, RegisterHhDgDto::class.java)
            registerHhDgDto.submissionDate = myDateUtil.toDateTimeString(choiceValidationEntity.submissionDate)
            registerHhDgDto.end = myDateUtil.toDateTimeString(choiceValidationEntity.endDate)
            registerHhDgDto.start = myDateUtil.toDateTimeString(choiceValidationEntity.startDate)
            registerHhDgDto.today = myDateUtil.toDateToString(choiceValidationEntity.todayDate)
            registerHhDgDto
        }

        writeCsvFile.writeCsv(
            classMap = RegisterHhDgDto::class.java, data = registerData,
            fileName = "Register_HH_DG", outPutPath = filePath
        )
    }

    @Throws(IOException::class)
    override fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<RegisterHhDgForm>>() {})

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

        val registerData = ArrayList<RegisterHhDgEntity>()
        list.forEach { choiceValidationForm ->
            val geoPoint = myDateUtil.splitGeoPoint(choiceValidationForm.geopoint)

            val registerHhEntity = modelMapper.map(choiceValidationForm, RegisterHhDgEntity::class.java)
            registerHhEntity.instanceId = choiceValidationForm.instanceId
            registerHhEntity.controlKey = choiceValidationForm.instanceId
            registerHhEntity.uuid = choiceValidationForm.formhubUuid

            registerHhEntity.submissionDate = myDateUtil.convertToDateTime(choiceValidationForm.submissionTime)
            registerHhEntity.todayDate = myDateUtil.convertToDate(choiceValidationForm.today)
            registerHhEntity.endDate = myDateUtil.convertToDateTime(choiceValidationForm.end)
            registerHhEntity.startDate = myDateUtil.convertToDateTime(choiceValidationForm.start)

            if (geoPoint.isNotEmpty()) {
                registerHhEntity.geopointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    registerHhEntity.geopointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    registerHhEntity.geopointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    registerHhEntity.geopointAccuracy = geoPoint[3]
                }
            }

            registerData.add(registerHhEntity)
        }

        registerHhDgRepo.saveAll(registerData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}