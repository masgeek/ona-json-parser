package com.tsobu.ona.core.dto.forms.dataval

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.tsobu.ona.core.dto.forms.Attachment

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class PpFormB {
    @JsonProperty("_id")
    var id = 0

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("harvest/harvestDate")
    var harvestDate: String? = null

    @JsonProperty("plantingDetails/plantingDate")
    var plantingDate: String? = null

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

    @JsonProperty("plantingDetails/variety")
    var variety: String? = null

    @JsonProperty("simserial")
    var simSerial: String? = null

    @JsonProperty("phonenumber")
    var phoneNumber: String? = null

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

    @JsonProperty("purpose/redplot")
    var redPlot: String? = null

    @JsonProperty("meta/instanceID")
    var metaInstanceID: String? = null

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


    @JsonProperty("_media_all_received")
    var mediaAllReceived = false


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

    @JsonProperty("landPreparation/clearing")
    var clearing: String? = null

    @JsonProperty("landPreparation/vegetation")
    var vegetation: String? = null


    @JsonProperty("landPreparation_ALT/ridging_ALT")
    var ridgingAlt: String? = null

    @JsonProperty("landPreparation_CON/ridging_CON")
    var ridgingCon: String? = null

    @JsonProperty("landPreparation_REC/ridging_REC")
    var ridgingRec: String? = null

    @JsonProperty("landPreparation_ALT/nrHarrow_ALT")
    var nrHarrowAlt: String? = null

    @JsonProperty("landPreparation_CON/nrHarrow_CON")
    var nrHarrowCon: String? = null

    @JsonProperty("landPreparation_REC/nrHarrow_REC")
    var nrHarrowRec: String? = null

    @JsonProperty("landPreparation_ALT/nrTillage_ALT")
    var nrTillageAlt: String? = null

    @JsonProperty("landPreparation_CON/nrTillage_CON")
    var nrTillageCon: String? = null

    @JsonProperty("landPreparation_ALT_BPP3/ridging_ALT_BPP3")
    var ridgingAltBpp3: String? = null

    @JsonProperty("landPreparation_CON_BPP3/ridging_CON_BPP3")
    var ridgingConBpp3: String? = null

    @JsonProperty("landPreparation_REC_BPP3/ridging_REC_BPP3")
    var ridgingRecBpp3: String? = null

    @JsonProperty("landPreparation_ALT_BPP3/nrHarrow_ALT_BPP3")
    var nrHarrowAltBpp3: String? = null

    @JsonProperty("landPreparation_CON_BPP3/nrHarrow_CON_BPP3")
    var nrHarrowConBpp3: String? = null

    @JsonProperty("landPreparation_REC_BPP3/nrHarrow_REC_BPP3")
    var nrHarrowRecBpp3: String? = null

    @JsonProperty("landPrepationDetails_REC/ridgingMethod_REC")
    var ridgingMethodRec: String? = null

    @JsonProperty("landPreparation_ALT_BPP3/nrTillage_ALT_BPP3")
    var nrTillageAltBpp3: String? = null

    @JsonProperty("landPreparation_CON_BPP3/nrTillage_CON_BPP3")
    var nrTillageConBpp3: String? = null

    @JsonProperty("landPreparation_REC_BPP3/nrTillage_REC_BPP3")
    var nrTillageRecBpp3: String? = null

    @JsonProperty("landPrepationDetails_ALT/tillageMethod1_ALT")
    var tillageMethod1ALT: String? = null

    @JsonProperty("landPrepationDetails_ALT/tillageMethod2_ALT")
    var tillageMethod2ALT: String? = null

    @JsonProperty("landPrepationDetails_CON/tillageMethod1_CON")
    var tillageMethod1Con: String? = null

    @JsonProperty("landPrepationDetails_REC/tillageMethod1_REC")
    var tillageMethod1Rec: String? = null

    @JsonProperty("landPrepationDetails_REC_BPP3/ridgingMethod_REC_BPP3")
    var ridgingMethodRecBpp3: String? = null

    @JsonProperty("landPrepationDetails_ALT_BPP3/tillageMethod1_ALT_BPP3")
    var tillageMethod1AltBpp3: String? = null

    @JsonProperty("landPrepationDetails_ALT_BPP3/tillageMethod2_ALT_BPP3")
    var tillageMethod2AltBpp3: String? = null

    @JsonProperty("landPrepationDetails_CON_BPP3/tillageMethod1_CON_BPP3")
    var tillageMethod1ConBpp3: String? = null

    @JsonProperty("landPrepationDetails_REC_BPP3/tillageMethod1_REC_BPP3")
    var tillageMethod1RecBpp3: String? = null

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

    @JsonProperty("weedAssessment_ALT_count")
    var weedAssessmentAltCount: String? = null

    @JsonProperty("weedAssessment_CON_count")
    var weedAssessmentConCount: String? = null

    @JsonProperty("weedAssessment_REC_count")
    var weedAssessmentRecCount: String? = null

    @JsonProperty("weedAssessment_ALT_BPP3_count")
    var weedAssessmentAltBpp3Count: String? = null

    @JsonProperty("weedAssessment_CON_BPP3_count")
    var weedAssessmentConBpp3Count: String? = null

    @JsonProperty("weedAssessment_REC_BPP3_count")
    var weedAssessmentRecBpp3Count: String? = null
}