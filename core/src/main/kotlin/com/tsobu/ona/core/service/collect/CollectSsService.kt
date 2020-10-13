package com.tsobu.ona.core.service.collect


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.collect.CollectSsAcDto
import com.tsobu.ona.core.dto.json.collect.CollectSsAcSoilSampleDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.collect.CollectSsAcEntity
import com.tsobu.ona.database.entities.collect.CollectSsAcSoilSampleEntity
import com.tsobu.ona.database.repositories.collect.CollectSsAcRepo
import com.tsobu.ona.database.repositories.collect.CollectSsAcSoilSampleRepo
import com.tsobu.ona.forms.collect.CollectSsAcForm
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
class CollectSsService
constructor(
        transactionManager: PlatformTransactionManager,
        val ssAcRepo: CollectSsAcRepo,
        val soilSampleRepo: CollectSsAcSoilSampleRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(CollectSsService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val writeCsvFile = WriteCsvFile()

    private val fileName = "Collect_SS_AC.json"
    fun mapJsonFile() {
        log.info("Exporting to CSV $fileName------->")
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
        val ssAcEntityList = ssAcRepo.findAllByOrderBySubmissionDateAsc()
        val soilSampleEntityList = soilSampleRepo.findAll()


        val ssAcData = ssAcEntityList.map { ssAcEntity ->
            val ssAcDto = modelMapper.map(ssAcEntity, CollectSsAcDto::class.java)
            ssAcDto.submissionDate = myDateUtil.convertTimeToString(ssAcEntity.submissionDate)
            ssAcDto.start = myDateUtil.convertTimeToString(ssAcEntity.startDate)
            ssAcDto.end = myDateUtil.convertTimeToString(ssAcEntity.endDate)
            ssAcDto
        }

        val soilSampleData = soilSampleEntityList.map { soilSampleEntity ->
            val soilSampleDto = modelMapper.map(soilSampleEntity, CollectSsAcSoilSampleDto::class.java)
            soilSampleDto
        }


        writeCsvFile.writeCsv(classMap = CollectSsAcDto::class.java,
                data = ssAcData,
                fileName = "Collect_SS_AC",
                outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = CollectSsAcSoilSampleDto::class.java,
                data = soilSampleData,
                fileName = "Collect_SS_AC-soilSample",
                outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<CollectSsAcForm>>() {})

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

        val ssAcData = ArrayList<CollectSsAcEntity>()
        val soilSampleData = ArrayList<CollectSsAcSoilSampleEntity>()
        list.forEach { ssAcForm ->
            //map and save to database
            val ssAcEntity = modelMapper.map(ssAcForm, CollectSsAcEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(ssAcForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                ssAcEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    ssAcEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    ssAcEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    ssAcEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            ssAcEntity.uuid = ssAcForm.formhubUuid
            ssAcEntity.submissionDate = myDateUtil.convertToDateTime(ssAcForm.submissionTime)
            ssAcEntity.todayDate = myDateUtil.convertToDate(ssAcForm.today)
            ssAcEntity.startDate = myDateUtil.convertToDateTime(ssAcForm.start)
            ssAcEntity.endDate = myDateUtil.convertToDateTime(ssAcForm.end)
            ssAcEntity.instanceId = ssAcForm.metaInstanceID
            ssAcEntity.controlKey = ssAcForm.metaInstanceID
            ssAcEntity.setOfSoilSample = "${ssAcEntity.controlKey}/soilSample"

            ssAcData.add(ssAcEntity)

            val soilSampleList = ssAcForm.soilSampleList
            var soilSampleCounter = 1
            soilSampleList.forEach { soilSample ->
                val soilSampleEntity = modelMapper.map(soilSample, CollectSsAcSoilSampleEntity::class.java)
                soilSampleEntity.parentKey = ssAcEntity.controlKey
                soilSampleEntity.controlKey = "${ssAcEntity.controlKey}/soilSample[$soilSampleCounter]"
                soilSampleEntity.setOfSoilSample = ssAcEntity.setOfSoilSample

                soilSampleCounter = soilSampleCounter.plus(1)
                soilSampleData.add(soilSampleEntity)
            }
        }

        ssAcRepo.saveAll(ssAcData)
        soilSampleRepo.saveAll(soilSampleData)

        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}