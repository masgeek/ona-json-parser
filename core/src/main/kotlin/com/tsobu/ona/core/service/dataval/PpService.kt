package com.tsobu.ona.core.service.dataval


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.dataval.*
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.dataval.*
import com.tsobu.ona.database.repositories.dataval.*
import com.tsobu.ona.forms.dataval.PpForm
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
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()

    private val fileName = "dataVAL_PP.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val ppList = ppRepo.findAllByOrderBySubmissionDateAsc()
        val ppWaAltList = ppWaAltRepo.findAll()
        val ppWaAltBpp3List = ppWaAltBpp3Repo.findAll()
        val ppWaConList = ppWaConRepo.findAll()
        val ppWaConBpp3List = ppWaConBpp3Repo.findAll()
        val ppWaRecList = ppWaRecRepo.findAll()
        val ppWaRecBpp3List = ppWaRecBpp3Repo.findAll()

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

        val ppData = ppList.map { ppEntity ->
            val ppDto = modelMapper.map(ppEntity, PpDto::class.java)
            ppDto.submissionDate = myDateUtil.toDateTimeString(ppEntity.submissionDate)
            ppDto.startDate = myDateUtil.toDateTimeString(ppEntity.startDate)
            ppDto.endDate = myDateUtil.toDateTimeString(ppEntity.endDate)

            ppDto.todayDate = myDateUtil.toDateToString(ppEntity.todayDate)
            ppDto.gappingDate = myDateUtil.toDateToString(ppEntity.gappingDate)

            ppDto.plantingDate = myDateUtil.toDateToString(ppEntity.plantingDate)
            ppDto.dateWeeding1 = myDateUtil.toDateToString(ppEntity.dateWeeding1)
            ppDto.dateWeeding2 = myDateUtil.toDateToString(ppEntity.dateWeeding2)
            ppDto.dateWeeding3 = myDateUtil.toDateToString(ppEntity.dateWeeding3)
            ppDto.dateWeeding4 = myDateUtil.toDateToString(ppEntity.dateWeeding4)
            ppDto.dateWeeding5 = myDateUtil.toDateToString(ppEntity.dateWeeding5)
            ppDto.dateWeeding6 = myDateUtil.toDateToString(ppEntity.dateWeeding6)
            ppDto.dateWeeding7 = myDateUtil.toDateToString(ppEntity.dateWeeding7)
            ppDto.dateWeeding8 = myDateUtil.toDateToString(ppEntity.dateWeeding8)
            ppDto.dateWeeding9 = myDateUtil.toDateToString(ppEntity.dateWeeding9)
            ppDto.dateWeeding10 = myDateUtil.toDateToString(ppEntity.dateWeeding10)

            ppDto
        }

        val ppWaAltData = ppWaAltList.map { waAltEntity ->
            val waAltDto = modelMapper.map(waAltEntity, PpWaAltDto::class.java)
            waAltDto
        }
        val ppWaAltBpp3Data = ppWaAltBpp3List.map { waAltEntity ->
            val waAltBpp3Dto = modelMapper.map(waAltEntity, PpWaAltBpp3Dto::class.java)
            waAltBpp3Dto
        }

        val ppWaConData = ppWaConList.map { waConEntity ->
            val waConDto = modelMapper.map(waConEntity, PpWaConDto::class.java)
            waConDto
        }
        val ppWaConBpp3Data = ppWaConBpp3List.map { waConBpp3Entity ->
            val waConBpp3Dto = modelMapper.map(waConBpp3Entity, PpWaConBpp3Dto::class.java)
            waConBpp3Dto
        }

        val ppWaRedData = ppWaRecList.map { ppWaRecEntity ->
            val ppDto = modelMapper.map(ppWaRecEntity, PpWaRecDto::class.java)
            ppDto
        }
        val ppWaRecBpp3Data = ppWaRecBpp3List.map { ppWaRecBpp3Entity ->
            val ppDto = modelMapper.map(ppWaRecBpp3Entity, PpWaRecBpp3Dto::class.java)
            ppDto
        }


        writeCsvFile.writeCsv(classMap = PpDto::class.java, data = ppData, fileName = "dataVAL_PP", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = PpWaAltDto::class.java, data = ppWaAltData, fileName = "dataVAL_PP-weedAssessment_ALT", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = PpWaAltBpp3Dto::class.java, data = ppWaAltBpp3Data, fileName = "dataVAL_PP-weedAssessment_ALT_BPP3", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = PpWaConDto::class.java, data = ppWaConData, fileName = "dataVAL_PP-weedAssessment_CON", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = PpWaConBpp3Dto::class.java, data = ppWaConBpp3Data, fileName = "dataVAL_PP-weedAssessment_CON_BPP3", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = PpWaRecDto::class.java, data = ppWaRedData, fileName = "dataVAL_PP-weedAssessment_REC", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = PpWaRecBpp3Dto::class.java, data = ppWaRecBpp3Data, fileName = "dataVAL_PP-weedAssessment_REC_BPP3", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
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
            val geoPoint = myDateUtil.splitGeoPoint(myVal.geopoint)
            val ppEntity = modelMapper.map(myVal, PpEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                ppEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    ppEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    ppEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    ppEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            ppEntity.uuid = myVal.formhubUuid
            ppEntity.submissionDate = myDateUtil.convertToDateTime(myVal.submissionTime)
            ppEntity.todayDate = myDateUtil.convertToDate(myVal.today)
            ppEntity.startDate = myDateUtil.convertToDateTime(myVal.start)
            ppEntity.endDate = myDateUtil.convertToDateTime(myVal.end)
            ppEntity.harvestDate = myDateUtil.convertToDate(myVal.harvestDate)
            ppEntity.plantingDate = myDateUtil.convertToDate(myVal.plantingDate)
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
        mapJsonFile()
    }
}