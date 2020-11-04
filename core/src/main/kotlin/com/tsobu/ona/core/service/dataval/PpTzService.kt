package com.tsobu.ona.core.service.dataval


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.dataval.*
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.dataval.*
import com.tsobu.ona.database.repositories.dataval.*
import com.tsobu.ona.forms.dataval.PpTzForm
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
class PpTzService
constructor(
        transactionManager: PlatformTransactionManager,
        val ppTzRepo: PpTzRepo,
        val assessmentP1Repo: PpTzWaP1Repo,
        val assessmentP2Repo: PpTzWaP2Repo,
        val assessmentP3Repo: PpTzWaP3Repo,
        val assessmentP4Repo: PpTzWaP4Repo,
        val assessmentP5Repo: PpTzWaP5Repo,
        val assessmentP6Repo: PpTzWaP6Repo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(PpTzService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()

    fun mapJsonFile() {
        log.info("Reading table data....")
        val frList = ppTzRepo.findAllByOrderBySubmissionDateAsc()
        val as1 = assessmentP1Repo.findAll()
        val as2 = assessmentP2Repo.findAll()
        val as3 = assessmentP3Repo.findAll()
        val as4 = assessmentP4Repo.findAll()
        val as5 = assessmentP5Repo.findAll()
        val as6 = assessmentP6Repo.findAll()

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

        val ppTzData = frList.map { ppTzEntity ->
            val ppTzDto = modelMapper.map(ppTzEntity, PpTzDto::class.java)
            ppTzDto.submissionDate = myDateUtil.convertTimeToString(ppTzEntity.submissionDate)
            ppTzDto.startDate = myDateUtil.convertTimeToString(ppTzEntity.startDate)
            ppTzDto.endDate = myDateUtil.convertTimeToString(ppTzEntity.endDate)

            ppTzDto
        }

        val as1Data = as1.map { ppTzEntity ->
            val waP1Dto = modelMapper.map(ppTzEntity, PpTzWaP1Dto::class.java)
            waP1Dto
        }
        val as2Data = as2.map { ppTzEntity ->
            val waP2Dto = modelMapper.map(ppTzEntity, PpTzWaP2Dto::class.java)
            waP2Dto
        }
        val as3Data = as3.map { ppTzEntity ->
            val waP3Dto = modelMapper.map(ppTzEntity, PpTzWaP3Dto::class.java)
            waP3Dto
        }

        val as4Data = as4.map { ppTzEntity ->
            val waP4Dto = modelMapper.map(ppTzEntity, PpTzWaP4Dto::class.java)
            waP4Dto
        }

        val as5Data = as5.map { ppTzEntity ->
            val waP5Dto = modelMapper.map(ppTzEntity, PpTzWaP5Dto::class.java)
            waP5Dto
        }

        val as6Data = as6.map { ppTzEntity ->
            val waP6Dto = modelMapper.map(ppTzEntity, PpTzWaP6Dto::class.java)
            waP6Dto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = FrDto::class.java, data = ppTzData, fileName = "dataVAL_PP_TZ-", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = PpTzWaP1Dto::class.java, data = as1Data, fileName = "dataVAL_PP_TZ-weedAssessment_P1", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = PpTzWaP2Dto::class.java, data = as2Data, fileName = "dataVAL_PP_TZ-weedAssessment_P2", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = PpTzWaP3Dto::class.java, data = as3Data, fileName = "dataVAL_PP_TZ-weedAssessment_P3", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = PpTzWaP4Dto::class.java, data = as4Data, fileName = "dataVAL_PP_TZ-weedAssessment_P4", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = PpTzWaP5Dto::class.java, data = as5Data, fileName = "dataVAL_PP_TZ-weedAssessment_P5", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = PpTzWaP6Dto::class.java, data = as6Data, fileName = "dataVAL_PP_TZ-weedAssessment_P6", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset(fileName: String) {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<PpTzForm>>() {})

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

        val ppTzEntityData = ArrayList<PpTzEntity>()
        val weedAssessmentP1Data = ArrayList<PpTzWaP1Entity>()
        val weedAssessmentP2Data = ArrayList<PpTzWaP2Entity>()
        val weedAssessmentP3Data = ArrayList<PpTzWaP3Entity>()
        val weedAssessmentP4Data = ArrayList<PpTzWaP4Entity>()
        val weedAssessmentP5Data = ArrayList<PpTzWaP5Entity>()
        val weedAssessmentP6Data = ArrayList<PpTzWaP6Entity>()
        list.forEach { myVal ->
            //map and save to database
            val geoPoint = myDateUtil.splitGeoPoint(myVal.geopoint)
            val ppTzEntity = modelMapper.map(myVal, PpTzEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                ppTzEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    ppTzEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    ppTzEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    ppTzEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            ppTzEntity.uuid = myVal.formhubUuid
            ppTzEntity.submissionDate = myDateUtil.convertToDateTime(myVal.submissionTime)
            ppTzEntity.todayDate = myDateUtil.convertToDate(myVal.today)
            ppTzEntity.startDate = myDateUtil.convertToDateTime(myVal.start)
            ppTzEntity.endDate = myDateUtil.convertToDateTime(myVal.end)
            ppTzEntity.harvestDate = myDateUtil.convertToDate(myVal.harvestDate)
            ppTzEntity.instanceId = myVal.metaInstanceID
            ppTzEntity.controlKey = myVal.metaInstanceID
            ppTzEntityData.add(ppTzEntity)


            val weedAssessmentP1List = myVal.weedAssessmentP1
            var weedAssesP1Count = 1
            weedAssessmentP1List?.forEach { weedAssessmentP1 ->
                val assessmentP1Entity = modelMapper.map(weedAssessmentP1, PpTzWaP1Entity::class.java)
                assessmentP1Entity.parentKey = ppTzEntity.controlKey
                assessmentP1Entity.setOfWeedAssessmentP1 = "${assessmentP1Entity.parentKey}/weedAssessment_P1"
                assessmentP1Entity.controlKey = "${assessmentP1Entity.parentKey}/weedAssessment_P1[$weedAssesP1Count]"


                weedAssessmentP1Data.add(assessmentP1Entity)
                weedAssesP1Count = weedAssesP1Count.plus(1)
            }

            val weedAssessmentP2List = myVal.weedAssessmentP2
            var weedAssesP2Count = 1
            weedAssessmentP2List?.forEach { weedAssessmentP2 ->
                val assessmentP2Entity = modelMapper.map(weedAssessmentP2, PpTzWaP2Entity::class.java)
                assessmentP2Entity.parentKey = ppTzEntity.controlKey
                assessmentP2Entity.setOfWeedAssessmentP2 = "${assessmentP2Entity.parentKey}/weedAssessment_P2"
                assessmentP2Entity.controlKey = "${assessmentP2Entity.parentKey}/weedAssessment_P2[$weedAssesP2Count]"


                weedAssessmentP2Data.add(assessmentP2Entity)
                weedAssesP2Count = weedAssesP2Count.plus(1)
            }

            val weedAssessmentP3List = myVal.weedAssessmentP3
            var weedAssesP3Count = 1
            weedAssessmentP3List?.forEach { weedAssessmentP3 ->
                val assessmentP3Entity = modelMapper.map(weedAssessmentP3, PpTzWaP3Entity::class.java)
                assessmentP3Entity.parentKey = ppTzEntity.controlKey
                assessmentP3Entity.setOfWeedAssessmentP3 = "${assessmentP3Entity.parentKey}/weedAssessment_P3"
                assessmentP3Entity.controlKey = "${assessmentP3Entity.parentKey}/weedAssessment_P3[$weedAssesP3Count]"


                weedAssessmentP3Data.add(assessmentP3Entity)
                weedAssesP3Count = weedAssesP3Count.plus(1)
            }

            val weedAssessmentP4List = myVal.weedAssessmentP4
            var weedAssesP4Count = 1
            weedAssessmentP4List?.forEach { weedAssessmentP4 ->
                val assessmentP4Entity = modelMapper.map(weedAssessmentP4, PpTzWaP4Entity::class.java)
                assessmentP4Entity.parentKey = ppTzEntity.controlKey
                assessmentP4Entity.setOfWeedAssessmentP4 = "${assessmentP4Entity.parentKey}/weedAssessment_P4"
                assessmentP4Entity.controlKey = "${assessmentP4Entity.parentKey}/weedAssessment_P4[$weedAssesP4Count]"


                weedAssessmentP4Data.add(assessmentP4Entity)
                weedAssesP4Count = weedAssesP4Count.plus(1)
            }

            val weedAssessmentP5List = myVal.weedAssessmentP5
            var weedAssesP5Count = 1
            weedAssessmentP5List?.forEach { weedAssessmentP5 ->
                val assessmentP5Entity = modelMapper.map(weedAssessmentP5, PpTzWaP5Entity::class.java)
                assessmentP5Entity.parentKey = ppTzEntity.controlKey
                assessmentP5Entity.setOfWeedAssessmentP5 = "${assessmentP5Entity.parentKey}/weedAssessment_P5"
                assessmentP5Entity.controlKey = "${assessmentP5Entity.parentKey}/weedAssessment_P5[$weedAssesP4Count]"


                weedAssessmentP5Data.add(assessmentP5Entity)
                weedAssesP5Count = weedAssesP5Count.plus(1)
            }

            val weedAssessmentP6List = myVal.weedAssessmentP6
            var weedAssesP6Count = 1
            weedAssessmentP6List?.forEach { weedAssessmentP6 ->
                val assessmentP6Entity = modelMapper.map(weedAssessmentP6, PpTzWaP6Entity::class.java)
                assessmentP6Entity.parentKey = ppTzEntity.controlKey
                assessmentP6Entity.setOfWeedAssessmentP6 = "${assessmentP6Entity.parentKey}/weedAssessment_P6"
                assessmentP6Entity.controlKey = "${assessmentP6Entity.parentKey}/weedAssessment_P6[$weedAssesP4Count]"


                weedAssessmentP6Data.add(assessmentP6Entity)
                weedAssesP6Count = weedAssesP6Count.plus(1)
            }
        }

        ppTzRepo.saveAll(ppTzEntityData)
        assessmentP1Repo.saveAll(weedAssessmentP1Data)
        assessmentP2Repo.saveAll(weedAssessmentP2Data)
        assessmentP3Repo.saveAll(weedAssessmentP3Data)
        assessmentP4Repo.saveAll(weedAssessmentP4Data)
        assessmentP5Repo.saveAll(weedAssessmentP5Data)
        assessmentP6Repo.saveAll(weedAssessmentP6Data)

        log.info("Finished saving the data for $fileName------->")
    }
}