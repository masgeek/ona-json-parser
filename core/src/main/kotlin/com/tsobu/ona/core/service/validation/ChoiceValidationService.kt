package com.tsobu.ona.core.service.validation

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.interfaces.IJsonProcessor
import com.tsobu.ona.core.service.akilimo.UptakeService
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.validation.ChoiceValidationEntity
import com.tsobu.ona.database.repositories.validation.ChoiceValidationRepo
import com.tsobu.ona.forms.validation.ChoiceValidationForm
import org.modelmapper.AbstractCondition
import org.modelmapper.Condition
import org.modelmapper.ModelMapper
import org.modelmapper.convention.MatchingStrategies
import org.modelmapper.spi.MappingContext
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.io.IOException
import java.nio.file.Paths

@Service
class ChoiceValidationService(
    val choiceRepo: ChoiceValidationRepo,
    val appConfig: AppConfig
) : IJsonProcessor {

    private val log = LoggerFactory.getLogger(UptakeService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val writeCsvFile = CsvUtility()

    val fileName = "Choice_Validation.json"

    override fun mapJsonFile() {
        TODO("Not yet implemented")
    }

    @Throws(IOException::class)
    override fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<ChoiceValidationForm>>() {})

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

        val choiceValidationData = ArrayList<ChoiceValidationEntity>()
        list.forEach { choiceValidationForm ->
            val choiceValidationEntity = modelMapper.map(choiceValidationForm, ChoiceValidationEntity::class.java)
            choiceValidationEntity.instanceId = choiceValidationForm.instanceId
            choiceValidationEntity.controlKey = choiceValidationForm.instanceId
            choiceValidationEntity.formHubUuid = choiceValidationForm.formhubUuid

            choiceValidationEntity.recommendationsSecondCropPackageFip = choiceValidationForm.recommendationsSecondCropPackageFIP

            choiceValidationEntity.submissionDate = myDateUtil.convertToDateTime(choiceValidationForm.submissionTime)
            choiceValidationEntity.todayDate = myDateUtil.convertToDate(choiceValidationForm.todayDate)
            choiceValidationEntity.endDate = myDateUtil.convertToDateTime(choiceValidationForm.endDate)

            choiceValidationData.add(choiceValidationEntity)
        }

        choiceRepo.saveAll(choiceValidationData)
        log.info("Finished saving the data for $fileName------->")
    }
}