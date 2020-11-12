package com.tsobu.ona.forms.valform

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("CP", "_id", "end", "lat", "lon", "EAID", "HHID", "_tags", "_uuid", "plot3", "plotL", "plotW", "start", "today", "CPtext", "_notes", "costCP", "_edited", "_status", "costDif", "country", "recText", "variety", "_version", "costT0FL", "costT0RG", "costT1FL", "costT1RG", "costT2FL", "costT2RG", "currency", "deviceid", "geopoint", "plotSize", "username", "_duration", "_xform_id", "implement", "simserial", "conversion", "costCPcurr", "costDifAbs", "harrowCost", "netValueCP", "priceRoots", "ridgingRec", "costDifcurr", "purpose/VAL", "ridgingCost", "weedingCost", "_attachments", "_geolocation", "_media_count", "_total_media", "basicTillRec", "formhub/uuid", "grossValueCP", "netValueT0FL", "netValueT0RG", "netValueT1FL", "netValueT1RG", "netValueT2FL", "netValueT2RG", "plantingDate", "subscriberid", "_submitted_by", "costDifChange", "thankyou/call", "tractorAccess", "basicTill1Cost", "basicTill2Cost", "grossValueT0FL", "grossValueT0RG", "grossValueT1FL", "grossValueT1RG", "grossValueT2FL", "grossValueT2RG", "netValueDifMax", "herbicideAccess", "meta/instanceID", "netValueDifT0FL", "netValueDifT0RG", "netValueDifT1FL", "netValueDifT1RG", "netValueDifT2FL", "netValueDifT2RG", "netValueDifcurr", "plantingDensity", "_submission_time", "_xform_id_string", "currentYieldLevel", "_bamboo_dataset_id", "_media_all_received", "thankyou/confirmVAL", "cost/ridgingManualCost", "cost/weedingManualCost", "currentPractice/ridging", "cost/basicTill1ManualCost", "cost/basicTill2ManualCost", "cost/weedingHerbicideCost", "currentPractice/basicTill", "cost/basicTill1TractorCost", "cost/basicTill2TractorCost", "plot3Details2/harrow_plot3", "plot3Details1/ridging_plot3", "currentPracticeDetails/harrow", "plot3Details1/basicTill_plot3", "plot3Details2/ridgingMethod_plot3", "currentPractice/weedingMethodSelect", "currentPracticeDetails/ridgingMethod", "currentPracticeDetails/weedingMethod", "plot3Details2/basicTillMethod1_plot3", "currentPracticeDetails/basicTillMethod1", "currentPracticeDetails/basicTillMethod2", "plot3Details2/basicTillMethodSelect1_plot3", "currentPracticeDetails/basicTillMethodSelect1", "currentPracticeDetails/basicTillMethodSelect2", "thankyou/hostBPP3", "netValueDifMaxRound", "densityDetails/withinRow", "densityDetails/betweenRow", "plot3Details2/basicTillMethod2_plot3", "plot3Details2/basicTillMethodSelect2_plot3", "cost/harrowTractorCost", "plot3Details1/harrow_plot3", "currentPractice/harrowSelect", "plot3Details2/harrowSelect_plot3", "email", "cost/ridgingTractorCost", "currentPracticeDetails/ridgingMethodSelect", "harrowText", "harrowText2", "plot3Details2/ridgingMethodSelect_plot3", "countrySelect", "PW", "slash", "spray", "PW_count", "currentY", "fallowType", "problemWeeds", "season", "fallowAge", "fallowGreen", "phonenumber", "_last_edited", "fallowHeight", "meta/deprecatedID")
class ValPpForm {
    @JsonProperty("CP")
    var cp: String? = null

    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("lat")
    var lat: String? = null

    @JsonProperty("lon")
    var lon: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("plot3")
    var plot3: String? = null

    @JsonProperty("plotL")
    var plotL: String? = null

    @JsonProperty("plotW")
    var plotW: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("CPtext")
    var cPtext: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("costCP")
    var costCp: String? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("costDif")
    var costDif: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("recText")
    var recText: String? = null

    @JsonProperty("variety")
    var variety: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("costT0FL")
    var costT0FL: String? = null

    @JsonProperty("costT0RG")
    var costT0RG: String? = null

    @JsonProperty("costT1FL")
    var costT1FL: String? = null

    @JsonProperty("costT1RG")
    var costT1RG: String? = null

    @JsonProperty("costT2FL")
    var costT2FL: String? = null

    @JsonProperty("costT2RG")
    var costT2RG: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("plotSize")
    var plotSize: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xFormId: String? = null

    @JsonProperty("implement")
    var implement: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("costCPcurr")
    var costCpCurr: String? = null

    @JsonProperty("costDifAbs")
    var costDifAbs: String? = null

    @JsonProperty("harrowCost")
    var harrowCost: String? = null

    @JsonProperty("netValueCP")
    var netValueCp: String? = null

    @JsonProperty("priceRoots")
    var priceRoots: String? = null

    @JsonProperty("ridgingRec")
    var ridgingRec: String? = null

    @JsonProperty("costDifcurr")
    var costDifCurr: String? = null

    @JsonProperty("purpose/VAL")
    var purposeVAL: String? = null

    @JsonProperty("ridgingCost")
    var ridgingCost: String? = null

    @JsonProperty("weedingCost")
    var weedingCost: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: String? = null

    @JsonProperty("_total_media")
    var totalMedia: String? = null

    @JsonProperty("basicTillRec")
    var basicTillRec: String? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("grossValueCP")
    var grossValueCp: String? = null

    @JsonProperty("netValueT0FL")
    var netValueT0FL: String? = null

    @JsonProperty("netValueT0RG")
    var netValueT0RG: String? = null

    @JsonProperty("netValueT1FL")
    var netValueT1FL: String? = null

    @JsonProperty("netValueT1RG")
    var netValueT1RG: String? = null

    @JsonProperty("netValueT2FL")
    var netValueT2FL: String? = null

    @JsonProperty("netValueT2RG")
    var netValueT2RG: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("costDifChange")
    var costDifChange: String? = null

    @JsonProperty("thankyou/call")
    var callValue: String? = null

    @JsonProperty("tractorAccess")
    var tractorAccess: String? = null

    @JsonProperty("basicTill1Cost")
    var basicTill1Cost: String? = null

    @JsonProperty("basicTill2Cost")
    var basicTill2Cost: String? = null

    @JsonProperty("grossValueT0FL")
    var grossValueT0FL: String? = null

    @JsonProperty("grossValueT0RG")
    var grossValueT0RG: String? = null

    @JsonProperty("grossValueT1FL")
    var grossValueT1FL: String? = null

    @JsonProperty("grossValueT1RG")
    var grossValueT1RG: String? = null

    @JsonProperty("grossValueT2FL")
    var grossValueT2FL: String? = null

    @JsonProperty("grossValueT2RG")
    var grossValueT2RG: String? = null

    @JsonProperty("netValueDifMax")
    var netValueDifMax: String? = null

    @JsonProperty("herbicideAccess")
    var herbicideAccess: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("netValueDifT0FL")
    var netValueDifT0FL: String? = null

    @JsonProperty("netValueDifT0RG")
    var netValueDifT0RG: String? = null

    @JsonProperty("netValueDifT1FL")
    var netValueDifT1FL: String? = null

    @JsonProperty("netValueDifT1RG")
    var netValueDifT1RG: String? = null

    @JsonProperty("netValueDifT2FL")
    var netValueDifT2FL: String? = null

    @JsonProperty("netValueDifT2RG")
    var netValueDifT2RG: String? = null

    @JsonProperty("netValueDifcurr")
    var netValueDifCurr: String? = null

    @JsonProperty("plantingDensity")
    var plantingDensity: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("currentYieldLevel")
    var currentYieldLevel: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("thankyou/confirmVAL")
    var confirmVal: String? = null

    @JsonProperty("cost/ridgingManualCost")
    var ridgingManualCost: String? = null

    @JsonProperty("cost/weedingManualCost")
    var weedingManualCost: String? = null

    @JsonProperty("currentPractice/ridging")
    var ridging: String? = null

    @JsonProperty("cost/basicTill1ManualCost")
    var basicTill1ManualCost: String? = null

    @JsonProperty("cost/basicTill2ManualCost")
    var basicTill2ManualCost: String? = null

    @JsonProperty("cost/weedingHerbicideCost")
    var weedingHerbicideCost: String? = null

    @JsonProperty("currentPractice/basicTill")
    var basicTill: String? = null

    @JsonProperty("cost/basicTill1TractorCost")
    var basicTill1TractorCost: String? = null

    @JsonProperty("cost/basicTill2TractorCost")
    var basicTill2TractorCost: String? = null

    @JsonProperty("plot3Details2/harrow_plot3")
    var harrowPlot31: String? = null

    @JsonProperty("plot3Details1/harrow_plot3")
    var harrowPlot3: String? = null

    @JsonProperty("plot3Details1/ridging_plot3")
    var ridgingPlot3: String? = null

    @JsonProperty("currentPracticeDetails/harrow")
    var harrow: String? = null

    @JsonProperty("plot3Details1/basicTill_plot3")
    var basicTillPlot3: String? = null

    @JsonProperty("plot3Details2/ridgingMethod_plot3")
    var ridgingMethodPlot3: String? = null

    @JsonProperty("currentPractice/weedingMethodSelect")
    var weedingMethodSelect: String? = null

    @JsonProperty("currentPracticeDetails/ridgingMethod")
    var ridgingMethod: String? = null

    @JsonProperty("currentPracticeDetails/weedingMethod")
    var weedingMethod: String? = null

    @JsonProperty("plot3Details2/basicTillMethod1_plot3")
    var basicTillMethod1Plot3: String? = null

    @JsonProperty("currentPracticeDetails/basicTillMethod1")
    var basicTillMethod1: String? = null

    @JsonProperty("currentPracticeDetails/basicTillMethod2")
    var basicTillMethod2: String? = null

    @JsonProperty("plot3Details2/basicTillMethodSelect1_plot3")
    var basicTillMethodSelect1Plot3: String? = null

    @JsonProperty("currentPracticeDetails/basicTillMethodSelect1")
    var basicTillMethodSelect1: String? = null

    @JsonProperty("currentPracticeDetails/basicTillMethodSelect2")
    var basicTillMethodSelect2: String? = null

    @JsonProperty("thankyou/hostBPP3")
    var hostBpp3: String? = null

    @JsonProperty("netValueDifMaxRound")
    var netValueDifMaxRound: String? = null

    @JsonProperty("densityDetails/withinRow")
    var withinRow: Double? = null

    @JsonProperty("densityDetails/betweenRow")
    var betweenRow: Double? = null

    @JsonProperty("plot3Details2/basicTillMethod2_plot3")
    var basicTillMethod2Plot3: String? = null

    @JsonProperty("plot3Details2/basicTillMethodSelect2_plot3")
    var basicTillMethodSelect2Plot3: String? = null

    @JsonProperty("cost/harrowTractorCost")
    var costHarrowTractorCost: String? = null


    @JsonProperty("currentPractice/harrowSelect")
    var harrowSelect: String? = null

    @JsonProperty("plot3Details2/harrowSelect_plot3")
    var harrowSelectPlot3: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("cost/ridgingTractorCost")
    var costRidgingTractorCost: String? = null

    @JsonProperty("currentPracticeDetails/ridgingMethodSelect")
    var ridgingMethodSelect: String? = null

    @JsonProperty("harrowText")
    var harrowText: String? = null

    @JsonProperty("harrowText2")
    var harrowText2: String? = null

    @JsonProperty("plot3Details2/ridgingMethodSelect_plot3")
    var ridgingMethodSelectPlot3: String? = null

    @JsonProperty("countrySelect")
    var countrySelect: String? = null

    @JsonProperty("PW")
    var valPpPwList: List<ValPpPwForm> = ArrayList()

    @JsonProperty("slash")
    var slash: String? = null

    @JsonProperty("spray")
    var spray: String? = null

    @JsonProperty("PW_count")
    var pWCount: String? = null

    @JsonProperty("currentY")
    var currentY: String? = null

    @JsonProperty("fallowType")
    var fallowType: String? = null

    @JsonProperty("problemWeeds")
    var problemWeeds: String? = null

    @JsonProperty("season")
    var season: String? = null

    @JsonProperty("fallowAge")
    var fallowAge: String? = null

    @JsonProperty("fallowGreen")
    var fallowGreen: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("_last_edited")
    var lastEdited: String? = null

    @JsonProperty("fallowHeight")
    var fallowHeight: String? = null

    @JsonProperty("meta/deprecatedID")
    var metaDeprecatedId: String? = null
}