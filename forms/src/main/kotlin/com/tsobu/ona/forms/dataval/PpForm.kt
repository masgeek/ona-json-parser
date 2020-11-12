package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class PpForm {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

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

    @JsonProperty("comment")
    var comment: String? = null

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
    var xformId: String? = null

    @JsonProperty("loc_field")
    var locField: String? = null

    @JsonProperty("nrWeeding")
    var nrWeeding: String? = null

    @JsonProperty("simserial")
    var simSerial: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("priceRoots")
    var priceRoots: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any>? = null

    @JsonProperty("_geolocation")
    var geolocation: List<Float>? = null

    @JsonProperty("_media_count")
    var mediaCount: String? = null

    @JsonProperty("_total_media")
    var totalMedia: String? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("overallScore")
    var overallScore: String? = null

    @JsonProperty("purpose/BPP3")
    var purposeBpp3: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("purpose/event")
    var eventValue: String? = null

    @JsonProperty("meta/instanceID")
    var metaInstanceId: String? = null

    @JsonProperty("purpose/redPlot")
    var redPlot: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("harvest/harvestDate")
    var harvestDate: String? = null

    @JsonProperty("trialRating/rateCMD")
    var rateCMD: String? = null

    @JsonProperty("trialRating/rateFire")
    var rateFire: String? = null

    @JsonProperty("trialRating/ratePests")
    var ratePests: String? = null

    @JsonProperty("trialRating/rateWeeds")
    var rateWeeds: String? = null

    @JsonProperty("plantStand/nrPlants_ALT")
    var nrPlantsAlt: String? = null

    @JsonProperty("plantStand/nrPlants_CON")
    var nrPlantsCon: String? = null

    @JsonProperty("plantStand/nrPlants_REC")
    var nrPlantsRec: String? = null

    @JsonProperty("trialRating/rateDrought")
    var rateDrought: String? = null

    @JsonProperty("trialRating/rateGrazing")
    var rateGrazing: String? = null

    @JsonProperty("trialRating/rateLodging")
    var rateLodging: String? = null

    @JsonProperty("weedAssessment_ALT_count")
    var weedAssessmentAltCount: String? = null

    @JsonProperty("weedAssessment_CON_count")
    var weedAssessmentConCount: String? = null

    @JsonProperty("weedAssessment_REC_count")
    var weedAssessmentRecCount: String? = null

    @JsonProperty("farmerEvaluation/costScore")
    var costScore: String? = null

    @JsonProperty("farmerEvaluation/yieldScore")
    var yieldScore: String? = null

    @JsonProperty("herbicideDetails/herbicides")
    var herbicides: String? = null

    @JsonProperty("weedingDetails/dateWeeding1")
    var dateWeeding1: String? = null

    @JsonProperty("weedingDetails/dateWeeding2")
    var dateWeeding2: String? = null

    @JsonProperty("weedingDetails/dateWeeding3")
    var dateWeeding3: String? = null

    @JsonProperty("farmerEvaluation/labourScore")
    var farmerEvaluationLabourScore: String? = null

    @JsonProperty("plantStand/nrPlants_ALT_BPP3")
    var nrPlantsAltBpp3: String? = null

    @JsonProperty("plantStand/nrPlants_CON_BPP3")
    var nrPlantsConBpp3: String? = null

    @JsonProperty("plantStand/nrPlants_REC_BPP3")
    var nrPlantsRecBpp3: String? = null

    @JsonProperty("trialRating/rateOtherDisease")
    var rateOtherDisease: String? = null

    @JsonProperty("trialRating/rateTheftMissing")
    var rateTheftMissing: String? = null

    @JsonProperty("trialRating/rateWaterLogging")
    var rateWaterLogging: String? = null

    @JsonProperty("farmerEvaluation/qualityScore")
    var qualityScore: String? = null

    @JsonProperty("farmerEvaluation/revenueScore")
    var revenueScore: String? = null

    @JsonProperty("weedAssessment_ALT_BPP3_count")
    var weedAssessmentAltBpp3Count: String? = null

    @JsonProperty("weedAssessment_CON_BPP3_count")
    var weedAssessmentConBpp3Count: String? = null

    @JsonProperty("weedAssessment_REC_BPP3_count")
    var weedAssessmentRecBpp3Count: String? = null

    @JsonProperty("weedingDetails/weedingMethod1")
    var weedingMethod1: String? = null

    @JsonProperty("weedingDetails/weedingMethod2")
    var weedingMethod2: String? = null

    @JsonProperty("weedingDetails/weedingMethod3")
    var weedingMethod3: String? = null

    @JsonProperty("herbicideDetails/herbicideActor")
    var herbicideActor: String? = null


    @JsonProperty("plotLayout_ALT_BPP3/plotL1_ALT_BPP3")
    var plotL1AltBpp3: Float? = null

    @JsonProperty("plotLayout_ALT_BPP3/plotL2_ALT_BPP3")
    var plotL2AltBpp3: Float? = null

    @JsonProperty("plotLayout_ALT_BPP3/plotW1_ALT_BPP3")
    var plotW1AltBpp3: Float? = null

    @JsonProperty("plotLayout_ALT_BPP3/plotW2_ALT_BPP3")
    var plotW2AltBpp3: Float? = null

    @JsonProperty("plotLayout_CON_BPP3/plotL1_CON_BPP3")
    var plotL1ConBpp3: Float? = null

    @JsonProperty("plotLayout_CON_BPP3/plotL2_CON_BPP3")
    var plotL2ConBpp3: Float? = null

    @JsonProperty("plotLayout_CON_BPP3/plotW1_CON_BPP3")
    var plotW1ConBpp3: Float? = null

    @JsonProperty("plotLayout_CON_BPP3/plotW2_CON_BPP3")
    var plotW2ConBpp3: Float? = null

    @JsonProperty("plotLayout_REC_BPP3/plotL1_REC_BPP3")
    var plotL1RecBpp3: Float? = null

    @JsonProperty("plotLayout_REC_BPP3/plotL2_REC_BPP3")
    var plotL2RecBpp3: Float? = null

    @JsonProperty("plotLayout_REC_BPP3/plotW1_REC_BPP3")
    var plotW1RecBpp3: Float? = null

    @JsonProperty("plotLayout_REC_BPP3/plotW2_REC_BPP3")
    var plotW2RecBpp3: Float? = null

    @JsonProperty("plotLayout_ALT/plotL1_ALT")
    var plotL1Alt: Float? = null

    @JsonProperty("plotLayout_ALT/plotL2_ALT")
    var plotL2Alt: Float? = null

    @JsonProperty("plotLayout_ALT/plotW1_ALT")
    var plotW1Alt: Float? = null

    @JsonProperty("plotLayout_ALT/plotW2_ALT")
    var plotW2Alt: Float? = null

    @JsonProperty("plotLayout_CON/plotL1_CON")
    var plotL1Con: Float? = null

    @JsonProperty("plotLayout_CON/plotL2_CON")
    var plotL2Con: Float? = null

    @JsonProperty("plotLayout_CON/plotW1_CON")
    var plotW1Con: Float? = null

    @JsonProperty("plotLayout_CON/plotW2_CON")
    var plotW2Con: Float? = null

    @JsonProperty("plotLayout_REC/plotL1_REC")
    var plotL1Rec: Float? = null

    @JsonProperty("plotLayout_REC/plotL2_REC")
    var plotL2Rec: Float? = null

    @JsonProperty("plotLayout_REC/plotW1_REC")
    var plotW1Rec: Float? = null

    @JsonProperty("plotLayout_REC/plotW2_REC")
    var plotW2Rec: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_ALT")
    var tuberizedMarketableRootsFwAlt: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_CON")
    var tuberizedMarketableRootsFwCon: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_REC")
    var tuberizedMarketableRootsFwRec: Float? = null


    @JsonProperty("harvest/tuberizedMarketableRootsNr_CON")
    var tuberizedMarketableRootsNrCon: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_REC")
    var tuberizedMarketableRootsNrRec: String? = null

    @JsonProperty("herbicideDetails/herbicideActorTrained")
    var herbicideActorTrained: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_CON_BPP3")
    var tuberizedMarketableRootsFwConBpp3: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_REC_BPP3")
    var tuberizedMarketableRootsFwRecBpp3: Float? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_ALT_BPP3")
    var tuberizedMarketableRootsNrAltBpp3: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_CON_BPP3")
    var tuberizedMarketableRootsNrConBpp3: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_REC_BPP3")
    var tuberizedMarketableRootsNrRecBpp3: String? = null

    /*---- missing fields --**/
    @JsonProperty("inputs1/orgInputs1")
    var orgInputs1: String? = null

    @JsonProperty("inputs2/orgInputs2")
    var orgInputs2: String? = null

    @JsonProperty("inputs3/orgInputs3")
    var orgInputs3: String? = null

    @JsonProperty("inputs4/orgInputs4")
    var orgInputs4: String? = null

    @JsonProperty("inputs5/orgInputs5")
    var orgInputs5: String? = null

    @JsonProperty("inputs6/orgInputs6")
    var orgInputs6: String? = null

    @JsonProperty("inputs1/fertilizer1")
    var fertilizer1: String? = null

    @JsonProperty("inputs2/fertilizer2")
    var fertilizer2: String? = null

    @JsonProperty("inputs3/fertilizer3")
    var fertilizer3: String? = null

    @JsonProperty("inputs4/fertilizer4")
    var fertilizer4: String? = null

    @JsonProperty("inputs5/fertilizer5")
    var fertilizer5: String? = null

    @JsonProperty("inputs6/fertilizer6")
    var fertilizer6: String? = null

    @JsonProperty("plantingDetails/variety")
    var variety: String? = null

    @JsonProperty("landPreparation/clearing")
    var clearing: String? = null

    @JsonProperty("landPreparation/vegetation")
    var vegetation: String? = null

    @JsonProperty("plantingDetails/plantingDate")
    var plantingDate: String? = null

    @JsonProperty("landPreparation_CON/ridging_CON")
    var ridgingCon: String? = null

    @JsonProperty("landPreparation_REC/ridging_REC")
    var ridgingRec: String? = null

    @JsonProperty("landPreparation_CON/nrHarrow_CON")
    var nrHarrowCon: String? = null

    @JsonProperty("landPreparation_REC/nrHarrow_REC")
    var nrHarrowRec: String? = null

    @JsonProperty("landPreparation_CON/nrTillage_CON")
    var nrTillageCon: String? = null

    @JsonProperty("landPreparation_REC/nrTillage_REC")
    var nrTillageRec: String? = null

    @JsonProperty("landPrepationDetails_CON/tillageMethod1_CON")
    var tillageMethod1Con: String? = null

    @JsonProperty("landPrepationDetails_REC/tillageMethod1_REC")
    var tillageMethod1Rec: String? = null


    @JsonProperty("landPreparation_ALT/ridging_ALT")
    var ridgingAlt: String? = null


    @JsonProperty("landPreparation_ALT/nrHarrow_ALT")
    var nrHarrowAlt: String? = null

    @JsonProperty("landPreparation_ALT/nrTillage_ALT")
    var nrTillageAlt: String? = null


    @JsonProperty("landPrepationDetails_ALT/ridgingMethod_ALT")
    var ridgingMethodAlt: String? = null

    @JsonProperty("landPrepationDetails_ALT/tillageMethod1_ALT")
    var tillageMethod1Alt: String? = null

    @JsonProperty("landPrepationDetails_REC/tillageMethod2_REC")
    var tillageMethod2Rec: String? = null



    @JsonProperty("weedingDetails/weedingMethod4")
    var weedingMethod4: String? = null


    @JsonProperty("harvest/tuberizedMarketableRootsNr_ALT")
    var tuberizedMarketableRootsNrAlt: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_ALT_BPP3")
    var tuberizedMarketableRootsFwAltBpp3: Float? = null


    @JsonProperty("weedAssessment_ALT")
    var weedAssessmentAlt: List<WeedAssessmentAlt>? = null

    @JsonProperty("weedAssessment_CON")
    var weedAssessmentCon: List<WeedAssessmentCon>? = null

    @JsonProperty("weedAssessment_REC")
    var weedAssessmentRec: List<WeedAssessmentRec>? = null

    @JsonProperty("weedAssessment_ALT_BPP3")
    var weedAssessmentAltBpp3: List<WeedAssessmentAltBpp3>? = null

    @JsonProperty("weedAssessment_CON_BPP3")
    var weedAssessmentConBpp3: List<WeedAssessmentConBpp3>? = null

    @JsonProperty("weedAssessment_REC_BPP3")
    var weedAssessmentRecBpp3: List<WeedAssessmentRecBpp3>? = null

}