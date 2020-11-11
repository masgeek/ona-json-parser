package com.tsobu.ona.core.service.collect


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.collect.CollectLeafTagsAcDto
import com.tsobu.ona.core.dto.json.collect.CollectLeafTagsAcIdDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.collect.CollectLeafTagsAcEntity
import com.tsobu.ona.database.entities.collect.CollectLeafTagsAcIdEntity
import com.tsobu.ona.database.repositories.collect.CollectLeafTagsAcIdRepo
import com.tsobu.ona.database.repositories.collect.CollectLeafTagsAcRepo
import com.tsobu.ona.forms.collect.CollectLeafTagsAcForm
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
class CollectLeafTagsService
constructor(
        transactionManager: PlatformTransactionManager,
        val tagsAcRepo: CollectLeafTagsAcRepo,
        val acIdRepo: CollectLeafTagsAcIdRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(CollectLeafTagsService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val writeCsvFile = WriteCsvFile()

    private val fileName = "Collect_Leaf_Tags_AC.json"
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
        val tagsEntityList = tagsAcRepo.findAllByOrderBySubmissionDateAsc()
        val tagsAcEntityList = acIdRepo.findAll()


        val tagsAcData = tagsEntityList.map { ssAcEntity ->
            val tagsAcDto = modelMapper.map(ssAcEntity, CollectLeafTagsAcDto::class.java)
            tagsAcDto.submissionDate = myDateUtil.toDateTimeString(ssAcEntity.submissionDate)
            tagsAcDto.start = myDateUtil.toDateTimeString(ssAcEntity.startDate)
            tagsAcDto.end = myDateUtil.toDateTimeString(ssAcEntity.endDate)
            tagsAcDto.today = myDateUtil.toDateToString(ssAcEntity.todayDate)
            tagsAcDto
        }

        val tagsAcIdData = tagsAcEntityList.map { soilSampleEntity ->
            val tagsAcIdDto = modelMapper.map(soilSampleEntity, CollectLeafTagsAcIdDto::class.java)
            tagsAcIdDto.dateAttached = myDateUtil.toDateToString(soilSampleEntity.dateAttached)
            tagsAcIdDto.dateRecovered = myDateUtil.toDateToString(soilSampleEntity.dateRecovered)
            tagsAcIdDto
        }


        writeCsvFile.writeCsv(classMap = CollectLeafTagsAcDto::class.java,
                data = tagsAcData,
                fileName = "Collect_Leaf_Tags_AC",
                outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = CollectLeafTagsAcIdDto::class.java,
                data = tagsAcIdData,
                fileName = "Collect_Leaf_Tags_AC-ID",
                outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<CollectLeafTagsAcForm>>() {})

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

        val leafTagAcData = ArrayList<CollectLeafTagsAcEntity>()
        val leafTagsIdData = ArrayList<CollectLeafTagsAcIdEntity>()
        list.forEach { leafTagsAcForm ->
            //map and save to database
            val tagsAcEntity = modelMapper.map(leafTagsAcForm, CollectLeafTagsAcEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(leafTagsAcForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                tagsAcEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    tagsAcEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    tagsAcEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    tagsAcEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            tagsAcEntity.uuid = leafTagsAcForm.formhubUuid
            tagsAcEntity.submissionDate = myDateUtil.convertToDateTime(leafTagsAcForm.submissionTime)
            tagsAcEntity.todayDate = myDateUtil.convertToDate(leafTagsAcForm.today)
            tagsAcEntity.startDate = myDateUtil.convertToDateTime(leafTagsAcForm.start)
            tagsAcEntity.endDate = myDateUtil.convertToDateTime(leafTagsAcForm.end)
            tagsAcEntity.instanceId = leafTagsAcForm.metaInstanceID
            tagsAcEntity.controlKey = leafTagsAcForm.metaInstanceID
            tagsAcEntity.setOfId = "${tagsAcEntity.controlKey}/ID"

            leafTagAcData.add(tagsAcEntity)

            val soilSampleList = leafTagsAcForm.leafTagsAcIdList
            var leafTagIdCounter = 1
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            soilSampleList.forEach { acIdForm ->
                val acIdEntity = modelMapper.map(acIdForm, CollectLeafTagsAcIdEntity::class.java)
                acIdEntity.parentKey = tagsAcEntity.controlKey
                acIdEntity.controlKey = "${tagsAcEntity.controlKey}/ID[$leafTagIdCounter]"
                acIdEntity.setOfId = tagsAcEntity.setOfId

                leafTagIdCounter = leafTagIdCounter.plus(1)
                leafTagsIdData.add(acIdEntity)
            }
        }

        tagsAcRepo.saveAll(leafTagAcData)
        acIdRepo.saveAll(leafTagsIdData)

        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}