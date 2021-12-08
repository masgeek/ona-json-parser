package com.tsobu.ona.core.service.partition


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.partition.PartitionPsAcDmDto
import com.tsobu.ona.core.dto.json.partition.PartitionPsAcDto
import com.tsobu.ona.core.dto.json.partition.PartitionPsAcPlantSampleDto
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.partition.PartitionPsAcDmEntity
import com.tsobu.ona.database.entities.partition.PartitionPsAcEntity
import com.tsobu.ona.database.entities.partition.PartitionPsAcPlantSampleEntity
import com.tsobu.ona.database.repositories.partition.PartitionPsAcDmRepo
import com.tsobu.ona.database.repositories.partition.PartitionPsAcPlantSampleRepo
import com.tsobu.ona.database.repositories.partition.PartitionPsAcRepo
import com.tsobu.ona.forms.partition.PartitionPsAcForm
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
class PartitionPsService
constructor(
        transactionManager: PlatformTransactionManager,
        val acRepo: PartitionPsAcRepo,
        val acDmRepo: PartitionPsAcDmRepo,
        val plantSampleRepo: PartitionPsAcPlantSampleRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(PartitionPsService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    val fileName = "Partition_PS_AC.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val confirmList = acRepo.findAllByOrderBySubmissionDateAsc()
        val acDmList = acDmRepo.findAll()
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
//        modelMapper.configuration.isAmbiguityIgnored = false
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD


        val acData = confirmList.map { assignAcEntity ->
            val acDto = modelMapper.map(assignAcEntity, PartitionPsAcDto::class.java)
            acDto.submissionDate = myDateUtil.toDateTimeString(assignAcEntity.submissionDate)
            acDto.startDate = myDateUtil.toDateTimeString(assignAcEntity.startDate)
            acDto.endDate = myDateUtil.toDateTimeString(assignAcEntity.endDate)
            acDto.todayDate = myDateUtil.toDateToString(assignAcEntity.todayDate)
            acDto
        }

        val acDmData = acDmList.map { plotLabelingEntity ->
            val acDmDto = modelMapper.map(plotLabelingEntity, PartitionPsAcDmDto::class.java)
            acDmDto
        }

        val plantSampleData = plantSampleList.map { plotLabelingEntity ->
            val plantSampleDto = modelMapper.map(plotLabelingEntity, PartitionPsAcPlantSampleDto::class.java)
            plantSampleDto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = PartitionPsAcDto::class.java, data = acData,
                fileName = "Partition_PS_AC", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = PartitionPsAcDmDto::class.java, data = acDmData,
                fileName = "Partition_PS_AC-DM", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = PartitionPsAcPlantSampleDto::class.java, data = plantSampleData,
                fileName = "Partition_PS_AC-plantSample", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<PartitionPsAcForm>>() {})

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

        val acData = ArrayList<PartitionPsAcEntity>()
        val acDmData = ArrayList<PartitionPsAcDmEntity>()
        val plantSampleData = ArrayList<PartitionPsAcPlantSampleEntity>()
        list.forEach { acForm ->
            //map and save to database
            val acEntity = modelMapper.map(acForm, PartitionPsAcEntity::class.java)

            acEntity.formHubUuId = acForm.formhubUuid
            acEntity.submissionDate = myDateUtil.convertToDateTime(acForm.submissionTime)
            acEntity.todayDate = myDateUtil.convertToDate(acForm.todayDate)
            acEntity.startDate = myDateUtil.convertToDateTime(acForm.startDate)
            acEntity.endDate = myDateUtil.convertToDateTime(acForm.endDate)
            acEntity.instanceID = acForm.instanceId
            acEntity.controlKey = acForm.instanceId

            acEntity.setOfPlantSample = "${acForm.instanceId}/plantSample"

            //child data
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            val plantSampleList = acForm.plantSampleList
            var acIdCounter = 1
            plantSampleList.forEach { plantSampleForm ->
                val plEntity = modelMapper.map(plantSampleForm, PartitionPsAcPlantSampleEntity::class.java)
                plEntity.parentKey = acEntity.controlKey
                plEntity.setOfPlantSample = acEntity.setOfPlantSample
                plEntity.controlKey = "${acForm.instanceId}/plantSample[$acIdCounter]"
                plEntity.setOfDm = "${acForm.instanceId}/plantSample[$acIdCounter]/DM"

                acIdCounter = acIdCounter.plus(1)
                plantSampleData.add(plEntity)

                val ndmList = plantSampleForm.dmList
                var acNdmCounter = 1
                ndmList.forEach { ndmForm ->
                    val ndmEntity = modelMapper.map(ndmForm, PartitionPsAcDmEntity::class.java)
                    ndmEntity.parentKey = plEntity.controlKey
                    ndmEntity.controlKey = "${plEntity.controlKey}/DM[$acNdmCounter]"
                    ndmEntity.setOfDm = "${acForm.instanceId}/plantSample[$acIdCounter]/DM"

                    acNdmCounter = acNdmCounter.plus(1)
                    acDmData.add(ndmEntity)
                }
            }
            acData.add(acEntity)
        }


        acRepo.saveAll(acData)
        plantSampleRepo.saveAll(plantSampleData)
        acDmRepo.saveAll(acDmData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}