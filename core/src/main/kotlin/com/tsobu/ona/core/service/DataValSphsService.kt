package com.tsobu.ona.core.service


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.forms.datavalsphs.DataValSphs
import com.tsobu.ona.core.dto.json.ScoreWeedControlAcDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.datavalsphs.*
import com.tsobu.ona.database.repositories.datavalsphs.*
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
class DataValSphsService
constructor(
        transactionManager: PlatformTransactionManager,
        val sphsRepo: SphsRepo,
        val harvestRecTriDetailRepo: HarvestRecTriDetailRepo,
        val recTriRepo: HarvestRecTriRepo,
        val remainPlantRecRepo: RemainPlantRecRepo,
        val cornerPlantRecRepo: CornerPlantRecRepo,
        val harvestConTriDetailRepo: HarvestConTriDetailRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(DataValSphsService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)

    fun mapJsonFile() {
        log.info("Reading weed table here")
        val scores = sphsRepo.findAll()
        val triDetailList = harvestRecTriDetailRepo.findAll()

        val scoreWeedData = scores.map { scoreWeedControlAc ->
            val outboxDto = modelMapper.map(scoreWeedControlAc, ScoreWeedControlAcDto::class.java)
            outboxDto.submissionDate = myDateUtil.convertTimeToString(scoreWeedControlAc.submissionDate)
            outboxDto.startDate = myDateUtil.convertTimeToString(scoreWeedControlAc.startDate)
            outboxDto.endDate = myDateUtil.convertTimeToString(scoreWeedControlAc.endDate)
            outboxDto
        }


        val writeCsvFile = WriteCsvFile()
//        writeCsvFile.writeScoreWeedCsv(list = scoreWeedData, fileName = "Score_Weed_Control_AC.csv")
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset(fileName: String) {
        val filePath = "${appConfig.globalProperties().folderPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<DataValSphs>>() {})

        val data = ArrayList<SphsEntity>()
        val recTriDetailEntityData = ArrayList<HarvestRecTriDetailEntity>()
        val recTriEntityData = ArrayList<SphsHarvestRecTriEntity>()
        val remainPlantEntityData = ArrayList<RemainPlantRecEntity>()
        val cornerPlantEntityData = ArrayList<CornerPlantRecEntity>()
        val harvestConTriDetailEntityData = ArrayList<HarvestConTriDetailEntity>()


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


        transactionTemplate.execute {
            list.forEach { myVal ->
                //map and save to database
                val geoPoint = myDateUtil.splitGeoPoint(myVal.geopoint)
                val weedEntity = modelMapper.map(myVal, SphsEntity::class.java)
                if (geoPoint.isNotEmpty()) {
                    weedEntity.geoPointLatitude = geoPoint[0].toDouble()

                    if (myDateUtil.indexExists(geoPoint, 1)) {
                        weedEntity.geoPointLongitude = geoPoint[1].toDouble()
                    }
                    if (myDateUtil.indexExists(geoPoint, 2)) {
                        weedEntity.geoPointAltitude = geoPoint[2].toDouble()
                    }
                    if (myDateUtil.indexExists(geoPoint, 3)) {
                        weedEntity.geoPointAccuracy = geoPoint[3].toDouble()
                    }
                }
                weedEntity.uuid = myVal.formhubUuid
                weedEntity.submissionDate = myDateUtil.convertToDateTime(myVal.submissionTime)
                weedEntity.todayDate = myDateUtil.convertToDate(myVal.today)
                weedEntity.plantingDate = myDateUtil.convertToDate(myVal.plantingDate)
                weedEntity.startDate = myDateUtil.convertToDateTime(myVal.start)
                weedEntity.endDate = myDateUtil.convertToDateTime(myVal.end)
                weedEntity.instanceid = myVal.metaInstanceID
                weedEntity.controlKey = myVal.metaInstanceID

                data.add(weedEntity)

                val harvestRecTriList = myVal.harvestRecTri
                var recTriCount = 1
                harvestRecTriList?.forEach { harvestRecTri ->
                    val recTriEntity = modelMapper.map(harvestRecTri, SphsHarvestRecTriEntity::class.java)
                    recTriEntity.parentKey = weedEntity.controlKey
                    recTriEntity.setOfHarvestRecTri = "${recTriEntity.parentKey}/harvest_REC_Tri"
                    recTriEntity.controlKey = "${recTriEntity.parentKey}/harvest_REC_Tri[$recTriCount]"

                    recTriEntityData.add(recTriEntity)
                    recTriCount = recTriCount.plus(1)
                }

                val recTriDetailList = myVal.harvestRecTriDetail
                var recTriDetailCount = 1
                recTriDetailList?.forEach { harvestRecTriDetail ->
                    val triDetailEntity = modelMapper.map(harvestRecTriDetail, HarvestRecTriDetailEntity::class.java)

                    triDetailEntity.parentKey = weedEntity.controlKey
                    triDetailEntity.setOfHarvest = "${triDetailEntity.parentKey}/harvest_REC_Tri_detail"
                    triDetailEntity.controlKey = "${triDetailEntity.parentKey}/harvest_REC_Tri_detail[$recTriDetailCount]"
                    triDetailEntity.setOfCornerPlant = "${triDetailEntity.setOfHarvest}/cornerPlant_REC"
                    triDetailEntity.setOfRemainPlant = "${weedEntity.controlKey}/harvest_REC_Tri_detail[$recTriDetailCount]/remainPlant_REC"


                    recTriDetailEntityData.add(triDetailEntity)

                    var remainPlantCounter = 1
                    val remainPlantList = harvestRecTriDetail.remainPlantRec
                    remainPlantList?.forEach { remainPlantRec ->
                        val remainPlantEntity = modelMapper.map(remainPlantRec, RemainPlantRecEntity::class.java)

                        remainPlantEntity.parentKey = "${triDetailEntity.setOfHarvest}[$remainPlantCounter]"
                        remainPlantEntity.setOfRemainPlantRec = "${remainPlantEntity.parentKey}/remainPlant_REC"
                        remainPlantEntity.controlKey = "${remainPlantEntity.setOfRemainPlantRec}[$remainPlantCounter]"

                        remainPlantEntityData.add(remainPlantEntity)
                        remainPlantCounter = remainPlantCounter.plus(1)
                    }

                    var cornerPlantCounter = 1
                    val cornerPlantList = harvestRecTriDetail.cornerPlantRec
                    cornerPlantList?.forEach { cornerPlantRec ->
                        val cornerPlantEntity = modelMapper.map(cornerPlantRec, CornerPlantRecEntity::class.java)

                        cornerPlantEntity.parentKey = "${triDetailEntity.setOfHarvest}[$cornerPlantCounter]"
                        cornerPlantEntity.setOfCornerPlantRec = "${cornerPlantEntity.parentKey}/cornerPlant_REC"
                        cornerPlantEntity.controlKey = "${cornerPlantEntity.setOfCornerPlantRec}[$cornerPlantCounter]"

                        cornerPlantEntityData.add(cornerPlantEntity)

                        cornerPlantCounter = cornerPlantCounter.plus(1)
                    }

                    recTriDetailCount = recTriDetailCount.plus(1)
                }

                val harvestConTriDetailList = myVal.harvestConTriDetail
                var conTriDetailCounter = 1
                harvestConTriDetailList?.forEach { conTriDetail ->
                    val conTriDetailEntity = modelMapper.map(conTriDetail, HarvestConTriDetailEntity::class.java)

                    conTriDetailEntity.parentKey = weedEntity.controlKey
                    conTriDetailEntity.setOfHarvestConTriDetail = "${conTriDetailEntity.parentKey}/harvest_CON_Tri_detail"
                    conTriDetailEntity.controlKey = "${conTriDetailEntity.parentKey}/harvest_CON_Tri_detail[$conTriDetailCounter]"
                    conTriDetailEntity.setOfRemainPlantCon = "${conTriDetailEntity.controlKey}/remainPlant_CON"
                    conTriDetailEntity.setOfCornerPlantCon = "${conTriDetailEntity.controlKey}/cornerPlant_CON"

                    harvestConTriDetailEntityData.add(conTriDetailEntity)
                    conTriDetailCounter = conTriDetailCounter.plus(1)
                }

            }

            log.info("Saving all the data to the database now")
//            dataValSphsRepo.saveAll(data)
//            harvestRecTriDetailRepo.saveAll(recTriDetailEntityData)
//            recTriRepo.saveAll(recTriEntityData)
//            remainPlantRecRepo.saveAll(remainPlantEntityData)
//            cornerPlantRecRepo.saveAll(cornerPlantEntityData)
            harvestConTriDetailRepo.saveAll(harvestConTriDetailEntityData)
            log.info("Finished saving the data for $fileName------->")
        }
    }
}