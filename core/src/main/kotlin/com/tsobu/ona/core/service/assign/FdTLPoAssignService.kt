package com.tsobu.ona.core.service.assign


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.assign.AssignFdTlPoEntity
import com.tsobu.ona.database.entities.assign.AssignFdTlPoTrialEntity
import com.tsobu.ona.database.entities.assign.AssignPaAcPlantLabelingEntity
import com.tsobu.ona.database.repositories.assign.AssignFdTlPoRepo
import com.tsobu.ona.database.repositories.assign.AssignFdTlPoTrialRepo
import com.tsobu.ona.forms.assign.AssignFdtLpoForm
import com.tsobu.ona.forms.assign.AssignFdtLpoTrialPlotForm
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
class FdTLPoAssignService
constructor(
    transactionManager: PlatformTransactionManager,
    val fdTlPoRepo: AssignFdTlPoRepo,
    val fdTlPoTrialRepo: AssignFdTlPoTrialRepo,
    val appConfig: AppConfig
) {

    private val log = LoggerFactory.getLogger(FdTLPoAssignService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    private val fileName = "Assign_FDTLPO.json"
    fun mapJsonFile() {
//        log.info("Reading table data....")
//        val isStringBlank: Condition<*, *> = object : AbstractCondition<Any?, Any?>() {
//            override fun applies(context: MappingContext<Any?, Any?>): Boolean {
//                return if (context.source is String) {
//                    null != context.source && "" != context.source
//                } else {
//                    context.source != null
//                }
//            }
//        }
//
//        modelMapper.configuration.propertyCondition = isStringBlank
//        modelMapper.configuration.isSkipNullEnabled = true
//        modelMapper.configuration.isAmbiguityIgnored = false
//        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD
//
//        val filePath = "${appConfig.globalProperties().outputPath}"
//        val tlAcEntityList = fdTlPoRepo.findAllByOrderBySubmissionDateAsc()
//
//
//        val tlAcData = tlAcEntityList.map { assignTlAcEntity ->
//            val assignPaAcDto = modelMapper.map(assignTlAcEntity, AssignFdTlPoEntity::class.java)
//            assignPaAcDto.submissionDate = myDateUtil.toDateTimeString(assignTlAcEntity.submissionDate)
//            assignPaAcDto.startDate = myDateUtil.toDateTimeString(assignTlAcEntity.startDate)
//            assignPaAcDto.endDate = myDateUtil.toDateTimeString(assignTlAcEntity.endDate)
//            assignPaAcDto.todayDate = myDateUtil.toDateToString(assignTlAcEntity.todayDate)
//            assignPaAcDto
//        }
//
//
//        writeCsvFile.writeCsv(
//            classMap = AssignTlAcDto::class.java,
//            data = tlAcData,
//            fileName = "Assign_TL_AC",
//            outPutPath = filePath
//        )
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<AssignFdtLpoForm>>() {})

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
        modelMapper.configuration.isAmbiguityIgnored = false
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val tlAcData = ArrayList<AssignFdTlPoEntity>()
        val trialData = ArrayList<AssignFdTlPoTrialEntity>()
        val trialPlotData = ArrayList<AssignFdtLpoTrialPlotForm>()
        list.forEach { assignFdtLpoForm ->
            //map and save to database
            val tlAcEntity = modelMapper.map(assignFdtLpoForm, AssignFdTlPoEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(assignFdtLpoForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                tlAcEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    tlAcEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    tlAcEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    tlAcEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            tlAcEntity.formHubUuid = assignFdtLpoForm.formHubUuid
            tlAcEntity.submissionDate = myDateUtil.convertToDateTime(assignFdtLpoForm.submissionTime)
            tlAcEntity.todayDate = myDateUtil.convertToDate(assignFdtLpoForm.todayDate)
            tlAcEntity.startDate = myDateUtil.convertToDateTime(assignFdtLpoForm.start)
            tlAcEntity.endDate = myDateUtil.convertToDateTime(assignFdtLpoForm.end)
            tlAcEntity.plantingDate = myDateUtil.convertToDate(assignFdtLpoForm.plantingDate)
            tlAcEntity.instanceId = assignFdtLpoForm.metaInstanceID
            tlAcEntity.controlKey = assignFdtLpoForm.metaInstanceID

            tlAcEntity.setOfTrial = "${tlAcEntity.controlKey}/trial"

            val trialList = assignFdtLpoForm.trial
            var trialLabelingCount = 1
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            trialList.forEach { assignFdtLpoTrialForm ->
                val trialEntity = modelMapper.map(assignFdtLpoTrialForm, AssignFdTlPoTrialEntity::class.java)
                trialEntity.parentKey = tlAcEntity.controlKey
                trialEntity.controlKey = "${tlAcEntity.controlKey}/trial[$trialLabelingCount]"
                trialEntity.setOfPlot = "${tlAcEntity.controlKey}/trial[$trialLabelingCount]/plot"
                trialEntity.setOfTrial = "${tlAcEntity.controlKey}/trial"

                trialLabelingCount = trialLabelingCount.plus(1)
                trialData.add(trialEntity)
            }

            tlAcData.add(tlAcEntity)
        }
        fdTlPoTrialRepo.saveAll(trialData)
        fdTlPoRepo.saveAll(tlAcData)

        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}