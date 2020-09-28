package com.tsobu.ona.core.service.dataval


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.forms.dataval.PpTzForm
import com.tsobu.ona.core.dto.json.dataval.FrDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.dataval.PpTzEntity
import com.tsobu.ona.database.entities.dataval.PpTzWaP1Entity
import com.tsobu.ona.database.repositories.dataval.PpTzRepo
import com.tsobu.ona.database.repositories.dataval.PpTzWaP1Repo
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

        val frData = frList.map { frEntity ->
            val sphsTzSzDto = modelMapper.map(frEntity, FrDto::class.java)
            sphsTzSzDto.submissionDate = myDateUtil.convertTimeToString(frEntity.submissionDate)
            sphsTzSzDto.startDate = myDateUtil.convertTimeToString(frEntity.startDate)
            sphsTzSzDto.endDate = myDateUtil.convertTimeToString(frEntity.endDate)
            sphsTzSzDto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(pojoType = FrDto::class.java, data = frData, fileName = "dataVAL_FR", outPutPath = filePath)
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


            val weedAssessmentList = myVal.weedAssessmentP1
            var recTriCount = 1
            weedAssessmentList?.forEach { weedAssessmentP1 ->
                val assessmentP1Entity = modelMapper.map(weedAssessmentP1, PpTzWaP1Entity::class.java)
                assessmentP1Entity.parentKey = ppTzEntity.controlKey
                assessmentP1Entity.setOfWeedAssessmentP1 = "${assessmentP1Entity.parentKey}/weedAssessment_P1"
                assessmentP1Entity.controlKey = "${assessmentP1Entity.parentKey}/weedAssessment_P1[$recTriCount]"


                weedAssessmentP1Data.add(assessmentP1Entity)
                recTriCount = recTriCount.plus(1)
            }
        }

//        ppTzRepo.saveAll(ppTzEntityData)
        assessmentP1Repo.saveAll(weedAssessmentP1Data)

        log.info("Finished saving the data for $fileName------->")
    }
}