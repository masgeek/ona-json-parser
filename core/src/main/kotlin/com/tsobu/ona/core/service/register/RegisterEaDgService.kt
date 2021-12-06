package com.tsobu.ona.core.service.register

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.register.RegisterEaDgDto
import com.tsobu.ona.core.interfaces.IJsonProcessor
import com.tsobu.ona.core.service.akilimo.UptakeService
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.register.RegisterEaDgEntity
import com.tsobu.ona.database.repositories.register.RegisterEaDgRepo
import com.tsobu.ona.forms.register.RegisterEaDgForm
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
class RegisterEaDgService(
    val registerEaDgRepo: RegisterEaDgRepo,
    val appConfig: AppConfig
) : IJsonProcessor {

    private val log = LoggerFactory.getLogger(UptakeService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val writeCsvFile = CsvUtility()

    val fileName = "Register_EA_DG.json"

    override fun mapJsonFile() {
        log.info("Reading table data....")
        val registerList = registerEaDgRepo.findAllByOrderBySubmissionDateAsc()

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
        val registerData = registerList.map { registerEaDgEntity ->
            val registerEaDgDto = modelMapper.map(registerEaDgEntity, RegisterEaDgDto::class.java)
            registerEaDgDto.submissionDate = myDateUtil.toDateTimeString(registerEaDgEntity.submissionDate)
            registerEaDgDto.end = myDateUtil.toDateTimeString(registerEaDgEntity.endDate)
            registerEaDgDto.start = myDateUtil.toDateTimeString(registerEaDgEntity.startDate)
            registerEaDgDto.today = myDateUtil.toDateToString(registerEaDgEntity.todayDate)
            registerEaDgDto
        }

        writeCsvFile.writeCsv(
            classMap = RegisterEaDgDto::class.java, data = registerData,
            fileName = "Register_EA_DG", outPutPath = filePath
        )
    }

    @Throws(IOException::class)
    override fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<RegisterEaDgForm>>() {})

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

        val registerData = ArrayList<RegisterEaDgEntity>()
        list.forEach { registerEaDgForm ->
            val geoPoint = myDateUtil.splitGeoPoint(registerEaDgForm.geopoint)

            val registerEaDgEntity = modelMapper.map(registerEaDgForm, RegisterEaDgEntity::class.java)
            registerEaDgEntity.instanceId = registerEaDgForm.instanceId
            registerEaDgEntity.controlKey = registerEaDgForm.instanceId
            registerEaDgEntity.uuid = registerEaDgForm.formhubUuid

            registerEaDgEntity.submissionDate = myDateUtil.convertToDateTime(registerEaDgForm.submissionTime)
            registerEaDgEntity.todayDate = myDateUtil.convertToDate(registerEaDgForm.today)
            registerEaDgEntity.endDate = myDateUtil.convertToDateTime(registerEaDgForm.end)
            registerEaDgEntity.startDate = myDateUtil.convertToDateTime(registerEaDgForm.start)

            if (geoPoint.isNotEmpty()) {
                registerEaDgEntity.geopointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    registerEaDgEntity.geopointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    registerEaDgEntity.geopointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    registerEaDgEntity.geopointAccuracy = geoPoint[3]
                }
            }

            registerData.add(registerEaDgEntity)
        }

        registerEaDgRepo.saveAll(registerData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}