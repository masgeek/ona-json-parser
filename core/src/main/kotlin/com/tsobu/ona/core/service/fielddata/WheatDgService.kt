package com.tsobu.ona.core.service.fielddata

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.fielddata.WheatDgDto
import com.tsobu.ona.core.interfaces.IJsonProcessor
import com.tsobu.ona.core.service.akilimo.UptakeService
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.fielddata.WheatDgEntity
import com.tsobu.ona.database.repositories.fielddata.WheatDgRepo
import com.tsobu.ona.forms.fielddata.WheatDgForm
import org.modelmapper.AbstractCondition
import org.modelmapper.Condition
import org.modelmapper.ModelMapper
import org.modelmapper.convention.MatchingStrategies
import org.modelmapper.spi.MappingContext
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.io.File
import java.io.IOException
import java.nio.file.Paths

@Service
class WheatDgService(
    val wheatDgRepo: WheatDgRepo,
    val appConfig: AppConfig
) : IJsonProcessor {

    private val log = LoggerFactory.getLogger(UptakeService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val writeCsvFile = CsvUtility()

    val fileName = "fieldData_wheat_DG.json"

    override fun mapJsonFile() {
        log.info("Reading table data....")
        val registerList = wheatDgRepo.findAllByOrderBySubmissionDateAsc()

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

        val fileSeparator = File.separator
        val filePath = "${appConfig.globalProperties().outputPath}${fileSeparator}DG${fileSeparator}"
        val registerData = registerList.map { registerEaDgEntity ->
            val wheatDgDto = modelMapper.map(registerEaDgEntity, WheatDgDto::class.java)
            wheatDgDto.submissionDate = myDateUtil.toDateTimeString(registerEaDgEntity.submissionDate)
            wheatDgDto.end = myDateUtil.toDateTimeString(registerEaDgEntity.endDate)
            wheatDgDto.start = myDateUtil.toDateTimeString(registerEaDgEntity.startDate)
            wheatDgDto.today = myDateUtil.toDateToString(registerEaDgEntity.todayDate)
            wheatDgDto
        }

        writeCsvFile.writeCsv(
            classMap = WheatDgDto::class.java, data = registerData,
            fileName = "fieldData_wheat_DG", outPutPath = filePath
        )
    }

    @Throws(IOException::class)
    override fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<WheatDgForm>>() {})

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

        val wheatData = ArrayList<WheatDgEntity>()
        list.forEach { wheatDgForm ->
            val geoPoint = myDateUtil.splitGeoPoint(wheatDgForm.locationGeopoint)

            val wheatDgEntity = modelMapper.map(wheatDgForm, WheatDgEntity::class.java)
            wheatDgEntity.instanceId = wheatDgForm.instanceId
            wheatDgEntity.controlKey = wheatDgForm.instanceId
            wheatDgEntity.uuid = wheatDgForm.formhubUuid

            wheatDgEntity.submissionDate = myDateUtil.convertToDateTime(wheatDgForm.submissionTime)
            wheatDgEntity.todayDate = myDateUtil.convertToDate(wheatDgForm.today)
            wheatDgEntity.endDate = myDateUtil.convertToDateTime(wheatDgForm.end)
            wheatDgEntity.startDate = myDateUtil.convertToDateTime(wheatDgForm.start)

            wheatDgEntity.plantingDate = myDateUtil.convertToDate(wheatDgForm.plantingDate)
            wheatDgEntity.dateFertilizer1 = myDateUtil.convertToDate(wheatDgForm.dateFertilizer1)
            wheatDgEntity.dateFertilizer2 = myDateUtil.convertToDate(wheatDgForm.dateFertilizer2)
            wheatDgEntity.dateOrganicInputs = myDateUtil.convertToDate(wheatDgForm.dateOrganicInputs)
            wheatDgEntity.dateSpraying1 = myDateUtil.convertToDate(wheatDgForm.dateSpraying1)
            wheatDgEntity.dateSpraying2 = myDateUtil.convertToDate(wheatDgForm.dateSpraying2)
            wheatDgEntity.dateSpraying3 = myDateUtil.convertToDate(wheatDgForm.dateSpraying3)

            wheatDgEntity.dateWeeding1 = myDateUtil.convertToDate(wheatDgForm.dateWeeding1)
            wheatDgEntity.dateWeeding2 = myDateUtil.convertToDate(wheatDgForm.dateWeeding2)
            wheatDgEntity.dateWeeding3 = myDateUtil.convertToDate(wheatDgForm.dateWeeding3)
            wheatDgEntity.dateWeeding4 = myDateUtil.convertToDate(wheatDgForm.dateWeeding4)


            if (geoPoint.isNotEmpty()) {
                wheatDgEntity.geopointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    wheatDgEntity.geopointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    wheatDgEntity.geopointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    wheatDgEntity.geopointAccuracy = geoPoint[3]
                }
            }

            wheatData.add(wheatDgEntity)
        }

        wheatDgRepo.saveAll(wheatData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}