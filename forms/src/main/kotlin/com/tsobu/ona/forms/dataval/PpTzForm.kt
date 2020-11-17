package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.tsobu.ona.forms.Attachment

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class PpTzForm {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var endDate: String? = null

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
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("_notes")
    var notes: List<Any>? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("comment")
    var commentValue: String? = null

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
    var duration: String? = null

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

    @JsonProperty("_attachments")
    var attachments: List<Attachment>? = null

    @JsonProperty("_geolocation")
    var geolocation: List<Double>? = null

    @JsonProperty("_media_count")
    var mediaCount: String? = null

    @JsonProperty("_total_media")
    var totalMedia: String? = null

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
    var instanceId: String? = null

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
    var rateCmd: String? = null

    @JsonProperty("trialRating/rateCBSD")
    var rateCbSd: String? = null

    @JsonProperty("trialRating/rateFire")
    var rateFire: String? = null

    @JsonProperty("trialRating/ratePests")
    var ratePests: String? = null

    @JsonProperty("trialRating/rateWeeds")
    var rateWeeds: String? = null

    @JsonProperty("plantStand/nrPlants_P1")
    var plantStandNrPlantsP1: String? = null

    @JsonProperty("plantStand/nrPlants_P2")
    var plantStandNrPlantsP2: String? = null

    @JsonProperty("plantStand/nrPlants_P3")
    var plantStandNrPlantsP3: String? = null

    @JsonProperty("plantStand/nrPlants_P4")
    var plantStandNrPlantsP4: String? = null

    @JsonProperty("trialRating/rateDrought")
    var rateDrought: String? = null

    @JsonProperty("trialRating/rateGrazing")
    var rateGrazing: String? = null

    @JsonProperty("trialRating/rateLodging")
    var rateLodging: String? = null

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
    var gappingDate: String? = null

    @JsonProperty("gappingDetails/gappingType")
    var gappingType: String? = null

    @JsonProperty("trialRating/rateOtherDisease")
    var rateOtherDisease: String? = null

    @JsonProperty("trialRating/rateTheftMissing")
    var rateTheftMissing: String? = null

    @JsonProperty("trialRating/rateWaterLogging")
    var rateWaterLogging: String? = null

    @JsonProperty("harvest/harvestDate")
    var harvestDate: String? = null

    /*---- missing fields --**/
    @JsonProperty("inputs1/orgInputs1")
    var orgInputs1: String? = null

    @JsonProperty("inputs1/fertilizer1")
    var fertilizer1: String? = null

    @JsonProperty("plantingDetails/variety")
    var variety: String? = null

    @JsonProperty("landPreparation/clearing")
    var clearing: String? = null

    @JsonProperty("weedAssessment_ALT_count")
    var weedAssessmentAltCount: String? = null

    @JsonProperty("weedAssessment_CON_count")
    var weedAssessmentConCount: String? = null

    @JsonProperty("weedAssessment_REC_count")
    var weedAssessmentRecCount: String? = null

    @JsonProperty("plotLayout_CON/plotL1_CON")
    var plotL1Con: String? = null

    @JsonProperty("plotLayout_CON/plotL2_CON")
    var plotL2Con: String? = null

    @JsonProperty("plotLayout_CON/plotW1_CON")
    var plotW1Con: String? = null

    @JsonProperty("plotLayout_CON/plotW2_CON")
    var plotW2Con: String? = null

    @JsonProperty("plotLayout_REC/plotL1_REC")
    var plotL1Rec: String? = null

    @JsonProperty("plotLayout_REC/plotL2_REC")
    var plotL2Rec: String? = null

    @JsonProperty("plotLayout_REC/plotW1_REC")
    var plotW1Rec: String? = null

    @JsonProperty("plotLayout_REC/plotW2_REC")
    var plotW2Rec: String? = null

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

    @JsonProperty("plotLayout_ALT/plotL1_ALT")
    var plotL1Alt: String? = null

    @JsonProperty("plotLayout_ALT/plotL2_ALT")
    var plotL2Alt: String? = null

    @JsonProperty("plotLayout_ALT/plotW1_ALT")
    var plotW1Alt: String? = null

    @JsonProperty("plotLayout_ALT/plotW2_ALT")
    var plotW2Alt: String? = null


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

    @JsonProperty("plantStand/nrPlants_CON")
    var plantStandNrPlantsCon: String? = null

    @JsonProperty("plantStand/nrPlants_REC")
    var plantStandNrPlantsRec: String? = null


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

    @JsonProperty("weedAssessment_ALT_BPP3_count")
    var weedAssessmentAltBpp3Count: String? = null

    @JsonProperty("weedAssessment_CON_BPP3_count")
    var weedAssessmentConBpp3Count: String? = null

    @JsonProperty("weedAssessment_REC_BPP3_count")
    var weedAssessmentRecBpp3Count: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_CON")
    var tuberizedMarketableRootsFwCon: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_REC")
    var tuberizedMarketableRootsFwRec: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_CON")
    var tuberizedMarketableRootsNrCon: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_REC")
    var tuberizedMarketableRootsNrRec: String? = null

    @JsonProperty("weedingDetails/weedingMethod1")
    var weedingMethod1: String? = null

    @JsonProperty("weedingDetails/weedingMethod2")
    var weedingMethod2: String? = null

    @JsonProperty("weedingDetails/weedingMethod3")
    var weedingMethod3: String? = null

    @JsonProperty("weedingDetails/weedingMethod4")
    var weedingMethod4: String? = null

    @JsonProperty("herbicideDetails/herbicideActor")
    var herbicideActor: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_ALT")
    var tuberizedMarketableRootsFwAlt: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_ALT")
    var tuberizedMarketableRootsNrAlt: String? = null

    @JsonProperty("herbicideDetails/herbicideActorTrained")
    var herbicideActorTrained: String? = null


    @JsonProperty("harvest/tuberizedMarketableRootsFW_ALT_BPP3")
    var tuberizedMarketableRootsFwAltBpp3: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_CON_BPP3")
    var tuberizedMarketableRootsFwConBpp3: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_REC_BPP3")
    var tuberizedMarketableRootsFwRecBpp3: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_ALT_BPP3")
    var tuberizedMarketableRootsNrAltBpp3: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_CON_BPP3")
    var tuberizedMarketableRootsNrConBPpp: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_REC_BPP3")
    var tuberizedMarketableRootsNrRecBpp3: String? = null
}