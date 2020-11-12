package com.tsobu.ona.core.dto.json.datavalsphs

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
        "countrySelect",
        "seasonSelect",
        "banner",
        "intro",
        "monitored",
        "rapidYield",
        "event",
        "name",
        "EAID",
        "HHID",
        "fieldID",
        "country",
        "currency",
        "conversion",
        "loc_field",
        "geopoint-Latitude",
        "geopoint-Longitude",
        "geopoint-Altitude",
        "geopoint-Accuracy",
        "plotDim_CON",
        "plotL1_CON",
        "plotW1_CON",
        "plotL2_CON",
        "plotW2_CON",
        "plotDim_REC",
        "plotL1_REC",
        "plotW1_REC",
        "plotL2_REC",
        "plotW2_REC",
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
        "reject",
        "rejectTRUE_note",
        "rejectFALSE_note",
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
        "orgInputs1",
        "fertilizer1",
        "plantingDate",
        "variety",
        "harvestDateQuestion_CON",
        "harvestDateQuestion_REC",
        "intHarvestDate_CON",
        "intHarvestDate_REC",
        "nrPlants_CON",
        "nrPlants_REC",
        "gapping",
        "gappingDate",
        "gappingType",
        "orgInputs2",
        "fertilizer2",
        "orgInputs3",
        "fertilizer3",
        "orgInputs4",
        "fertilizer4",
        "orgInputs5",
        "fertilizer5",
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
        "effHarvestDate_CON",
        "tuberizedMarketableRootsNr_CON",
        "tuberizedMarketableRootsFW_CON",
        "priceRoots_CON",
        "effHarvestDate_REC",
        "tuberizedMarketableRootsNr_REC",
        "tuberizedMarketableRootsFW_REC",
        "priceRoots_REC",
        "effHarvestDate_CON_Tri",
        "harvest_CON_Tri_count",
        "SET-OF-harvest_CON_Tri",
        "harvest_CON_Tri_detail_count",
        "SET-OF-harvest_CON_Tri_detail",
        "effHarvestDate_REC_Tri",
        "harvest_REC_Tri_count",
        "SET-OF-harvest_REC_Tri",
        "harvest_REC_Tri_detail_count",
        "SET-OF-harvest_REC_Tri_detail",
        "lastPlot",
        "scoreNote",
        "costScore",
        "labourScore",
        "yieldScore",
        "qualityScore",
        "revenueScore",
        "overallScore",
        "comment",
        "thankyou",
        "end",
        "instanceID",
        "KEY"
)
class SphsDto {
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

    @JsonProperty("countrySelect")
    var countrySelect: String? = null

    @JsonProperty("seasonSelect")
    var seasonSelect: String? = null

    @JsonProperty("banner")
    var banner: String? = null

    @JsonProperty("intro")
    var intro: String? = null

    @JsonProperty("monitored")
    var monitored: String? = null

    @JsonProperty("rapidYield")
    var rapidYield: String? = null

    @JsonProperty("event")
    var eventValue: String? = null

    @JsonProperty("name")
    var nameValue: String? = null

    @JsonProperty("EAID")
    var eAId: String? = null

    @JsonProperty("HHID")
    var hHId: String? = null

    @JsonProperty("fieldID")
    var fieldId: String? = null

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
    var rateCMD: String? = null

    @JsonProperty("rateCBSD")
    var rateCBSD: String? = null

    @JsonProperty("rateOtherDisease")
    var rateOtherDisease: String? = null

    @JsonProperty("rateTheftMissing")
    var rateTheftMissing: String? = null

    @JsonProperty("reject")
    var reject: String? = null

    @JsonProperty("rejectTRUE_note")
    var rejectTRUENote: String? = null

    @JsonProperty("rejectFALSE_note")
    var rejectFALSENote: String? = null

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

    @JsonProperty("orgInputs1")
    var orgInputs1: String? = null

    @JsonProperty("fertilizer1")
    var fertilizer1: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("variety")
    var variety: String? = null

    @JsonProperty("harvestDateQuestion_CON")
    var harvestDateQuestionCon: String? = null

    @JsonProperty("harvestDateQuestion_REC")
    var harvestDateQuestionRec: String? = null

    @JsonProperty("intHarvestDate_CON")
    var intHarvestDateCon: String? = null

    @JsonProperty("intHarvestDate_REC")
    var intHarvestDateRec: String? = null

    @JsonProperty("nrPlants_CON")
    var nrPlantsCon: String? = null

    @JsonProperty("nrPlants_REC")
    var nrPlantsRec: String? = null

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

    @JsonProperty("orgInputs5")
    var orgInputs5: String? = null

    @JsonProperty("fertilizer5")
    var fertilizer5: String? = null

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

    @JsonProperty("effHarvestDate_CON")
    var effHarvestDateCon: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_CON")
    var tuberizedMarketableRootsNrCon: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_CON")
    var tuberizedMarketableRootsFWCon: String? = null

    @JsonProperty("priceRoots_CON")
    var priceRootsCon: String? = null

    @JsonProperty("effHarvestDate_REC")
    var effHarvestDateRec: String? = null

    @JsonProperty("tuberizedMarketableRootsNr_REC")
    var tuberizedMarketableRootsNrRec: String? = null

    @JsonProperty("tuberizedMarketableRootsFW_REC")
    var tuberizedMarketableRootsFwRec: String? = null

    @JsonProperty("priceRoots_REC")
    var priceRootsRec: String? = null

    @JsonProperty("effHarvestDate_CON_Tri")
    var effHarvestDateConTri: String? = null

    @JsonProperty("harvest_CON_Tri_count")
    var harvestCONTriCount: String? = null

    @JsonProperty("SET-OF-harvest_CON_Tri")
    var setOfHarvestConTri: String? = null

    @JsonProperty("harvest_CON_Tri_detail_count")
    var harvestCONTriDetailCount: String? = null

    @JsonProperty("SET-OF-harvest_CON_Tri_detail")
    var setOfHarvestCONTriDetail: String? = null

    @JsonProperty("effHarvestDate_REC_Tri")
    var effHarvestDateRecTri: String? = null

    @JsonProperty("harvest_REC_Tri_count")
    var harvestRECTriCount: String? = null

    @JsonProperty("SET-OF-harvest_REC_Tri")
    var setOfHarvestRecTri: String? = null

    @JsonProperty("harvest_REC_Tri_detail_count")
    var harvestRECTriDetailCount: String? = null

    @JsonProperty("SET-OF-harvest_REC_Tri_detail")
    var setOfHarvestRecTriDetail: String? = null

    @JsonProperty("lastPlot")
    var lastPlot: String? = null

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

    @JsonProperty("comment")
    var comment: String? = null

    @JsonProperty("thankyou")
    var thankYou: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}