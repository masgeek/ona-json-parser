package com.tsobu.ona.core.service.register

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.register.SgRegisterEaDto
import com.tsobu.ona.core.interfaces.IJsonProcessor
import com.tsobu.ona.core.service.akilimo.UptakeService
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.register.SgRegisterEaEntity
import com.tsobu.ona.database.repositories.register.SgRegisterEaRepo
import com.tsobu.ona.forms.register.SgRegisterEaForm
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
class SgRegisterEaService(
    val registerEaRepo: SgRegisterEaRepo,
    val appConfig: AppConfig
) : IJsonProcessor {

    private val log = LoggerFactory.getLogger(UptakeService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val writeCsvFile = CsvUtility()

    val fileName = "SG_Register_EA.json"

    override fun mapJsonFile() {
        log.info("Reading table data....")
        val registerList = registerEaRepo.findAllByOrderBySubmissionDateAsc()

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
            val registerEaDto = modelMapper.map(choiceValidationEntity, SgRegisterEaDto::class.java)
            registerEaDto.submissionDate = myDateUtil.toDateTimeString(choiceValidationEntity.submissionDate)
            registerEaDto.end = myDateUtil.toDateTimeString(choiceValidationEntity.endDate)
            registerEaDto.start = myDateUtil.toDateTimeString(choiceValidationEntity.startDate)
            registerEaDto.today = myDateUtil.toDateToString(choiceValidationEntity.todayDate)
            registerEaDto
        }

        writeCsvFile.writeCsv(
            classMap = SgRegisterEaDto::class.java, data = registerData,
            fileName = "SG_Register_EA", outPutPath = filePath
        )
    }

    @Throws(IOException::class)
    override fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<SgRegisterEaForm>>() {})

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

        val choiceValidationData = ArrayList<SgRegisterEaEntity>()
        list.forEach { choiceValidationForm ->
            val geoPoint = myDateUtil.splitGeoPoint(choiceValidationForm.areaEAGeopoint)

            val choiceValidationEntity = modelMapper.map(choiceValidationForm, SgRegisterEaEntity::class.java)
            choiceValidationEntity.instanceId = choiceValidationForm.instanceId
            choiceValidationEntity.controlKey = choiceValidationForm.instanceId
            choiceValidationEntity.formhubUuid = choiceValidationForm.formhubUuid

            choiceValidationEntity.submissionDate = myDateUtil.convertToDateTime(choiceValidationForm.submissionTime)
            choiceValidationEntity.todayDate = myDateUtil.convertToDate(choiceValidationForm.today)
            choiceValidationEntity.endDate = myDateUtil.convertToDateTime(choiceValidationForm.end)
            choiceValidationEntity.startDate = myDateUtil.convertToDateTime(choiceValidationForm.start)

            if (geoPoint.isNotEmpty()) {
                choiceValidationEntity.areaEaGeopointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    choiceValidationEntity.areaEaGeopointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    choiceValidationEntity.areaEaGeopointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    choiceValidationEntity.areaEaGeopointAccuracy = geoPoint[3]
                }
            }

            choiceValidationData.add(choiceValidationEntity)
        }

        registerEaRepo.saveAll(choiceValidationData)
        log.info("Finished saving the data for $fileName------->")
//        mapJsonFile()
    }
}