package com.tsobu.ona.core.service


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.forms.scoreweed.ScoreWeedControl
import com.tsobu.ona.core.dto.json.ScoreWeedControlAcDto
import com.tsobu.ona.core.dto.json.ScoreWeedControlAcIdDto
import com.tsobu.ona.core.dto.json.ScoreWeedControlAcWdDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.ScoreWeedControlAc
import com.tsobu.ona.database.entities.ScoreWeedControlAcId
import com.tsobu.ona.database.entities.ScoreWeedControlAcWd
import com.tsobu.ona.database.repositories.ScoreWeedControlAcIdRepo
import com.tsobu.ona.database.repositories.ScoreWeedControlAcRepo
import com.tsobu.ona.database.repositories.ScoreWeedControlAcWdRepo
import org.modelmapper.ModelMapper
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.TransactionStatus
import org.springframework.transaction.support.TransactionTemplate
import java.io.IOException
import java.nio.file.Paths


@Service
class ScoreWeedControlService
constructor(
        transactionManager: PlatformTransactionManager,
        val scoreWeedControlAcRepo: ScoreWeedControlAcRepo,
        val scoreWeedControlAcIdRepo: ScoreWeedControlAcIdRepo,
        val scoreWeedControlAcWdRepo: ScoreWeedControlAcWdRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(ScoreWeedControlService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)

    fun mapJsonFile() {
        log.info("Reading weed table here")
        val scores = scoreWeedControlAcRepo.findAll()
        val scoresId = scoreWeedControlAcIdRepo.findAll()
        val scoresAc = scoreWeedControlAcWdRepo.findAll()

        val scoreWeedData = scores.map { scoreWeedControlAc ->
            val outboxDto = modelMapper.map(scoreWeedControlAc, ScoreWeedControlAcDto::class.java)
            outboxDto.submissionDate = myDateUtil.convertTimeToString(scoreWeedControlAc.submissionDate)
            outboxDto.startDate = myDateUtil.convertTimeToString(scoreWeedControlAc.startDate)
            outboxDto.endDate = myDateUtil.convertTimeToString(scoreWeedControlAc.endDate)
            outboxDto
        }

        val scoreWeedIdData = scoresId.map { scoreWeedControlAcId ->
            val outboxDto = modelMapper.map(scoreWeedControlAcId, ScoreWeedControlAcIdDto::class.java)
            outboxDto
        }

        val scoreWeedAcData = scoresAc.map { scoreWeedControlAcWd ->
            val outboxDto = modelMapper.map(scoreWeedControlAcWd, ScoreWeedControlAcWdDto::class.java)
            outboxDto
        }


        val writeCsvFile = WriteCsvFile()
        writeCsvFile.writeScoreWeedCsv(list = scoreWeedData, fileName = "Score_Weed_Control_AC.csv")
        writeCsvFile.writeScoreWeedIdCsv(list = scoreWeedIdData, fileName = "Score_Weed_Control_AC-ID.csv")
        writeCsvFile.writeScoreWeedAcCsv(list = scoreWeedAcData, fileName = "Score_Weed_Control_AC-WD.csv")
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset(fileName: String) {
        val filePath = "${appConfig.globalProperties().folderPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<ScoreWeedControl>>() {})

        val data = ArrayList<ScoreWeedControlAc>()
        val weedIdData = ArrayList<ScoreWeedControlAcId>()
        val weedWdData = ArrayList<ScoreWeedControlAcWd>()

        val result = transactionTemplate.execute { status: TransactionStatus? ->

            list.forEach { myVal ->
                //map and save to database
                val geoPoint = myDateUtil.splitGeoPoint(myVal.geopoint)
                val weedEntity = ScoreWeedControlAc()
                if (geoPoint.isNotEmpty()) {
                    weedEntity.geoPointLatitude = geoPoint[0].toDouble()

                    if (myDateUtil.indexExists(geoPoint, 1)) {
                        weedEntity.geoPointLongitude = geoPoint[1].toDouble()
                    }
                    if (myDateUtil.indexExists(geoPoint, 2)) {
                        weedEntity.geoPointAltitude = geoPoint[2].toDouble()
                    }
                    if (myDateUtil.indexExists(geoPoint, 3)) {
                        weedEntity.geoPointAccuracy = geoPoint[3].toDouble()
                    }
                }
                weedEntity.uuid = myVal.formHubUuid
                weedEntity.submissionDate = myDateUtil.convertToDateTime(myVal.submissionTime)
                weedEntity.todayDate = myDateUtil.convertToDate(myVal.today)
                weedEntity.startDate = myDateUtil.convertToDateTime(myVal.start)
                weedEntity.endDate = myDateUtil.convertToDateTime(myVal.end)
                weedEntity.setOfId = "${myVal.metaInstanceID}/ID"
                weedEntity.instanceId = myVal.metaInstanceID
                weedEntity.weedKey = myVal.metaInstanceID

                weedEntity.deviceId = myVal.deviceid
                weedEntity.subscriberId = myVal.subscriberId
                weedEntity.email = myVal.email
                weedEntity.username = myVal.username
                weedEntity.simSerial = myVal.simserial
                weedEntity.phoneNumber = myVal.phoneNumber
                weedEntity.project = myVal.project
                weedEntity.country = myVal.country
                weedEntity.login = myVal.login
                weedEntity.weedEntity = myVal.weedEntity
                weedEntity.weedDetail = myVal.weedDetail
                weedEntity.nrQuadrants = myVal.nrQuadrants

                data.add(weedEntity)

                //now we evaluate the weed id list
                val weedIdList = myVal.weedIdList
                var weedListIdCount = 1
                weedIdList?.forEach { weedList ->
                    val weedIdEntity = ScoreWeedControlAcId()
                    weedIdEntity.sectionId = weedList.sectionId
                    weedIdEntity.plotId = weedList.plotId
                    weedIdEntity.daysLastWeeded = weedList.daysLastWeeded
                    weedIdEntity.scoreWeedingEff = weedList.scoreWeedingEff
                    weedIdEntity.scoreCropInjury = weedList.scoreCropInjury
                    weedIdEntity.weedcount = weedList.weedCount
                    weedIdEntity.parentKey = weedEntity.instanceId
                    weedIdEntity.setOfId = weedEntity.setOfId
                    weedIdEntity.setOfWd = "${weedEntity.setOfId}[$weedListIdCount]/WD"
                    weedIdEntity.controlKey = "${weedEntity.setOfId}[$weedListIdCount]"

                    weedIdData.add(weedIdEntity)
                    log.info("Added plot id is  ---->>> ${weedIdEntity.plotId} with for weed being $weedListIdCount")
                    weedListIdCount = weedListIdCount.plus(1)

                    //now we evaluate the weed ac list
                    log.info("Evaluating the weed ac now")
                    val weedAcList = weedList.weedIdentifierList
                    var weedListAcCount = 1
                    weedAcList?.forEach { weedIdentifier ->
                        val weedAcEntity = ScoreWeedControlAcWd()
                        weedAcEntity.parentKey = weedIdEntity.controlKey
                        weedAcEntity.imageLeafArea = weedIdentifier.imageLeafArea
                        weedAcEntity.controlKey = "${weedIdEntity.setOfWd}[$weedListIdCount]"
                        weedAcEntity.setOfWd = "${weedIdEntity.setOfWd}"
                        weedWdData.add(weedAcEntity)

                        log.info("Added plot id is  ---->>> ${weedAcEntity.imageLeafArea} with for weed being $weedListAcCount")
                        weedListAcCount = weedListAcCount.plus(1)
                    }
                }


            }

            log.info("Saving all the data to the database now")
            scoreWeedControlAcRepo.saveAll(data)
            scoreWeedControlAcIdRepo.saveAll(weedIdData)
            scoreWeedControlAcWdRepo.saveAll(weedWdData)
            log.info("Finished saving the data for $fileName------->")
        }
    }
}