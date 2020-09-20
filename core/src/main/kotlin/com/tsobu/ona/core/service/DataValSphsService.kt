package com.tsobu.ona.core.service


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.forms.datavalsphs.DataValSphs
import com.tsobu.ona.core.dto.json.datavalsphs.ConTriDetailDto
import com.tsobu.ona.core.dto.json.datavalsphs.CornerPlantConDto
import com.tsobu.ona.core.dto.json.datavalsphs.SphsDto
import com.tsobu.ona.core.dto.json.datavarsphs.CornerPlantRecDto
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
        val remainPlantConRepo: RemainPlantConRepo,
        val cornerPlantConRepo: CornerPlantConRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(DataValSphsService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)

    fun mapJsonFile() {
        log.info("Reading tables here")
        val sphsList = sphsRepo.findAllByOrderBySubmissionDateAsc()
        val conTriDetailList = harvestConTriDetailRepo.findAll()
        val recTriDetailList = harvestRecTriDetailRepo.findAll()
        val cornerPlantConList = cornerPlantConRepo.findAll()
        val cornerPlantRecList = cornerPlantRecRepo.findAll()

        val sphsData = sphsList.map { sphsEntity ->
            val sphsDto = modelMapper.map(sphsEntity, SphsDto::class.java)
            sphsDto.submissionDate = myDateUtil.convertTimeToString(sphsEntity.submissionDate)
            sphsDto.startDate = myDateUtil.convertTimeToString(sphsEntity.startDate)
            sphsDto.endDate = myDateUtil.convertTimeToString(sphsEntity.endDate)
            sphsDto
        }

        val conTriDetailData = conTriDetailList.map { triDetailEntity ->
            val cornerPlantConDto = modelMapper.map(triDetailEntity, ConTriDetailDto::class.java)
            cornerPlantConDto
        }
        val cornerPlantConData = cornerPlantConList.map { plantConEntity ->
            val cornerPlantConDto = modelMapper.map(plantConEntity, CornerPlantConDto::class.java)
            cornerPlantConDto
        }
        val cornerPlantRecData = cornerPlantRecList.map { plantRecEntity ->
            val cornerPlantRecDto = modelMapper.map(plantRecEntity, CornerPlantRecDto::class.java)
            cornerPlantRecDto
        }


        val writeCsvFile = WriteCsvFile()
//        writeCsvFile.writeSphsCsv(list = sphsData, fileName = "dataVAL_SPHS.csv")
//        writeCsvFile.writeCornerPlantRecCsv(list = cornerPlantRecData, fileName = "dataVAL_SPHS-cornerPlant_REC.csv")
//        writeCsvFile.writeCsv(pojoType = CornerPlantConDto::class.java, list = cornerPlantConData, fileName = "dataVAL_SPHS-cornerPlant_CON")
        writeCsvFile.writeCsv(pojoType = ConTriDetailDto::class.java, list = conTriDetailData, fileName = "dataVAL_SPHS-harvest_CON_Tri_detail-")
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset(fileName: String) {
        val filePath = "${appConfig.globalProperties().folderPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<DataValSphs>>() {})

        val sphsEntityData = ArrayList<SphsEntity>()
        val recTriDetailEntityData = ArrayList<HarvestRecTriDetailEntity>()
        val recTriEntityData = ArrayList<SphsHarvestRecTriEntity>()
        val remainPlantEntityData = ArrayList<RemainPlantRecEntity>()
        val cornerPlantEntityData = ArrayList<CornerPlantRecEntity>()
        val harvestConTriDetailEntityData = ArrayList<HarvestConTriDetailEntity>()
        val remainPlantConEntityData = ArrayList<RemainPlantConEntity>()
        val cornerPlantConEntityData = ArrayList<CornerPlantConEntity>()


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
            list.forEach { sphs ->
                //map and save to database
                val geoPoint = myDateUtil.splitGeoPoint(sphs.geopoint)
                val sphsEntity = modelMapper.map(sphs, SphsEntity::class.java)
                if (geoPoint.isNotEmpty()) {
                    sphsEntity.geoPointLatitude = geoPoint[0].toDouble()

                    if (myDateUtil.indexExists(geoPoint, 1)) {
                        sphsEntity.geoPointLongitude = geoPoint[1].toDouble()
                    }
                    if (myDateUtil.indexExists(geoPoint, 2)) {
                        sphsEntity.geoPointAltitude = geoPoint[2].toDouble()
                    }
                    if (myDateUtil.indexExists(geoPoint, 3)) {
                        sphsEntity.geoPointAccuracy = geoPoint[3].toDouble()
                    }
                }
                sphsEntity.uuid = sphs.formHubUuid
                sphsEntity.submissionDate = myDateUtil.convertToDateTime(sphs.submissionTime)
                sphsEntity.todayDate = myDateUtil.convertToDate(sphs.today)
                sphsEntity.plantingDate = myDateUtil.convertToDate(sphs.plantingDate)
                sphsEntity.startDate = myDateUtil.convertToDateTime(sphs.start)
                sphsEntity.endDate = myDateUtil.convertToDateTime(sphs.end)
                sphsEntity.instanceId = sphs.metaInstanceID
                sphsEntity.controlKey = sphs.metaInstanceID
                sphsEntity.plotL2Con = sphs.plotL2con

                sphsEntityData.add(sphsEntity)

                val harvestRecTriList = sphs.harvestRecTri
                var recTriCount = 1
                harvestRecTriList?.forEach { harvestRecTri ->
                    val recTriEntity = modelMapper.map(harvestRecTri, SphsHarvestRecTriEntity::class.java)
                    recTriEntity.parentKey = sphsEntity.controlKey
                    recTriEntity.setOfHarvestRecTri = "${recTriEntity.parentKey}/harvest_REC_Tri"
                    recTriEntity.controlKey = "${recTriEntity.parentKey}/harvest_REC_Tri[$recTriCount]"

                    recTriEntityData.add(recTriEntity)
                    recTriCount = recTriCount.plus(1)
                }

                val recTriDetailList = sphs.harvestRecTriDetail
                var recTriDetailCount = 1
                recTriDetailList?.forEach { harvestRecTriDetail ->
                    val triDetailEntity = modelMapper.map(harvestRecTriDetail, HarvestRecTriDetailEntity::class.java)

                    triDetailEntity.parentKey = sphsEntity.controlKey
                    triDetailEntity.setOfHarvest = "${triDetailEntity.parentKey}/harvest_REC_Tri_detail"
                    triDetailEntity.controlKey = "${triDetailEntity.parentKey}/harvest_REC_Tri_detail[$recTriDetailCount]"
                    triDetailEntity.setOfCornerPlant = "${triDetailEntity.setOfHarvest}/cornerPlant_REC"
                    triDetailEntity.setOfRemainPlant = "${sphsEntity.controlKey}/harvest_REC_Tri_detail[$recTriDetailCount]/remainPlant_REC"


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

                val harvestConTriDetailList = sphs.harvestConTriDetailList
                var conTriDetailCounter = 1
                harvestConTriDetailList?.forEach { conTriDetail ->
                    val conTriDetailEntity = modelMapper.map(conTriDetail, HarvestConTriDetailEntity::class.java)

                    conTriDetailEntity.parentKey = sphsEntity.controlKey
                    conTriDetailEntity.setOfHarvestConTriDetail = "${conTriDetailEntity.parentKey}/harvest_CON_Tri_detail"
                    conTriDetailEntity.controlKey = "${conTriDetailEntity.parentKey}/harvest_CON_Tri_detail[$conTriDetailCounter]"
                    conTriDetailEntity.setOfRemainPlantCon = "${conTriDetailEntity.controlKey}/remainPlant_CON"
                    conTriDetailEntity.setOfCornerPlantCon = "${conTriDetailEntity.controlKey}/cornerPlant_CON"

                    harvestConTriDetailEntityData.add(conTriDetailEntity)
                    conTriDetailCounter = conTriDetailCounter.plus(1)

                    var remainPlantConCounter = 1
                    val remainPlantConList = conTriDetail.remainPlantConList
                    remainPlantConList?.forEach { remainPlantCon ->
                        val remainPlantConEntity = modelMapper.map(remainPlantCon, RemainPlantConEntity::class.java)
                        remainPlantConEntity.parentKey = conTriDetailEntity.controlKey
                        remainPlantConEntity.setOfRemainPlantCon = "${conTriDetailEntity.controlKey}/remainPlant_CON"
                        remainPlantConEntity.controlKey = "${conTriDetailEntity.controlKey}/remainPlant_CON[${remainPlantConCounter}]"

                        remainPlantConEntityData.add(remainPlantConEntity)
                        remainPlantConCounter = remainPlantConCounter.plus(1)
                    }

                    var cornerPlantConCounter = 1
                    val cornerPlantConList = conTriDetail.cornerPlantConList
                    cornerPlantConList?.forEach { cornerPlantCon ->
                        val cornerPlantConEntity = modelMapper.map(cornerPlantCon, CornerPlantConEntity::class.java)
                        cornerPlantConEntity.parentKey = conTriDetailEntity.controlKey
                        cornerPlantConEntity.setOfCornerPlantCon = "${conTriDetailEntity.controlKey}/cornerPlant_CON"
                        cornerPlantConEntity.controlKey = "${conTriDetailEntity.controlKey}/cornerPlant_CON[${cornerPlantConCounter}]"

                        cornerPlantConEntityData.add(cornerPlantConEntity)
                        cornerPlantConCounter = cornerPlantConCounter.plus(1)
                    }
                }

            }

            log.info("Saving all the data to the database now")
            sphsRepo.saveAll(sphsEntityData)
            harvestRecTriDetailRepo.saveAll(recTriDetailEntityData)
            recTriRepo.saveAll(recTriEntityData)
            remainPlantRecRepo.saveAll(remainPlantEntityData)
            cornerPlantRecRepo.saveAll(cornerPlantEntityData)
            harvestConTriDetailRepo.saveAll(harvestConTriDetailEntityData)
            remainPlantConRepo.saveAll(remainPlantConEntityData)
            cornerPlantConRepo.saveAll(cornerPlantConEntityData)
            log.info("Finished saving the data for $fileName------->")
        }
    }
}