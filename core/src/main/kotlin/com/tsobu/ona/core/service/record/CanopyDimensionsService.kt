package com.tsobu.ona.core.service.record


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.record.CanopyDimensionsAcCdDto
import com.tsobu.ona.core.dto.json.record.CanopyDimensionsAcDto
import com.tsobu.ona.core.dto.json.record.CanopyDimensionsAcIdDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.record.CanopyDimensionsAcCdEntity
import com.tsobu.ona.database.entities.record.CanopyDimensionsAcEntity
import com.tsobu.ona.database.entities.record.CanopyDimensionsAcIdEntity
import com.tsobu.ona.database.repositories.record.CanopyDimensionsAcCdRepo
import com.tsobu.ona.database.repositories.record.CanopyDimensionsAcIdRepo
import com.tsobu.ona.database.repositories.record.CanopyDimensionsAcRepo
import com.tsobu.ona.forms.record.RecordCanopyDimensionsAcForm
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
class CanopyDimensionsService
constructor(
        transactionManager: PlatformTransactionManager,
        val acRepo: CanopyDimensionsAcRepo,
        val cdRepo: CanopyDimensionsAcCdRepo,
        val idRepo: CanopyDimensionsAcIdRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(CanopyDimensionsService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    val fileName = "Record_Canopy_Dimensions_AC.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val confirmList = acRepo.findAllByOrderBySubmissionDateAsc()
        val cdList = cdRepo.findAll()
        val oldLabelList = idRepo.findAll()

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


        val acData = confirmList.map { acEntity ->
            val acDto = modelMapper.map(acEntity, CanopyDimensionsAcDto::class.java)
            acDto.submissionDate = myDateUtil.toDateTimeString(acEntity.submissionDate)
            acDto.startDate = myDateUtil.toDateTimeString(acEntity.startDate)
            acDto.endDate = myDateUtil.toDateTimeString(acEntity.endDate)
            acDto.todayDate = myDateUtil.toDateToString(acEntity.todayDate)
            acDto
        }

        val cdData = cdList.map { idEntity ->
            val cdDto = modelMapper.map(idEntity, CanopyDimensionsAcCdDto::class.java)
            cdDto
        }

        val idData = oldLabelList.map { cdEntity ->
            val idDto = modelMapper.map(cdEntity, CanopyDimensionsAcIdDto::class.java)
            idDto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = CanopyDimensionsAcDto::class.java, data = acData,
                fileName = "Record_Canopy_Dimensions_AC", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = CanopyDimensionsAcCdDto::class.java, data = cdData,
                fileName = "Record_Canopy_Dimensions_AC-CD", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = CanopyDimensionsAcIdDto::class.java, data = idData,
                fileName = "Record_Canopy_Dimensions_AC-ID", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<RecordCanopyDimensionsAcForm>>() {})

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

        val acData = ArrayList<CanopyDimensionsAcEntity>()
        val idData = ArrayList<CanopyDimensionsAcIdEntity>()
        val cdData = ArrayList<CanopyDimensionsAcCdEntity>()
        list.forEach { acForm ->
            //map and save to database
            val acEntity = modelMapper.map(acForm, CanopyDimensionsAcEntity::class.java)

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

            acEntity.formHubUuId = acForm.formhubUuid
            acEntity.submissionDate = myDateUtil.convertToDateTime(acForm.submissionTime)
            acEntity.todayDate = myDateUtil.convertToDate(acForm.todayDate)
            acEntity.startDate = myDateUtil.convertToDateTime(acForm.startDate)
            acEntity.endDate = myDateUtil.convertToDateTime(acForm.endDate)
            acEntity.instanceId = acForm.instanceId
            acEntity.controlKey = acForm.instanceId

            acEntity.setOfId = "${acForm.instanceId}/ID"

            //child data
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            val idList = acForm.idList
            var sampleCounter = 1
            idList.forEach { idForm ->
                val idEntity = modelMapper.map(idForm, CanopyDimensionsAcIdEntity::class.java)
                idEntity.parentKey = acEntity.controlKey
                idEntity.setOfId = acEntity.setOfId
                idEntity.controlKey = "${acForm.instanceId}/ID[$sampleCounter]"
                idEntity.setOfCd = "${acForm.instanceId}/ID[$sampleCounter]/CD"

                sampleCounter = sampleCounter.plus(1)
                idData.add(idEntity)

                val cdList = idForm.cdList
                var labelCounter = 1
                cdList.forEach { cdForm ->
                    val cdEntity = modelMapper.map(cdForm, CanopyDimensionsAcCdEntity::class.java)
                    cdEntity.parentKey = idEntity.controlKey
                    cdEntity.controlKey = "${idEntity.controlKey}/CD[$labelCounter]"
                    cdEntity.setOfCd = "${acForm.instanceId}/ID[$sampleCounter]/CD"

                    labelCounter = labelCounter.plus(1)
                    cdData.add(cdEntity)
                }
            }
            acData.add(acEntity)
        }


        acRepo.saveAll(acData)
        cdRepo.saveAll(cdData)
        idRepo.saveAll(idData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}