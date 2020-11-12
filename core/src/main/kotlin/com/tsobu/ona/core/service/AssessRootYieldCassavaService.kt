package com.tsobu.ona.core.service


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.RootYieldCassavaAcDto
import com.tsobu.ona.core.dto.json.RootYieldCassavaAcYieldAssessmentDto
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.rootyieldcassava.RootYieldCassAcEntity
import com.tsobu.ona.database.entities.rootyieldcassava.RootYieldCassAcYaEntity
import com.tsobu.ona.database.repositories.RootYieldCassavaAcRepo
import com.tsobu.ona.database.repositories.RootYieldCassavaAcYieldAssessmentRepo
import com.tsobu.ona.forms.rootyieldcassava.AssesRootYieldCassavaAcForm
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

        val yieldCassavaData = scores.map { cassAcEntity ->
            val cassavaAcDto = modelMapper.map(cassAcEntity, RootYieldCassavaAcDto::class.java)
            cassavaAcDto.submissionDate = myDateUtil.toDateTimeString(cassAcEntity.submissionDate)
            cassavaAcDto.startDate = myDateUtil.toDateTimeString(cassAcEntity.startDate)
            cassavaAcDto.endDate = myDateUtil.toDateTimeString(cassAcEntity.endDate)
            cassavaAcDto.todayDate = myDateUtil.toDateToString(cassAcEntity.todayDate)

            cassavaAcDto.setOfYieldAssessment = cassAcEntity.setOfYieldAssesment

            cassavaAcDto
        }

        val yieldAssesData = scoresId.map { yieldCassAcYaEntity ->
            val assessmentDto = modelMapper.map(yieldCassAcYaEntity, RootYieldCassavaAcYieldAssessmentDto::class.java)
            assessmentDto
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

        val list = objectMapper.readValue(file, object : TypeReference<List<AssesRootYieldCassavaAcForm>>() {})

        val data = ArrayList<RootYieldCassAcEntity>()
        val yieldAssessmentData = ArrayList<RootYieldCassAcYaEntity>()
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
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        list.forEach { yieldCassavaForm ->
            //map and save to database
            val geoPoint = myDateUtil.splitGeoPoint(yieldCassavaForm.geopoint)
            val yieldCassavaEntity = modelMapper.map(yieldCassavaForm, RootYieldCassAcEntity::class.java)
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
            yieldCassavaEntity.formHubUuId = yieldCassavaForm.formhubUuid
            yieldCassavaEntity.submissionDate = myDateUtil.convertToDateTime(yieldCassavaForm.submissionTime)
            yieldCassavaEntity.todayDate = myDateUtil.convertToDate(yieldCassavaForm.today)
            yieldCassavaEntity.startDate = myDateUtil.convertToDateTime(yieldCassavaForm.start)
            yieldCassavaEntity.endDate = myDateUtil.convertToDateTime(yieldCassavaForm.end)
            yieldCassavaEntity.setOfYieldAssesment = "${yieldCassavaForm.instanceId}/yieldAssessment"
            yieldCassavaEntity.instanceId = yieldCassavaForm.instanceId
            yieldCassavaEntity.controlKey = yieldCassavaForm.instanceId

            data.add(yieldCassavaEntity)

            log.info("Added data to list ${yieldCassavaEntity.controlKey} with surname as ${yieldCassavaEntity.surname}")

            //evaluate the yield assessment
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            val yieldAssessmentList = yieldCassavaForm.yieldAssessment
            var assessmentCount = 1
            yieldAssessmentList?.forEach { ya ->
                val yieldAssessment = modelMapper.map(ya, RootYieldCassAcYaEntity::class.java)

                yieldAssessment.parentKey = yieldCassavaEntity.controlKey
                yieldAssessment.controlKey = "${yieldCassavaEntity.setOfYieldAssesment}[$assessmentCount]"
                yieldAssessment.setOfYieldAssessment = yieldCassavaEntity.setOfYieldAssesment
                yieldAssessment.nrPlantsNp = ya.nrPlantsNp

                log.info("Added >>> ${yieldAssessment.plotId}: ${yieldAssessment.plotId} with for assessment being $assessmentCount")
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