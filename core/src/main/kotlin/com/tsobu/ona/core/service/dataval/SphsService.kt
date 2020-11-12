package com.tsobu.ona.core.service.dataval


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.datavalsphs.*
import com.tsobu.ona.core.dto.json.datavarsphs.CornerPlantRecDto
import com.tsobu.ona.core.dto.json.datavarsphs.RemainPlantConDto
import com.tsobu.ona.core.dto.json.datavarsphs.RemainPlantRecDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.dataval.*
import com.tsobu.ona.database.repositories.dataval.*
import com.tsobu.ona.forms.datavalsphs.SphsForm
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
class SphsService
constructor(
        transactionManager: PlatformTransactionManager,
        val sphsRepo: SphsRepo,
        val harvestRecTriDetailRepo: HarvestRecTriDetailRepo,
        val harvestRecTriRepo: HarvestRecTriRepo,
        val remainPlantRecRepo: RemainPlantRecRepo,
        val cornerPlantRecRepo: CornerPlantRecRepo,
        val harvestConTriDetailRepo: HarvestConTriDetailRepo,
        val remainPlantConRepo: RemainPlantConRepo,
        val cornerPlantConRepo: CornerPlantConRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(SphsService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()
    private val fileName = "dataVAL_SPHS.json"
    fun mapJsonFile() {
        log.info("Reading tables here")
        val sphsList = sphsRepo.findAllByOrderBySubmissionDateAsc()
        val harvestRecTriList = harvestRecTriRepo.findAll()
        val conTriDetailList = harvestConTriDetailRepo.findAll()
        val recTriDetailList = harvestRecTriDetailRepo.findAll()
        val cornerPlantConList = cornerPlantConRepo.findAll()
        val cornerPlantRecList = cornerPlantRecRepo.findAll()
        val remainPlantRecList = remainPlantRecRepo.findAll()
        val remainPlantConList = remainPlantConRepo.findAll()

        val sphsData = sphsList.map { sphsEntity ->
            val sphsDto = modelMapper.map(sphsEntity, SphsDto::class.java)
            sphsDto.submissionDate = myDateUtil.toDateTimeString(sphsEntity.submissionDate)
            sphsDto.startDate = myDateUtil.toDateTimeString(sphsEntity.startDate)
            sphsDto.endDate = myDateUtil.toDateTimeString(sphsEntity.endDate)
            sphsDto.todayDate = myDateUtil.toDateToString(sphsEntity.todayDate)

            sphsDto.todayDate = myDateUtil.toDateToString(sphsEntity.todayDate)

            sphsDto.gappingDate = myDateUtil.toDateToString(sphsEntity.gappingDate)
            sphsDto.plantingDate = myDateUtil.toDateToString(sphsEntity.plantingDate)
            sphsDto.dateWeeding1 = myDateUtil.toDateToString(sphsEntity.dateWeeding1)
            sphsDto.dateWeeding2 = myDateUtil.toDateToString(sphsEntity.dateWeeding2)
            sphsDto.dateWeeding3 = myDateUtil.toDateToString(sphsEntity.dateWeeding3)
            sphsDto.dateWeeding4 = myDateUtil.toDateToString(sphsEntity.dateWeeding4)
            sphsDto.dateWeeding5 = myDateUtil.toDateToString(sphsEntity.dateWeeding5)
            sphsDto.dateWeeding6 = myDateUtil.toDateToString(sphsEntity.dateWeeding6)
            sphsDto.dateWeeding7 = myDateUtil.toDateToString(sphsEntity.dateWeeding7)
            sphsDto.dateWeeding8 = myDateUtil.toDateToString(sphsEntity.dateWeeding8)
            sphsDto.dateWeeding9 = myDateUtil.toDateToString(sphsEntity.dateWeeding9)
            sphsDto.dateWeeding10 = myDateUtil.toDateToString(sphsEntity.dateWeeding10)

            sphsDto.harvestDateQuestionCon = myDateUtil.toDateToString(sphsEntity.harvestDateQuestionCon)
            sphsDto.effHarvestDateCon = myDateUtil.toDateToString(sphsEntity.effHarvestDateCon)
            sphsDto.effHarvestDateConTri = myDateUtil.toDateToString(sphsEntity.effHarvestDateConTri)
            sphsDto.harvestDateQuestionRec = myDateUtil.toDateToString(sphsEntity.harvestDateQuestionRec)
            sphsDto.effHarvestDateRec = myDateUtil.toDateToString(sphsEntity.effHarvestDateRec)
            sphsDto.effHarvestDateRecTri = myDateUtil.toDateToString(sphsEntity.effHarvestDateRecTri)
            sphsDto.intHarvestDateCon = myDateUtil.toDateToString(sphsEntity.intHarvestDateCon)
            sphsDto.intHarvestDateRec = myDateUtil.toDateToString(sphsEntity.intHarvestDateRec)
            sphsDto
        }

        val conTriDetailData = conTriDetailList.map { triDetailEntity ->
            val cornerPlantConDto = modelMapper.map(triDetailEntity, ConTriDetailDto::class.java)
            cornerPlantConDto
        }
        val harvestRecTriData = harvestRecTriList.map { harvestRecTriEntity ->
            val harvestRecTriDto = modelMapper.map(harvestRecTriEntity, HarvestRecTriDto::class.java)
            harvestRecTriDto
        }
        val recTriDetailData = recTriDetailList.map { recTriDetailEntity ->
            val recTriDetailDto = modelMapper.map(recTriDetailEntity, RecTriDetailDto::class.java)
            recTriDetailDto
        }
        val cornerPlantConData = cornerPlantConList.map { plantConEntity ->
            val cornerPlantConDto = modelMapper.map(plantConEntity, CornerPlantConDto::class.java)
            cornerPlantConDto
        }
        val cornerPlantRecData = cornerPlantRecList.map { plantRecEntity ->
            val cornerPlantRecDto = modelMapper.map(plantRecEntity, CornerPlantRecDto::class.java)
            cornerPlantRecDto
        }

        val remainPlantRecData = remainPlantRecList.map { remainPlantRecEntity ->
            val remainPlantRecDto = modelMapper.map(remainPlantRecEntity, RemainPlantRecDto::class.java)
            remainPlantRecDto
        }
        val remainPlantConData = remainPlantConList.map { remainPlantConEntity ->
            val remainPlantConDto = modelMapper.map(remainPlantConEntity, RemainPlantConDto::class.java)
            remainPlantConDto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = SphsDto::class.java, data = sphsData, fileName = "dataVAL_SPHS", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = CornerPlantRecDto::class.java, data = cornerPlantRecData, fileName = "dataVAL_SPHS-cornerPlant_REC", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = CornerPlantConDto::class.java, data = cornerPlantConData, fileName = "dataVAL_SPHS-cornerPlant_CON", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = ConTriDetailDto::class.java, data = conTriDetailData, fileName = "dataVAL_SPHS-harvest_CON_Tri_detail", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = RecTriDetailDto::class.java, data = recTriDetailData, fileName = "dataVAL_SPHS-harvest_REC_Tri_detail", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = HarvestRecTriDto::class.java, data = harvestRecTriData, fileName = "dataVAL_SPHS-harvest_REC_Tri", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = RemainPlantRecDto::class.java, data = remainPlantRecData, fileName = "dataVAL_SPHS-remainPlant_REC", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = RemainPlantConDto::class.java, data = remainPlantConData, fileName = "dataVAL_SPHS-remainPlant_CON", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<SphsForm>>() {})

        val sphsEntityData = ArrayList<SphsEntity>()
        val recTriDetailEntityData = ArrayList<HarvestRecTriDetailEntity>()
        val recTriEntityData = ArrayList<HarvestRecTriEntity>()
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

                val harvestRecTriList = sphs.harvestRecTriForm
                var recTriCount = 1
                harvestRecTriList?.forEach { harvestRecTri ->
                    val recTriEntity = modelMapper.map(harvestRecTri, HarvestRecTriEntity::class.java)
                    recTriEntity.parentKey = sphsEntity.controlKey
                    recTriEntity.setOfHarvestRecTri = "${recTriEntity.parentKey}/harvest_REC_Tri"
                    recTriEntity.controlKey = "${recTriEntity.parentKey}/harvest_REC_Tri[$recTriCount]"

                    recTriEntityData.add(recTriEntity)
                    recTriCount = recTriCount.plus(1)
                }

                val recTriDetailList = sphs.harvestRecTriDetailForm
                var recTriDetailCount = 1
                recTriDetailList?.forEach { harvestRecTriDetail ->
                    val triDetailEntity = modelMapper.map(harvestRecTriDetail, HarvestRecTriDetailEntity::class.java)

                    triDetailEntity.parentKey = sphsEntity.controlKey
                    triDetailEntity.setOfHarvest = "${triDetailEntity.parentKey}/harvest_REC_Tri_detail"
                    triDetailEntity.controlKey = "${triDetailEntity.parentKey}/harvest_REC_Tri_detail[$recTriDetailCount]"
                    triDetailEntity.setOfCornerPlant = "${sphsEntity.controlKey}/harvest_REC_Tri_detail[$recTriDetailCount]/cornerPlant_REC"
                    triDetailEntity.setOfRemainPlant = "${sphsEntity.controlKey}/harvest_REC_Tri_detail[$recTriDetailCount]/remainPlant_REC"


                    recTriDetailEntityData.add(triDetailEntity)

                    var remainPlantCounter = 1
                    val remainPlantList = harvestRecTriDetail.remainPlantRecForm
                    remainPlantList?.forEach { remainPlantRec ->
                        val remainPlantEntity = modelMapper.map(remainPlantRec, RemainPlantRecEntity::class.java)

                        remainPlantEntity.parentKey = "${triDetailEntity.setOfHarvest}[$remainPlantCounter]"
                        remainPlantEntity.setOfRemainPlantRec = "${remainPlantEntity.parentKey}/remainPlant_REC"
                        remainPlantEntity.controlKey = "${remainPlantEntity.setOfRemainPlantRec}[$remainPlantCounter]"

                        remainPlantEntityData.add(remainPlantEntity)
                        remainPlantCounter = remainPlantCounter.plus(1)
                    }

                    var cornerPlantCounter = 1
                    val cornerPlantList = harvestRecTriDetail.cornerPlantRecForm
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

                val harvestConTriDetailList = sphs.harvestConTriDetailFormList
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
                    val remainPlantConList = conTriDetail.remainPlantConFormList
                    remainPlantConList?.forEach { remainPlantCon ->
                        val remainPlantConEntity = modelMapper.map(remainPlantCon, RemainPlantConEntity::class.java)
                        remainPlantConEntity.parentKey = conTriDetailEntity.controlKey
                        remainPlantConEntity.setOfRemainPlantCon = "${conTriDetailEntity.controlKey}/remainPlant_CON"
                        remainPlantConEntity.controlKey = "${conTriDetailEntity.controlKey}/remainPlant_CON[${remainPlantConCounter}]"

                        remainPlantConEntityData.add(remainPlantConEntity)
                        remainPlantConCounter = remainPlantConCounter.plus(1)
                    }

                    var cornerPlantConCounter = 1
                    val cornerPlantConList = conTriDetail.cornerPlantConFormList
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
            harvestRecTriRepo.saveAll(recTriEntityData)
            remainPlantRecRepo.saveAll(remainPlantEntityData)
            cornerPlantRecRepo.saveAll(cornerPlantEntityData)
            harvestConTriDetailRepo.saveAll(harvestConTriDetailEntityData)
            remainPlantConRepo.saveAll(remainPlantConEntityData)
            cornerPlantConRepo.saveAll(cornerPlantConEntityData)
            log.info("Finished saving the data for $fileName------->")
            mapJsonFile()
        }
    }
}