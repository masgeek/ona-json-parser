package com.tsobu.ona.core.service.lignifiedstem


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.lignifiedstem.LignifiedStemYieldCassAcDto
import com.tsobu.ona.core.dto.json.lignifiedstem.LignifiedStemYieldCassAcYaDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.lignifiedstem.LignifiedStemYieldCassAcEntity
import com.tsobu.ona.database.entities.lignifiedstem.LignifiedStemYieldCassAcYaEntity
import com.tsobu.ona.database.repositories.lignifiedstem.LignifiedStemYieldCassAcRepo
import com.tsobu.ona.database.repositories.lignifiedstem.LignifiedStemYieldCassAcYaRepo
import com.tsobu.ona.forms.lignifiedstem.LignifiedStemYieldCassavaAcForm
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
class LignifiedStemService
constructor(
        transactionManager: PlatformTransactionManager,
        val yieldCassAcRepo: LignifiedStemYieldCassAcRepo,
        val yieldCassAcYaRepo: LignifiedStemYieldCassAcYaRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(LignifiedStemService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()
    private val fileName = "Assess_LignifiedStem_Yield_Cassava_AC.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
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
        val acEntityList = yieldCassAcRepo.findAllByOrderBySubmissionDateAsc()
        val acSampleList = yieldCassAcYaRepo.findAll()


        val yieldCassAcData = acEntityList.map { acEntity ->
            val yieldCassAcDto = modelMapper.map(acEntity, LignifiedStemYieldCassAcDto::class.java)
            yieldCassAcDto.submissionDate = myDateUtil.toDateTimeString(acEntity.submissionDate)
            yieldCassAcDto.start = myDateUtil.toDateTimeString(acEntity.startDate)
            yieldCassAcDto.end = myDateUtil.toDateTimeString(acEntity.endDate)
            yieldCassAcDto
        }

        val yieldCasAcYaData = acSampleList.map { acSampleEntity ->
            val yieldCassAcYaDto = modelMapper.map(acSampleEntity, LignifiedStemYieldCassAcYaDto::class.java)
            yieldCassAcYaDto
        }


        writeCsvFile.writeCsv(classMap = LignifiedStemYieldCassAcDto::class.java, data = yieldCassAcData,
                fileName = "Assess_LignifiedStem_Yield_Cassava_AC", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = LignifiedStemYieldCassAcYaDto::class.java, data = yieldCasAcYaData,
                fileName = "Assess_LignifiedStem_Yield_Cassava_AC-yieldAssessment", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<LignifiedStemYieldCassavaAcForm>>() {})

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

        val lignifiedAcData = ArrayList<LignifiedStemYieldCassAcEntity>()
        val lignifiedAcYaData = ArrayList<LignifiedStemYieldCassAcYaEntity>()
        list.forEach { yieldCassavaAcForm ->
            //map and save to database
            val yieldCassAcEntity = modelMapper.map(yieldCassavaAcForm, LignifiedStemYieldCassAcEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(yieldCassavaAcForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                yieldCassAcEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    yieldCassAcEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    yieldCassAcEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    yieldCassAcEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            yieldCassAcEntity.uuid = yieldCassavaAcForm.formhubUuid
            yieldCassAcEntity.submissionDate = myDateUtil.convertToDateTime(yieldCassavaAcForm.submissionTime)
            yieldCassAcEntity.todayDate = myDateUtil.convertToDate(yieldCassavaAcForm.today)
            yieldCassAcEntity.startDate = myDateUtil.convertToDateTime(yieldCassavaAcForm.start)
            yieldCassAcEntity.endDate = myDateUtil.convertToDateTime(yieldCassavaAcForm.end)
            yieldCassAcEntity.instanceId = yieldCassavaAcForm.metaInstanceID
            yieldCassAcEntity.controlKey = yieldCassavaAcForm.metaInstanceID
            yieldCassAcEntity.setOfYieldAssessment = "${yieldCassAcEntity.controlKey}/yieldAssessment"

            lignifiedAcData.add(yieldCassAcEntity)
            log.info("Added data to table ${yieldCassAcEntity.controlKey} with surname as ${yieldCassavaAcForm.xformIdString}")

            val yieldAssessmentList = yieldCassavaAcForm.yieldAssessmentList
            var yieldAssessmentCounter = 1
            yieldAssessmentList?.forEach { acSample ->
                val yieldCassAcYaEntity = modelMapper.map(acSample, LignifiedStemYieldCassAcYaEntity::class.java)
                yieldCassAcYaEntity.parentKey = yieldCassAcEntity.controlKey
                yieldCassAcYaEntity.controlKey = "${yieldCassAcEntity.controlKey}/yieldAssessment[$yieldAssessmentCounter]"
                yieldCassAcYaEntity.setOfYieldAssessment = "${yieldCassAcEntity.controlKey}/yieldAssessment"

                yieldAssessmentCounter = yieldAssessmentCounter.plus(1)
                lignifiedAcYaData.add(yieldCassAcYaEntity)
            }
        }

        yieldCassAcRepo.saveAll(lignifiedAcData)
        yieldCassAcYaRepo.saveAll(lignifiedAcYaData)

        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}