package com.tsobu.ona.core.service.survey

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.survey.FipSurvey2020Dto
import com.tsobu.ona.core.interfaces.IJsonProcessor
import com.tsobu.ona.core.service.akilimo.UptakeService
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.survey.FipSurvey2020Entity
import com.tsobu.ona.database.repositories.survey.FipSurvey2020Repo
import com.tsobu.ona.forms.survey.FipSurvey2020Form
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
class FipSurvey2020Service(
    val fipSurvey2020Repo: FipSurvey2020Repo,
    val appConfig: AppConfig
) : IJsonProcessor {

    private val log = LoggerFactory.getLogger(UptakeService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val writeCsvFile = CsvUtility()

    val fileName = "FIP_Survey_2020.json"

    override fun mapJsonFile() {
        log.info("Reading table data....")
        val surveyList = fipSurvey2020Repo.findAllByOrderBySubmissionDateAsc()

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
        val uptakeData = surveyList.map { fipSurvey2020Entity ->
            val choiceValidationDto = modelMapper.map(fipSurvey2020Entity, FipSurvey2020Dto::class.java)
            choiceValidationDto.submissionDate = myDateUtil.toDateTimeString(fipSurvey2020Entity.submissionDate)
            choiceValidationDto.end = myDateUtil.toDateTimeString(fipSurvey2020Entity.endDate)
            choiceValidationDto.today = myDateUtil.toDateToString(fipSurvey2020Entity.todayDate)
            choiceValidationDto
        }

        writeCsvFile.writeCsv(
            classMap = FipSurvey2020Dto::class.java, data = uptakeData,
            fileName = "FIP_Survey_2020", outPutPath = filePath
        )
    }

    @Throws(IOException::class)
    override fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<FipSurvey2020Form>>() {})

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

        val choiceValidationData = ArrayList<FipSurvey2020Entity>()
        list.forEach { choiceValidationForm ->
            val choiceValidationEntity = modelMapper.map(choiceValidationForm, FipSurvey2020Entity::class.java)
            choiceValidationEntity.instanceId = choiceValidationForm.instanceId
            choiceValidationEntity.controlKey = choiceValidationForm.instanceId
            choiceValidationEntity.formhubUuid = choiceValidationForm.formhubUuid

            choiceValidationEntity.submissionDate = myDateUtil.convertToDateTime(choiceValidationForm.submissionTime)
            choiceValidationEntity.todayDate = myDateUtil.convertToDate(choiceValidationForm.today)
            choiceValidationEntity.endDate = myDateUtil.convertToDateTime(choiceValidationForm.end)

            choiceValidationData.add(choiceValidationEntity)
        }

        fipSurvey2020Repo.saveAll(choiceValidationData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}