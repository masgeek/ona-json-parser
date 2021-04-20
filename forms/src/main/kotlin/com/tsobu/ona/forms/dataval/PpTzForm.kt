package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.tsobu.ona.forms.Attachment
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class PpTzForm {
    @JsonProperty("_id")
    var dataId: Int? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("zone")
    var zone: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("email")
    var email: String? = null

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
    var comment: String? = null

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
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId: Int? = null

    @JsonProperty("loc_field")
    var locField: String? = null

    @JsonProperty("simserial")
    var simSerial: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("phonenumber")
    var phoneNumber: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Attachment> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("subscriberid")
    var subscriberId: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("purpose/event")
    var eventValue: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("controlTreatment")
    var controlTreatment: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("inputs1/orgInputs1")
    var orgInputs1: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("inputs1/fertilizer1")
    var fertilizer1: String? = null

    @JsonProperty("plantingDetails/variety")
    var variety: String? = null

    @JsonProperty("plotLayout_P1/plotL1_P1")
    var plotLayoutP1PlotL1P1: Double? = null

    @JsonProperty("plotLayout_P1/plotL2_P1")
    var plotLayoutP1PlotL2P1: Double? = null

    @JsonProperty("plotLayout_P1/plotW1_P1")
    var plotLayoutP1PlotW1P1: Double? = null

    @JsonProperty("plotLayout_P1/plotW2_P1")
    var plotLayoutP1PlotW2P1: Double? = null

    @JsonProperty("plotLayout_P2/plotL1_P2")
    var plotLayoutP2PlotL1P2: Double? = null

    @JsonProperty("plotLayout_P2/plotL2_P2")
    var plotLayoutP2PlotL2P2: Double? = null

    @JsonProperty("plotLayout_P2/plotW1_P2")
    var plotLayoutP2PlotW1P2: Double? = null

    @JsonProperty("plotLayout_P2/plotW2_P2")
    var plotLayoutP2PlotW2P2: Double? = null

    @JsonProperty("plotLayout_P3/plotL1_P3")
    var plotLayoutP3PlotL1P3: Double? = null

    @JsonProperty("plotLayout_P3/plotL2_P3")
    var plotLayoutP3PlotL2P3: Double? = null

    @JsonProperty("plotLayout_P3/plotW1_P3")
    var plotLayoutP3PlotW1P3: Double? = null

    @JsonProperty("plotLayout_P3/plotW2_P3")
    var plotLayoutP3PlotW2P3: Double? = null

    @JsonProperty("plotLayout_P4/plotL1_P4")
    var plotLayoutP4PlotL1P4: Double? = null

    @JsonProperty("plotLayout_P4/plotL2_P4")
    var plotLayoutP4PlotL2P4: Double? = null

    @JsonProperty("plotLayout_P4/plotW1_P4")
    var plotLayoutP4PlotW1P4: Double? = null

    @JsonProperty("plotLayout_P4/plotW2_P4")
    var plotLayoutP4PlotW2P4: Double? = null

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

    @JsonProperty("landPreparation/clearing")
    var clearing: String? = null

    @JsonProperty("landPreparation/vegetation")
    var vegetation: String? = null

    @JsonProperty("confirmTreatments/confirm_P1")
    var confirmP1: String? = null

    @JsonProperty("confirmTreatments/confirm_P2")
    var confirmP2: String? = null

    @JsonProperty("confirmTreatments/confirm_P3")
    var confirmP3: String? = null

    @JsonProperty("confirmTreatments/confirm_P4")
    var confirmP4: String? = null

    @JsonProperty("plantingDetails/plantingDate")
    var plantingDate: String? = null

    @JsonProperty("landPrepationDetails/ridgingMethod")
    var ridgingMethod: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod")
    var tillageMethod: String? = null

    @JsonProperty("meta/deprecatedID")
    var deprecatedID: String? = null

    @JsonProperty("plotLayout_P5/plotL1_P5")
    var plotLayoutP5PlotL1P5: Double? = null

    @JsonProperty("plotLayout_P5/plotL2_P5")
    var plotLayoutP5PlotL2P5: Double? = null

    @JsonProperty("plotLayout_P5/plotW1_P5")
    var plotLayoutP5PlotW1P5: Double? = null

    @JsonProperty("plotLayout_P5/plotW2_P5")
    var plotLayoutP5PlotW2P5: Double? = null

    @JsonProperty("plotLayout_P6/plotL1_P6")
    var plotLayoutP6PlotL1P6: Double? = null

    @JsonProperty("plotLayout_P6/plotL2_P6")
    var plotLayoutP6PlotL2P6: Double? = null

    @JsonProperty("plotLayout_P6/plotW1_P6")
    var plotLayoutP6PlotW1P6: Double? = null

    @JsonProperty("plotLayout_P6/plotW2_P6")
    var plotLayoutP6PlotW2P6: Double? = null

    @JsonProperty("confirmTreatments/confirm_P5")
    var confirmP5: String? = null

    @JsonProperty("confirmTreatments/confirm_P6")
    var confirmP6: String? = null

    @JsonProperty("gapping")
    var gapping: String? = null

    @JsonProperty("nrWeeding")
    var nrWeeding: Int? = null

    @JsonProperty("weedAssessment_P1")
    var weedAssessmentP1: List<WeedAssessmentP1> = ArrayList()

    @JsonProperty("weedAssessment_P2")
    var weedAssessmentP2: List<WeedAssessmentP2> = ArrayList()

    @JsonProperty("weedAssessment_P3")
    var weedAssessmentP3: List<WeedAssessmentP3> = ArrayList()

    @JsonProperty("weedAssessment_P4")
    var weedAssessmentP4: List<WeedAssessmentP4> = ArrayList()

    @JsonProperty("inputs2/orgInputs2")
    var orgInputs2: String? = null

    @JsonProperty("inputs2/fertilizer2")
    var fertilizer2: String? = null

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
    var nrPlantsP1: Int? = null

    @JsonProperty("plantStand/nrPlants_P2")
    var nrPlantsP2: Int? = null

    @JsonProperty("plantStand/nrPlants_P3")
    var nrPlantsP3: Int? = null

    @JsonProperty("plantStand/nrPlants_P4")
    var nrPlantsP4: Int? = null

    @JsonProperty("trialRating/rateDrought")
    var rateDrought: String? = null

    @JsonProperty("trialRating/rateGrazing")
    var rateGrazing: String? = null

    @JsonProperty("trialRating/rateLodging")
    var rateLodging: String? = null

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

    @JsonProperty("weedingDetails/dateWeeding1")
    var dateWeeding1: String? = null

    @JsonProperty("weedingDetails/weedingMethod1")
    var weedingMethod1: String? = null

    @JsonProperty("weedAssessment_P5")
    var weedAssessmentP5: List<WeedAssessmentP5> = ArrayList()

    @JsonProperty("weedAssessment_P6")
    var weedAssessmentP6: List<WeedAssessmentP6> = ArrayList()

    @JsonProperty("plantStand/nrPlants_P5")
    var nrPlantsP5: Int? = null

    @JsonProperty("plantStand/nrPlants_P6")
    var nrPlantsP6: Int? = null

    @JsonProperty("herbicideDetails/herbicides")
    var herbicides: String? = null

    @JsonProperty("herbicideDetails/herbicideActor")
    var herbicideActor: String? = null

    @JsonProperty("herbicideDetails/herbicideActorTrained")
    var herbicideActorTrained: String? = null

    @JsonProperty("weedingDetails/dateWeeding2")
    var dateWeeding2: String? = null

    @JsonProperty("weedingDetails/weedingMethod2")
    var weedingMethod2: String? = null

    @JsonProperty("herbicideOther")
    var herbicideOther: String? = null

    @JsonProperty("inputs3/orgInputs3")
    var orgInputs3: String? = null

    @JsonProperty("inputs3/fertilizer3")
    var fertilizer3: String? = null

    @JsonProperty("weedingDetails/dateWeeding3")
    var dateWeeding3: String? = null

    @JsonProperty("weedingDetails/weedingMethod3")
    var weedingMethod3: String? = null

    @JsonProperty("inputs4/orgInputs4")
    var orgInputs4: String? = null

    @JsonProperty("inputs4/fertilizer4")
    var fertilizer4: String? = null

    @JsonProperty("weedingDetails/dateWeeding4")
    var dateWeeding4: String? = null

    @JsonProperty("weedingDetails/weedingMethod4")
    var weedingMethod4: String? = null

    @JsonProperty("weedingDetails/dateWeeding5")
    var dateWeeding5: String? = null

    @JsonProperty("weedingDetails/dateWeeding6")
    var dateWeeding6: String? = null

    @JsonProperty("weedingDetails/dateWeeding7")
    var dateWeeding7: String? = null

    @JsonProperty("weedingDetails/dateWeeding8")
    var dateWeeding8: String? = null

    @JsonProperty("weedingDetails/weedingMethod5")
    var weedingMethod5: String? = null

    @JsonProperty("weedingDetails/weedingMethod6")
    var weedingMethod6: String? = null

    @JsonProperty("weedingDetails/weedingMethod7")
    var weedingMethod7: String? = null

    @JsonProperty("weedingDetails/weedingMethod8")
    var weedingMethod8: String? = null

    @JsonProperty("priceRoots")
    var priceRoots: Int? = null

    @JsonProperty("overallScore")
    var overallScore: String? = null

    @JsonProperty("preferredTreatment")
    var preferredTreatment: String? = null

    @JsonProperty("harvest/harvestDate")
    var harvestDate: String? = null

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

    @JsonProperty("harvest/tuberizedMarketableRootsFW_P1")
    var tuberizedMarketableRootsFwP1: Double? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_P2")
    var tuberizedMarketableRootsFwP2: Double? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_P3")
    var tuberizedMarketableRootsFwP3: Double? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_P4")
    var tuberizedMarketableRootsFwP4: Double? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_P1")
    var tuberizedMarketableRootsNrP1: Int? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_P2")
    var tuberizedMarketableRootsNrP2: Int? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_P3")
    var tuberizedMarketableRootsNrP3: Int? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_P4")
    var tuberizedMarketableRootsNrP4: Int? = null

    @JsonProperty("weedingDetails/dateWeeding9")
    var dateWeeding9: String? = null

    @JsonProperty("weedingDetails/dateWeeding10")
    var dateWeeding10: String? = null

    @JsonProperty("weedingDetails/weedingMethod9")
    var weedingMethod9: String? = null

    @JsonProperty("weedingDetails/weedingMethod10")
    var weedingMethod10: String? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_P5")
    var tuberizedMarketableRootsFwP5: Double? = null

    @JsonProperty("harvest/tuberizedMarketableRootsFW_P6")
    var tuberizedMarketableRootsFwP6: Double? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_P5")
    var tuberizedMarketableRootsNrP5: Int? = null

    @JsonProperty("harvest/tuberizedMarketableRootsNr_P6")
    var tuberizedMarketableRootsNrP6: Int? = null
}