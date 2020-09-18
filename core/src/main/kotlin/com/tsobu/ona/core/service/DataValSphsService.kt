package com.tsobu.ona.core.service


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.forms.datavalsphs.DataValSphs
import com.tsobu.ona.core.dto.json.ScoreWeedControlAcDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.datavalsphs.HarvestRecTriDetailEntity
import com.tsobu.ona.database.entities.datavalsphs.RemainPlantRecEntity
import com.tsobu.ona.database.entities.datavalsphs.SphsEntity
import com.tsobu.ona.database.entities.datavalsphs.SphsHarvestRecTriEntity
import com.tsobu.ona.database.repositories.datavalsphs.HarvestRecTriDetailRepo
import com.tsobu.ona.database.repositories.datavalsphs.HarvestRecTriRepo
import com.tsobu.ona.database.repositories.datavalsphs.RemainPlantRecRepo
import com.tsobu.ona.database.repositories.datavalsphs.SphsRepo
import org.modelmapper.AbstractCondition
import org.modelmapper.Condition
import org.modelmapper.ModelMapper
import org.modelmapper.convention.MatchingStrategies
import org.modelmapper.spi.MappingContext
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.TransactionStatus
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


        val result = transactionTemplate.execute { status: TransactionStatus? ->

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

                val recTriList = myVal.harvestRecTri
                var recTriCount = 1
                recTriList?.forEach { recTri ->
                    val recTriEntity = modelMapper.map(recTri, SphsHarvestRecTriEntity::class.java)
                    recTriEntity.parentKey = weedEntity.controlKey
                    recTriEntity.setOfHarvestRecTri = "${recTriEntity.parentKey}/harvest_REC_Tri"
                    recTriEntity.controlKey = "${recTriEntity.parentKey}/harvest_REC_Tri[$recTriCount]"

                    recTriEntityData.add(recTriEntity)
                    recTriCount = recTriCount.plus(1)
                }
                val recTriDetailList = myVal.harvestRecTriDetail
                var recTriDetailCount = 1
                recTriDetailList?.forEach { recTriDetail ->
                    val triDetailEntity = modelMapper.map(recTriDetail, HarvestRecTriDetailEntity::class.java)

                    triDetailEntity.parentKey = weedEntity.controlKey
                    triDetailEntity.setOfHarvest = "${triDetailEntity.parentKey}/harvest_REC_Tri_detail"
                    triDetailEntity.controlKey = "${triDetailEntity.parentKey}/harvest_REC_Tri_detail[$recTriDetailCount]"
                    triDetailEntity.setOfCornerPlant = "${triDetailEntity.setOfHarvest}/cornerPlant_REC"
                    triDetailEntity.setOfRemainPlant = "${weedEntity.controlKey}/harvest_REC_Tri_detail[$recTriDetailCount]/remainPlant_REC"


                    recTriDetailEntityData.add(triDetailEntity)

                    var remainPlantCounter = 1
                    val remainPlantList = recTriDetail.remainPlantRec
                    remainPlantList?.forEach { remainPlant ->
                        val remainPlantEntity = modelMapper.map(remainPlant, RemainPlantRecEntity::class.java)

                        remainPlantEntity.parentKey = "${triDetailEntity.setOfHarvest}[$remainPlantCounter]"
                        remainPlantEntity.setOfRemainPlantRec = "${remainPlantEntity.parentKey}/remainPlant_REC"
                        remainPlantEntity.controlKey = "${remainPlantEntity.setOfRemainPlantRec}[$remainPlantCounter]"

                        remainPlantEntityData.add(remainPlantEntity)
                        remainPlantCounter = remainPlantCounter.plus(1)
                    }

                    recTriDetailCount = recTriDetailCount.plus(1)
                }


            }

            log.info("Saving all the data to the database now")
//            dataValSphsRepo.saveAll(data)
//            harvestRecTriDetailRepo.saveAll(recTriDetailEntityData)
//            recTriRepo.saveAll(recTriEntityData)
            remainPlantRecRepo.saveAll(remainPlantEntityData)
            log.info("Finished saving the data for $fileName------->")
        }
    }
}