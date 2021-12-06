package com.tsobu.ona.core.service.validation

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.validation.ChoiceValidationKanoKadunaDto
import com.tsobu.ona.core.interfaces.IJsonProcessor
import com.tsobu.ona.core.service.akilimo.UptakeService
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.validation.ChoiceValidationKanoKadunaEntity
import com.tsobu.ona.database.repositories.validation.ChoiceValidationKanoKadunaRepo
import com.tsobu.ona.forms.validation.ChoiceValidationKanoKadunaForm
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
class ChoiceValidationKanoKadunaService(
    val choiceRepo: ChoiceValidationKanoKadunaRepo,
    val appConfig: AppConfig
) : IJsonProcessor {

    private val log = LoggerFactory.getLogger(UptakeService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val writeCsvFile = CsvUtility()

    val fileName = "Choice_Validation_Kano_Kaduna.json"

    override fun mapJsonFile() {
        log.info("Reading table data....")
        val choiceList = choiceRepo.findAllByOrderBySubmissionDateAsc()

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
        val uptakeData = choiceList.map { choiceValidationEntity ->
            val choiceValidationDto = modelMapper.map(choiceValidationEntity, ChoiceValidationKanoKadunaDto::class.java)
            choiceValidationDto.submissionDate = myDateUtil.toDateTimeString(choiceValidationEntity.submissionDate)
            choiceValidationDto.end = myDateUtil.toDateTimeString(choiceValidationEntity.endDate)
            choiceValidationDto.today = myDateUtil.toDateToString(choiceValidationEntity.todayDate)
            choiceValidationDto
        }

        writeCsvFile.writeCsv(
            classMap = ChoiceValidationKanoKadunaDto::class.java, data = uptakeData,
            fileName = "Choice_Validation_Kano_Kaduna", outPutPath = filePath
        )
    }

    @Throws(IOException::class)
    override fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<ChoiceValidationKanoKadunaForm>>() {})

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

        val choiceValidationData = ArrayList<ChoiceValidationKanoKadunaEntity>()
        list.forEach { choiceValidationForm ->
            val choiceValidationEntity = modelMapper.map(choiceValidationForm, ChoiceValidationKanoKadunaEntity::class.java)
            choiceValidationEntity.instanceId = choiceValidationForm.instanceId
            choiceValidationEntity.controlKey = choiceValidationForm.instanceId
            choiceValidationEntity.formhubUuid = choiceValidationForm.formhubUuid

            choiceValidationEntity.submissionDate = myDateUtil.convertToDateTime(choiceValidationForm.submissionTime)
            choiceValidationEntity.todayDate = myDateUtil.convertToDate(choiceValidationForm.today)
            choiceValidationEntity.endDate = myDateUtil.convertToDateTime(choiceValidationForm.end)

            choiceValidationData.add(choiceValidationEntity)
        }

        choiceRepo.saveAll(choiceValidationData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}