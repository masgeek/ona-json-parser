package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "event", "EAID", "HHID", "country", "currency", "conversion", "loc_field", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "zone", "plotDim_P1", "plotL1_P1", "plotW1_P1", "plotL2_P1", "plotW2_P1", "plotDim_P2", "plotL1_P2", "plotW1_P2", "plotL2_P2", "plotW2_P2", "plotDim_P3", "plotL1_P3", "plotW1_P3", "plotL2_P3", "plotW2_P3", "plotDim_P4", "plotL1_P4", "plotW1_P4", "plotL2_P4", "plotW2_P4", "plotDim_P5", "plotL1_P5", "plotW1_P5", "plotL2_P5", "plotW2_P5", "plotDim_P6", "plotL1_P6", "plotW1_P6", "plotL2_P6", "plotW2_P6", "clearing", "vegetation", "tillageMethod", "ridgingMethod", "orgInputs1", "fertilizer1", "plantingDate", "variety", "confirm_P1", "confirm_P2", "confirm_P3", "confirm_P4", "confirm_P5", "confirm_P6", "nrPlants_P1", "nrPlants_P2", "nrPlants_P3", "nrPlants_P4", "nrPlants_P5", "nrPlants_P6", "gapping", "gappingDate", "gappingType", "orgInputs2", "fertilizer2", "orgInputs3", "fertilizer3", "orgInputs4", "fertilizer4", "nrWeeding", "dateWeeding1", "weedingMethod1", "dateWeeding2", "weedingMethod2", "dateWeeding3", "weedingMethod3", "dateWeeding4", "weedingMethod4", "dateWeeding5", "weedingMethod5", "dateWeeding6", "weedingMethod6", "dateWeeding7", "weedingMethod7", "dateWeeding8", "weedingMethod8", "dateWeeding9", "weedingMethod9", "dateWeeding10", "weedingMethod10", "herbicides", "herbicideActor", "herbicideActorTrained", "herbicideOther", "rateNote", "rateDrought", "rateWaterLogging", "rateLodging", "rateFire", "rateGrazing", "ratePests", "rateWeeds", "rateCMD", "rateCBSD", "rateOtherDisease", "rateTheftMissing", "weedAssessment_P1_count", "SET-OF-weedAssessment_P1", "weedAssessment_P2_count", "SET-OF-weedAssessment_P2", "weedAssessment_P3_count", "SET-OF-weedAssessment_P3", "weedAssessment_P4_count", "SET-OF-weedAssessment_P4", "weedAssessment_P5_count", "SET-OF-weedAssessment_P5", "weedAssessment_P6_count", "SET-OF-weedAssessment_P6", "harvestDate", "tuberizedMarketableRootsNr_P1", "tuberizedMarketableRootsFW_P1", "tuberizedMarketableRootsNr_P2", "tuberizedMarketableRootsFW_P2", "tuberizedMarketableRootsNr_P3", "tuberizedMarketableRootsFW_P3", "tuberizedMarketableRootsNr_P4", "tuberizedMarketableRootsFW_P4", "tuberizedMarketableRootsNr_P5", "tuberizedMarketableRootsFW_P5", "tuberizedMarketableRootsNr_P6", "tuberizedMarketableRootsFW_P6", "controlTreatment", "preferredTreatment", "scoreNote", "costScore", "labourScore", "yieldScore", "qualityScore", "revenueScore", "overallScore", "priceRoots", "comment", "thankyou", "end", "instanceID", "KEY")
class PpTzDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var formHubUuId:String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("deviceid")
    var deviceId: String? = null

    @JsonProperty("subscriberid")
    var subscriberId: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("banner")
    var banner: String? = null

    @JsonProperty("intro")
    var intro: String? = null

    @JsonProperty("event")
    var eventValue: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("loc_field")
    var locField: String? = null

    @JsonProperty("geopoint-Latitude")
    var geoPointLatitude: String? = null

    @JsonProperty("geopoint-Longitude")
    var geoPointLongitude: String? = null

    @JsonProperty("geopoint-Altitude")
    var geoPointAltitude: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geoPointAccuracy: String? = null

    @JsonProperty("zone")
    var zoneValue: String? = null

    @JsonProperty("plotDim_P1")
    var plotDimP1: String? = null

    @JsonProperty("plotL1_P1")
    var plotL1P1: String? = null

    @JsonProperty("plotW1_P1")
    var plotW1P1: String? = null

    @JsonProperty("plotL2_P1")
    var plotL2P1: String? = null

    @JsonProperty("plotW2_P1")
    var plotW2P1: String? = null

    @JsonProperty("plotDim_P2")
    var plotDimP2: String? = null

    @JsonProperty("plotL1_P2")
    var plotL1P2: String? = null

    @JsonProperty("plotW1_P2")
    var plotW1P2: String? = null

    @JsonProperty("plotL2_P2")
    var plotL2P2: String? = null

    @JsonProperty("plotW2_P2")
    var plotW2P2: String? = null

    @JsonProperty("plotDim_P3")
    var plotDimP3: String? = null

    @JsonProperty("plotL1_P3")
    var plotL1P3: String? = null

    @JsonProperty("plotW1_P3")
    var plotW1P3: String? = null

    @JsonProperty("plotL2_P3")
    var plotL2P3: String? = null

    @JsonProperty("plotW2_P3")
    var plotW2P3: String? = null

    @JsonProperty("plotDim_P4")
    var plotDimP4: String? = null

    @JsonProperty("plotL1_P4")
    var plotL1P4: String? = null

    @JsonProperty("plotW1_P4")
    var plotW1P4: String? = null

    @JsonProperty("plotL2_P4")
    var plotL2P4: String? = null

    @JsonProperty("plotW2_P4")
    var plotW2P4: String? = null

    @JsonProperty("plotDim_P5")
    var plotDimP5: String? = null

    @JsonProperty("plotL1_P5")
    var plotL1P5: String? = null

    @JsonProperty("plotW1_P5")
    var plotW1P5: String? = null

    @JsonProperty("plotL2_P5")
    var plotL2P5: String? = null

    @JsonProperty("plotW2_P5")
    var plotW2P5: String? = null

    @JsonProperty("plotDim_P6")
    var plotDimP6: String? = null

    @JsonProperty("plotL1_P6")
    var plotL1P6: String? = null

    @JsonProperty("plotW1_P6")
    var plotW1P6: String? = null

    @JsonProperty("plotL2_P6")
    var plotL2P6: String? = null

    @JsonProperty("plotW2_P6")
    var plotW2P6: String? = null

    @JsonProperty("clearing")
    var clearing: String? = null

    @JsonProperty("vegetation")
    var vegetation: String? = null

    @JsonProperty("tillageMethod")
    var tillageMethod: String? = null

    @JsonProperty("ridgingMethod")
    var ridgingMethod: String? = null

    @JsonProperty("orgInputs1")
    var orgInputs1: String? = null

    @JsonProperty("fertilizer1")
    var fertilizer1: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("variety")
    var variety: String? = null

    @JsonProperty("confirm_P1")
    var confirmP1: String? = null

    @JsonProperty("confirm_P2")
    var confirmP2: String? = null

    @JsonProperty("confirm_P3")
    var confirmP3: String? = null

    @JsonProperty("confirm_P4")
    var confirmP4: String? = null

    @JsonProperty("confirm_P5")
    var confirmP5: String? = null

    @JsonProperty("confirm_P6")
    var confirmP6: String? = null

    @JsonProperty("nrPlants_P1")
    var nrPlantsP1: String? = null

    @JsonProperty("nrPlants_P2")
    var nrPlantsP2: String? = null

    @JsonProperty("nrPlants_P3")
    var nrPlantsP3: String? = null

    @JsonProperty("nrPlants_P4")
    var nrPlantsP4: String? = null

    @JsonProperty("nrPlants_P5")
    var nrPlantsP5: String? = null

    @JsonProperty("nrPlants_P6")
    var nrPlantsP6: String? = null

    @JsonProperty("gapping")
    var gapping: String? = null

    @JsonProperty("gappingDate")
    var gappingDate: String? = null

    @JsonProperty("gappingType")
    var gappingType: String? = null

    @JsonProperty("orgInputs2")
    var orgInputs2: String? = null

    @JsonProperty("fertilizer2")
    var fertilizer2: String? = null

    @JsonProperty("orgInputs3")
    var orgInputs3: String? = null

    @JsonProperty("fertilizer3")
    var fertilizer3: String? = null

    @JsonProperty("orgInputs4")
    var orgInputs4: String? = null

    @JsonProperty("fertilizer4")
    var fertilizer4: String? = null

    @JsonProperty("nrWeeding")
    var nrWeeding: String? = null

    @JsonProperty("dateWeeding1")
    var dateWeeding1: String? = null

    @JsonProperty("weedingMethod1")
    var weedingMethod1: String? = null

    @JsonProperty("dateWeeding2")
    var dateWeeding2: String? = null

    @JsonProperty("weedingMethod2")
    var weedingMethod2: String? = null

    @JsonProperty("dateWeeding3")
    var dateWeeding3: String? = null

    @JsonProperty("weedingMethod3")
    var weedingMethod3: String? = null

    @JsonProperty("dateWeeding4")
    var dateWeeding4: String? = null

    @JsonProperty("weedingMethod4")
    var weedingMethod4: String? = null

    @JsonProperty("dateWeeding5")
    var dateWeeding5: String? = null

    @JsonProperty("weedingMethod5")
    var weedingMethod5: String? = null

    @JsonProperty("dateWeeding6")
    var dateWeeding6: String? = null

    @JsonProperty("weedingMethod6")
    var weedingMethod6: String? = null

    @JsonProperty("dateWeeding7")
    var dateWeeding7: String? = null

    @JsonProperty("weedingMethod7")
    var weedingMethod7: String? = null

    @JsonProperty("dateWeeding8")
    var dateWeeding8: String? = null

    @JsonProperty("weedingMethod8")
    var weedingMethod8: String? = null

    @JsonProperty("dateWeeding9")
    var dateWeeding9: String? = null

    @JsonProperty("weedingMethod9")
    var weedingMethod9: String? = null

    @JsonProperty("dateWeeding10")
    var dateWeeding10: String? = null

    @JsonProperty("weedingMethod10")
    var weedingMethod10: String? = null

    @JsonProperty("herbicides")
    var herbicides: String? = null

    @JsonProperty("herbicideActor")
    var herbicideActor: String? = null

    @JsonProperty("herbicideActorTrained")
    var herbicideActorTrained: String? = null

    @JsonProperty("herbicideOther")
    var herbicideOther: String? = null

    @JsonProperty("rateNote")
    var rateNote: String? = null

    @JsonProperty("rateDrought")
    var rateDrought: String? = null

    @JsonProperty("rateWaterLogging")
    var rateWaterLogging: String? = null

    @JsonProperty("rateLodging")
    var rateLodging: String? = null

    @JsonProperty("rateFire")
    var rateFire: String? = null

    @JsonProperty("rateGrazing")
    var rateGrazing: String? = null

    @JsonProperty("ratePests")
    var ratePests: String? = null

    @JsonProperty("rateWeeds")
    var rateWeeds: String? = null

    @JsonProperty("rateCMD")
    var rateCmd: String? = null

    @JsonProperty("rateCBSD")
    var rateCbSd: String? = null

    @JsonProperty("rateOtherDisease")
    var rateOtherDisease: String? = null

    @JsonProperty("rateTheftMissing")
    var rateTheftMissing: String? = null

    @JsonProperty("weedAssessment_P1_count")
    var weedAssessmentP1Count: String? = null

    @JsonProperty("SET-OF-weedAssessment_P1")
    var setOfWeedAssessmentP1: String? = null

    @JsonProperty("weedAssessment_P2_count")
    var weedAssessmentP2Count: String? = null

    @JsonProperty("SET-OF-weedAssessment_P2")
    var setOfWeedAssessmentP2: String? = null

    @JsonProperty("weedAssessment_P3_count")
    var weedAssessmentP3Count: String? = null

    @JsonProperty("SET-OF-weedAssessment_P3")
    var setOfWeedAssessmentP3: String? = null

    @JsonProperty("weedAssessment_P4_count")
    var weedAssessmentP4Count: String? = null

    @JsonProperty("SET-OF-weedAssessment_P4")
    var setOfWeedAssessmentP4: String? = null

    @JsonProperty("weedAssessment_P5_count")
    var weedAssessmentP5Count: String? = null

    @JsonProperty("SET-OF-weedAssessment_P5")
    var setOfWeedAssessmentP5: String? = null

    @JsonProperty("weedAssessment_P6_count")
    var weedAssessmentP6Count: String? = null

    @JsonProperty("SET-OF-weedAssessment_P6")
    var setOfWeedAssessmentP6: String? = null

    @JsonProperty("harvestDate")
    var harvestDate: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_P1")
    var tuberizedMarketableRootsNrP1: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_P1")
    var tuberizedMarketableRootsFWP1: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_P2")
    var tuberizedMarketableRootsNrP2: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_P2")
    var tuberizedMarketableRootsFWP2: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_P3")
    var tuberizedMarketableRootsNrP3: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_P3")
    var tuberizedMarketableRootsFWP3: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_P4")
    var tuberizedMarketableRootsNrP4: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_P4")
    var tuberizedMarketableRootsFWP4: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_P5")
    var tuberizedMarketableRootsNrP5: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_P5")
    var tuberizedMarketableRootsFWP5: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_P6")
    var tuberizedMarketableRootsNrP6: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_P6")
    var tuberizedMarketableRootsFWP6: String? = null

    @JsonProperty("controlTreatment")
    var controlTreatment: String? = null

    @JsonProperty("preferredTreatment")
    var preferredTreatment: String? = null

    @JsonProperty("scoreNote")
    var scoreNote: String? = null

    @JsonProperty("costScore")
    var costScore: String? = null

    @JsonProperty("labourScore")
    var labourScore: String? = null

    @JsonProperty("yieldScore")
    var yieldScore: String? = null

    @JsonProperty("qualityScore")
    var qualityScore: String? = null

    @JsonProperty("revenueScore")
    var revenueScore: String? = null

    @JsonProperty("overallScore")
    var overallScore: String? = null

    @JsonProperty("priceRoots")
    var priceRoots: String? = null

    @JsonProperty("comment")
    var commentValue: String? = null

    @JsonProperty("thankyou")
    var thankyou: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}