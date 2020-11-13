package com.tsobu.ona.core.dto.json.`val`

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "intro2", "VAL", "EAID", "HHID", "countrySelect", "country", "currency", "conversion", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "lat", "lon", "plantingDate", "season", "fallowType", "fallowHeight", "fallowAge", "fallowGreen", "problemWeeds", "PW_count", "SET-OF-PW", "slash", "spray", "slash1spray1Note", "slash1spray0Note", "slash0spray1Note", "slash0spray0Note", "tractorAccess", "implement", "herbicideAccess", "basicTill", "harrowSelect", "ridging", "weedingMethodSelect", "basicTillMethodSelect1", "basicTillMethod1", "basicTillMethodSelect2", "basicTillMethod2", "harrow", "ridgingMethodSelect", "ridgingMethod", "weedingMethod", "currentY", "currentYieldLevel", "CP", "variety", "plantingDensity", "betweenRow", "withinRow", "plotL", "plotW", "plotSize", "costNote", "basicTill1ManualCost", "basicTill1TractorCost", "basicTill2ManualCost", "basicTill2TractorCost", "harrowTractorCost", "ridgingManualCost", "ridgingTractorCost", "weedingManualCost", "weedingHerbicideCost", "priceRoots", "basicTill1Cost", "basicTill2Cost", "harrowCost", "ridgingCost", "weedingCost", "costT0RG", "costT0FL", "costT1RG", "costT1FL", "costT2RG", "costT2FL", "costCP", "costCPcurr", "grossValueT0RG", "grossValueT0FL", "grossValueT1RG", "grossValueT1FL", "grossValueT2RG", "grossValueT2FL", "grossValueCP", "netValueT0RG", "netValueT0FL", "netValueT1RG", "netValueT1FL", "netValueT2RG", "netValueT2FL", "netValueCP", "netValueDifT0RG", "netValueDifT0FL", "netValueDifT1RG", "netValueDifT1FL", "netValueDifT2RG", "netValueDifT2FL", "netValueDifMax", "netValueDifMaxRound", "CPtext", "basicTillRec", "ridgingRec", "recText", "harrowText", "harrowText2", "costDif", "costDifChange", "costDifAbs", "netValueDifcurr", "costDifcurr", "optPPNote", "recNote", "netValueNote", "costNote1", "costNote2", "ridgingNote", "tractorNote", "harrowNote", "validationNote", "validationNote2", "validationNote3", "validationNote4", "validationNote5", "validationNote6", "plot3", "validationNote7", "basicTill_plot3", "harrow_plot3", "ridging_plot3", "basicTillMethodSelect1_plot3", "basicTillMethod1_plot3", "basicTillMethodSelect2_plot3", "basicTillMethod2_plot3", "harrowSelect_plot3", "ridgingMethodSelect_plot3", "ridgingMethod_plot3", "plantingNote", "weedingNote", "call", "confirmVAL", "hostBPP3", "end", "instanceID", "KEY")
class ValPpDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var formHubUuId:String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

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

    @JsonProperty("intro2")
    var intro2: String? = null

    @JsonProperty("VAL")
    var purposeVal: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("countrySelect")
    var countrySelect: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("geopoint-Latitude")
    var geopointLatitude: String? = null

    @JsonProperty("geopoint-Longitude")
    var geopointLongitude: String? = null

    @JsonProperty("geopoint-Altitude")
    var geopointAltitude: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geopointAccuracy: String? = null

    @JsonProperty("lat")
    var lat: String? = null

    @JsonProperty("lon")
    var lon: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("season")
    var season: String? = null

    @JsonProperty("fallowType")
    var fallowType: String? = null

    @JsonProperty("fallowHeight")
    var fallowHeight: String? = null

    @JsonProperty("fallowAge")
    var fallowAge: String? = null

    @JsonProperty("fallowGreen")
    var fallowGreen: String? = null

    @JsonProperty("problemWeeds")
    var problemWeeds: String? = null

    @JsonProperty("PW_count")
    var pwCount: String? = null

    @JsonProperty("SET-OF-PW")
    var setOfPw: String? = null

    @JsonProperty("slash")
    var slash: String? = null

    @JsonProperty("spray")
    var spray: String? = null

    @JsonProperty("slash1spray1Note")
    var slash1spray1Note: String? = null

    @JsonProperty("slash1spray0Note")
    var slash1spray0Note: String? = null

    @JsonProperty("slash0spray1Note")
    var slash0spray1Note: String? = null

    @JsonProperty("slash0spray0Note")
    var slash0spray0Note: String? = null

    @JsonProperty("tractorAccess")
    var tractorAccess: String? = null

    @JsonProperty("implement")
    var implement: String? = null

    @JsonProperty("herbicideAccess")
    var herbicideAccess: String? = null

    @JsonProperty("basicTill")
    var basicTill: String? = null

    @JsonProperty("harrowSelect")
    var harrowSelect: String? = null

    @JsonProperty("ridging")
    var ridging: String? = null

    @JsonProperty("weedingMethodSelect")
    var weedingMethodSelect: String? = null

    @JsonProperty("basicTillMethodSelect1")
    var basicTillMethodSelect1: String? = null

    @JsonProperty("basicTillMethod1")
    var basicTillMethod1: String? = null

    @JsonProperty("basicTillMethodSelect2")
    var basicTillMethodSelect2: String? = null

    @JsonProperty("basicTillMethod2")
    var basicTillMethod2: String? = null

    @JsonProperty("harrow")
    var harrow: String? = null

    @JsonProperty("ridgingMethodSelect")
    var ridgingMethodSelect: String? = null

    @JsonProperty("ridgingMethod")
    var ridgingMethod: String? = null

    @JsonProperty("weedingMethod")
    var weedingMethod: String? = null

    @JsonProperty("currentY")
    var currentY: String? = null

    @JsonProperty("currentYieldLevel")
    var currentYieldLevel: String? = null

    @JsonProperty("CP")
    var cp: String? = null

    @JsonProperty("variety")
    var variety: String? = null

    @JsonProperty("plantingDensity")
    var plantingDensity: String? = null

    @JsonProperty("betweenRow")
    var betweenRow: Any? = null

    @JsonProperty("withinRow")
    var withinRow: Any? = null

    @JsonProperty("plotL")
    var plotL: String? = null

    @JsonProperty("plotW")
    var plotW: String? = null

    @JsonProperty("plotSize")
    var plotSize: String? = null

    @JsonProperty("costNote")
    var costNote: String? = null

    @JsonProperty("basicTill1ManualCost")
    var basicTill1ManualCost: String? = null

    @JsonProperty("basicTill1TractorCost")
    var basicTill1TractorCost: Any? = null

    @JsonProperty("basicTill2ManualCost")
    var basicTill2ManualCost: String? = null

    @JsonProperty("basicTill2TractorCost")
    var basicTill2TractorCost: Any? = null

    @JsonProperty("harrowTractorCost")
    var harrowTractorCost: Any? = null

    @JsonProperty("ridgingManualCost")
    var ridgingManualCost: String? = null

    @JsonProperty("ridgingTractorCost")
    var ridgingTractorCost: Any? = null

    @JsonProperty("weedingManualCost")
    var weedingManualCost: String? = null

    @JsonProperty("weedingHerbicideCost")
    var weedingHerbicideCost: String? = null

    @JsonProperty("priceRoots")
    var priceRoots: String? = null

    @JsonProperty("basicTill1Cost")
    var basicTill1Cost: String? = null

    @JsonProperty("basicTill2Cost")
    var basicTill2Cost: String? = null

    @JsonProperty("harrowCost")
    var harrowCost: String? = null

    @JsonProperty("ridgingCost")
    var ridgingCost: String? = null

    @JsonProperty("weedingCost")
    var weedingCost: String? = null

    @JsonProperty("costT0RG")
    var costT0Rg: String? = null

    @JsonProperty("costT0FL")
    var costT0Fl: String? = null

    @JsonProperty("costT1RG")
    var costT1Rg: String? = null

    @JsonProperty("costT1FL")
    var costT1Fl: String? = null

    @JsonProperty("costT2RG")
    var costT2Rg: String? = null

    @JsonProperty("costT2FL")
    var costT2Fl: String? = null

    @JsonProperty("costCP")
    var costCp: String? = null

    @JsonProperty("costCPcurr")
    var costCpCurr: String? = null

    @JsonProperty("grossValueT0RG")
    var grossValueT0Rg: String? = null

    @JsonProperty("grossValueT0FL")
    var grossValueT0Fl: String? = null

    @JsonProperty("grossValueT1RG")
    var grossValueT1Rg: String? = null

    @JsonProperty("grossValueT1FL")
    var grossValueT1Fl: String? = null

    @JsonProperty("grossValueT2RG")
    var grossValueT2Rg: String? = null

    @JsonProperty("grossValueT2FL")
    var grossValueT2Fl: String? = null

    @JsonProperty("grossValueCP")
    var grossValueCp: String? = null

    @JsonProperty("netValueT0RG")
    var netValueT0Rg: String? = null

    @JsonProperty("netValueT0FL")
    var netValueT0Fl: String? = null

    @JsonProperty("netValueT1RG")
    var netValueT1Rg: String? = null

    @JsonProperty("netValueT1FL")
    var netValueT1Fl: String? = null

    @JsonProperty("netValueT2RG")
    var netValueT2Rg: String? = null

    @JsonProperty("netValueT2FL")
    var netValueT2Fl: String? = null

    @JsonProperty("netValueCP")
    var netValueCp: String? = null

    @JsonProperty("netValueDifT0RG")
    var netValueDifT0Rg: String? = null

    @JsonProperty("netValueDifT0FL")
    var netValueDifT0Fl: String? = null

    @JsonProperty("netValueDifT1RG")
    var netValueDifT1Rg: String? = null

    @JsonProperty("netValueDifT1FL")
    var netValueDifT1Fl: String? = null

    @JsonProperty("netValueDifT2RG")
    var netValueDifT2Rg: String? = null

    @JsonProperty("netValueDifT2FL")
    var netValueDifT2Fl: String? = null

    @JsonProperty("netValueDifMax")
    var netValueDifMax: String? = null

    @JsonProperty("netValueDifMaxRound")
    var netValueDifMaxRound: String? = null

    @JsonProperty("CPtext")
    var cPtext: String? = null

    @JsonProperty("basicTillRec")
    var basicTillRec: String? = null

    @JsonProperty("ridgingRec")
    var ridgingRec: String? = null

    @JsonProperty("recText")
    var recText: String? = null

    @JsonProperty("harrowText")
    var harrowText: String? = null

    @JsonProperty("harrowText2")
    var harrowText2: String? = null

    @JsonProperty("costDif")
    var costDif: String? = null

    @JsonProperty("costDifChange")
    var costDifChange: String? = null

    @JsonProperty("costDifAbs")
    var costDifAbs: String? = null

    @JsonProperty("netValueDifcurr")
    var netValueDifCurr: String? = null

    @JsonProperty("costDifcurr")
    var costDifCurr: String? = null

    @JsonProperty("optPPNote")
    var optPpNote: String? = null

    @JsonProperty("recNote")
    var recNote: String? = null

    @JsonProperty("netValueNote")
    var netValueNote: String? = null

    @JsonProperty("costNote1")
    var costNote1: String? = null

    @JsonProperty("costNote2")
    var costNote2: String? = null

    @JsonProperty("ridgingNote")
    var ridgingNote: String? = null

    @JsonProperty("tractorNote")
    var tractorNote: String? = null

    @JsonProperty("harrowNote")
    var harrowNote: String? = null

    @JsonProperty("validationNote")
    var validationNote: String? = null

    @JsonProperty("validationNote2")
    var validationNote2: String? = null

    @JsonProperty("validationNote3")
    var validationNote3: String? = null

    @JsonProperty("validationNote4")
    var validationNote4: String? = null

    @JsonProperty("validationNote5")
    var validationNote5: String? = null

    @JsonProperty("validationNote6")
    var validationNote6: String? = null

    @JsonProperty("plot3")
    var plot3: String? = null

    @JsonProperty("validationNote7")
    var validationNote7: String? = null

    @JsonProperty("basicTill_plot3")
    var basicTillPlot3: String? = null

    @JsonProperty("harrow_plot3")
    var harrowPlot3: String? = null

    @JsonProperty("ridging_plot3")
    var ridgingPlot3: String? = null

    @JsonProperty("basicTillMethodSelect1_plot3")
    var basicTillMethodSelect1Plot3: String? = null

    @JsonProperty("basicTillMethod1_plot3")
    var basicTillMethod1Plot3: String? = null

    @JsonProperty("basicTillMethodSelect2_plot3")
    var basicTillMethodSelect2Plot3: String? = null

    @JsonProperty("basicTillMethod2_plot3")
    var basicTillMethod2Plot3: String? = null

    @JsonProperty("harrowSelect_plot3")
    var harrowSelectPlot3: String? = null

    @JsonProperty("ridgingMethodSelect_plot3")
    var ridgingMethodSelectPlot3: String? = null

    @JsonProperty("ridgingMethod_plot3")
    var ridgingMethodPlot3: String? = null

    @JsonProperty("plantingNote")
    var plantingNote: String? = null

    @JsonProperty("weedingNote")
    var weedingNote: String? = null

    @JsonProperty("call")
    var callValue: String? = null

    @JsonProperty("confirmVAL")
    var confirmVal: String? = null

    @JsonProperty("hostBPP3")
    var hostBPP3: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}