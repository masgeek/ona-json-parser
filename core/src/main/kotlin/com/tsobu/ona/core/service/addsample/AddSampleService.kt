package com.tsobu.ona.core.service.addsample


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.addsample.AcDto
import com.tsobu.ona.core.dto.json.addsample.AcNewLabelDto
import com.tsobu.ona.core.dto.json.addsample.AcSampleDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.addsample.SampleLabelAcEntity
import com.tsobu.ona.database.entities.addsample.AcNewLabelEntity
import com.tsobu.ona.database.entities.addsample.AcSampleEntity
import com.tsobu.ona.database.repositories.addsample.AcNewLabelRepo
import com.tsobu.ona.database.repositories.addsample.AcRepo
import com.tsobu.ona.database.repositories.addsample.AcSampleRepo
import com.tsobu.ona.forms.addsample.AcForm
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
class AddSampleService
constructor(
        transactionManager: PlatformTransactionManager,
        val acRepo: AcRepo,
        val acSampleRepo: AcSampleRepo,
        val acNewLabelRepo: AcNewLabelRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(AddSampleService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()

    private val fileName = "Add_Sample_Label_AC.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
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
        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val filePath = "${appConfig.globalProperties().outputPath}"
        val acEntityList = acRepo.findAllByOrderBySubmissionDateAsc()
        val acSampleList = acSampleRepo.findAll()
        val acNewLabelList = acNewLabelRepo.findAll()


        val acData = acEntityList.map { acEntity ->
            val acDto = modelMapper.map(acEntity, AcDto::class.java)
            acDto.submissionDate = myDateUtil.convertToDateTimeString(acEntity.submissionDate)
            acDto.start = myDateUtil.convertToDateTimeString(acEntity.startDate)
            acDto.end = myDateUtil.convertToDateTimeString(acEntity.endDate)
            acDto
        }

        val acSampleData = acSampleList.map { acSampleEntity ->
            val acDto = modelMapper.map(acSampleEntity, AcSampleDto::class.java)
            acDto
        }
        val acNewLabelData = acNewLabelList.map { acSampleEntity ->
            val acDto = modelMapper.map(acSampleEntity, AcNewLabelDto::class.java)
            acDto
        }

        writeCsvFile.writeCsv(classMap = AcDto::class.java, data = acData, fileName = "Add_Sample_Label_AC", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = AcSampleDto::class.java, data = acSampleData, fileName = "Add_Sample_Label_AC-sample", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = AcNewLabelDto::class.java, data = acNewLabelData, fileName = "Add_Sample_Label_AC-newLabel", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<AcForm>>() {})

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
        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val acEntityData = ArrayList<SampleLabelAcEntity>()
        val acSampleData = ArrayList<AcSampleEntity>()
        val acNewLabelData = ArrayList<AcNewLabelEntity>()
        list.forEach { acForm ->
            //map and save to database
            val acEntity = modelMapper.map(acForm, SampleLabelAcEntity::class.java)
            acEntity.uuid = acForm.formhubUuid
            acEntity.submissionDate = myDateUtil.convertToDateTime(acForm.submissionTime)
            acEntity.todayDate = myDateUtil.convertToDate(acForm.today)
            acEntity.startDate = myDateUtil.convertToDateTime(acForm.start)
            acEntity.endDate = myDateUtil.convertToDateTime(acForm.end)
            acEntity.instanceId = acForm.metaInstanceID
            acEntity.controlKey = acForm.metaInstanceID
            acEntity.setOfSample = "${acEntity.controlKey}/sample"

            acEntityData.add(acEntity)
            log.info("Added data to table ${acEntity.controlKey} with surname as ${acForm.xformIdString}")

            val acSampleList = acForm.acSampleList
            var acSampleCounter = 1
            acSampleList?.forEach { acSample ->
                val sampleEntity = modelMapper.map(acSample, AcSampleEntity::class.java)
                sampleEntity.parentKey = acEntity.controlKey
                sampleEntity.controlKey = "${acEntity.controlKey}/sample[$acSampleCounter]"
                sampleEntity.setOfSample = "${acEntity.controlKey}/sample"
                sampleEntity.setOfNewLabel = "${acEntity.controlKey}/sample[$acSampleCounter]/newLabel"

                acSampleCounter = acSampleCounter.plus(1)
                acSampleData.add(sampleEntity)

                val acNewLabelList = acSample.acNewLabel
                var acNewLabelCounter = 1
                acNewLabelList?.forEach { acNewLabel ->
                    val newLabelEntity = modelMapper.map(acNewLabel, AcNewLabelEntity::class.java)
                    newLabelEntity.controlKey = "${sampleEntity.controlKey}/newLabel[$acNewLabelCounter]"
                    newLabelEntity.parentKey = "${sampleEntity.controlKey}"
                    newLabelEntity.setOfNewLabel = "${sampleEntity.controlKey}/newLabel"

                    acNewLabelCounter = acNewLabelCounter.plus(1)
                    acNewLabelData.add(newLabelEntity)
                }
            }
        }

        acRepo.saveAll(acEntityData)
        acSampleRepo.saveAll(acSampleData)
        acNewLabelRepo.saveAll(acNewLabelData)

        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}