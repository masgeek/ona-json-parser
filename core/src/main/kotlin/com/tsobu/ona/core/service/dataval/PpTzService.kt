package com.tsobu.ona.core.service.dataval


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.dataval.*
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
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
    private val writeCsvFile = CsvUtility()

    private val fileName = "dataVAL_PP_TZ.json"
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
//        modelMapper.configuration.isAmbiguityIgnored = false
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val ppTzData = frList.map { ppTzEntity ->
            val ppTzDto = modelMapper.map(ppTzEntity, PpTzDto::class.java)
            ppTzDto.submissionDate = myDateUtil.toDateTimeString(ppTzEntity.submissionDate)
            ppTzDto.startDate = myDateUtil.toDateTimeString(ppTzEntity.startDate)
            ppTzDto.endDate = myDateUtil.toDateTimeString(ppTzEntity.endDate)

            ppTzDto.todayDate = myDateUtil.toDateToString(ppTzEntity.todayDate)
            ppTzDto.harvestDate = myDateUtil.toDateToString(ppTzEntity.harvestDate)
            ppTzDto.gappingDate = myDateUtil.toDateToString(ppTzEntity.gappingDate)
            ppTzDto.plantingDate = myDateUtil.toDateToString(ppTzEntity.plantingDate)
            ppTzDto.dateWeeding1 = myDateUtil.toDateToString(ppTzEntity.dateWeeding1)
            ppTzDto.dateWeeding2 = myDateUtil.toDateToString(ppTzEntity.dateWeeding2)
            ppTzDto.dateWeeding3 = myDateUtil.toDateToString(ppTzEntity.dateWeeding3)
            ppTzDto.dateWeeding4 = myDateUtil.toDateToString(ppTzEntity.dateWeeding4)
            ppTzDto.dateWeeding5 = myDateUtil.toDateToString(ppTzEntity.dateWeeding5)
            ppTzDto.dateWeeding6 = myDateUtil.toDateToString(ppTzEntity.dateWeeding6)
            ppTzDto.dateWeeding7 = myDateUtil.toDateToString(ppTzEntity.dateWeeding7)
            ppTzDto.dateWeeding8 = myDateUtil.toDateToString(ppTzEntity.dateWeeding8)
            ppTzDto.dateWeeding9 = myDateUtil.toDateToString(ppTzEntity.dateWeeding9)
            ppTzDto.dateWeeding10 = myDateUtil.toDateToString(ppTzEntity.dateWeeding10)


            ppTzDto.plotLength1P1 = ppTzEntity.plotL1P1
            ppTzDto.plotLength1P2 = ppTzEntity.plotL1P2
            ppTzDto.plotLength1P3 = ppTzEntity.plotL1P3
            ppTzDto.plotLength1P4 = ppTzEntity.plotL1P4
            ppTzDto.plotLength1P5 = ppTzEntity.plotL1P5
            ppTzDto.plotLength1P6 = ppTzEntity.plotL1P6

            ppTzDto.plotLength2P1 = ppTzEntity.plotL2P1
            ppTzDto.plotLength2P2 = ppTzEntity.plotL2P2
            ppTzDto.plotLength2P3 = ppTzEntity.plotL2P3
            ppTzDto.plotLength2P4 = ppTzEntity.plotL2P4
            ppTzDto.plotLength2P5 = ppTzEntity.plotL2P5
            ppTzDto.plotLength2P6 = ppTzEntity.plotL2P6

            ppTzDto.plotWidth1P1 = ppTzEntity.plotW1P1
            ppTzDto.plotWidth1P2 = ppTzEntity.plotW1P2
            ppTzDto.plotWidth1P3 = ppTzEntity.plotW1P3
            ppTzDto.plotWidth1P4 = ppTzEntity.plotW1P4
            ppTzDto.plotWidth1P5 = ppTzEntity.plotW1P5
            ppTzDto.plotWidth1P6 = ppTzEntity.plotW1P6


            ppTzDto.plotWidth2P1 = ppTzEntity.plotW2P1
            ppTzDto.plotWidth2P2 = ppTzEntity.plotW2P2
            ppTzDto.plotWidth2P3 = ppTzEntity.plotW2P3
            ppTzDto.plotWidth2P4 = ppTzEntity.plotW2P4
            ppTzDto.plotWidth2P5 = ppTzEntity.plotW2P5
            ppTzDto.plotWidth2P6 = ppTzEntity.plotW2P6

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
        writeCsvFile.writeCsv(classMap = PpTzDto::class.java, data = ppTzData, fileName = "dataVAL_PP_TZ", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = PpTzWaP1Dto::class.java, data = as1Data, fileName = "dataVAL_PP_TZ-weedAssessment_P1", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = PpTzWaP2Dto::class.java, data = as2Data, fileName = "dataVAL_PP_TZ-weedAssessment_P2", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = PpTzWaP3Dto::class.java, data = as3Data, fileName = "dataVAL_PP_TZ-weedAssessment_P3", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = PpTzWaP4Dto::class.java, data = as4Data, fileName = "dataVAL_PP_TZ-weedAssessment_P4", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = PpTzWaP5Dto::class.java, data = as5Data, fileName = "dataVAL_PP_TZ-weedAssessment_P5", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = PpTzWaP6Dto::class.java, data = as6Data, fileName = "dataVAL_PP_TZ-weedAssessment_P6", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
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
            ppTzEntity.formHubUuId = myVal.formhubUuid
            ppTzEntity.submissionDate = myDateUtil.convertToDateTime(myVal.submissionTime)
            ppTzEntity.todayDate = myDateUtil.convertToDate(myVal.todayDate)
            ppTzEntity.startDate = myDateUtil.convertToDateTime(myVal.startDate)
            ppTzEntity.endDate = myDateUtil.convertToDateTime(myVal.endDate)
            ppTzEntity.instanceId = myVal.instanceId
            ppTzEntity.controlKey = myVal.instanceId

            ppTzEntity.setOfWeedAssessmentP1 = "${ppTzEntity.instanceId}/weedAssessment_P1"
            ppTzEntity.setOfWeedAssessmentP2 = "${ppTzEntity.instanceId}/weedAssessment_P2"
            ppTzEntity.setOfWeedAssessmentP3 = "${ppTzEntity.instanceId}/weedAssessment_P3"
            ppTzEntity.setOfWeedAssessmentP4 = "${ppTzEntity.instanceId}/weedAssessment_P4"
            ppTzEntity.setOfWeedAssessmentP5 = "${ppTzEntity.instanceId}/weedAssessment_P5"
            ppTzEntity.setOfWeedAssessmentP6 = "${ppTzEntity.instanceId}/weedAssessment_P6"

            ppTzEntity.todayDate = myDateUtil.convertToDate(myVal.todayDate)
            ppTzEntity.harvestDate = myDateUtil.convertToDate(myVal.harvestDate)
            ppTzEntity.gappingDate = myDateUtil.convertToDate(myVal.gappingDate)
            ppTzEntity.plantingDate = myDateUtil.convertToDate(myVal.plantingDate)

            ppTzEntity.dateWeeding1 = myDateUtil.convertToDate(myVal.dateWeeding1)
            ppTzEntity.dateWeeding2 = myDateUtil.convertToDate(myVal.dateWeeding2)
            ppTzEntity.dateWeeding3 = myDateUtil.convertToDate(myVal.dateWeeding3)
            ppTzEntity.dateWeeding4 = myDateUtil.convertToDate(myVal.dateWeeding4)
            ppTzEntity.dateWeeding5 = myDateUtil.convertToDate(myVal.dateWeeding5)
            ppTzEntity.dateWeeding6 = myDateUtil.convertToDate(myVal.dateWeeding6)
            ppTzEntity.dateWeeding7 = myDateUtil.convertToDate(myVal.dateWeeding7)
            ppTzEntity.dateWeeding8 = myDateUtil.convertToDate(myVal.dateWeeding8)
            ppTzEntity.dateWeeding9 = myDateUtil.convertToDate(myVal.dateWeeding9)
            ppTzEntity.dateWeeding10 = myDateUtil.convertToDate(myVal.dateWeeding10)
                      
            ppTzEntity.plotL1P1 = myVal.plotLayoutP1PlotL1P1
            ppTzEntity.plotL1P2 = myVal.plotLayoutP2PlotL1P2
            ppTzEntity.plotL1P3 = myVal.plotLayoutP3PlotL1P3
            ppTzEntity.plotL1P4 = myVal.plotLayoutP4PlotL1P4
            ppTzEntity.plotL1P5 = myVal.plotLayoutP5PlotL1P5
            ppTzEntity.plotL1P6 = myVal.plotLayoutP6PlotL1P6

            ppTzEntity.plotL2P1 = myVal.plotLayoutP1PlotL2P1
            ppTzEntity.plotL2P2 = myVal.plotLayoutP2PlotL2P2
            ppTzEntity.plotL2P3 = myVal.plotLayoutP3PlotL2P3
            ppTzEntity.plotL2P4 = myVal.plotLayoutP4PlotL2P4
            ppTzEntity.plotL2P5 = myVal.plotLayoutP5PlotL2P5
            ppTzEntity.plotL2P6 = myVal.plotLayoutP6PlotL2P6

            ppTzEntity.plotW1P1 = myVal.plotLayoutP1PlotW1P1
            ppTzEntity.plotW1P2 = myVal.plotLayoutP2PlotW1P2
            ppTzEntity.plotW1P3 = myVal.plotLayoutP3PlotW1P3
            ppTzEntity.plotW1P4 = myVal.plotLayoutP4PlotW1P4
            ppTzEntity.plotW1P5 = myVal.plotLayoutP5PlotW1P5
            ppTzEntity.plotW1P6 = myVal.plotLayoutP6PlotW1P6

            ppTzEntity.plotW2P1 = myVal.plotLayoutP1PlotW2P1
            ppTzEntity.plotW2P2 = myVal.plotLayoutP2PlotW2P2
            ppTzEntity.plotW2P3 = myVal.plotLayoutP3PlotW2P3
            ppTzEntity.plotW2P4 = myVal.plotLayoutP4PlotW2P4
            ppTzEntity.plotW2P5 = myVal.plotLayoutP5PlotW2P5
            ppTzEntity.plotW2P6 = myVal.plotLayoutP6PlotW2P6

            ppTzEntity.comment = myVal.comment

            ppTzEntityData.add(ppTzEntity)


            modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD
            val weedAssessmentP1List = myVal.weedAssessmentP1
            var weedAssesP1Count = 1
            weedAssessmentP1List.forEach { weedAssessmentP1 ->
                val assessmentP1Entity = modelMapper.map(weedAssessmentP1, PpTzWaP1Entity::class.java)
                assessmentP1Entity.parentKey = ppTzEntity.controlKey
                assessmentP1Entity.setOfWeedAssessmentP1 = "${assessmentP1Entity.parentKey}/weedAssessment_P1"
                assessmentP1Entity.controlKey = "${assessmentP1Entity.parentKey}/weedAssessment_P1[$weedAssesP1Count]"


                weedAssessmentP1Data.add(assessmentP1Entity)
                weedAssesP1Count = weedAssesP1Count.plus(1)
            }

            val weedAssessmentP2List = myVal.weedAssessmentP2
            var weedAssesP2Count = 1
            weedAssessmentP2List.forEach { weedAssessmentP2 ->
                val assessmentP2Entity = modelMapper.map(weedAssessmentP2, PpTzWaP2Entity::class.java)
                assessmentP2Entity.parentKey = ppTzEntity.controlKey
                assessmentP2Entity.setOfWeedAssessmentP2 = "${assessmentP2Entity.parentKey}/weedAssessment_P2"
                assessmentP2Entity.controlKey = "${assessmentP2Entity.parentKey}/weedAssessment_P2[$weedAssesP2Count]"


                weedAssessmentP2Data.add(assessmentP2Entity)
                weedAssesP2Count = weedAssesP2Count.plus(1)
            }

            val weedAssessmentP3List = myVal.weedAssessmentP3
            var weedAssesP3Count = 1
            weedAssessmentP3List.forEach { weedAssessmentP3 ->
                val assessmentP3Entity = modelMapper.map(weedAssessmentP3, PpTzWaP3Entity::class.java)
                assessmentP3Entity.parentKey = ppTzEntity.controlKey
                assessmentP3Entity.setOfWeedAssessmentP3 = "${assessmentP3Entity.parentKey}/weedAssessment_P3"
                assessmentP3Entity.controlKey = "${assessmentP3Entity.parentKey}/weedAssessment_P3[$weedAssesP3Count]"


                weedAssessmentP3Data.add(assessmentP3Entity)
                weedAssesP3Count = weedAssesP3Count.plus(1)
            }

            val weedAssessmentP4List = myVal.weedAssessmentP4
            var weedAssesP4Count = 1
            weedAssessmentP4List.forEach { weedAssessmentP4 ->
                val assessmentP4Entity = modelMapper.map(weedAssessmentP4, PpTzWaP4Entity::class.java)
                assessmentP4Entity.parentKey = ppTzEntity.controlKey
                assessmentP4Entity.setOfWeedAssessmentP4 = "${assessmentP4Entity.parentKey}/weedAssessment_P4"
                assessmentP4Entity.controlKey = "${assessmentP4Entity.parentKey}/weedAssessment_P4[$weedAssesP4Count]"


                weedAssessmentP4Data.add(assessmentP4Entity)
                weedAssesP4Count = weedAssesP4Count.plus(1)
            }

            val weedAssessmentP5List = myVal.weedAssessmentP5
            var weedAssesP5Count = 1
            weedAssessmentP5List.forEach { weedAssessmentP5 ->
                val assessmentP5Entity = modelMapper.map(weedAssessmentP5, PpTzWaP5Entity::class.java)
                assessmentP5Entity.parentKey = ppTzEntity.controlKey
                assessmentP5Entity.setOfWeedAssessmentP5 = "${assessmentP5Entity.parentKey}/weedAssessment_P5"
                assessmentP5Entity.controlKey = "${assessmentP5Entity.parentKey}/weedAssessment_P5[$weedAssesP4Count]"


                weedAssessmentP5Data.add(assessmentP5Entity)
                weedAssesP5Count = weedAssesP5Count.plus(1)
            }

            val weedAssessmentP6List = myVal.weedAssessmentP6
            var weedAssesP6Count = 1
            weedAssessmentP6List.forEach { weedAssessmentP6 ->
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
        mapJsonFile()
    }
}