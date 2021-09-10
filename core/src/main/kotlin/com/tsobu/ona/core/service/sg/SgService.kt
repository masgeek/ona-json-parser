package com.tsobu.ona.core.service.sg


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.sg.DataValFipDto
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
            valFipDto.formHubUuId = dataValFipEntity.formHubUuId
            valFipDto.submissionDate = myDateUtil.toDateTimeString(dataValFipEntity.submissionDate)
            valFipDto.startDate = myDateUtil.toDateTimeString(dataValFipEntity.startDate)
            valFipDto.endDate = myDateUtil.toDateTimeString(dataValFipEntity.endDate)
            valFipDto.todayDate = myDateUtil.toDateToString(dataValFipEntity.todayDate)
            valFipDto.plantingDetailsPlantingDate = myDateUtil.toDateToString(dataValFipEntity.plantingDate)
            valFipDto.plantingDetailsTpDate = myDateUtil.toDateToString(dataValFipEntity.tpDate)
            valFipDto.gappingDetailsGappingDate = myDateUtil.toDateToString(dataValFipEntity.gappingDate)
            valFipDto.plantingDetailsNurseryDate = myDateUtil.toDateToString(dataValFipEntity.nurseryDate)
            valFipDto.plantingDetailsSeedingDate = myDateUtil.toDateToString(dataValFipEntity.seedingDate)
            valFipDto.harvestCassavaHarvestDate = myDateUtil.toDateToString(dataValFipEntity.cassavaHarvestDate)
            valFipDto.harvestRiceHarvestDate = myDateUtil.toDateToString(dataValFipEntity.riceHarvestDate)
            valFipDto.fertilizer1BlueDateFertilizer1 = myDateUtil.toDateToString(dataValFipEntity.fertilizer1BlueDateFertilizer1)
            valFipDto.fertilizer2BlueDateFertilizer2 = myDateUtil.toDateToString(dataValFipEntity.fertilizer2BlueDateFertilizer2)
            valFipDto.fertilizer3BlueDateFertilizer3 = myDateUtil.toDateToString(dataValFipEntity.fertilizer3BlueDateFertilizer3)
            valFipDto.fertilizer1yellowDateFertilizer1 = myDateUtil.toDateToString(dataValFipEntity.fertilizer1YellowDateFertilizer1)
            valFipDto.fertilizer2yellowDateFertilizer2 = myDateUtil.toDateToString(dataValFipEntity.fertilizer2YellowDateFertilizer2)
            valFipDto.fertilizer3yellowDateFertilizer3 = myDateUtil.toDateToString(dataValFipEntity.fertilizer3YellowDateFertilizer3)

            valFipDto.weedingDetailsDateWeeding1 = myDateUtil.toDateToString(dataValFipEntity.weedingDetailsDateWeeding1)
            valFipDto.weedingDetailsDateWeeding2 = myDateUtil.toDateToString(dataValFipEntity.weedingDetailsDateWeeding2)
            valFipDto.weedingDetailsDateWeeding3 = myDateUtil.toDateToString(dataValFipEntity.weedingDetailsDateWeeding3)
            valFipDto.weedingDetailsDateWeeding4 = myDateUtil.toDateToString(dataValFipEntity.weedingDetailsDateWeeding4)
            valFipDto.weedingDetailsDateWeeding5 = myDateUtil.toDateToString(dataValFipEntity.weedingDetailsDateWeeding5)
            valFipDto.weedingDetailsDateWeeding6 = myDateUtil.toDateToString(dataValFipEntity.weedingDetailsDateWeeding6)
            valFipDto.weedingDetailsDateWeeding7 = myDateUtil.toDateToString(dataValFipEntity.weedingDetailsDateWeeding7)
            valFipDto.weedingDetailsDateWeeding8 = myDateUtil.toDateToString(dataValFipEntity.weedingDetailsDateWeeding8)
            valFipDto.weedingDetailsDateWeeding9 = myDateUtil.toDateToString(dataValFipEntity.weedingDetailsDateWeeding9)
            valFipDto.weedingDetailsDateWeeding10 = myDateUtil.toDateToString(dataValFipEntity.weedingDetailsDateWeeding10)


//            valFipDto.intro = dataValFipEntity.intro

            valFipDto
        }
        val filePath = "${appConfig.globalProperties().outputPath}/EiA_SAA/"
        writeCsvFile.writeCsv(
            classMap = DataValFipDto::class.java, data = fipData,
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
            sgDataValFipEntity.plantingDate = myDateUtil.convertToDate(sgDataValFipForm.plantingDetailsPlantingDate)
            sgDataValFipEntity.tpDate = myDateUtil.convertToDate(sgDataValFipForm.plantingDetailsTpDate)
            sgDataValFipEntity.gappingDate = myDateUtil.convertToDate(sgDataValFipForm.gappingDetailsGappingDate)
            sgDataValFipEntity.seedingDate = myDateUtil.convertToDate(sgDataValFipForm.plantingDetailsSeedingDate)
            sgDataValFipEntity.cassavaHarvestDate = myDateUtil.convertToDate(sgDataValFipForm.harvestCassavaHarvestDate)
            sgDataValFipEntity.fertilizer1BlueDateFertilizer1 = myDateUtil.convertToDate(sgDataValFipForm.fertilizer1BlueDateFertilizer1)
            sgDataValFipEntity.fertilizer2BlueDateFertilizer2 = myDateUtil.convertToDate(sgDataValFipForm.fertilizer2BlueDateFertilizer2)
            sgDataValFipEntity.fertilizer3BlueDateFertilizer3 = myDateUtil.convertToDate(sgDataValFipForm.fertilizer3BlueDateFertilizer3)
            sgDataValFipEntity.fertilizer1YellowDateFertilizer1 = myDateUtil.convertToDate(sgDataValFipForm.fertilizer1YellowDateFertilizer1)
            sgDataValFipEntity.fertilizer2YellowDateFertilizer2 = myDateUtil.convertToDate(sgDataValFipForm.fertilizer2YellowDateFertilizer2)
            sgDataValFipEntity.fertilizer3YellowDateFertilizer3 = myDateUtil.convertToDate(sgDataValFipForm.fertilizer3YellowDateFertilizer3)

            sgDataValFipEntity.weedingDetailsDateWeeding1 = myDateUtil.convertToDate(sgDataValFipForm.weedingDetailsDateWeeding1)
            sgDataValFipEntity.weedingDetailsDateWeeding2 = myDateUtil.convertToDate(sgDataValFipForm.weedingDetailsDateWeeding2)
            sgDataValFipEntity.weedingDetailsDateWeeding3 = myDateUtil.convertToDate(sgDataValFipForm.weedingDetailsDateWeeding3)
            sgDataValFipEntity.weedingDetailsDateWeeding4 = myDateUtil.convertToDate(sgDataValFipForm.weedingDetailsDateWeeding4)



            sgData.add(sgDataValFipEntity)
        }


        sgDataValFipRepo.saveAll(sgData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}