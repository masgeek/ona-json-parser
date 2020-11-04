package com.tsobu.ona.core.service.collect


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.collect.CollectPsAcDto
import com.tsobu.ona.core.dto.json.collect.CollectPsAcPlantSampleDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.collect.CollectPsAcEntity
import com.tsobu.ona.database.entities.collect.CollectPsAcPlantSampleEntity
import com.tsobu.ona.database.repositories.collect.CollectPsAcPlantSampleRepo
import com.tsobu.ona.database.repositories.collect.CollectPsAcRepo
import com.tsobu.ona.forms.collect.CollectPsAcForm
import org.modelmapper.AbstractCondition
import org.modelmapper.Condition
import org.modelmapper.ModelMapper
import org.modelmapper.convention.MatchingStrategies
import org.modelmapper.spi.MappingContext
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.PlatformTransactionManager
import java.io.IOException
import java.nio.file.Paths


@Service
class CollectPsService
constructor(
        transactionManager: PlatformTransactionManager,
        val psAcRepo: CollectPsAcRepo,
        val plantSampleRepo: CollectPsAcPlantSampleRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(CollectPsService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val writeCsvFile = WriteCsvFile()

    private val fileName = "Collect_PS_AC.json"
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
        val psAcEntityList = psAcRepo.findAllByOrderBySubmissionDateAsc()
        val plantSampleEntityList = plantSampleRepo.findAll()


        val psAcData = psAcEntityList.map { psAcEntity ->
            val collectPsAcDto = modelMapper.map(psAcEntity, CollectPsAcDto::class.java)
            collectPsAcDto.submissionDate = myDateUtil.convertTimeToString(psAcEntity.submissionDate)
            collectPsAcDto.start = myDateUtil.convertTimeToString(psAcEntity.startDate)
            collectPsAcDto.end = myDateUtil.convertTimeToString(psAcEntity.endDate)
            collectPsAcDto
        }

        val plantSampleData = plantSampleEntityList.map { psAcEntity ->
            val plantSampleDto = modelMapper.map(psAcEntity, CollectPsAcPlantSampleDto::class.java)
            plantSampleDto
        }

        writeCsvFile.writeCsv(classMap = CollectPsAcDto::class.java,
                data = psAcData,
                fileName = "Collect_PS_AC",
                outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = CollectPsAcPlantSampleDto::class.java,
                data = plantSampleData,
                fileName = "Collect_PS_AC-plantSample",
                outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<CollectPsAcForm>>() {})

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

        val psAcData = ArrayList<CollectPsAcEntity>()
        val plantSampleAcData = ArrayList<CollectPsAcPlantSampleEntity>()
        list.forEach { psAcForm ->
            //map and save to database
            val psAcEntity = modelMapper.map(psAcForm, CollectPsAcEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(psAcForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                psAcEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    psAcEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    psAcEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    psAcEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            psAcEntity.uuid = psAcForm.formhubUuid
            psAcEntity.submissionDate = myDateUtil.convertToDateTime(psAcForm.submissionTime)
            psAcEntity.todayDate = myDateUtil.convertToDate(psAcForm.today)
            psAcEntity.startDate = myDateUtil.convertToDateTime(psAcForm.start)
            psAcEntity.endDate = myDateUtil.convertToDateTime(psAcForm.end)
            psAcEntity.instanceId = psAcForm.metaInstanceID
            psAcEntity.controlKey = psAcForm.metaInstanceID
            psAcEntity.setOfPlantSample = "${psAcEntity.controlKey}/plantSample"
            psAcData.add(psAcEntity)

            val plantSampleList = psAcForm.plantSampleList
            var plantSampleCounter = 1
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            plantSampleList.forEach { samplePsAcForm ->
                val plantSampleEntity = modelMapper.map(samplePsAcForm, CollectPsAcPlantSampleEntity::class.java)
                plantSampleEntity.parentKey = psAcEntity.controlKey
                plantSampleEntity.controlKey = "${psAcEntity.controlKey}/plantSample[$plantSampleCounter]"
                plantSampleEntity.setOfPlantSample = "${psAcEntity.controlKey}/plantSample"

                plantSampleCounter = plantSampleCounter.plus(1)
                plantSampleAcData.add(plantSampleEntity)
            }
        }

//        psAcRepo.saveAll(psAcData)
//        plantSampleRepo.saveAll(plantSampleAcData)

        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}