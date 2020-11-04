package com.tsobu.ona.core.service.record


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.record.CanopyDimensionsAcCdDto
import com.tsobu.ona.core.dto.json.record.CanopyDimensionsAcDto
import com.tsobu.ona.core.dto.json.record.RecordDmPsAcDto
import com.tsobu.ona.core.dto.json.record.RecordDmPsAcPlantSampleDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.record.RecordDmPsAcEntity
import com.tsobu.ona.database.entities.record.RecordDmPsAcPlantSampleEntity
import com.tsobu.ona.database.repositories.record.RecordDmPsAcPlantSampleRepo
import com.tsobu.ona.database.repositories.record.RecordDmPsAcRepo
import com.tsobu.ona.forms.record.RecordDmPsAcForm
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
class RecordDmService
constructor(
        transactionManager: PlatformTransactionManager,
        val acRepo: RecordDmPsAcRepo,
        val plantSampleRepo: RecordDmPsAcPlantSampleRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(RecordDmService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()

    val fileName = "Record_DM_PS_AC.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val acList = acRepo.findAllByOrderBySubmissionDateAsc()
        val plantSampleList = plantSampleRepo.findAll()

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
//        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD


        val acData = acList.map { acEntity ->
            val acDto = modelMapper.map(acEntity, RecordDmPsAcDto::class.java)
            acDto.submissionDate = myDateUtil.convertTimeToString(acEntity.submissionDate)
            acDto.startDate = myDateUtil.convertTimeToString(acEntity.startDate)
            acDto.endDate = myDateUtil.convertTimeToString(acEntity.endDate)
            acDto
        }

        val plantSampleData = plantSampleList.map { plantSampleEntity ->
            val plantSampleDto = modelMapper.map(plantSampleEntity, RecordDmPsAcPlantSampleDto::class.java)
            plantSampleDto
        }


        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = RecordDmPsAcDto::class.java, data = acData,
                fileName = "Record_DM_PS_AC", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = RecordDmPsAcPlantSampleDto::class.java, data = plantSampleData,
                fileName = "Record_DM_PS_AC-plantSample", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<RecordDmPsAcForm>>() {})

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
//        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val acData = ArrayList<RecordDmPsAcEntity>()
        val plantSampleData = ArrayList<RecordDmPsAcPlantSampleEntity>()
        list.forEach { acForm ->
            //map and save to database
            val acEntity = modelMapper.map(acForm, RecordDmPsAcEntity::class.java)

            acEntity.uuid = acForm.formhubUuid
            acEntity.submissionDate = myDateUtil.convertToDateTime(acForm.submissionTime)
            acEntity.todayDate = myDateUtil.convertToDate(acForm.today)
            acEntity.startDate = myDateUtil.convertToDateTime(acForm.start)
            acEntity.endDate = myDateUtil.convertToDateTime(acForm.end)
            acEntity.instanceId = acForm.metaInstanceID
            acEntity.controlKey = acForm.metaInstanceID

            acEntity.setOfPlantSample = "${acForm.metaInstanceID}/plantSample"

            //child data
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            val idList = acForm.plantSampleList
            var sampleCounter = 1
            idList.forEach { plantSampleForm ->
                val idEntity = modelMapper.map(plantSampleForm, RecordDmPsAcPlantSampleEntity::class.java)
                idEntity.parentKey = acEntity.controlKey
                idEntity.setOfPlantSample = acEntity.setOfPlantSample
                idEntity.controlKey = "${acForm.metaInstanceID}/plantSample[$sampleCounter]"

                sampleCounter = sampleCounter.plus(1)
                plantSampleData.add(idEntity)
            }
            acData.add(acEntity)
        }


        acRepo.saveAll(acData)
        plantSampleRepo.saveAll(plantSampleData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}