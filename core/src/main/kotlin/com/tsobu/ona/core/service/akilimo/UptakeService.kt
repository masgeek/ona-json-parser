package com.tsobu.ona.core.service.akilimo


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.akilimo.UseUptakeDto
import com.tsobu.ona.core.dto.json.akilimo.UseUptakePerceptionsRepeatDto
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.akilimo.UseUptakeEntity
import com.tsobu.ona.database.entities.akilimo.UseUptakePerceptionsRepeatEntity
import com.tsobu.ona.database.repositories.akilimo.UseUptakePerceptionsRepeatRepo
import com.tsobu.ona.database.repositories.akilimo.UseUptakeRepo
import com.tsobu.ona.forms.akilimo.UseUptakeForm
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
class UptakeService
constructor(
    val useUptakeRepo: UseUptakeRepo,
    val repeatRepo: UseUptakePerceptionsRepeatRepo,
    val appConfig: AppConfig
) {

    private val log = LoggerFactory.getLogger(UptakeService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val writeCsvFile = CsvUtility()

    val fileName = "AKILIMO_use_uptake.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val uptakeList = useUptakeRepo.findAllByOrderBySubmissionDateAsc()
        val repeatList = repeatRepo.findAll()

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
        val filePath = "${appConfig.globalProperties().outputPath}${fileSeparator}EiA_SAA${fileSeparator}"
        val uptakeData = uptakeList.map { uptakeEntity ->
            val useUptakeDto = modelMapper.map(uptakeEntity, UseUptakeDto::class.java)
            useUptakeDto.submissionDate = myDateUtil.toDateTimeString(uptakeEntity.submissionDate)
            useUptakeDto.end = myDateUtil.toDateTimeString(uptakeEntity.endDate)
            useUptakeDto.today = myDateUtil.toDateToString(uptakeEntity.todayDate)
            useUptakeDto
        }

        val repeatData = repeatList.map { repeatEntity ->
            val useUptakeDto = modelMapper.map(repeatEntity, UseUptakePerceptionsRepeatDto::class.java)
            useUptakeDto
        }
        writeCsvFile.writeCsv(
            classMap = UseUptakeDto::class.java, data = uptakeData,
            fileName = "AKILIMO_use_uptake", outPutPath = filePath
        )
        writeCsvFile.writeCsv(
            classMap = UseUptakePerceptionsRepeatDto::class.java, data = repeatData,
            fileName = "AKILIMO_use_uptake-perceptions_repeat", outPutPath = filePath
        )

    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<UseUptakeForm>>() {})

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

        val useUptakeData = ArrayList<UseUptakeEntity>()
        val repeatListData = ArrayList<UseUptakePerceptionsRepeatEntity>()
        list.forEach { useUptakeForm ->
            val useUptakeEntity = modelMapper.map(useUptakeForm, UseUptakeEntity::class.java)

            /*
            val geoPoint = myDateUtil.splitGeoPoint(useUptakeForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                useUptakeEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    useUptakeEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    useUptakeEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    useUptakeEntity.geoPointAccuracy = geoPoint[3]
                }
            }
             */
            useUptakeEntity.instanceId = useUptakeForm.instanceId
            useUptakeEntity.controlKey = useUptakeForm.instanceId
            useUptakeEntity.uuid = useUptakeForm.formHubUuid

            useUptakeEntity.submissionDate = myDateUtil.convertToDateTime(useUptakeForm.submissionTime)
            useUptakeEntity.todayDate = myDateUtil.convertToDate(useUptakeForm.today)
            useUptakeEntity.endDate = myDateUtil.convertToDateTime(useUptakeForm.end)
            useUptakeEntity.eventDate = myDateUtil.convertToDate(useUptakeForm.eventDate)

            useUptakeEntity.setOfPerceptionsPerceptionsRepeat = "${useUptakeEntity.controlKey}/perceptions_repeat"

            val repeatList = useUptakeForm.perceptionsRepeatList
            var repeatListNumber = 1
            repeatList.forEach { list ->
                val repeatEntity = modelMapper.map(list, UseUptakePerceptionsRepeatEntity::class.java)

                repeatEntity.parentKey = useUptakeEntity.controlKey
                repeatEntity.setOfPerceptionsRepeat = "${useUptakeEntity.controlKey}/perceptions_repeat"
                repeatEntity.controlKey = "${useUptakeEntity.controlKey}/perceptions_repeat[$repeatListNumber]"

                repeatListNumber = repeatListNumber.plus(1)
                repeatListData.add(repeatEntity)
            }

            useUptakeData.add(useUptakeEntity)
        }

        repeatRepo.saveAll(repeatListData)
        useUptakeRepo.saveAll(useUptakeData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}