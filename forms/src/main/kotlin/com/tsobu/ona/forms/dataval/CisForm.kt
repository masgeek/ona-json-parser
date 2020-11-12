package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class CisForm {
    @JsonProperty("_id")
    var id: Int? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

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
    var deviceid: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId: Int? = null

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
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

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
    var metaInstanceId: String? = null

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
    var plotSizeDetailsPlotL: Int? = null

    @JsonProperty("plotSizeDetails/plotW")
    var plotSizeDetailsPlotW: Int? = null

    @JsonProperty("landPreparation/ridging")
    var landPreparationRidging: String? = null

    @JsonProperty("landPreparation/clearing")
    var landPreparationClearing: String? = null

    @JsonProperty("landPreparation/nrHarrow")
    var landPreparationNrHarrow: String? = null

    @JsonProperty("plotSizeDetails/plotSize")
    var plotSizeDetailsPlotSize: String? = null

    @JsonProperty("landPreparation/nrTillage")
    var landPreparationNrTillage: String? = null

    @JsonProperty("landPreparation/vegetation")
    var landPreparationVegetation: String? = null

    @JsonProperty("plantingDetails/plantingDate")
    var plantingDetailsPlantingDate: String? = null

    @JsonProperty("plantingDetails/cassavaVariety")
    var plantingDetailsCassavaVariety: String? = null

    @JsonProperty("plantingDetails/sweetPotatoVariety")
    var plantingDetailsSweetPotatoVariety: String? = null

    @JsonProperty("plantingDetails/plantingDensityCSIC")
    var plantingDetailsPlantingDensityCSIC: String? = null

    @JsonProperty("plantingDetails/plantingDensityCSMC")
    var plantingDetailsPlantingDensityCSMC: String? = null

    @JsonProperty("plantingDetails/plantingDensitySPIC")
    var plantingDetailsPlantingDensitySPIC: String? = null

    @JsonProperty("plantingDetails/plantingDensitySPMC")
    var plantingDetailsPlantingDensitySPMC: String? = null

    @JsonProperty("landPrepationDetails/harrowMethod1")
    var landPrepationDetailsHarrowMethod1: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod1")
    var landPrepationDetailsTillageMethod1: String? = null

    @JsonProperty("plantingDetails/plantingDateCS")
    var plantingDetailsPlantingDateCS: String? = null

    @JsonProperty("plantingDetails/plantingDateSP")
    var plantingDetailsPlantingDateSP: String? = null

    @JsonProperty("landPrepationDetails/harrowMethod2")
    var landPrepationDetailsHarrowMethod2: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod2")
    var landPrepationDetailsTillageMethod2: String? = null

    @JsonProperty("densityDetailsCSMC/withinRowCSMC")
    var densityDetailsCSMCWithinRowCSMC: Double? = null

    @JsonProperty("densityDetailsCSMC/betweenRowCSMC")
    var densityDetailsCSMCBetweenRowCSMC: Double? = null

    @JsonProperty("fertilizer1")
    var fertilizer1: String? = null

    @JsonProperty("dateFertilizer1")
    var dateFertilizer1: String? = null

    @JsonProperty("sweetPotatoReplanting")
    var sweetPotatoReplanting: String? = null

    @JsonProperty("sweetPotatoReplantingDetails/sweetPotatoReplantingDate")
    var sweetPotatoReplantingDetailsSweetPotatoReplantingDate: String? = null

    @JsonProperty("sweetPotatoReplantingDetails/sweetPotatoReplantingType")
    var sweetPotatoReplantingDetailsSweetPotatoReplantingType: String? = null

    @JsonProperty("nrRows")
    var nrRows: Int? = null

    @JsonProperty("nrWeeding")
    var nrWeeding: Int? = null

    @JsonProperty("cassavaGapping")
    var cassavaGapping: String? = null

    @JsonProperty("weedingDetails/dateWeeding1")
    var weedingDetailsDateWeeding1: String? = null

    @JsonProperty("weedingDetails/weedingMethod1")
    var weedingDetailsWeedingMethod1: String? = null

    @JsonProperty("sweetPotatoVigor_SP/scoreCover_SP")
    var sweetPotatoVigorSPScoreCoverSP: String? = null

    @JsonProperty("sweetPotatoVigor_SP/scoreVigour_SP")
    var sweetPotatoVigorSPScoreVigourSP: String? = null

    @JsonProperty("cassavaPlantStand/nrCassavaPlants_CS")
    var cassavaPlantStandNrCassavaPlantsCS: Int? = null

    @JsonProperty("sweetPotatoVigor_CSSP/scoreCover_CSSP")
    var sweetPotatoVigorCSSPScoreCoverCSSP: String? = null

    @JsonProperty("cassavaPlantStand/nrCassavaPlants_CSSP")
    var cassavaPlantStandNrCassavaPlantsCSSP: Int? = null

    @JsonProperty("sweetPotatoVigor_CSSP/scoreVigour_CSSP")
    var sweetPotatoVigorCSSPScoreVigourCSSP: String? = null

    @JsonProperty("cassavaPlantStand/nrCassavaPlants_CSSPF")
    var cassavaPlantStandNrCassavaPlantsCSSPF: Int? = null

    @JsonProperty("sweetPotatoVigor_CSSPF/scoreCover_CSSPF")
    var sweetPotatoVigorCSSPFScoreCoverCSSPF: String? = null

    @JsonProperty("cassavaGappingDetails/cassavaGappingDate")
    var cassavaGappingDetailsCassavaGappingDate: String? = null

    @JsonProperty("cassavaGappingDetails/cassavaGappingType")
    var cassavaGappingDetailsCassavaGappingType: String? = null

    @JsonProperty("sweetPotatoVigor_CSSPF/scoreVigour_CSSPF")
    var sweetPotatoVigorCSSPFScoreVigourCSSPF: String? = null

    @JsonProperty("sweetPotatoPlantStand_SP/nrSweetPotatoPlants1_SP")
    var sweetPotatoPlantStandSPNrSweetPotatoPlants1SP: Int? = null

    @JsonProperty("sweetPotatoPlantStand_SP/nrSweetPotatoPlants2_SP")
    var sweetPotatoPlantStandSPNrSweetPotatoPlants2SP: Int? = null

    @JsonProperty("sweetPotatoPlantStand_SP/nrSweetPotatoPlants3_SP")
    var sweetPotatoPlantStandSPNrSweetPotatoPlants3SP: Int? = null

    @JsonProperty("sweetPotatoPlantStand_SP/nrSweetPotatoPlants4_SP")
    var sweetPotatoPlantStandSPNrSweetPotatoPlants4SP: Int? = null

    @JsonProperty("sweetPotatoPlantStand_SP/nrSweetPotatoPlants5_SP")
    var sweetPotatoPlantStandSPNrSweetPotatoPlants5SP: Int? = null

    @JsonProperty("sweetPotatoPlantStand_SP/nrSweetPotatoPlants6_SP")
    var sweetPotatoPlantStandSPNrSweetPotatoPlants6SP: Int? = null

    @JsonProperty("sweetPotatoPlantStand_SP/nrSweetPotatoPlants7_SP")
    var sweetPotatoPlantStandSPNrSweetPotatoPlants7SP: Int? = null

    @JsonProperty("sweetPotatoPlantStand_CSSP/nrSweetPotatoPlants1_CSSP")
    var sweetPotatoPlantStandCSSPNrSweetPotatoPlants1CSSP: Int? = null

    @JsonProperty("sweetPotatoPlantStand_CSSP/nrSweetPotatoPlants2_CSSP")
    var sweetPotatoPlantStandCSSPNrSweetPotatoPlants2CSSP: Int? = null

    @JsonProperty("sweetPotatoPlantStand_CSSP/nrSweetPotatoPlants3_CSSP")
    var sweetPotatoPlantStandCSSPNrSweetPotatoPlants3CSSP: Int? = null

    @JsonProperty("sweetPotatoPlantStand_CSSP/nrSweetPotatoPlants4_CSSP")
    var sweetPotatoPlantStandCSSPNrSweetPotatoPlants4CSSP: Int? = null

    @JsonProperty("sweetPotatoPlantStand_CSSP/nrSweetPotatoPlants5_CSSP")
    var sweetPotatoPlantStandCSSPNrSweetPotatoPlants5CSSP: Int? = null

    @JsonProperty("sweetPotatoPlantStand_CSSP/nrSweetPotatoPlants6_CSSP")
    var sweetPotatoPlantStandCSSPNrSweetPotatoPlants6CSSP: Int? = null

    @JsonProperty("sweetPotatoPlantStand_CSSP/nrSweetPotatoPlants7_CSSP")
    var sweetPotatoPlantStandCSSPNrSweetPotatoPlants7CSSP: Int? = null

    @JsonProperty("sweetPotatoPlantStand_CSSPF/nrSweetPotatoPlants1_CSSPF")
    var sweetPotatoPlantStandCSSPFNrSweetPotatoPlants1CSSPF: Int? = null

    @JsonProperty("sweetPotatoPlantStand_CSSPF/nrSweetPotatoPlants2_CSSPF")
    var sweetPotatoPlantStandCSSPFNrSweetPotatoPlants2CSSPF: Int? = null

    @JsonProperty("sweetPotatoPlantStand_CSSPF/nrSweetPotatoPlants3_CSSPF")
    var sweetPotatoPlantStandCSSPFNrSweetPotatoPlants3CSSPF: Int? = null

    @JsonProperty("sweetPotatoPlantStand_CSSPF/nrSweetPotatoPlants4_CSSPF")
    var sweetPotatoPlantStandCSSPFNrSweetPotatoPlants4CSSPF: Int? = null

    @JsonProperty("sweetPotatoPlantStand_CSSPF/nrSweetPotatoPlants5_CSSPF")
    var sweetPotatoPlantStandCSSPFNrSweetPotatoPlants5CSSPF: Int? = null

    @JsonProperty("sweetPotatoPlantStand_CSSPF/nrSweetPotatoPlants6_CSSPF")
    var sweetPotatoPlantStandCSSPFNrSweetPotatoPlants6CSSPF: Int? = null

    @JsonProperty("sweetPotatoPlantStand_CSSPF/nrSweetPotatoPlants7_CSSPF")
    var sweetPotatoPlantStandCSSPFNrSweetPotatoPlants7CSSPF: Int? = null

    @JsonProperty("weedingDetails/dateWeeding2")
    var weedingDetailsDateWeeding2: String? = null

    @JsonProperty("weedingDetails/weedingMethod2")
    var weedingDetailsWeedingMethod2: String? = null

    @JsonProperty("trialRating/rateCMD")
    var trialRatingRateCMD: String? = null

    @JsonProperty("trialRating/rateCBSD")
    var trialRatingRateCBSD: String? = null

    @JsonProperty("trialRating/rateFire")
    var trialRatingRateFire: String? = null

    @JsonProperty("trialRating/rateWeeds")
    var trialRatingRateWeeds: String? = null

    @JsonProperty("trialRating/rateDrought")
    var trialRatingRateDrought: String? = null

    @JsonProperty("trialRating/rateGrazing")
    var trialRatingRateGrazing: String? = null

    @JsonProperty("trialRating/rateLodging")
    var trialRatingRateLodging: String? = null

    @JsonProperty("trialRating/rateOtherDisease")
    var trialRatingRateOtherDisease: String? = null

    @JsonProperty("trialRating/ratePestsCassava")
    var trialRatingRatePestsCassava: String? = null

    @JsonProperty("trialRating/rateWaterLogging")
    var trialRatingRateWaterLogging: String? = null

    @JsonProperty("trialRating/ratePestsSweetPotato")
    var trialRatingRatePestsSweetPotato: String? = null

    @JsonProperty("trialRating/rateDiseaseSweetPotato")
    var trialRatingRateDiseaseSweetPotato: String? = null

    @JsonProperty("trialRating/rateTheftMissingCassava")
    var trialRatingRateTheftMissingCassava: String? = null

    @JsonProperty("trialRating/rateTheftMissingSweetPotato")
    var trialRatingRateTheftMissingSweetPotato: String? = null

    @JsonProperty("tuberUnit")
    var tuberUnit: String? = null

    @JsonProperty("tuberPrice")
    var tuberPrice: String? = null

    @JsonProperty("prefPlot_SP")
    var prefPlotSP: String? = null

    @JsonProperty("tuberUnitName")
    var tuberUnitName: String? = null

    @JsonProperty("overallScore_SP")
    var overallScoreSP: String? = null

    @JsonProperty("dateSweetPotatoHarvest")
    var dateSweetPotatoHarvest: String? = null

    @JsonProperty("tuberUnitDetails/tuberUnitPrice")
    var tuberUnitDetailsTuberUnitPrice: Int? = null

    @JsonProperty("farmerEvaluation_SP/costScore_SP")
    var farmerEvaluationSPCostScoreSP: String? = null

    @JsonProperty("tuberUnitDetails/tuberUnitWeight")
    var tuberUnitDetailsTuberUnitWeight: Double? = null

    @JsonProperty("farmerEvaluation_SP/yieldScore_SP")
    var farmerEvaluationSPYieldScoreSP: String? = null

    @JsonProperty("farmerEvaluation_SP/labourScore_SP")
    var farmerEvaluationSPLabourScoreSP: String? = null

    @JsonProperty("farmerEvaluation_SP/qualityScore_SP")
    var farmerEvaluationSPQualityScoreSP: String? = null

    @JsonProperty("farmerEvaluation_SP/revenueScore_SP")
    var farmerEvaluationSPRevenueScoreSP: String? = null

    @JsonProperty("sweetPotatoHarvest_SP/largeTubersFW_SP")
    var sweetPotatoHarvestSPLargeTubersFWSP: Double? = null

    @JsonProperty("sweetPotatoHarvest_SP/largeTubersNr_SP")
    var sweetPotatoHarvestSPLargeTubersNrSP: Int? = null

    @JsonProperty("sweetPotatoHarvest_SP/smallTubersFW_SP")
    var sweetPotatoHarvestSPSmallTubersFWSP: Double? = null

    @JsonProperty("sweetPotatoHarvest_SP/smallTubersNr_SP")
    var sweetPotatoHarvestSPSmallTubersNrSP: Int? = null

    @JsonProperty("sweetPotatoHarvest_CSSP/largeTubersFW_CSSP")
    var sweetPotatoHarvestCSSPLargeTubersFWCSSP: Double? = null

    @JsonProperty("sweetPotatoHarvest_CSSP/largeTubersNr_CSSP")
    var sweetPotatoHarvestCSSPLargeTubersNrCSSP: Int? = null

    @JsonProperty("sweetPotatoHarvest_CSSP/smallTubersFW_CSSP")
    var sweetPotatoHarvestCSSPSmallTubersFWCSSP: Double? = null

    @JsonProperty("sweetPotatoHarvest_CSSP/smallTubersNr_CSSP")
    var sweetPotatoHarvestCSSPSmallTubersNrCSSP: Int? = null

    @JsonProperty("sweetPotatoHarvest_CSSPF/largeTubersFW_CSSPF")
    var sweetPotatoHarvestCSSPFLargeTubersFWCSSPF: Double? = null

    @JsonProperty("sweetPotatoHarvest_CSSPF/largeTubersNr_CSSPF")
    var sweetPotatoHarvestCSSPFLargeTubersNrCSSPF: Int? = null

    @JsonProperty("sweetPotatoHarvest_CSSPF/smallTubersFW_CSSPF")
    var sweetPotatoHarvestCSSPFSmallTubersFWCSSPF: Double? = null

    @JsonProperty("sweetPotatoHarvest_CSSPF/smallTubersNr_CSSPF")
    var sweetPotatoHarvestCSSPFSmallTubersNrCSSPF: Int? = null

    @JsonProperty("tuberPriceSI")
    var tuberPriceSI: Int? = null

    @JsonProperty("weedingDetails/dateWeeding3")
    var weedingDetailsDateWeeding3: String? = null

    @JsonProperty("weedingDetails/weedingMethod3")
    var weedingDetailsWeedingMethod3: String? = null

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
    var farmerEvaluationCostScore: String? = null

    @JsonProperty("farmerEvaluation/yieldScore")
    var farmerEvaluationYieldScore: String? = null

    @JsonProperty("farmerEvaluation/labourScore")
    var farmerEvaluationLabourScore: String? = null

    @JsonProperty("farmerEvaluation/qualityScore")
    var farmerEvaluationQualityScore: String? = null

    @JsonProperty("farmerEvaluation/revenueScore")
    var farmerEvaluationRevenueScore: String? = null

    @JsonProperty("rootsUnitDetails/rootsUnitPrice")
    var rootsUnitDetailsRootsUnitPrice: Int? = null

    @JsonProperty("rootsUnitDetails/rootsUnitWeight")
    var rootsUnitDetailsRootsUnitWeight: Double? = null

    @JsonProperty("cassavaHarvest_CS/tuberizedMarketableRootsFW_CS")
    var cassavaHarvestCSTuberizedMarketableRootsFWCS: Double? = null

    @JsonProperty("cassavaHarvest_CS/tuberizedMarketableRootsNr_CS")
    var cassavaHarvestCSTuberizedMarketableRootsNrCS: Int? = null

    @JsonProperty("cassavaHarvest_CSSP/tuberizedMarketableRootsFW_CSSP")
    var cassavaHarvestCSSPTuberizedMarketableRootsFWCSSP: Double? = null

    @JsonProperty("cassavaHarvest_CSSP/tuberizedMarketableRootsNr_CSSP")
    var cassavaHarvestCSSPTuberizedMarketableRootsNrCSSP: Int? = null

    @JsonProperty("cassavaHarvest_CSSPF/tuberizedMarketableRootsFW_CSSPF")
    var cassavaHarvestCSSPFTuberizedMarketableRootsFWCSSPF: Double? = null

    @JsonProperty("cassavaHarvest_CSSPF/tuberizedMarketableRootsNr_CSSPF")
    var cassavaHarvestCSSPFTuberizedMarketableRootsNrCSSPF: Int? = null

    @JsonProperty("weedingDetails/dateWeeding4")
    var weedingDetailsDateWeeding4: String? = null

    @JsonProperty("weedingDetails/weedingMethod4")
    var weedingDetailsWeedingMethod4: String? = null

    @JsonProperty("rootsPriceSI")
    var rootsPriceSI: Int? = null
}