package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.tsobu.ona.forms.Attachment

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class PpTzForm {
    @JsonProperty("_id")
    var id = 0

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("zone")
    var zoneValue: String? = null

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
    var edited = false

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("comment")
    var comment: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("gapping")
    var gapping: String? = null

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
    var duration = 0.0

    @JsonProperty("_xform_id")
    var xformId = 0

    @JsonProperty("loc_field")
    var locField: String? = null

    @JsonProperty("nrWeeding")
    var nrWeeding: String? = null

    @JsonProperty("simserial")
    var simSerial: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Attachment>? = null

    @JsonProperty("_geolocation")
    var geolocation: List<Double>? = null

    @JsonProperty("_media_count")
    var mediaCount = 0

    @JsonProperty("_total_media")
    var totalMedia = 0

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("subscriberid")
    var subscriberId: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("purpose/event")
    var eventValue: String? = null

    @JsonProperty("purpose/redPlot")
    var redPlot: String? = null

    @JsonProperty("meta/instanceID")
    var metaInstanceId: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("controlTreatment")
    var controlTreatment: String? = null

    @JsonProperty("weedAssessment_P1")
    var weedAssessmentP1: List<WeedAssessmentP1>? = null

    @JsonProperty("weedAssessment_P2")
    var weedAssessmentP2: List<WeedAssessmentP2>? = null

    @JsonProperty("weedAssessment_P3")
    var weedAssessmentP3: List<WeedAssessmentP3>? = null

    @JsonProperty("weedAssessment_P4")
    var weedAssessmentP4: List<WeedAssessmentP4>? = null

    @JsonProperty("weedAssessment_P5")
    var weedAssessmentP5: List<WeedAssessmentP5>? = null

    @JsonProperty("weedAssessment_P6")
    var weedAssessmentP6: List<WeedAssessmentP6>? = null


    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("inputs2/orgInputs2")
    var inputs2OrgInputs2: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived = false

    @JsonProperty("inputs2/fertilizer2")
    var inputs2Fertilizer2: String? = null

    @JsonProperty("trialRating/rateCMD")
    var trialRatingRateCMD: String? = null

    @JsonProperty("trialRating/rateCBSD")
    var trialRatingRateCBSD: String? = null

    @JsonProperty("trialRating/rateFire")
    var trialRatingRateFire: String? = null

    @JsonProperty("trialRating/ratePests")
    var trialRatingRatePests: String? = null

    @JsonProperty("trialRating/rateWeeds")
    var trialRatingRateWeeds: String? = null

    @JsonProperty("plantStand/nrPlants_P1")
    var plantStandNrPlantsP1 = 0

    @JsonProperty("plantStand/nrPlants_P2")
    var plantStandNrPlantsP2 = 0

    @JsonProperty("plantStand/nrPlants_P3")
    var plantStandNrPlantsP3 = 0

    @JsonProperty("plantStand/nrPlants_P4")
    var plantStandNrPlantsP4 = 0

    @JsonProperty("trialRating/rateDrought")
    var trialRatingRateDrought: String? = null

    @JsonProperty("trialRating/rateGrazing")
    var trialRatingRateGrazing: String? = null

    @JsonProperty("trialRating/rateLodging")
    var trialRatingRateLodging: String? = null

    @JsonProperty("weedAssessment_P1_count")
    var weedAssessmentP1Count: String? = null

    @JsonProperty("weedAssessment_P2_count")
    var weedAssessmentP2Count: String? = null

    @JsonProperty("weedAssessment_P3_count")
    var weedAssessmentP3Count: String? = null

    @JsonProperty("weedAssessment_P4_count")
    var weedAssessmentP4Count: String? = null

    @JsonProperty("weedAssessment_P5_count")
    var weedAssessmentP5Count: String? = null

    @JsonProperty("weedAssessment_P6_count")
    var weedAssessmentP6Count: String? = null

    @JsonProperty("gappingDetails/gappingDate")
    var gappingDetailsGappingDate: String? = null

    @JsonProperty("gappingDetails/gappingType")
    var gappingDetailsGappingType: String? = null

    @JsonProperty("trialRating/rateOtherDisease")
    var trialRatingRateOtherDisease: String? = null

    @JsonProperty("trialRating/rateTheftMissing")
    var trialRatingRateTheftMissing: String? = null

    @JsonProperty("trialRating/rateWaterLogging")
    var trialRatingRateWaterLogging: String? = null

    @JsonProperty("harvest/harvestDate")
    var harvestDate: String? = null

    /*---- missing fields --**/
    @JsonProperty("inputs1/orgInputs1")
    var inputs1OrgInputs1: String? = null

    @JsonProperty("inputs1/fertilizer1")
    var inputs1Fertilizer1: String? = null

    @JsonProperty("plantingDetails/variety")
    var plantingDetailsVariety: String? = null

    @JsonProperty("landPreparation/clearing")
    var landPreparationClearing: String? = null

    @JsonProperty("weedAssessment_ALT_count")
    var weedAssessmentALTCount: String? = null

    @JsonProperty("weedAssessment_CON_count")
    var weedAssessmentCONCount: String? = null

    @JsonProperty("weedAssessment_REC_count")
    var weedAssessmentRECCount: String? = null

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

    @JsonProperty("landPreparation/vegetation")
    var landPreparationVegetation: String? = null

    @JsonProperty("plantingDetails/plantingDate")
    var plantingDate: String? = null

    @JsonProperty("landPreparation_CON/ridging_CON")
    var landPreparationCONRidgingCON: String? = null

    @JsonProperty("landPreparation_REC/ridging_REC")
    var landPreparationRECRidgingREC: String? = null

    @JsonProperty("landPreparation_CON/nrHarrow_CON")
    var landPreparationCONNrHarrowCON: String? = null

    @JsonProperty("landPreparation_REC/nrHarrow_REC")
    var landPreparationRECNrHarrowREC: String? = null

    @JsonProperty("landPreparation_CON/nrTillage_CON")
    var landPreparationCONNrTillageCON: String? = null

    @JsonProperty("landPreparation_REC/nrTillage_REC")
    var landPreparationRECNrTillageREC: String? = null

    @JsonProperty("landPrepationDetails_CON/tillageMethod1_CON")
    var landPrepationDetailsCONTillageMethod1CON: String? = null

    @JsonProperty("landPrepationDetails_REC/tillageMethod1_REC")
    var tillageMethod1Rec: String? = null


    @JsonProperty("plotLayout_ALT/plotL1_ALT")
    var plotLayoutALTPlotL1ALT: Float? = null

    @JsonProperty("plotLayout_ALT/plotL2_ALT")
    var plotLayoutALTPlotL2ALT: Float? = null

    @JsonProperty("plotLayout_ALT/plotW1_ALT")
    var plotLayoutALTPlotW1ALT: Float? = null

    @JsonProperty("plotLayout_ALT/plotW2_ALT")
    var plotLayoutALTPlotW2ALT: Float? = null


    @JsonProperty("landPreparation_ALT/ridging_ALT")
    var ridgingAlt: String? = null


    @JsonProperty("landPreparation_ALT/nrHarrow_ALT")
    var landPreparationALTNrHarrowALT: String? = null

    @JsonProperty("landPreparation_ALT/nrTillage_ALT")
    var landPreparationALTNrTillageALT: String? = null


    @JsonProperty("landPrepationDetails_ALT/ridgingMethod_ALT")
    var landPrepationDetailsALTRidgingMethodALT: String? = null

    @JsonProperty("landPrepationDetails_ALT/tillageMethod1_ALT")
    var landPrepationDetailsALTTillageMethod1ALT: String? = null

    @JsonProperty("landPrepationDetails_REC/tillageMethod2_REC")
    var tillageMethod2Rec: String? = null

    @JsonProperty("plantStand/nrPlants_CON")
    var plantStandNrPlantsCON: String? = null

    @JsonProperty("plantStand/nrPlants_REC")
    var plantStandNrPlantsREC: String? = null


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

    @JsonProperty("weedAssessment_ALT_BPP3_count")
    var weedAssessmentALTBPP3Count: String? = null

    @JsonProperty("weedAssessment_CON_BPP3_count")
    var weedAssessmentCONBPP3Count: String? = null

    @JsonProperty("weedAssessment_REC_BPP3_count")
    var weedAssessmentRECBPP3Count: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_CON")
    var harvestTuberizedMarketableRootsFWCON: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_REC")
    var tuberizedMarketableRootsFwRec: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_CON")
    var tuberizedMarketableRootsNrCon: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_REC")
    var tuberizedMarketableRootsNrRec: String? = null

    @JsonProperty("weedingDetails/weedingMethod1")
    var weedingDetailsWeedingMethod1: String? = null

    @JsonProperty("weedingDetails/weedingMethod2")
    var weedingDetailsWeedingMethod2: String? = null

    @JsonProperty("weedingDetails/weedingMethod3")
    var weedingDetailsWeedingMethod3: String? = null

    @JsonProperty("weedingDetails/weedingMethod4")
    var weedingDetailsWeedingMethod4: String? = null

    @JsonProperty("herbicideDetails/herbicideActor")
    var herbicideDetailsHerbicideActor: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_ALT")
    var tuberizedMarketableRootsFwAlt: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_ALT")
    var tuberizedMarketableRootsNrAlt: String? = null

    @JsonProperty("herbicideDetails/herbicideActorTrained")
    var herbicideActorTrained: String? = null


    @JsonProperty("harvest/tuberizedMarketableRootsFW_ALT_BPP3")
    var tuberizedMarketableRootsFwAltBpp3: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_CON_BPP3")
    var tuberizedMarketableRootsFwConBpp3: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_REC_BPP3")
    var tuberizedMarketableRootsFwRecBpp3: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_ALT_BPP3")
    var tuberizedMarketableRootsNrAltBpp3: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_CON_BPP3")
    var tuberizedMarketableRootsNrConBPpp: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_REC_BPP3")
    var tuberizedMarketableRootsNrRecBpp3: String? = null
}