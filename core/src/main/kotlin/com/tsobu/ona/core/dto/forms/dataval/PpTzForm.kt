package com.tsobu.ona.core.dto.forms.dataval

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.tsobu.ona.core.dto.forms.Attachment

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
    var simserial: String? = null

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
}