package com.tsobu.ona.core.service.agro

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.agro.AdvisoryWv2Dto
import com.tsobu.ona.core.interfaces.IJsonProcessor
import com.tsobu.ona.core.service.akilimo.UptakeService
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.agro.AdvisoryWv2Entity
import com.tsobu.ona.database.repositories.agro.AdvisoryRepo
import com.tsobu.ona.forms.agro.AdvisoryWV2Form
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
class AdvisoryWv2Service(
    val advisoryRepo: AdvisoryRepo,
    val appConfig: AppConfig
) : IJsonProcessor {

    private val log = LoggerFactory.getLogger(UptakeService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val writeCsvFile = CsvUtility()

    val fileName = "AgroadvisoryWV2.json"

    override fun mapJsonFile() {
        log.info("Reading table data....")
        val registerList = advisoryRepo.findAllByOrderBySubmissionDateAsc()

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
        val advisoryData = registerList.map { advisoryWv2Entity ->
            val advisoryWv2Dto = modelMapper.map(advisoryWv2Entity, AdvisoryWv2Dto::class.java)
            advisoryWv2Dto.submissionDate = myDateUtil.toDateTimeString(advisoryWv2Entity.submissionDate)
            advisoryWv2Dto.end = myDateUtil.toDateTimeString(advisoryWv2Entity.endDate)
            advisoryWv2Dto.start = myDateUtil.toDateTimeString(advisoryWv2Entity.startDate)
            advisoryWv2Dto.today = myDateUtil.toDateToString(advisoryWv2Entity.todayDate)
            advisoryWv2Dto
        }

        writeCsvFile.writeCsv(
            classMap = AdvisoryWv2Dto::class.java, data = advisoryData,
            fileName = "AgroadvisoryWV2", outPutPath = filePath
        )
    }

    @Throws(IOException::class)
    override fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<AdvisoryWV2Form>>() {})

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

        val advisoryData = ArrayList<AdvisoryWv2Entity>()
        list.forEach { advisoryWV2Form ->
            val geoPoint = myDateUtil.splitGeoPoint(advisoryWV2Form.geopoint)

            val advisoryWv2Entity = modelMapper.map(advisoryWV2Form, AdvisoryWv2Entity::class.java)
            advisoryWv2Entity.instanceId = advisoryWV2Form.instanceId
            advisoryWv2Entity.controlKey = advisoryWV2Form.instanceId
            advisoryWv2Entity.uuid = advisoryWV2Form.formhubUuid

            advisoryWv2Entity.submissionDate = myDateUtil.convertToDateTime(advisoryWV2Form.submissionTime)
            advisoryWv2Entity.todayDate = myDateUtil.convertToDate(advisoryWV2Form.today)
            advisoryWv2Entity.endDate = myDateUtil.convertToDateTime(advisoryWV2Form.end)
            advisoryWv2Entity.startDate = myDateUtil.convertToDateTime(advisoryWV2Form.start)

            if (geoPoint.isNotEmpty()) {
                advisoryWv2Entity.geopointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    advisoryWv2Entity.geopointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    advisoryWv2Entity.geopointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    advisoryWv2Entity.geopointAccuracy = geoPoint[3]
                }
            }

            advisoryData.add(advisoryWv2Entity)
        }

        advisoryRepo.saveAll(advisoryData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}