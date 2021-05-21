package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class CisForm {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("comment")
    var commentValue: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("deviceid")
    var deviceId: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: String?=null

    @JsonProperty("_xform_id")
    var xFormId: String? = null

    @JsonProperty("loc_field")
    var locField: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("fertilizer0")
    var fertilizer0: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: String? = null

    @JsonProperty("_total_media")
    var totalMedia: String? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("purpose/event")
    var eventValue: String? = null

    @JsonProperty("dateFertilizer0")
    var dateFertilizer0: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("sameDayPlanting")
    var sameDayPlanting: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("plotSizeDetails/plotL")
    var plotLength: String? = null

    @JsonProperty("plotSizeDetails/plotW")
    var plotWidth: String? = null

    @JsonProperty("landPreparation/ridging")
    var ridging: String? = null

    @JsonProperty("landPreparation/clearing")
    var clearing: String? = null

    @JsonProperty("landPreparation/nrHarrow")
    var nrHarrow: String? = null

    @JsonProperty("plotSizeDetails/plotSize")
    var plotSize: String? = null

    @JsonProperty("landPreparation/nrTillage")
    var nrTillage: String? = null

    @JsonProperty("landPreparation/vegetation")
    var vegetation: String? = null

    @JsonProperty("plantingDetails/plantingDate")
    var plantingDate: String? = null

    @JsonProperty("plantingDetails/cassavaVariety")
    var cassavaVariety: String? = null

    @JsonProperty("plantingDetails/sweetPotatoVariety")
    var sweetPotatoVariety: String? = null

    @JsonProperty("plantingDetails/plantingDensityCSIC")
    var plantingDensityCsIc: String? = null

    @JsonProperty("plantingDetails/plantingDensityCSMC")
    var plantingDensityCsMc: String? = null

    @JsonProperty("plantingDetails/plantingDensitySPIC")
    var plantingDensitySpIc: String? = null

    @JsonProperty("plantingDetails/plantingDensitySPMC")
    var plantingDensitySpMc: String? = null

    @JsonProperty("landPrepationDetails/harrowMethod1")
    var harrowMethod1: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod1")
    var tillageMethod1: String? = null

    @JsonProperty("plantingDetails/plantingDateCS")
    var plantingDateCs: String? = null

    @JsonProperty("plantingDetails/plantingDateSP")
    var plantingDateSp: String? = null

    @JsonProperty("landPrepationDetails/harrowMethod2")
    var harrowMethod2: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod2")
    var tillageMethod2: String? = null

    @JsonProperty("densityDetailsCSMC/withinRowCSMC")
    var withinRowCsMc: String?=null

    @JsonProperty("densityDetailsCSMC/betweenRowCSMC")
    var betweenRowCsMc: String?=null

    @JsonProperty("fertilizer1")
    var fertilizer1: String? = null

    @JsonProperty("dateFertilizer1")
    var dateFertilizer1: String? = null

    @JsonProperty("sweetPotatoReplanting")
    var sweetPotatoReplanting: String? = null

    @JsonProperty("sweetPotatoReplantingDetails/sweetPotatoReplantingDate")
    var sweetPotatoReplantingDate: String? = null

    @JsonProperty("sweetPotatoReplantingDetails/sweetPotatoReplantingType")
    var sweetPotatoReplantingType: String? = null

    @JsonProperty("nrRows")
    var nrRows: String? = null

    @JsonProperty("nrWeeding")
    var nrWeeding: String? = null

    @JsonProperty("cassavaGapping")
    var cassavaGapping: String? = null

    @JsonProperty("weedingDetails/dateWeeding1")
    var dateWeeding1: String? = null

    @JsonProperty("weedingDetails/weedingMethod1")
    var weedingMethod1: String? = null

    @JsonProperty("sweetPotatoVigor_SP/scoreCover_SP")
    var scoreCoverSp: String? = null

    @JsonProperty("sweetPotatoVigor_SP/scoreVigour_SP")
    var scoreVigourSp: String? = null

    @JsonProperty("cassavaPlantStand/nrCassavaPlants_CS")
    var nrCassavaPlantsCs: String? = null

    @JsonProperty("sweetPotatoVigor_CSSP/scoreCover_CSSP")
    var scoreCoverCsSp: String? = null

    @JsonProperty("cassavaPlantStand/nrCassavaPlants_CSSP")
    var nrCassavaPlantsCsSp: String? = null

    @JsonProperty("sweetPotatoVigor_CSSP/scoreVigour_CSSP")
    var scoreVigourCsSp: String? = null

    @JsonProperty("cassavaPlantStand/nrCassavaPlants_CSSPF")
    var nrCassavaPlantsCssPf: String? = null

    @JsonProperty("sweetPotatoVigor_CSSPF/scoreCover_CSSPF")
    var scoreCoverCssPf: String? = null

    @JsonProperty("cassavaGappingDetails/cassavaGappingDate")
    var cassavaGappingDate: String? = null

    @JsonProperty("cassavaGappingDetails/cassavaGappingType")
    var cassavaGappingType: String? = null

    @JsonProperty("sweetPotatoVigor_CSSPF/scoreVigour_CSSPF")
    var scoreVigourCssPf: String? = null

    @JsonProperty("sweetPotatoPlantStand_SP/nrSweetPotatoPlants1_SP")
    var nrSweetPotatoPlants1Sp: String? = null

    @JsonProperty("sweetPotatoPlantStand_SP/nrSweetPotatoPlants2_SP")
    var nrSweetPotatoPlants2Sp: String? = null

    @JsonProperty("sweetPotatoPlantStand_SP/nrSweetPotatoPlants3_SP")
    var nrSweetPotatoPlants3Sp: String? = null

    @JsonProperty("sweetPotatoPlantStand_SP/nrSweetPotatoPlants4_SP")
    var nrSweetPotatoPlants4Sp: String? = null

    @JsonProperty("sweetPotatoPlantStand_SP/nrSweetPotatoPlants5_SP")
    var nrSweetPotatoPlants5Sp: String? = null

    @JsonProperty("sweetPotatoPlantStand_SP/nrSweetPotatoPlants6_SP")
    var nrSweetPotatoPlants6Sp: String? = null

    @JsonProperty("sweetPotatoPlantStand_SP/nrSweetPotatoPlants7_SP")
    var nrSweetPotatoPlants7Sp: String? = null

    @JsonProperty("sweetPotatoPlantStand_CSSP/nrSweetPotatoPlants1_CSSP")
    var nrSweetPotatoPlants1CsSp: String? = null

    @JsonProperty("sweetPotatoPlantStand_CSSP/nrSweetPotatoPlants2_CSSP")
    var nrSweetPotatoPlants2CsSp: String? = null

    @JsonProperty("sweetPotatoPlantStand_CSSP/nrSweetPotatoPlants3_CSSP")
    var nrSweetPotatoPlants3CsSp: String? = null

    @JsonProperty("sweetPotatoPlantStand_CSSP/nrSweetPotatoPlants4_CSSP")
    var nrSweetPotatoPlants4CsSp: String? = null

    @JsonProperty("sweetPotatoPlantStand_CSSP/nrSweetPotatoPlants5_CSSP")
    var nrSweetPotatoPlants5CsSp: String? = null

    @JsonProperty("sweetPotatoPlantStand_CSSP/nrSweetPotatoPlants6_CSSP")
    var nrSweetPotatoPlants6CsSp: String? = null

    @JsonProperty("sweetPotatoPlantStand_CSSP/nrSweetPotatoPlants7_CSSP")
    var nrSweetPotatoPlants7CsSp: String? = null

    @JsonProperty("sweetPotatoPlantStand_CSSPF/nrSweetPotatoPlants1_CSSPF")
    var nrSweetPotatoPlants1CssPf: String? = null

    @JsonProperty("sweetPotatoPlantStand_CSSPF/nrSweetPotatoPlants2_CSSPF")
    var nrSweetPotatoPlants2CssPf: String? = null

    @JsonProperty("sweetPotatoPlantStand_CSSPF/nrSweetPotatoPlants3_CSSPF")
    var nrSweetPotatoPlants3CssPf: String? = null

    @JsonProperty("sweetPotatoPlantStand_CSSPF/nrSweetPotatoPlants4_CSSPF")
    var nrSweetPotatoPlants4CssPf: String? = null

    @JsonProperty("sweetPotatoPlantStand_CSSPF/nrSweetPotatoPlants5_CSSPF")
    var nrSweetPotatoPlants5CssPf: String? = null

    @JsonProperty("sweetPotatoPlantStand_CSSPF/nrSweetPotatoPlants6_CSSPF")
    var nrSweetPotatoPlants6CssPf: String? = null

    @JsonProperty("sweetPotatoPlantStand_CSSPF/nrSweetPotatoPlants7_CSSPF")
    var nrSweetPotatoPlants7CssPf: String? = null

    @JsonProperty("weedingDetails/dateWeeding2")
    var dateWeeding2: String? = null

    @JsonProperty("weedingDetails/weedingMethod2")
    var weedingMethod2: String? = null

    @JsonProperty("trialRating/rateCMD")
    var rateCmd: String? = null

    @JsonProperty("trialRating/rateCBSD")
    var rateCbSd: String? = null

    @JsonProperty("trialRating/rateFire")
    var rateFire: String? = null

    @JsonProperty("trialRating/rateWeeds")
    var rateWeeds: String? = null

    @JsonProperty("trialRating/rateDrought")
    var rateDrought: String? = null

    @JsonProperty("trialRating/rateGrazing")
    var rateGrazing: String? = null

    @JsonProperty("trialRating/rateLodging")
    var rateLodging: String? = null

    @JsonProperty("trialRating/rateOtherDisease")
    var rateOtherDisease: String? = null

    @JsonProperty("trialRating/ratePestsCassava")
    var ratePestsCassava: String? = null

    @JsonProperty("trialRating/rateWaterLogging")
    var rateWaterLogging: String? = null

    @JsonProperty("trialRating/ratePestsSweetPotato")
    var ratePestsSweetPotato: String? = null

    @JsonProperty("trialRating/rateDiseaseSweetPotato")
    var rateDiseaseSweetPotato: String? = null

    @JsonProperty("trialRating/rateTheftMissingCassava")
    var rateTheftMissingCassava: String? = null

    @JsonProperty("trialRating/rateTheftMissingSweetPotato")
    var rateTheftMissingSweetPotato: String? = null

    @JsonProperty("tuberUnit")
    var tuberUnit: String? = null

    @JsonProperty("tuberPrice")
    var tuberPrice: String? = null

    @JsonProperty("prefPlot_SP")
    var prefPlotSp: String? = null

    @JsonProperty("tuberUnitName")
    var tuberUnitName: String? = null

    @JsonProperty("overallScore_SP")
    var overallScoreSp: String? = null

    @JsonProperty("dateSweetPotatoHarvest")
    var dateSweetPotatoHarvest: String? = null

    @JsonProperty("tuberUnitDetails/tuberUnitPrice")
    var tuberUnitPrice: String? = null

    @JsonProperty("farmerEvaluation_SP/costScore_SP")
    var costScoreSp: String? = null

    @JsonProperty("tuberUnitDetails/tuberUnitWeight")
    var tuberUnitWeight: String?=null

    @JsonProperty("farmerEvaluation_SP/yieldScore_SP")
    var yieldScoreSp: String? = null

    @JsonProperty("farmerEvaluation_SP/labourScore_SP")
    var labourScoreSp: String? = null

    @JsonProperty("farmerEvaluation_SP/qualityScore_SP")
    var qualityScoreSp: String? = null

    @JsonProperty("farmerEvaluation_SP/revenueScore_SP")
    var revenueScoreSp: String? = null

    @JsonProperty("sweetPotatoHarvest_SP/largeTubersFW_SP")
    var largeTubersFwSp: String?=null

    @JsonProperty("sweetPotatoHarvest_SP/largeTubersNr_SP")
    var largeTubersNrSp: String? = null

    @JsonProperty("sweetPotatoHarvest_SP/smallTubersFW_SP")
    var smallTubersFwSp: String?=null

    @JsonProperty("sweetPotatoHarvest_SP/smallTubersNr_SP")
    var smallTubersNrSp: String? = null

    @JsonProperty("sweetPotatoHarvest_CSSP/largeTubersFW_CSSP")
    var largeTubersFeCsSp: String?=null

    @JsonProperty("sweetPotatoHarvest_CSSP/largeTubersNr_CSSP")
    var largeTubersNrCsSp: String? = null

    @JsonProperty("sweetPotatoHarvest_CSSP/smallTubersFW_CSSP")
    var smallTubersFeCsSp: String?=null

    @JsonProperty("sweetPotatoHarvest_CSSP/smallTubersNr_CSSP")
    var smallTubersNrCsSp: String? = null

    @JsonProperty("sweetPotatoHarvest_CSSPF/largeTubersFW_CSSPF")
    var largeTubersFwCssPf: String?=null

    @JsonProperty("sweetPotatoHarvest_CSSPF/largeTubersNr_CSSPF")
    var largeTubersNrCssPf: String? = null

    @JsonProperty("sweetPotatoHarvest_CSSPF/smallTubersFW_CSSPF")
    var smallTubersFwCssPf: String?=null

    @JsonProperty("sweetPotatoHarvest_CSSPF/smallTubersNr_CSSPF")
    var smallTubersNrCssPf: String? = null

    @JsonProperty("tuberPriceSI")
    var tuberPriceSi: String? = null

    @JsonProperty("weedingDetails/dateWeeding3")
    var dateWeeding3: String? = null

    @JsonProperty("weedingDetails/weedingMethod3")
    var weedingMethod3: String? = null

    @JsonProperty("prefPlot")
    var prefPlot: String? = null

    @JsonProperty("rootsUnit")
    var rootsUnit: String? = null

    @JsonProperty("rootsPrice")
    var rootsPrice: String? = null

    @JsonProperty("overallScore")
    var overallScore: String? = null

    @JsonProperty("rootsUnitName")
    var rootsUnitName: String? = null

    @JsonProperty("dateCassavaHarvest")
    var dateCassavaHarvest: String? = null

    @JsonProperty("farmerEvaluation/costScore")
    var costScore: String? = null

    @JsonProperty("farmerEvaluation/yieldScore")
    var yieldScore: String? = null

    @JsonProperty("farmerEvaluation/labourScore")
    var labourScore: String? = null

    @JsonProperty("farmerEvaluation/qualityScore")
    var qualityScore: String? = null

    @JsonProperty("farmerEvaluation/revenueScore")
    var revenueScore: String? = null

    @JsonProperty("rootsUnitDetails/rootsUnitPrice")
    var rootsUnitPrice: String? = null

    @JsonProperty("rootsUnitDetails/rootsUnitWeight")
    var rootsUnitWeight: String?=null

    @JsonProperty("cassavaHarvest_CS/tuberizedMarketableRootsFW_CS")
    var tuberizedMarketableRootsFwCs: String?=null

    @JsonProperty("cassavaHarvest_CS/tuberizedMarketableRootsNr_CS")
    var tuberizedMarketableRootsNrCs: String? = null

    @JsonProperty("cassavaHarvest_CSSP/tuberizedMarketableRootsFW_CSSP")
    var tuberizedMarketableRootsFeCsSp: String?=null

    @JsonProperty("cassavaHarvest_CSSP/tuberizedMarketableRootsNr_CSSP")
    var tuberizedMarketableRootsNrCsSp: String? = null

    @JsonProperty("cassavaHarvest_CSSPF/tuberizedMarketableRootsFW_CSSPF")
    var tuberizedMarketableRootsFwCssPf: String?=null

    @JsonProperty("cassavaHarvest_CSSPF/tuberizedMarketableRootsNr_CSSPF")
    var tuberizedMarketableRootsNrCssPf: String? = null

    @JsonProperty("weedingDetails/dateWeeding4")
    var dateWeeding4: String? = null

    @JsonProperty("weedingDetails/weedingMethod4")
    var weedingMethod4: String? = null

    @JsonProperty("rootsPriceSI")
    var rootsPriceSi: String? = null
}