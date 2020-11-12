package com.tsobu.ona.core.service.batchcomposition


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.batchcomposition.CompositionDto
import com.tsobu.ona.core.dto.json.batchcomposition.NextDto
import com.tsobu.ona.core.dto.json.batchcomposition.SampleDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.batchcomposition.CompositionEntity
import com.tsobu.ona.database.entities.batchcomposition.NextEntity
import com.tsobu.ona.database.entities.batchcomposition.SampleEntity
import com.tsobu.ona.database.repositories.batchcomposition.CompositionNextRepo
import com.tsobu.ona.database.repositories.batchcomposition.CompositionRepo
import com.tsobu.ona.database.repositories.batchcomposition.CompositionSampleRepo
import com.tsobu.ona.forms.batchcomposition.SampleBatchCompositionForm
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
class BatchCompositionService
constructor(
        transactionManager: PlatformTransactionManager,
        val compositionRepo: CompositionRepo,
        val nextRepo: CompositionNextRepo,
        val sampleRepo: CompositionSampleRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(BatchCompositionService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    private val fileName = "sample_batch_composition.json"

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
//        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val filePath = "${appConfig.globalProperties().outputPath}"
        val compositionList = compositionRepo.findAllByOrderBySubmissionDateAsc()
        val sampleList = sampleRepo.findAll()
        val nextList = nextRepo.findAll()


        val compositionData = compositionList.map { compositionEntity ->
            val compositionDto = modelMapper.map(compositionEntity, CompositionDto::class.java)
            compositionDto.submissionDate = myDateUtil.toDateTimeString(compositionEntity.submissionDate)
            compositionDto.start = myDateUtil.toDateTimeString(compositionEntity.startDate)
            compositionDto.end = myDateUtil.toDateTimeString(compositionEntity.endDate)
            compositionDto.today = myDateUtil.toDateToString(compositionEntity.todayDate)
            compositionDto
        }

        val sampleData = sampleList.map { sampleEntity ->
            val sampleDto = modelMapper.map(sampleEntity, SampleDto::class.java)
            sampleDto
        }
        val nextData = nextList.map { nextEntity ->
            val nextDto = modelMapper.map(nextEntity, NextDto::class.java)
            nextDto
        }


        writeCsvFile.writeCsv(classMap = CompositionDto::class.java, data = compositionData,
                fileName = "sample_batch_composition", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = SampleDto::class.java, data = sampleData,
                fileName = "sample_batch_composition-sample", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = NextDto::class.java, data = nextData,
                fileName = "sample_batch_composition-next", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
        val list = objectMapper.readValue(file, object : TypeReference<List<SampleBatchCompositionForm>>() {})

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
//        modelMapper.configuration.sourceNamingConvention = NamingConventions.NONE
//        modelMapper.configuration.destinationNamingConvention = NamingConventions.NONE
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val compositionList = ArrayList<CompositionEntity>()
        val nextEntityList = ArrayList<NextEntity>()
        val sampleEntityList = ArrayList<SampleEntity>()
        list.forEach { compositionForm ->
            //map and save to database
            val compositionEntity = modelMapper.map(compositionForm, CompositionEntity::class.java)

            compositionEntity.uuid = compositionForm.formhubUuid
            compositionEntity.submissionDate = myDateUtil.convertToDateTime(compositionForm.submissionTime)
            compositionEntity.todayDate = myDateUtil.convertToDate(compositionForm.today)
            compositionEntity.startDate = myDateUtil.convertToDateTime(compositionForm.start)
            compositionEntity.endDate = myDateUtil.convertToDateTime(compositionForm.end)
            compositionEntity.instanceId = compositionForm.metaInstanceID
            compositionEntity.controlKey = compositionForm.metaInstanceID

            compositionEntity.setOfSampleListSample = "${compositionEntity.instanceId}/sample"
            compositionEntity.setOfNextStepNext = "${compositionEntity.instanceId}/next"
            compositionList.add(compositionEntity)
            log.info("Added data to table ${compositionEntity.controlKey} with surname as ${compositionForm.xformIdString}")

            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            val nextList = compositionForm.nextList
            var nextCounter = 1
            nextList?.forEach { nextForm ->
                val nextEntity = modelMapper.map(nextForm, NextEntity::class.java)
                nextEntity.parentKey = compositionEntity.controlKey
                nextEntity.controlKey = "${compositionEntity.controlKey}/next[$nextCounter]"
                nextEntity.setOfNext = "${compositionEntity.controlKey}/next"

                nextCounter = nextCounter.plus(1)
                nextEntityList.add(nextEntity)
            }

            val sampleList = compositionForm.sampleList
            var sampleCounter = 1
            sampleList?.forEach { sampleForm ->
                val sampleEntity = modelMapper.map(sampleForm, SampleEntity::class.java)
                sampleEntity.parentKey = compositionEntity.controlKey
                sampleEntity.controlKey = "${compositionEntity.controlKey}/sample[$sampleCounter]"
                sampleEntity.setOfSample = "${compositionEntity.controlKey}/sample"


                sampleCounter = sampleCounter.plus(1)
                sampleEntityList.add(sampleEntity)
            }
        }

        compositionRepo.saveAll(compositionList)
        nextRepo.saveAll(nextEntityList)
        sampleRepo.saveAll(sampleEntityList)

        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}