package com.tsobu.ona.core.service.monitorval


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.forms.monitorval.MonitorValForm
import com.tsobu.ona.core.dto.json.dataval.FrDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.monitorval.MonitorValEntity
import com.tsobu.ona.database.entities.valsphstz.SzEntity
import com.tsobu.ona.database.repositories.monitorval.MonitorValRepo
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
class MonitorValService
constructor(
        transactionManager: PlatformTransactionManager,
        val monitorValRepo: MonitorValRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(MonitorValService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()
    fun mapJsonFile() {
        log.info("Reading table data....")
        val frList = monitorValRepo.findAllByOrderBySubmissionDateAsc()

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

        val monitorValData = frList.map { monitorValEntity ->
            val sphsTzSzDto = modelMapper.map(monitorValEntity, FrDto::class.java)
            sphsTzSzDto.submissionDate = myDateUtil.convertTimeToString(monitorValEntity.submissionDate)
            sphsTzSzDto.startDate = myDateUtil.convertTimeToString(monitorValEntity.startDate)
            sphsTzSzDto.endDate = myDateUtil.convertTimeToString(monitorValEntity.endDate)
            sphsTzSzDto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(pojoType = FrDto::class.java, data = monitorValData, fileName = "dataVAL_FR", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset(fileName: String) {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<MonitorValForm>>() {})

        val data = ArrayList<SzEntity>()
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

        val monitorValEntityDate = ArrayList<MonitorValEntity>()
        list.forEach { myVal ->
            //map and save to database
            val geoPoint = myDateUtil.splitGeoPoint(myVal.geopoint)
            val monitorValEntity = modelMapper.map(myVal, MonitorValEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                monitorValEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    monitorValEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    monitorValEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    monitorValEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            monitorValEntity.uuid = myVal.formhubUuid
            monitorValEntity.submissionDate = myDateUtil.convertToDateTime(myVal.submissionTime)
            monitorValEntity.todayDate = myDateUtil.convertToDate(myVal.today)
            monitorValEntity.startDate = myDateUtil.convertToDateTime(myVal.start)
            monitorValEntity.endDate = myDateUtil.convertToDateTime(myVal.end)
            monitorValEntity.instanceId = myVal.metaInstanceID
            monitorValEntity.controlKey = myVal.metaInstanceID

            monitorValEntity.setOfPlotLayout = "${monitorValEntity.controlKey}/plotLayout"
            monitorValEntity.setOfMaizePlantHeight = "${monitorValEntity.controlKey}/maizePlantHeight"
            monitorValEntity.setOfSoilsample = "${monitorValEntity.controlKey}/soilSample"
            monitorValEntity.setOfLeafsample = "${monitorValEntity.controlKey}/leafSample"

            try {
                monitorValEntityDate.add(monitorValEntity)
                log.info("Added data to table ${monitorValEntity.controlKey} with surname as ${myVal.xformIdString}")
            } catch (ex: Exception) {
                log.error(ex.message, ex.stackTrace)
            }
        }

        monitorValRepo.saveAll(monitorValEntityDate)

        log.info("Finished saving the data for $fileName------->")
    }
}