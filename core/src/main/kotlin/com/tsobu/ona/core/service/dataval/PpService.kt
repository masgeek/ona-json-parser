package com.tsobu.ona.core.service.dataval


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.forms.dataval.*
import com.tsobu.ona.core.dto.json.dataval.FrDto
import com.tsobu.ona.core.dto.json.dataval.PpTzDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.dataval.*
import com.tsobu.ona.database.repositories.dataval.*
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
class PpService
constructor(
        transactionManager: PlatformTransactionManager,
        val ppRepo: PpRepo,
        val ppWaAltRepo: PpWaAltRepo,
        val ppWaAltBpp3Repo: PpWaAltBpp3Repo,
        val ppWaConRepo: PpWaConRepo,
        val ppWaConBpp3Repo: PpWaConBpp3Repo,
        val ppWaRecRepo: PpWaRecRepo,
        val ppWaRecBpp3Repo: PpWaRecBpp3Repo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(PpService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myUtils = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()

    fun mapJsonFile() {
        log.info("Reading table data....")
        val frList = ppRepo.findAllByOrderBySubmissionDateAsc()

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
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT

        val ppData = frList.map { ppEntity ->
            val ppTzDto = modelMapper.map(ppEntity, PpTzDto::class.java)
            ppTzDto.submissionDate = myUtils.convertTimeToString(ppEntity.submissionDate)
            ppTzDto.startDate = myUtils.convertTimeToString(ppEntity.startDate)
            ppTzDto.endDate = myUtils.convertTimeToString(ppEntity.endDate)

            ppTzDto
        }


        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(pojoType = FrDto::class.java, data = ppData, fileName = "dataVAL_PP-", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset(fileName: String) {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<PpForm>>() {})

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
//        modelMapper.configuration.sourceNameTokenizer = NameTokenizers.CAMEL_CASE
        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val ppEntityData = ArrayList<PpEntity>()
        val weedAssessmentAltData = ArrayList<PpWaAltEntity>()
        val weedAssessmentConData = ArrayList<PpWaConEntity>()
        val weedAssessmentRecData = ArrayList<PpWaRecEntity>()
        val weedAssessmentAltBpp3Data = ArrayList<PpWaAltBpp3Entity>()
        val weedAssessmentConBpp3Data = ArrayList<PpWaConBpp3Entity>()
        val weedAssessmentRecBpp3Data = ArrayList<PpWaRecBpp3Entity>()
        list.forEach { myVal ->
            //map and save to database
            val geoPoint = myUtils.splitGeoPoint(myVal.geopoint)
            val ppEntity = modelMapper.map(myVal, PpEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                ppEntity.geoPointLatitude = geoPoint[0]

                if (myUtils.indexExists(geoPoint, 1)) {
                    ppEntity.geoPointLongitude = geoPoint[1]
                }
                if (myUtils.indexExists(geoPoint, 2)) {
                    ppEntity.geoPointAltitude = geoPoint[2]
                }
                if (myUtils.indexExists(geoPoint, 3)) {
                    ppEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            ppEntity.uuid = myVal.formhubUuid
            ppEntity.submissionDate = myUtils.convertToDateTime(myVal.submissionTime)
            ppEntity.todayDate = myUtils.convertToDate(myVal.today)
            ppEntity.startDate = myUtils.convertToDateTime(myVal.start)
            ppEntity.endDate = myUtils.convertToDateTime(myVal.end)
            ppEntity.harvestDate = myUtils.convertToDate(myVal.harvestDate)
            ppEntity.plantingDate = myUtils.convertToDate(myVal.plantingDate)
            ppEntity.instanceId = myVal.metaInstanceID
            ppEntity.controlKey = myVal.metaInstanceID

            ppEntityData.add(ppEntity)

            val weedAssessmentAltList = myVal.weedAssessmentAlt
            var weedAssesAltCount = 1
            weedAssessmentAltList?.forEach { assessmentAlt ->
                val waAltEntity = modelMapper.map(assessmentAlt, PpWaAltEntity::class.java)
                waAltEntity.parentKey = ppEntity.controlKey
                waAltEntity.setOfWeedAssessmentAlt = "${waAltEntity.parentKey}/weedAssessment_ALT"
                waAltEntity.controlKey = "${waAltEntity.parentKey}/weedAssessment_ALT[$weedAssesAltCount]"
                weedAssesAltCount = weedAssesAltCount.plus(1)

                weedAssessmentAltData.add(waAltEntity)
            }

            val weedAssessmentAltBpp3List = myVal.weedAssessmentAltBpp3
            var weedAssesAltBppCount = 1
            weedAssessmentAltBpp3List?.forEach { assessmentAltBpp3 ->
                val waAltBpp3Entity = modelMapper.map(assessmentAltBpp3, PpWaAltBpp3Entity::class.java)
                waAltBpp3Entity.parentKey = ppEntity.controlKey
                waAltBpp3Entity.setOfWeedAssessmentAltBpp3 = "${waAltBpp3Entity.parentKey}/weedAssessment_ALT_BPP3"
                waAltBpp3Entity.controlKey = "${waAltBpp3Entity.parentKey}/weedAssessment_ALT_BPP3[$weedAssesAltCount]"
                weedAssesAltBppCount = weedAssesAltBppCount.plus(1)

                weedAssessmentAltBpp3Data.add(waAltBpp3Entity)
            }

            val weedAssessmentConList = myVal.weedAssessmentCon
            var weedAssesConCount = 1
            weedAssessmentConList?.forEach { assessmentCon ->
                val waConEntity = modelMapper.map(assessmentCon, PpWaConEntity::class.java)
                waConEntity.parentKey = ppEntity.controlKey
                waConEntity.setOfWeedAssessmentCon = "${waConEntity.parentKey}/weedAssessment_CON"
                waConEntity.controlKey = "${waConEntity.parentKey}/weedAssessment_CON[$weedAssesAltCount]"
                weedAssesConCount = weedAssesConCount.plus(1)

                weedAssessmentConData.add(waConEntity)
            }

            val weedAssessmentConBpp3List = myVal.weedAssessmentConBpp3
            var weedAssesConBpp3Count = 1
            weedAssessmentConBpp3List?.forEach { assessmentConBpp3 ->
                val bpp3Entity = modelMapper.map(assessmentConBpp3, PpWaConBpp3Entity::class.java)
                bpp3Entity.parentKey = ppEntity.controlKey
                bpp3Entity.setOfWeedAssessmentConBpp3 = "${bpp3Entity.parentKey}/weedAssessment_CON_BPP3"
                bpp3Entity.controlKey = "${bpp3Entity.parentKey}/weedAssessment_CON_BPP3[$weedAssesAltCount]"
                weedAssesConBpp3Count = weedAssesConBpp3Count.plus(1)

                weedAssessmentConBpp3Data.add(bpp3Entity)
            }

            val weedAssessmentRecList = myVal.weedAssessmentRec
            var weedAssesRecCount = 1
            weedAssessmentRecList?.forEach { assessmentRec ->
                val waRecEntity = modelMapper.map(assessmentRec, PpWaRecEntity::class.java)
                waRecEntity.parentKey = ppEntity.controlKey
                waRecEntity.setOfWeedAssessmentRec = "${waRecEntity.parentKey}/weedAssessment_REC"
                waRecEntity.controlKey = "${waRecEntity.parentKey}/weedAssessment_REC[$weedAssesAltCount]"
                weedAssesRecCount = weedAssesRecCount.plus(1)

                weedAssessmentRecData.add(waRecEntity)
            }

            val weedAssessmentRecBpp3List = myVal.weedAssessmentRecBpp3
            var weedAssesRecBpp3Count = 1
            weedAssessmentRecBpp3List?.forEach { assessmentRecBpp3 ->
                val recBpp3Entity = modelMapper.map(assessmentRecBpp3, PpWaRecBpp3Entity::class.java)
                recBpp3Entity.parentKey = ppEntity.controlKey
                recBpp3Entity.setOfWeedAssessmentRecBpp3 = "${recBpp3Entity.parentKey}/weedAssessment_REC_BPP3"
                recBpp3Entity.controlKey = "${recBpp3Entity.parentKey}/weedAssessment_REC_BPP3[$weedAssesAltCount]"
                weedAssesRecBpp3Count = weedAssesRecBpp3Count.plus(1)

                weedAssessmentRecBpp3Data.add(recBpp3Entity)
            }

        }

        ppRepo.saveAll(ppEntityData)
        ppWaAltRepo.saveAll(weedAssessmentAltData)
        ppWaAltBpp3Repo.saveAll(weedAssessmentAltBpp3Data)
        ppWaConRepo.saveAll(weedAssessmentConData)
        ppWaConBpp3Repo.saveAll(weedAssessmentConBpp3Data)
        ppWaRecRepo.saveAll(weedAssessmentRecData)
        ppWaRecBpp3Repo.saveAll(weedAssessmentRecBpp3Data)

        log.info("Finished saving the data for $fileName------->")
    }
}