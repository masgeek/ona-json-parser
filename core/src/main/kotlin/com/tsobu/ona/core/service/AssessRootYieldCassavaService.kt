package com.tsobu.ona.core.service


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.RootYieldCassavaAcDto
import com.tsobu.ona.core.dto.json.RootYieldCassavaAcYieldAssessmentDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.rootyieldcassava.RootYieldCassAcYaEntity
import com.tsobu.ona.database.entities.rootyieldcassava.RootYieldCassAcEntity
import com.tsobu.ona.database.entities.scoreweedcontrol.WdEntity
import com.tsobu.ona.database.repositories.RootYieldCassavaAcRepo
import com.tsobu.ona.database.repositories.RootYieldCassavaAcYieldAssessmentRepo
import com.tsobu.ona.forms.rootyieldcassava.AssesRootYieldCassavaForm
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
class AssessRootYieldCassavaService
constructor(
        transactionManager: PlatformTransactionManager,
        val yieldCassavaRepo: RootYieldCassavaAcRepo,
        val yieldAssessmentRepo: RootYieldCassavaAcYieldAssessmentRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(AssessRootYieldCassavaService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val fileName = "Assess_Root_Yield_Cassava_AC.json"
    fun mapJsonFile() {
        log.info("Reading weed table here")
        val scores = yieldCassavaRepo.findAll()
        val scoresId = yieldAssessmentRepo.findAll()

        val yieldCassavaData = scores.map { scoreWeedControlAc ->
            val outboxDto = modelMapper.map(scoreWeedControlAc, RootYieldCassavaAcDto::class.java)
            outboxDto.submissionDate = myDateUtil.toDateTimeString(scoreWeedControlAc.submissionDate)
            outboxDto.startDate = myDateUtil.toDateTimeString(scoreWeedControlAc.startDate)
            outboxDto.endDate = myDateUtil.toDateTimeString(scoreWeedControlAc.endDate)
            outboxDto.todayDate = myDateUtil.toDateToString(scoreWeedControlAc.todayDate)
            outboxDto
        }

        val yieldAssesData = scoresId.map { scoreWeedControlAcId ->
            val outboxDto = modelMapper.map(scoreWeedControlAcId, RootYieldCassavaAcYieldAssessmentDto::class.java)
            outboxDto
        }

        val writeCsvFile = CsvUtility()
        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = RootYieldCassavaAcDto::class.java, data = yieldCassavaData, fileName = "Assess_Root_Yield_Cassava_AC", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = RootYieldCassavaAcYieldAssessmentDto::class.java, data = yieldAssesData, fileName = "Assess_Root_Yield_Cassava_AC-yieldAssessment", outPutPath = filePath)

    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<AssesRootYieldCassavaForm>>() {})

        val data = ArrayList<RootYieldCassAcEntity>()
        val yieldAssessmentData = ArrayList<RootYieldCassAcYaEntity>()
        val weedWdData = ArrayList<WdEntity>()

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
                val yieldCassavaEntity = modelMapper.map(myVal, RootYieldCassAcEntity::class.java)
                if (geoPoint.isNotEmpty()) {
                    yieldCassavaEntity.geoPointLatitude = geoPoint[0]

                    if (myDateUtil.indexExists(geoPoint, 1)) {
                        yieldCassavaEntity.geoPointLongitude = geoPoint[1]
                    }
                    if (myDateUtil.indexExists(geoPoint, 2)) {
                        yieldCassavaEntity.geoPointAltitude = geoPoint[2]
                    }
                    if (myDateUtil.indexExists(geoPoint, 3)) {
                        yieldCassavaEntity.geoPointAccuracy = geoPoint[3]
                    }
                }
                yieldCassavaEntity.uuid = myVal.formhubUuid
                yieldCassavaEntity.submissionDate = myDateUtil.convertToDateTime(myVal.submissionTime)
                yieldCassavaEntity.todayDate = myDateUtil.convertToDate(myVal.today)
                yieldCassavaEntity.startDate = myDateUtil.convertToDateTime(myVal.start)
                yieldCassavaEntity.endDate = myDateUtil.convertToDateTime(myVal.end)
                yieldCassavaEntity.setOfYieldAssesment = "${myVal.metaInstanceID}/yieldAssessment"
                yieldCassavaEntity.instanceId = myVal.metaInstanceID
                yieldCassavaEntity.controlKey = myVal.metaInstanceID

                data.add(yieldCassavaEntity)

                log.info("Added data to list ${yieldCassavaEntity.controlKey} with surname as ${yieldCassavaEntity.surname}")

                //evaluate the yield assessment
                val yieldAssessmentList = myVal.yieldAssessmentForm
                var assessmentCount = 1
                yieldAssessmentList?.forEach { ya ->
                    val yieldAssessment = modelMapper.map(ya, RootYieldCassAcYaEntity::class.java)

                    yieldAssessment.parentKey = yieldCassavaEntity.controlKey
                    yieldAssessment.controlKey = "${yieldCassavaEntity.setOfYieldAssesment}[$assessmentCount]"
                    yieldAssessment.setOfYieldAssessment = yieldCassavaEntity.setOfYieldAssesment
                    yieldAssessment.nrPlantsNp = ya.nrPlantsNp

                    log.info("Added >>> ${yieldAssessment.plotId}: ${yieldAssessment.plantId} with for assessment being $assessmentCount")
                    assessmentCount = assessmentCount.plus(1)
                    yieldAssessmentData.add(yieldAssessment)
                }
            }

            log.info("Saving all the data to the database now")
            yieldCassavaRepo.saveAll(data)
            yieldAssessmentRepo.saveAll(yieldAssessmentData)
            log.info("Finished saving the data for $fileName------->")
            mapJsonFile()
        }
    }
}