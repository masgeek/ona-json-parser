package com.tsobu.ona.core.service.replace


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.replace.ReplacePoAcDto
import com.tsobu.ona.core.dto.json.replace.ReplacePoAcReplaceLabelDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.replace.ReplacePoAcEntity
import com.tsobu.ona.database.entities.replace.ReplacePoAcReplaceLabelEntity
import com.tsobu.ona.database.repositories.replace.ReplacePoAcReplaceLabelRepo
import com.tsobu.ona.database.repositories.replace.ReplacePoAcRepo
import com.tsobu.ona.forms.replace.ReplacePoAcForm
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
class ReplacePoService
constructor(
        transactionManager: PlatformTransactionManager,
        val acRepo: ReplacePoAcRepo,
        val labelRepo: ReplacePoAcReplaceLabelRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(ReplacePoService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()

    val fileName = "Replace_PO_AC.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val acList = acRepo.findAllByOrderBySubmissionDateAsc()
        val plantSampleList = labelRepo.findAll()

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
            val acDto = modelMapper.map(acEntity, ReplacePoAcDto::class.java)
            acDto.submissionDate = myDateUtil.toDateTimeString(acEntity.submissionDate)
            acDto.startDate = myDateUtil.toDateTimeString(acEntity.startDate)
            acDto.endDate = myDateUtil.toDateTimeString(acEntity.endDate)
            acDto.today = myDateUtil.toDateToString(acEntity.todayDate)
            acDto
        }

        val labelData = plantSampleList.map { labelEntity ->
            val labelDto = modelMapper.map(labelEntity, ReplacePoAcReplaceLabelDto::class.java)
            labelDto
        }


        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = ReplacePoAcDto::class.java, data = acData,
                fileName = "Replace_PO_AC", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = ReplacePoAcReplaceLabelDto::class.java, data = labelData,
                fileName = "Replace_PO_AC-replaceLabel", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<ReplacePoAcForm>>() {})

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

        val acData = ArrayList<ReplacePoAcEntity>()
        val labelData = ArrayList<ReplacePoAcReplaceLabelEntity>()
        list.forEach { acForm ->
            //map and save to database
            val acEntity = modelMapper.map(acForm, ReplacePoAcEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(acForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                acEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    acEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    acEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    acEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            acEntity.uuid = acForm.formhubUuid
            acEntity.submissionDate = myDateUtil.convertToDateTime(acForm.submissionTime)
            acEntity.todayDate = myDateUtil.convertToDate(acForm.today)
            acEntity.startDate = myDateUtil.convertToDateTime(acForm.start)
            acEntity.endDate = myDateUtil.convertToDateTime(acForm.end)
            acEntity.instanceId = acForm.metaInstanceID
            acEntity.controlKey = acForm.metaInstanceID

            acEntity.setOfReplaceLabel = "${acForm.metaInstanceID}/replaceLabel"

            //child data
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            val idList = acForm.replaceLabelList
            var labelCounter = 1
            idList.forEach { plantSampleForm ->
                val idEntity = modelMapper.map(plantSampleForm, ReplacePoAcReplaceLabelEntity::class.java)
                idEntity.parentKey = acEntity.controlKey
                idEntity.setOfReplaceLabel = acEntity.setOfReplaceLabel
                idEntity.controlKey = "${acForm.metaInstanceID}/replaceLabel[$labelCounter]"

                labelCounter = labelCounter.plus(1)
                labelData.add(idEntity)
            }
            acData.add(acEntity)
        }


        acRepo.saveAll(acData)
        labelRepo.saveAll(labelData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}