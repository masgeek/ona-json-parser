package com.tsobu.ona.core.dto.forms.datvalpp

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty




@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class ValPpForm {
    @JsonProperty("_id")
    var id: Int? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("EAID")
    var eAID: String? = null

    @JsonProperty("HHID")
    var hHID: String? = null

    @JsonProperty("_tags")
    var tags: List<Any>? = null

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("_notes")
    var notes: List<Any>? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

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
    var duration: Float? = null

    @JsonProperty("_xform_id")
    var xformId: Int? = null

    @JsonProperty("loc_field")
    var locField: String? = null

    @JsonProperty("nrWeeding")
    var nrWeeding: Int? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("priceRoots")
    var priceRoots: Int? = null

    @JsonProperty("_attachments")
    var attachments: List<Any>? = null

    @JsonProperty("_geolocation")
    var geolocation: List<Float>? = null

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("overallScore")
    var overallScore: String? = null

    @JsonProperty("purpose/BPP3")
    var purposeBPP3: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("purpose/event")
    var purposeEvent: String? = null

    @JsonProperty("meta/instanceID")
    var metaInstanceID: String? = null

    @JsonProperty("purpose/redPlot")
    var purposeRedPlot: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("harvest/harvestDate")
    var harvestHarvestDate: String? = null

    @JsonProperty("trialRating/rateCMD")
    var trialRatingRateCMD: String? = null

    @JsonProperty("trialRating/rateFire")
    var trialRatingRateFire: String? = null

    @JsonProperty("trialRating/ratePests")
    var trialRatingRatePests: String? = null

    @JsonProperty("trialRating/rateWeeds")
    var trialRatingRateWeeds: String? = null

    @JsonProperty("plantStand/nrPlants_ALT")
    var plantStandNrPlantsALT: Int? = null

    @JsonProperty("plantStand/nrPlants_CON")
    var plantStandNrPlantsCON: Int? = null

    @JsonProperty("plantStand/nrPlants_REC")
    var plantStandNrPlantsREC: Int? = null

    @JsonProperty("trialRating/rateDrought")
    var trialRatingRateDrought: String? = null

    @JsonProperty("trialRating/rateGrazing")
    var trialRatingRateGrazing: String? = null

    @JsonProperty("trialRating/rateLodging")
    var trialRatingRateLodging: String? = null

    @JsonProperty("weedAssessment_ALT_count")
    var weedAssessmentALTCount: String? = null

    @JsonProperty("weedAssessment_CON_count")
    var weedAssessmentCONCount: String? = null

    @JsonProperty("weedAssessment_REC_count")
    var weedAssessmentRECCount: String? = null

    @JsonProperty("plotLayout_ALT/plotL1_ALT")
    var plotLayoutALTPlotL1ALT: Float? = null

    @JsonProperty("plotLayout_ALT/plotL2_ALT")
    var plotLayoutALTPlotL2ALT: Float? = null

    @JsonProperty("plotLayout_ALT/plotW1_ALT")
    var plotLayoutALTPlotW1ALT: Float? = null

    @JsonProperty("plotLayout_ALT/plotW2_ALT")
    var plotLayoutALTPlotW2ALT: Float? = null

    @JsonProperty("plotLayout_CON/plotL1_CON")
    var plotLayoutCONPlotL1CON: Float? = null

    @JsonProperty("plotLayout_CON/plotL2_CON")
    var plotLayoutCONPlotL2CON: Float? = null

    @JsonProperty("plotLayout_CON/plotW1_CON")
    var plotLayoutCONPlotW1CON: Float? = null

    @JsonProperty("plotLayout_CON/plotW2_CON")
    var plotLayoutCONPlotW2CON: Float? = null

    @JsonProperty("plotLayout_REC/plotL1_REC")
    var plotLayoutRECPlotL1REC: Float? = null

    @JsonProperty("plotLayout_REC/plotL2_REC")
    var plotLayoutRECPlotL2REC: Float? = null

    @JsonProperty("plotLayout_REC/plotW1_REC")
    var plotLayoutRECPlotW1REC: Float? = null

    @JsonProperty("plotLayout_REC/plotW2_REC")
    var plotLayoutRECPlotW2REC: Float? = null

    @JsonProperty("farmerEvaluation/costScore")
    var farmerEvaluationCostScore: String? = null

    @JsonProperty("farmerEvaluation/yieldScore")
    var farmerEvaluationYieldScore: String? = null

    @JsonProperty("herbicideDetails/herbicides")
    var herbicideDetailsHerbicides: String? = null

    @JsonProperty("weedingDetails/dateWeeding1")
    var weedingDetailsDateWeeding1: String? = null

    @JsonProperty("weedingDetails/dateWeeding2")
    var weedingDetailsDateWeeding2: String? = null

    @JsonProperty("weedingDetails/dateWeeding3")
    var weedingDetailsDateWeeding3: String? = null

    @JsonProperty("farmerEvaluation/labourScore")
    var farmerEvaluationLabourScore: String? = null

    @JsonProperty("plantStand/nrPlants_ALT_BPP3")
    var plantStandNrPlantsALTBPP3: Int? = null

    @JsonProperty("plantStand/nrPlants_CON_BPP3")
    var plantStandNrPlantsCONBPP3: Int? = null

    @JsonProperty("plantStand/nrPlants_REC_BPP3")
    var plantStandNrPlantsRECBPP3: Int? = null

    @JsonProperty("trialRating/rateOtherDisease")
    var trialRatingRateOtherDisease: String? = null

    @JsonProperty("trialRating/rateTheftMissing")
    var trialRatingRateTheftMissing: String? = null

    @JsonProperty("trialRating/rateWaterLogging")
    var trialRatingRateWaterLogging: String? = null

    @JsonProperty("farmerEvaluation/qualityScore")
    var farmerEvaluationQualityScore: String? = null

    @JsonProperty("farmerEvaluation/revenueScore")
    var farmerEvaluationRevenueScore: String? = null

    @JsonProperty("weedAssessment_ALT_BPP3_count")
    var weedAssessmentALTBPP3Count: String? = null

    @JsonProperty("weedAssessment_CON_BPP3_count")
    var weedAssessmentCONBPP3Count: String? = null

    @JsonProperty("weedAssessment_REC_BPP3_count")
    var weedAssessmentRECBPP3Count: String? = null

    @JsonProperty("weedingDetails/weedingMethod1")
    var weedingDetailsWeedingMethod1: String? = null

    @JsonProperty("weedingDetails/weedingMethod2")
    var weedingDetailsWeedingMethod2: String? = null

    @JsonProperty("weedingDetails/weedingMethod3")
    var weedingDetailsWeedingMethod3: String? = null

    @JsonProperty("herbicideDetails/herbicideActor")
    var herbicideDetailsHerbicideActor: String? = null

    @JsonProperty("plotLayout_ALT_BPP3/plotL1_ALT_BPP3")
    var plotLayoutALTBPP3PlotL1ALTBPP3: Float? = null

    @JsonProperty("plotLayout_ALT_BPP3/plotL2_ALT_BPP3")
    var plotLayoutALTBPP3PlotL2ALTBPP3: Float? = null

    @JsonProperty("plotLayout_ALT_BPP3/plotW1_ALT_BPP3")
    var plotLayoutALTBPP3PlotW1ALTBPP3: Float? = null

    @JsonProperty("plotLayout_ALT_BPP3/plotW2_ALT_BPP3")
    var plotLayoutALTBPP3PlotW2ALTBPP3: Float? = null

    @JsonProperty("plotLayout_CON_BPP3/plotL1_CON_BPP3")
    var plotLayoutCONBPP3PlotL1CONBPP3: Float? = null

    @JsonProperty("plotLayout_CON_BPP3/plotL2_CON_BPP3")
    var plotLayoutCONBPP3PlotL2CONBPP3: Float? = null

    @JsonProperty("plotLayout_CON_BPP3/plotW1_CON_BPP3")
    var plotLayoutCONBPP3PlotW1CONBPP3: Float? = null

    @JsonProperty("plotLayout_CON_BPP3/plotW2_CON_BPP3")
    var plotLayoutCONBPP3PlotW2CONBPP3: Float? = null

    @JsonProperty("plotLayout_REC_BPP3/plotL1_REC_BPP3")
    var plotLayoutRECBPP3PlotL1RECBPP3: Float? = null

    @JsonProperty("plotLayout_REC_BPP3/plotL2_REC_BPP3")
    var plotLayoutRECBPP3PlotL2RECBPP3: Float? = null

    @JsonProperty("plotLayout_REC_BPP3/plotW1_REC_BPP3")
    var plotLayoutRECBPP3PlotW1RECBPP3: Float? = null

    @JsonProperty("plotLayout_REC_BPP3/plotW2_REC_BPP3")
    var plotLayoutRECBPP3PlotW2RECBPP3: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_ALT")
    var harvestTuberizedMarketableRootsFWALT: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_CON")
    var harvestTuberizedMarketableRootsFWCON: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_REC")
    var harvestTuberizedMarketableRootsFWREC: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_ALT")
    var harvestTuberizedMarketableRootsNrALT: Int? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_CON")
    var harvestTuberizedMarketableRootsNrCON: Int? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_REC")
    var harvestTuberizedMarketableRootsNrREC: Int? = null

    @JsonProperty("herbicideDetails/herbicideActorTrained")
    var herbicideDetailsHerbicideActorTrained: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_ALT_BPP3")
    var harvestTuberizedMarketableRootsFWALTBPP3: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_CON_BPP3")
    var harvestTuberizedMarketableRootsFWCONBPP3: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_REC_BPP3")
    var harvestTuberizedMarketableRootsFWRECBPP3: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_ALT_BPP3")
    var harvestTuberizedMarketableRootsNrALTBPP3: Int? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_CON_BPP3")
    var harvestTuberizedMarketableRootsNrCONBPP3: Int? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_REC_BPP3")
    var harvestTuberizedMarketableRootsNrRECBPP3: Int? = null

}