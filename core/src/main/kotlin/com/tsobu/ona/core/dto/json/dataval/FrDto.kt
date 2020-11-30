package com.tsobu.ona.core.dto.json.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        "SubmissionDate",
        "uuid",
        "start",
        "today",
        "deviceid",
        "subscriberid",
        "email",
        "username",
        "simserial",
        "phonenumber",
        "banner",
        "intro",
        "event",
        "EAID",
        "HHID",
        "country",
        "currency",
        "conversion",
        "loc_field",
        "geopoint-Latitude",
        "geopoint-Longitude",
        "geopoint-Altitude",
        "geopoint-Accuracy",
        "clearing",
        "vegetation",
        "nrTillage",
        "nrHarrow",
        "ridging",
        "tillageMethod1",
        "tillageMethod2",
        "tillageMethod3",
        "harrowMethod1",
        "harrowMethod2",
        "harrowMethod3",
        "plantingDate",
        "trialType",
        "variety",
        "plantingDensity",
        "betweenRow",
        "withinRow",
        "plotW",
        "plotL",
        "plotSize",
        "nrPlants_CON",
        "nrPlants_SSR",
        "plotDim_CON",
        "plotL1_CON",
        "plotW1_CON",
        "plotL2_CON",
        "plotW2_CON",
        "plotDim_SSR",
        "plotL1_SSR",
        "plotW1_SSR",
        "plotL2_SSR",
        "plotW2_SSR",
        "gapping",
        "gappingDate",
        "gappingType",
        "fertilizers1",
        "dateFertilizer1",
        "urea1",
        "TSP1",
        "DAP1",
        "MOP1",
        "NPK1",
        "fertilizers2",
        "dateFertilizer2",
        "urea2",
        "TSP2",
        "DAP2",
        "MOP2",
        "NPK2",
        "nrWeeding",
        "dateWeeding1",
        "weedingMethod1",
        "dateWeeding2",
        "weedingMethod2",
        "dateWeeding3",
        "weedingMethod3",
        "dateWeeding4",
        "weedingMethod4",
        "dateWeeding5",
        "weedingMethod5",
        "dateWeeding6",
        "weedingMethod6",
        "dateWeeding7",
        "weedingMethod7",
        "dateWeeding8",
        "weedingMethod8",
        "dateWeeding9",
        "weedingMethod9",
        "dateWeeding10",
        "weedingMethod10",
        "rateNote",
        "rateDrought",
        "rateWaterLogging",
        "rateLodging",
        "rateGrazing",
        "rateFire",
        "ratePests",
        "rateWeeds",
        "rateCMD",
        "rateCBSD",
        "rateOtherDisease",
        "rateTheftMissing",
        "harvestDate",
        "tuberizedMarketableRootsNr_CON",
        "tuberizedMarketableRootsFW_CON",
        "tuberizedMarketableRootsNr_SSR",
        "tuberizedMarketableRootsFW_SSR",
        "scoreNote",
        "costScore",
        "labourScore",
        "yieldScore",
        "qualityScore",
        "revenueScore",
        "overallScore",
        "priceRoots",
        "comment",
        "thankyou",
        "end",
        "instanceID",
        "KEY"
)
class FrDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var formHubUuId:String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("end")
    var endDate: String? = null

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
    var phonenumber: String? = null

    @JsonProperty("banner")
    var banner: String? = null

    @JsonProperty("intro")
    var intro: String? = null

    @JsonProperty("event")
    var purposeEvent: String? = null

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

    @JsonProperty("clearing")
    var clearing: String? = null

    @JsonProperty("vegetation")
    var vegetation: String? = null

    @JsonProperty("nrTillage")
    var nrTillage: String? = null

    @JsonProperty("nrHarrow")
    var nrHarrow: String? = null

    @JsonProperty("ridging")
    var ridging: String? = null

    @JsonProperty("tillageMethod1")
    var tillageMethod1: String? = null

    @JsonProperty("tillageMethod2")
    var tillageMethod2: String? = null

    @JsonProperty("tillageMethod3")
    var tillageMethod3: String? = null

    @JsonProperty("harrowMethod1")
    var harrowMethod1: String? = null

    @JsonProperty("harrowMethod2")
    var harrowMethod2: String? = null

    @JsonProperty("harrowMethod3")
    var harrowMethod3: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("trialType")
    var trialType: String? = null

    @JsonProperty("variety")
    var variety: String? = null

    @JsonProperty("plantingDensity")
    var plantingDensity: String? = null

    @JsonProperty("betweenRow")
    var betweenRow: String? = null

    @JsonProperty("withinRow")
    var withinRow: String? = null

    @JsonProperty("plotW")
    var plotWidth: String? = null

    @JsonProperty("plotL")
    var plotLength: String? = null

    @JsonProperty("plotSize")
    var plotSize: String? = null

    @JsonProperty("nrPlants_CON")
    var nrPlantsCon: String? = null

    @JsonProperty("nrPlants_SSR")
    var nrPlantsSsr: String? = null

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

    @JsonProperty("plotDim_SSR")
    var plotDimSsr: String? = null

    @JsonProperty("plotL1_SSR")
    var plotL1Ssr: String? = null

    @JsonProperty("plotW1_SSR")
    var plotW1Ssr: String? = null

    @JsonProperty("plotL2_SSR")
    var plotL2Ssr: String? = null

    @JsonProperty("plotW2_SSR")
    var plotW2Ssr: String? = null

    @JsonProperty("gapping")
    var gapping: String? = null

    @JsonProperty("gappingDate")
    var gappingDate: String? = null

    @JsonProperty("gappingType")
    var gappingType: String? = null

    @JsonProperty("fertilizers1")
    var fertilizers1: String? = null

    @JsonProperty("dateFertilizer1")
    var dateFertilizer1: String? = null

    @JsonProperty("urea1")
    var urea1: String? = null

    @JsonProperty("TSP1")
    var tsp1: String? = null

    @JsonProperty("DAP1")
    var dap1: String? = null

    @JsonProperty("MOP1")
    var mop1: String? = null

    @JsonProperty("NPK1")
    var npk1: String? = null

    @JsonProperty("fertilizers2")
    var fertilizers2: String? = null

    @JsonProperty("dateFertilizer2")
    var dateFertilizer2: String? = null

    @JsonProperty("urea2")
    var urea2: String? = null

    @JsonProperty("TSP2")
    var tsp2: String? = null

    @JsonProperty("DAP2")
    var dap2: String? = null

    @JsonProperty("MOP2")
    var mop2: String? = null

    @JsonProperty("NPK2")
    var npk2: String? = null

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

    @JsonProperty("rateNote")
    var rateNote: String? = null

    @JsonProperty("rateDrought")
    var rateDrought: String? = null

    @JsonProperty("rateWaterLogging")
    var rateWaterLogging: String? = null

    @JsonProperty("rateLodging")
    var rateLodging: String? = null

    @JsonProperty("rateGrazing")
    var rateGrazing: String? = null

    @JsonProperty("rateFire")
    var rateFire: String? = null

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

    @JsonProperty("harvestDate")
    var harvestDate: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_CON")
    var tuberizedMarketableRootsNrCon: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_CON")
    var tuberizedMarketableRootsFwCon: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_SSR")
    var tuberizedMarketableRootsNrSsr: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_SSR")
    var tuberizedMarketableRootsFwSsr: String? = null

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

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}