package com.tsobu.ona.core.service.confirm


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.confirm.PoAssignAcDto
import com.tsobu.ona.core.dto.json.confirm.PoAssignAcPlotLabellingDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.confirm.ConfirmPoAcEntity
import com.tsobu.ona.database.entities.confirm.ConfirmPoAcPlotLabelingEntity
import com.tsobu.ona.database.repositories.confirm.PoAssignAcPlotLabelingRepo
import com.tsobu.ona.database.repositories.confirm.PoAssignAcRepo
import com.tsobu.ona.forms.confirm.PoAssignAcForm
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
class PoConfirmService
constructor(
        transactionManager: PlatformTransactionManager,
        val assignAcRepo: PoAssignAcRepo,
        val plotLabelingRepo: PoAssignAcPlotLabelingRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(PoConfirmService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    val fileName = "Confirm_PO_Assign_AC.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val confirmList = assignAcRepo.findAllByOrderBySubmissionDateAsc()
        val labelList = plotLabelingRepo.findAll()

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


        val confirmData = confirmList.map { assignAcEntity ->
            val assignAcDto = modelMapper.map(assignAcEntity, PoAssignAcDto::class.java)
            assignAcDto.submissionDate = myDateUtil.toDateTimeString(assignAcEntity.submissionDate)
            assignAcDto.startDate = myDateUtil.toDateTimeString(assignAcEntity.startDate)
            assignAcDto.endDate = myDateUtil.toDateTimeString(assignAcEntity.endDate)
            assignAcDto.today = myDateUtil.toDateToString(assignAcEntity.todayDate)
            assignAcDto
        }

        val labelData = labelList.map { plotLabelingEntity ->
            val plotLabellingDto = modelMapper.map(plotLabelingEntity, PoAssignAcPlotLabellingDto::class.java)
            plotLabellingDto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = PoAssignAcDto::class.java, data = confirmData, fileName = "Confirm_PO_Assign_AC", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = PoAssignAcPlotLabellingDto::class.java, data = labelData, fileName = "Confirm_PO_Assign_AC-plotLabeling", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<PoAssignAcForm>>() {})

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

        val confirmData = ArrayList<ConfirmPoAcEntity>()
        val labelData = ArrayList<ConfirmPoAcPlotLabelingEntity>()
        list.forEach { poAssignAcForm ->
            //map and save to database
            val geoPoint = myDateUtil.splitGeoPoint(poAssignAcForm.geopoint)
            val poAcEntity = modelMapper.map(poAssignAcForm, ConfirmPoAcEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                poAcEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    poAcEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    poAcEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    poAcEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            poAcEntity.uuid = poAssignAcForm.formhubUuid
            poAcEntity.submissionDate = myDateUtil.convertToDateTime(poAssignAcForm.submissionTime)
            poAcEntity.todayDate = myDateUtil.convertToDate(poAssignAcForm.today)
            poAcEntity.startDate = myDateUtil.convertToDateTime(poAssignAcForm.start)
            poAcEntity.endDate = myDateUtil.convertToDateTime(poAssignAcForm.end)
            poAcEntity.plantingDate = myDateUtil.convertToDate(poAssignAcForm.plantingDate)
            poAcEntity.instanceid = poAssignAcForm.metaInstanceID
            poAcEntity.controlKey = poAssignAcForm.metaInstanceID

            poAcEntity.setOfPlotLabeling = "${poAssignAcForm.metaInstanceID}/plotLabeling"

            //child data
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            val plotLabelList = poAssignAcForm.plotLabeling
            var nextCounter = 1
            plotLabelList.forEach { labelingForm ->
                val labelEntity = modelMapper.map(labelingForm, ConfirmPoAcPlotLabelingEntity::class.java)
                labelEntity.parentKey = poAcEntity.controlKey
                labelEntity.setOfPlotLabeling = poAcEntity.setOfPlotLabeling
                labelEntity.controlKey = "${poAssignAcForm.metaInstanceID}/plotLabeling[$nextCounter]"
                labelEntity.setOfPlotLabeling = "${poAssignAcForm.metaInstanceID}/plotLabeling"

                nextCounter = nextCounter.plus(1)
                labelData.add(labelEntity)
            }
            confirmData.add(poAcEntity)
        }

        assignAcRepo.saveAll(confirmData)
        plotLabelingRepo.saveAll(labelData)

        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}