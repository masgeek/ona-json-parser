package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "event", "redPlot", "BPP3", "EAID", "HHID", "country", "currency", "conversion", "loc_field", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "plotDim_CON", "plotL1_CON", "plotW1_CON", "plotL2_CON", "plotW2_CON", "plotDim_REC", "plotL1_REC", "plotW1_REC", "plotL2_REC", "plotW2_REC", "plotDim_ALT", "plotL1_ALT", "plotW1_ALT", "plotL2_ALT", "plotW2_ALT", "plotDim_CON_BPP3", "plotL1_CON_BPP3", "plotW1_CON_BPP3", "plotL2_CON_BPP3", "plotW2_CON_BPP3", "plotDim_REC_BPP3", "plotL1_REC_BPP3", "plotW1_REC_BPP3", "plotL2_REC_BPP3", "plotW2_REC_BPP3", "plotDim_ALT_BPP3", "plotL1_ALT_BPP3", "plotW1_ALT_BPP3", "plotL2_ALT_BPP3", "plotW2_ALT_BPP3", "clearing", "vegetation", "nrTillage_CON", "nrHarrow_CON", "ridging_CON", "tillageMethod1_CON", "tillageMethod2_CON", "tillageMethod3_CON", "harrowMethod1_CON", "harrowMethod2_CON", "harrowMethod3_CON", "ridgingMethod_CON", "nrTillage_REC", "nrHarrow_REC", "ridging_REC", "tillageMethod1_REC", "tillageMethod2_REC", "tillageMethod3_REC", "harrowMethod1_REC", "harrowMethod2_REC", "harrowMethod3_REC", "ridgingMethod_REC", "nrTillage_ALT", "nrHarrow_ALT", "ridging_ALT", "tillageMethod1_ALT", "tillageMethod2_ALT", "tillageMethod3_ALT", "harrowMethod1_ALT", "harrowMethod2_ALT", "harrowMethod3_ALT", "ridgingMethod_ALT", "nrTillage_CON_BPP3", "nrHarrow_CON_BPP3", "ridging_CON_BPP3", "tillageMethod1_CON_BPP3", "tillageMethod2_CON_BPP3", "tillageMethod3_CON_BPP3", "harrowMethod1_CON_BPP3", "harrowMethod2_CON_BPP3", "harrowMethod3_CON_BPP3", "ridgingMethod_CON_BPP3", "nrTillage_REC_BPP3", "nrHarrow_REC_BPP3", "ridging_REC_BPP3", "tillageMethod1_REC_BPP3", "tillageMethod2_REC_BPP3", "tillageMethod3_REC_BPP3", "harrowMethod1_REC_BPP3", "harrowMethod2_REC_BPP3", "harrowMethod3_REC_BPP3", "ridgingMethod_REC_BPP3", "nrTillage_ALT_BPP3", "nrHarrow_ALT_BPP3", "ridging_ALT_BPP3", "tillageMethod1_ALT_BPP3", "tillageMethod2_ALT_BPP3", "tillageMethod3_ALT_BPP3", "harrowMethod1_ALT_BPP3", "harrowMethod2_ALT_BPP3", "harrowMethod3_ALT_BPP3", "ridgingMethod_ALT_BPP3", "orgInputs1", "fertilizer1", "plantingDate", "variety", "nrPlants_CON", "nrPlants_REC", "nrPlants_ALT", "nrPlants_CON_BPP3", "nrPlants_REC_BPP3", "nrPlants_ALT_BPP3", "gapping", "gappingDate", "gappingType", "orgInputs2", "fertilizer2", "orgInputs3", "fertilizer3", "orgInputs4", "fertilizer4", "nrWeeding", "dateWeeding1", "weedingMethod1", "dateWeeding2", "weedingMethod2", "dateWeeding3", "weedingMethod3", "dateWeeding4", "weedingMethod4", "dateWeeding5", "weedingMethod5", "dateWeeding6", "weedingMethod6", "dateWeeding7", "weedingMethod7", "dateWeeding8", "weedingMethod8", "dateWeeding9", "weedingMethod9", "dateWeeding10", "weedingMethod10", "herbicides", "herbicideActor", "herbicideActorTrained", "herbicideOther", "rateNote", "rateDrought", "rateWaterLogging", "rateLodging", "rateFire", "rateGrazing", "ratePests", "rateWeeds", "rateCMD", "rateCBSD", "rateOtherDisease", "rateTheftMissing", "weedAssessment_CON_count", "SET-OF-weedAssessment_CON", "weedAssessment_REC_count", "SET-OF-weedAssessment_REC", "weedAssessment_ALT_count", "SET-OF-weedAssessment_ALT", "weedAssessment_CON_BPP3_count", "SET-OF-weedAssessment_CON_BPP3", "weedAssessment_REC_BPP3_count", "SET-OF-weedAssessment_REC_BPP3", "weedAssessment_ALT_BPP3_count", "SET-OF-weedAssessment_ALT_BPP3", "harvestDate", "tuberizedMarketableRootsNr_CON", "tuberizedMarketableRootsFW_CON", "tuberizedMarketableRootsNr_REC", "tuberizedMarketableRootsFW_REC", "tuberizedMarketableRootsNr_ALT", "tuberizedMarketableRootsFW_ALT", "tuberizedMarketableRootsNr_CON_BPP3", "tuberizedMarketableRootsFW_CON_BPP3", "tuberizedMarketableRootsNr_REC_BPP3", "tuberizedMarketableRootsFW_REC_BPP3", "tuberizedMarketableRootsNr_ALT_BPP3", "tuberizedMarketableRootsFW_ALT_BPP3", "scoreNote", "costScore", "labourScore", "yieldScore", "qualityScore", "revenueScore", "overallScore", "priceRoots", "comment", "thankyou", "end", "instanceID", "KEY")
class PpDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var uuid: String? = null

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
    var simSerial: String? = null

    @JsonProperty("phonenumber")
    var phoneNumber: String? = null

    @JsonProperty("banner")
    var banner: String? = null

    @JsonProperty("intro")
    var intro: String? = null

    @JsonProperty("event")
    var eventValue: String? = null

    @JsonProperty("redPlot")
    var redPlot: String? = null

    @JsonProperty("BPP3")
    var bpp3: String? = null

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

    @JsonProperty("plotDim_CON")
    var plotDimCon: String? = null

    @JsonProperty("plotL1_CON")
    var plotL1Con: String? = null

    @JsonProperty("plotW1_CON")
    var plotW1Con: String? = null

    @JsonProperty("plotL2_CON")
    var plotL2Con: String? = null

    @JsonProperty("plotW2_CON")
    var plotW2Con: String? = null

    @JsonProperty("plotDim_REC")
    var plotDimRec: String? = null

    @JsonProperty("plotL1_REC")
    var plotL1Rec: String? = null

    @JsonProperty("plotW1_REC")
    var plotW1Rec: String? = null

    @JsonProperty("plotL2_REC")
    var plotL2Rec: String? = null

    @JsonProperty("plotW2_REC")
    var plotW2Rec: String? = null

    @JsonProperty("plotDim_ALT")
    var plotDimAlt: String? = null

    @JsonProperty("plotL1_ALT")
    var plotL1Alt: String? = null

    @JsonProperty("plotW1_ALT")
    var plotW1Alt: String? = null

    @JsonProperty("plotL2_ALT")
    var plotL2Alt: String? = null

    @JsonProperty("plotW2_ALT")
    var plotW2Alt: String? = null

    @JsonProperty("plotDim_CON_BPP3")
    var plotDimConBpp3: String? = null

    @JsonProperty("plotL1_CON_BPP3")
    var plotL1ConBpp3: String? = null

    @JsonProperty("plotW1_CON_BPP3")
    var plotW1ConBpp3: String? = null

    @JsonProperty("plotL2_CON_BPP3")
    var plotL2ConBpp3: String? = null

    @JsonProperty("plotW2_CON_BPP3")
    var plotW2ConBpp3: String? = null

    @JsonProperty("plotDim_REC_BPP3")
    var plotDimRecBpp3: String? = null

    @JsonProperty("plotL1_REC_BPP3")
    var plotL1RecBpp3: String? = null

    @JsonProperty("plotW1_REC_BPP3")
    var plotW1RecBpp3: String? = null

    @JsonProperty("plotL2_REC_BPP3")
    var plotL2RecBpp3: String? = null

    @JsonProperty("plotW2_REC_BPP3")
    var plotW2RecBpp3: String? = null

    @JsonProperty("plotDim_ALT_BPP3")
    var plotDimAltBpp3: String? = null

    @JsonProperty("plotL1_ALT_BPP3")
    var plotL1AltBpp3: String? = null

    @JsonProperty("plotW1_ALT_BPP3")
    var plotW1AltBpp3: String? = null

    @JsonProperty("plotL2_ALT_BPP3")
    var plotL2AltBpp3: String? = null

    @JsonProperty("plotW2_ALT_BPP3")
    var plotW2AltBpp3: String? = null

    @JsonProperty("clearing")
    var clearing: String? = null

    @JsonProperty("vegetation")
    var vegetation: String? = null

    @JsonProperty("nrTillage_CON")
    var nrTillageCon: String? = null

    @JsonProperty("nrHarrow_CON")
    var nrHarrowCon: String? = null

    @JsonProperty("ridging_CON")
    var ridgingCon: String? = null

    @JsonProperty("tillageMethod1_CON")
    var tillageMethod1Con: String? = null

    @JsonProperty("tillageMethod2_CON")
    var tillageMethod2Con: String? = null

    @JsonProperty("tillageMethod3_CON")
    var tillageMethod3Con: String? = null

    @JsonProperty("harrowMethod1_CON")
    var harrowMethod1Con: String? = null

    @JsonProperty("harrowMethod2_CON")
    var harrowMethod2Con: String? = null

    @JsonProperty("harrowMethod3_CON")
    var harrowMethod3Con: String? = null

    @JsonProperty("ridgingMethod_CON")
    var ridgingMethodCon: String? = null

    @JsonProperty("nrTillage_REC")
    var nrTillageRec: String? = null

    @JsonProperty("nrHarrow_REC")
    var nrHarrowRec: String? = null

    @JsonProperty("ridging_REC")
    var ridgingRec: String? = null

    @JsonProperty("tillageMethod1_REC")
    var tillageMethod1Rec: String? = null

    @JsonProperty("tillageMethod2_REC")
    var tillageMethod2Rec: String? = null

    @JsonProperty("tillageMethod3_REC")
    var tillageMethod3Rec: String? = null

    @JsonProperty("harrowMethod1_REC")
    var harrowMethod1Rec: String? = null

    @JsonProperty("harrowMethod2_REC")
    var harrowMethod2Rec: String? = null

    @JsonProperty("harrowMethod3_REC")
    var harrowMethod3Rec: String? = null

    @JsonProperty("ridgingMethod_REC")
    var ridgingMethodRec: String? = null

    @JsonProperty("nrTillage_ALT")
    var nrTillageAlt: String? = null

    @JsonProperty("nrHarrow_ALT")
    var nrHarrowAlt: String? = null

    @JsonProperty("ridging_ALT")
    var ridgingAlt: String? = null

    @JsonProperty("tillageMethod1_ALT")
    var tillageMethod1Alt: String? = null

    @JsonProperty("tillageMethod2_ALT")
    var tillageMethod2Alt: String? = null

    @JsonProperty("tillageMethod3_ALT")
    var tillageMethod3Alt: String? = null

    @JsonProperty("harrowMethod1_ALT")
    var harrowMethod1Alt: String? = null

    @JsonProperty("harrowMethod2_ALT")
    var harrowMethod2Alt: String? = null

    @JsonProperty("harrowMethod3_ALT")
    var harrowMethod3Alt: String? = null

    @JsonProperty("ridgingMethod_ALT")
    var ridgingMethodAlt: String? = null

    @JsonProperty("nrTillage_CON_BPP3")
    var nrTillageConBpp3: String? = null

    @JsonProperty("nrHarrow_CON_BPP3")
    var nrHarrowConBpp3: String? = null

    @JsonProperty("ridging_CON_BPP3")
    var ridgingConBpp3: String? = null

    @JsonProperty("tillageMethod1_CON_BPP3")
    var tillageMethod1ConBpp3: String? = null

    @JsonProperty("tillageMethod2_CON_BPP3")
    var tillageMethod2ConBpp3: String? = null

    @JsonProperty("tillageMethod3_CON_BPP3")
    var tillageMethod3ConBpp3: String? = null

    @JsonProperty("harrowMethod1_CON_BPP3")
    var harrowMethod1ConBpp3: String? = null

    @JsonProperty("harrowMethod2_CON_BPP3")
    var harrowMethod2ConBpp3: String? = null

    @JsonProperty("harrowMethod3_CON_BPP3")
    var harrowMethod3ConBpp3: String? = null

    @JsonProperty("ridgingMethod_CON_BPP3")
    var ridgingMethodConBpp3: String? = null

    @JsonProperty("nrTillage_REC_BPP3")
    var nrTillageRecBpp3: String? = null

    @JsonProperty("nrHarrow_REC_BPP3")
    var nrHarrowRecBpp3: String? = null

    @JsonProperty("ridging_REC_BPP3")
    var ridgingRecBpp3: String? = null

    @JsonProperty("tillageMethod1_REC_BPP3")
    var tillageMethod1RecBpp3: String? = null

    @JsonProperty("tillageMethod2_REC_BPP3")
    var tillageMethod2RecBpp3: String? = null

    @JsonProperty("tillageMethod3_REC_BPP3")
    var tillageMethod3RecBpp3: String? = null

    @JsonProperty("harrowMethod1_REC_BPP3")
    var harrowMethod1RecBpp3: String? = null

    @JsonProperty("harrowMethod2_REC_BPP3")
    var harrowMethod2RecBpp3: String? = null

    @JsonProperty("harrowMethod3_REC_BPP3")
    var harrowMethod3RecBpp3: String? = null

    @JsonProperty("ridgingMethod_REC_BPP3")
    var ridgingMethodRecBpp3: String? = null

    @JsonProperty("nrTillage_ALT_BPP3")
    var nrTillageAltBpp3: String? = null

    @JsonProperty("nrHarrow_ALT_BPP3")
    var nrHarrowAltBpp3: String? = null

    @JsonProperty("ridging_ALT_BPP3")
    var ridgingAltBpp3: String? = null

    @JsonProperty("tillageMethod1_ALT_BPP3")
    var tillageMethod1AltBpp3: String? = null

    @JsonProperty("tillageMethod2_ALT_BPP3")
    var tillageMethod2AltBpp3: String? = null

    @JsonProperty("tillageMethod3_ALT_BPP3")
    var tillageMethod3AltBpp3: String? = null

    @JsonProperty("harrowMethod1_ALT_BPP3")
    var harrowMethod1AltBpp3: String? = null

    @JsonProperty("harrowMethod2_ALT_BPP3")
    var harrowMethod2AltBpp3: String? = null

    @JsonProperty("harrowMethod3_ALT_BPP3")
    var harrowMethod3AltBpp3: String? = null

    @JsonProperty("ridgingMethod_ALT_BPP3")
    var ridgingMethodAltBpp3: String? = null

    @JsonProperty("orgInputs1")
    var orgInputs1: String? = null

    @JsonProperty("fertilizer1")
    var fertilizer1: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("variety")
    var variety: String? = null

    @JsonProperty("nrPlants_CON")
    var nrPlantsCon: String? = null

    @JsonProperty("nrPlants_REC")
    var nrPlantsRec: String? = null

    @JsonProperty("nrPlants_ALT")
    var nrPlantsAlt: String? = null

    @JsonProperty("nrPlants_CON_BPP3")
    var nrPlantsConBpp3: String? = null

    @JsonProperty("nrPlants_REC_BPP3")
    var nrPlantsRecBpp3: String? = null

    @JsonProperty("nrPlants_ALT_BPP3")
    var nrPlantsAltBpp3: String? = null

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
    var rateCMD: String? = null

    @JsonProperty("rateCBSD")
    var rateCBSD: String? = null

    @JsonProperty("rateOtherDisease")
    var rateOtherDisease: String? = null

    @JsonProperty("rateTheftMissing")
    var rateTheftMissing: String? = null

    @JsonProperty("weedAssessment_CON_count")
    var weedAssessmentConCount: String? = null

    @JsonProperty("SET-OF-weedAssessment_CON")
    var setOfWeedAssessmentCon: String? = null

    @JsonProperty("weedAssessment_REC_count")
    var weedAssessmentRecCount: String? = null

    @JsonProperty("SET-OF-weedAssessment_REC")
    var setOfWeedAssessmentRec: String? = null

    @JsonProperty("weedAssessment_ALT_count")
    var weedAssessmentAltCount: String? = null

    @JsonProperty("SET-OF-weedAssessment_ALT")
    var setOfWeedAssessmentAlt: String? = null

    @JsonProperty("weedAssessment_CON_BPP3_count")
    var weedAssessmentConBPP3Count: String? = null

    @JsonProperty("SET-OF-weedAssessment_CON_BPP3")
    var setOfWeedAssessmentConBpp3: String? = null

    @JsonProperty("weedAssessment_REC_BPP3_count")
    var weedAssessmentRecBPP3Count: String? = null

    @JsonProperty("SET-OF-weedAssessment_REC_BPP3")
    var setOfWeedAssessmentRecBpp3: String? = null

    @JsonProperty("weedAssessment_ALT_BPP3_count")
    var weedAssessmentAltBPP3Count: String? = null

    @JsonProperty("SET-OF-weedAssessment_ALT_BPP3")
    var setOfWeedAssessmentAltBpp3: String? = null

    @JsonProperty("harvestDate")
    var harvestDate: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_CON")
    var tuberizedMarketableRootsNrCon: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_CON")
    var tuberizedMarketableRootsFWCon: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_REC")
    var tuberizedMarketableRootsNrRec: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_REC")
    var tuberizedMarketableRootsFwRec: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_ALT")
    var tuberizedMarketableRootsNrAlt: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_ALT")
    var tuberizedMarketableRootsFWAlt: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_CON_BPP3")
    var tuberizedMarketableRootsNrConBpp3: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_CON_BPP3")
    var tuberizedMarketableRootsFWConBpp3: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_REC_BPP3")
    var tuberizedMarketableRootsNrRecBpp3: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_REC_BPP3")
    var tuberizedMarketableRootsFwRecBpp3: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_ALT_BPP3")
    var tuberizedMarketableRootsNrAltBpp3: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_ALT_BPP3")
    var tuberizedMarketableRootsFwAltpp3: String? = null

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
    var comment: String? = null

    @JsonProperty("thankyou")
    var thankyou: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}