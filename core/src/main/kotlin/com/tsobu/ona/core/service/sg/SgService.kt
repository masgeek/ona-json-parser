package com.tsobu.ona.core.service.sg


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.sg.DataValFipDto
import com.tsobu.ona.core.dto.json.sphs.PraSphsDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.sg.SgDataValFipEntity
import com.tsobu.ona.database.repositories.sg.SgDataValFipRepo
import com.tsobu.ona.forms.sg.SgDataValFipForm
import org.modelmapper.AbstractCondition
import org.modelmapper.Condition
import org.modelmapper.ModelMapper
import org.modelmapper.convention.MatchingStrategies
import org.modelmapper.spi.MappingContext
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.io.IOException
import java.nio.file.Paths


@Service
class SgService
constructor(
    val sgDataValFipRepo: SgDataValFipRepo,
    val appConfig: AppConfig
) {

    private val log = LoggerFactory.getLogger(SgService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val writeCsvFile = CsvUtility()

    val fileName = "SG_dataVAL_FIP.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val sgList = sgDataValFipRepo.findAllByOrderBySubmissionDateAsc()

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


        val fipData = sgList.map { dataValFipEntity ->
            val valFipDto = modelMapper.map(dataValFipEntity, DataValFipDto::class.java)
            valFipDto.submissionDate = myDateUtil.toDateTimeString(dataValFipEntity.submissionDate)
            valFipDto.startDate = myDateUtil.toDateTimeString(dataValFipEntity.startDate)
            valFipDto.endDate = myDateUtil.toDateTimeString(dataValFipEntity.endDate)
            valFipDto.todayDate = myDateUtil.toDateToString(dataValFipEntity.todayDate)
            valFipDto.plantingDetailsPlantingDate = myDateUtil.toDateToString(dataValFipEntity.plantingDetailsPlantingDate)
            valFipDto.plantingDetailsTpDate = myDateUtil.toDateToString(dataValFipEntity.plantingDetailsTpDate)
            valFipDto.gappingDetailsGappingDate = myDateUtil.toDateToString(dataValFipEntity.gappingDetailsGappingDate)
            valFipDto.fertilizer1BlueDateFertilizer1 = myDateUtil.toDateToString(dataValFipEntity.fertilizer1BlueDateFertilizer1)
            valFipDto.fertilizer2BlueDateFertilizer2 = myDateUtil.toDateToString(dataValFipEntity.fertilizer2BlueDateFertilizer2)
            valFipDto.fertilizer3BlueDateFertilizer3 = myDateUtil.toDateToString(dataValFipEntity.fertilizer3BlueDateFertilizer3)
            valFipDto.fertilizer1yellowDateFertilizer1 = myDateUtil.toDateToString(dataValFipEntity.fertilizer1YellowDateFertilizer1)
            valFipDto.fertilizer2yellowDateFertilizer2 = myDateUtil.toDateToString(dataValFipEntity.fertilizer2YellowDateFertilizer2)
            valFipDto.fertilizer3yellowDateFertilizer3 = myDateUtil.toDateToString(dataValFipEntity.fertilizer3YellowDateFertilizer3)

            valFipDto
        }
        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(
            classMap = PraSphsDto::class.java, data = fipData,
            fileName = "SG_dataVAL_FIP", outPutPath = filePath
        )

    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<SgDataValFipForm>>() {})

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

        val sgData = ArrayList<SgDataValFipEntity>()
        list.forEach { sgDataValFipForm ->
            val sgDataValFipEntity = modelMapper.map(sgDataValFipForm, SgDataValFipEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(sgDataValFipForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                sgDataValFipEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    sgDataValFipEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    sgDataValFipEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    sgDataValFipEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            sgDataValFipEntity.instanceId = sgDataValFipForm.instanceId
            sgDataValFipEntity.controlKey = sgDataValFipForm.instanceId
            sgDataValFipEntity.formHubUuId = sgDataValFipForm.formHubUuId
            sgDataValFipEntity.submissionDate = myDateUtil.convertToDateTime(sgDataValFipForm.submissionTime)
            sgDataValFipEntity.todayDate = myDateUtil.convertToDate(sgDataValFipForm.todayDate)
            sgDataValFipEntity.startDate = myDateUtil.convertToDateTime(sgDataValFipForm.startDate)
            sgDataValFipEntity.endDate = myDateUtil.convertToDateTime(sgDataValFipForm.endDate)
            sgDataValFipEntity.plantingDetailsPlantingDate = myDateUtil.convertToDate(sgDataValFipForm.plantingDetailsPlantingDate)
            sgDataValFipEntity.plantingDetailsTpDate = myDateUtil.convertToDate(sgDataValFipForm.plantingDetailsTpDate)
            sgDataValFipEntity.gappingDetailsGappingDate = myDateUtil.convertToDate(sgDataValFipForm.gappingDetailsGappingDate)
            sgDataValFipEntity.fertilizer1BlueDateFertilizer1 = myDateUtil.convertToDate(sgDataValFipForm.fertilizer1BlueDateFertilizer1)
            sgDataValFipEntity.fertilizer2BlueDateFertilizer2 = myDateUtil.convertToDate(sgDataValFipForm.fertilizer2BlueDateFertilizer2)
            sgDataValFipEntity.fertilizer3BlueDateFertilizer3 = myDateUtil.convertToDate(sgDataValFipForm.fertilizer3BlueDateFertilizer3)
            sgDataValFipEntity.fertilizer1YellowDateFertilizer1 = myDateUtil.convertToDate(sgDataValFipForm.fertilizer1YellowDateFertilizer1)
            sgDataValFipEntity.fertilizer2YellowDateFertilizer2 = myDateUtil.convertToDate(sgDataValFipForm.fertilizer2YellowDateFertilizer2)
            sgDataValFipEntity.fertilizer3YellowDateFertilizer3 = myDateUtil.convertToDate(sgDataValFipForm.fertilizer3YellowDateFertilizer3)



            sgData.add(sgDataValFipEntity)
        }


        sgDataValFipRepo.saveAll(sgData)
        log.info("Finished saving the data for $fileName------->")
//        mapJsonFile()
    }
}