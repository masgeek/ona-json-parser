package com.tsobu.ona.core.service.pool


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.pool.PoolSamplesAcDto
import com.tsobu.ona.core.dto.json.pool.PoolSamplesAcOldLabelDto
import com.tsobu.ona.core.dto.json.pool.PoolSamplesAcSampleDto
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.pool.PoolSamplesAcEntity
import com.tsobu.ona.database.entities.pool.PoolSamplesAcOldLabelEntity
import com.tsobu.ona.database.entities.pool.PoolSamplesAcSampleEntity
import com.tsobu.ona.database.repositories.pool.PoolSamplesAcOldLabelRepo
import com.tsobu.ona.database.repositories.pool.PoolSamplesAcRepo
import com.tsobu.ona.database.repositories.pool.PoolSamplesAcSampleRepo
import com.tsobu.ona.forms.pool.PoolSamplesAcForm
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
class PoolSampleService
constructor(
        transactionManager: PlatformTransactionManager,
        val acRepo: PoolSamplesAcRepo,
        val acSampleRepo: PoolSamplesAcSampleRepo,
        val oldLabelRepo: PoolSamplesAcOldLabelRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(PoolSampleService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    val fileName = "Pool_Samples_AC.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val confirmList = acRepo.findAllByOrderBySubmissionDateAsc()
        val acSampleList = acSampleRepo.findAll()
        val oldLabelList = oldLabelRepo.findAll()

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


        val acData = confirmList.map { poolSamplesAcEntity ->
            val poolSamplesAcDto = modelMapper.map(poolSamplesAcEntity, PoolSamplesAcDto::class.java)
            poolSamplesAcDto.submissionDate = myDateUtil.toDateTimeString(poolSamplesAcEntity.submissionDate)
            poolSamplesAcDto.startDate = myDateUtil.toDateTimeString(poolSamplesAcEntity.startDate)
            poolSamplesAcDto.endDate = myDateUtil.toDateTimeString(poolSamplesAcEntity.endDate)
            poolSamplesAcDto.todayDate = myDateUtil.toDateToString(poolSamplesAcEntity.todayDate)
            poolSamplesAcDto
        }

        val oldLabelData = oldLabelList.map { sampleEntity ->
            val oldLabelDto = modelMapper.map(sampleEntity, PoolSamplesAcOldLabelDto::class.java)
            oldLabelDto
        }

        val acSampleData = acSampleList.map { plotLabelingEntity ->
            val acSampleDto = modelMapper.map(plotLabelingEntity, PoolSamplesAcSampleDto::class.java)
            acSampleDto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = PoolSamplesAcDto::class.java, data = acData,
                fileName = "Pool_Samples_AC", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = PoolSamplesAcOldLabelDto::class.java, data = oldLabelData,
                fileName = "Pool_Samples_AC-oldLabel", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = PoolSamplesAcSampleDto::class.java, data = acSampleData,
                fileName = "Pool_Samples_AC-sample", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<PoolSamplesAcForm>>() {})

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

        val acData = ArrayList<PoolSamplesAcEntity>()
        val sampleData = ArrayList<PoolSamplesAcSampleEntity>()
        val oldLabelData = ArrayList<PoolSamplesAcOldLabelEntity>()
        list.forEach { poolSamplesAcForm ->
            //map and save to database
            val acEntity = modelMapper.map(poolSamplesAcForm, PoolSamplesAcEntity::class.java)

            acEntity.formHubUuId = poolSamplesAcForm.formhubUuid
            acEntity.submissionDate = myDateUtil.convertToDateTime(poolSamplesAcForm.submissionTime)
            acEntity.todayDate = myDateUtil.convertToDate(poolSamplesAcForm.todayDate)
            acEntity.startDate = myDateUtil.convertToDateTime(poolSamplesAcForm.startDate)
            acEntity.endDate = myDateUtil.convertToDateTime(poolSamplesAcForm.endDate)
            acEntity.instanceId = poolSamplesAcForm.instanceId
            acEntity.controlKey = poolSamplesAcForm.instanceId

            acEntity.setOfSample = "${poolSamplesAcForm.instanceId}/sample"

            //child data
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            val sampleList = poolSamplesAcForm.sample
            var sampleCounter = 1
            sampleList.forEach { poolSampleForm ->
                val plEntity = modelMapper.map(poolSampleForm, PoolSamplesAcSampleEntity::class.java)
                plEntity.parentKey = acEntity.controlKey

                plEntity.setOfSample = acEntity.setOfSample
                plEntity.controlKey = "${poolSamplesAcForm.instanceId}/sample[$sampleCounter]"
                plEntity.setOfOldLabel = "${poolSamplesAcForm.instanceId}/sample[$sampleCounter]/oldLabel"

                sampleCounter = sampleCounter.plus(1)
                sampleData.add(plEntity)

                val oldLabelList = poolSampleForm.oldLabel
                var labelCounter = 1
                oldLabelList.forEach { oldLabelForm ->
                    val ndmEntity = modelMapper.map(oldLabelForm, PoolSamplesAcOldLabelEntity::class.java)
                    ndmEntity.parentKey = plEntity.controlKey
                    ndmEntity.controlKey = "${plEntity.controlKey}/oldLabel[$labelCounter]"
                    ndmEntity.setOfOldLabel = "${poolSamplesAcForm.instanceId}/sample[$sampleCounter]/oldLabel"

                    labelCounter = labelCounter.plus(1)
                    oldLabelData.add(ndmEntity)
                }
            }
            acData.add(acEntity)
        }


        acRepo.saveAll(acData)
        acSampleRepo.saveAll(sampleData)
        oldLabelRepo.saveAll(oldLabelData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}