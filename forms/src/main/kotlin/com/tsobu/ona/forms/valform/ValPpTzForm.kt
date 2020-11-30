package com.tsobu.ona.forms.valform

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("CP", "PW", "_id", "end", "lat", "lon", "EAID", "HHID", "zone", "_tags", "_uuid", "email", "plotL", "plotW", "slash", "spray", "start", "today", "CPtext", "_notes", "costCP", "season", "_edited", "_status", "costDif", "country", "recText", "variety", "PW_count", "_version", "costT0FL", "costT0RG", "costT1FL", "costT1RG", "costT2FL", "costT2RG", "currency", "currentY", "deviceid", "geopoint", "plotSize", "username", "_duration", "_xform_id", "implement", "simserial", "conversion", "costCPcurr", "costDifAbs", "fallowType", "harrowCost", "harrowText", "netValueCP", "priceRoots", "ridgingRec", "costDifcurr", "harrowText2", "phonenumber", "purpose/VAL", "ridgingCost", "weedingCost", "_attachments", "_geolocation", "_media_count", "_total_media", "basicTillRec", "formhub/uuid", "grossValueCP", "netValueT0FL", "netValueT0RG", "netValueT1FL", "netValueT1RG", "netValueT2FL", "netValueT2RG", "plantingDate", "problemWeeds", "subscriberid", "_submitted_by", "costDifChange", "thankyou/call", "tractorAccess", "basicTill1Cost", "basicTill2Cost", "grossValueT0FL", "grossValueT0RG", "grossValueT1FL", "grossValueT1RG", "grossValueT2FL", "grossValueT2RG", "netValueDifMax", "herbicideAccess", "meta/instanceID", "netValueDifT0FL", "netValueDifT0RG", "netValueDifT1FL", "netValueDifT1RG", "netValueDifT2FL", "netValueDifT2RG", "netValueDifcurr", "plantingDensity", "_submission_time", "_xform_id_string", "currentYieldLevel", "_bamboo_dataset_id", "_media_all_received", "netValueDifMaxRound", "thankyou/confirmVAL", "cost/harrowTractorCost", "cost/ridgingManualCost", "cost/weedingManualCost", "cost/ridgingTractorCost", "currentPractice/ridging", "densityDetails/withinRow", "cost/basicTill1ManualCost", "cost/basicTill2ManualCost", "cost/weedingHerbicideCost", "currentPractice/basicTill", "densityDetails/betweenRow", "cost/basicTill1TractorCost", "cost/basicTill2TractorCost", "currentPractice/harrowSelect", "currentPracticeDetails/harrow", "currentPractice/weedingMethodSelect", "currentPracticeDetails/ridgingMethod", "currentPracticeDetails/weedingMethod", "currentPracticeDetails/basicTillMethod1", "currentPracticeDetails/ridgingMethodSelect", "currentPracticeDetails/basicTillMethodSelect1", "meta/deprecatedID", "fallowAge", "fallowGreen", "fallowHeight", "currentPracticeDetails/basicTillMethod2", "currentPracticeDetails/basicTillMethodSelect2")
class ValPpTzForm {
    @JsonProperty("CP")
    var cp: String? = null

    @JsonProperty("PW")
    var ppTzPwList: List<ValPpTzPwForm> = ArrayList()

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

    @JsonProperty("zone")
    var zone: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("plotL")
    var plotLength: String? = null

    @JsonProperty("plotW")
    var plotWidth: String? = null

    @JsonProperty("slash")
    var slash: String? = null

    @JsonProperty("spray")
    var spray: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("CPtext")
    var cpText: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("costCP")
    var costCp: String? = null

    @JsonProperty("season")
    var season: String? = null

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

    @JsonProperty("PW_count")
    var pwCount: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("costT0FL")
    var costT0Fl: String? = null

    @JsonProperty("costT0RG")
    var costT0Rg: String? = null

    @JsonProperty("costT1FL")
    var costT1Fl: String? = null

    @JsonProperty("costT1RG")
    var costT1Rg: String? = null

    @JsonProperty("costT2FL")
    var costT2Fl: String? = null

    @JsonProperty("costT2RG")
    var costT2Rg: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("currentY")
    var currentY: String? = null

    @JsonProperty("deviceid")
    var deviceId: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("plotSize")
    var plotSize: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: String?=null

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

    @JsonProperty("fallowType")
    var fallowType: String? = null

    @JsonProperty("harrowCost")
    var harrowCost: String? = null

    @JsonProperty("harrowText")
    var harrowText: String? = null

    @JsonProperty("netValueCP")
    var netValueCp: String? = null

    @JsonProperty("priceRoots")
    var priceRoots: String? = null

    @JsonProperty("ridgingRec")
    var ridgingRec: String? = null

    @JsonProperty("costDifcurr")
    var costDifCurr: String? = null

    @JsonProperty("harrowText2")
    var harrowText2: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("purpose/VAL")
    var purposeVal: String? = null

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
    var netValueT0Fl: String? = null

    @JsonProperty("netValueT0RG")
    var netValueT0Rg: String? = null

    @JsonProperty("netValueT1FL")
    var netValueT1Fl: String? = null

    @JsonProperty("netValueT1RG")
    var netValueT1Rg: String? = null

    @JsonProperty("netValueT2FL")
    var netValueT2Fl: String? = null

    @JsonProperty("netValueT2RG")
    var netValueT2Rg: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("problemWeeds")
    var problemWeeds: String? = null

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
    var grossValueT0Fl: String? = null

    @JsonProperty("grossValueT0RG")
    var grossValueT0Rg: String? = null

    @JsonProperty("grossValueT1FL")
    var grossValueT1Fl: String? = null

    @JsonProperty("grossValueT1RG")
    var grossValueT1Rg: String? = null

    @JsonProperty("grossValueT2FL")
    var grossValueT2Fl: String? = null

    @JsonProperty("grossValueT2RG")
    var grossValueT2Rg: String? = null

    @JsonProperty("netValueDifMax")
    var netValueDifMax: String? = null

    @JsonProperty("herbicideAccess")
    var herbicideAccess: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("netValueDifT0FL")
    var netValueDifT0Fl: String? = null

    @JsonProperty("netValueDifT0RG")
    var netValueDifT0Rg: String? = null

    @JsonProperty("netValueDifT1FL")
    var netValueDifT1Fl: String? = null

    @JsonProperty("netValueDifT1RG")
    var netValueDifT1Rg: String? = null

    @JsonProperty("netValueDifT2FL")
    var netValueDifT2Fl: String? = null

    @JsonProperty("netValueDifT2RG")
    var netValueDifT2Rg: String? = null

    @JsonProperty("netValueDifcurr")
    var netValueDifcurr: String? = null

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

    @JsonProperty("netValueDifMaxRound")
    var netValueDifMaxRound: String? = null

    @JsonProperty("thankyou/confirmVAL")
    var confirmVal: String? = null

    @JsonProperty("cost/harrowTractorCost")
    var harrowTractorCost: String? = null

    @JsonProperty("cost/ridgingManualCost")
    var ridgingManualCost: String? = null

    @JsonProperty("cost/weedingManualCost")
    var costWeedingManualCost: String? = null

    @JsonProperty("cost/ridgingTractorCost")
    var ridgingTractorCost: String? = null

    @JsonProperty("currentPractice/ridging")
    var ridging: String? = null

    @JsonProperty("densityDetails/withinRow")
    var withinRow: String?=null

    @JsonProperty("cost/basicTill1ManualCost")
    var basicTill1ManualCost: String? = null

    @JsonProperty("cost/basicTill2ManualCost")
    var basicTill2ManualCost: String? = null

    @JsonProperty("cost/weedingHerbicideCost")
    var weedingHerbicideCost: String? = null

    @JsonProperty("currentPractice/basicTill")
    var basicTill: String? = null

    @JsonProperty("densityDetails/betweenRow")
    var betweenRow: String? = null

    @JsonProperty("cost/basicTill1TractorCost")
    var basicTill1TractorCost: String? = null

    @JsonProperty("cost/basicTill2TractorCost")
    var basicTill2TractorCost: String? = null

    @JsonProperty("currentPractice/harrowSelect")
    var harrowSelect: String? = null

    @JsonProperty("currentPracticeDetails/harrow")
    var harrow: String? = null

    @JsonProperty("currentPractice/weedingMethodSelect")
    var weedingMethodSelect: String? = null

    @JsonProperty("currentPracticeDetails/ridgingMethod")
    var ridgingMethod: String? = null

    @JsonProperty("currentPracticeDetails/weedingMethod")
    var weedingMethod: String? = null

    @JsonProperty("currentPracticeDetails/basicTillMethod1")
    var basicTillMethod1: String? = null

    @JsonProperty("currentPracticeDetails/ridgingMethodSelect")
    var ridgingMethodSelect: String? = null

    @JsonProperty("currentPracticeDetails/basicTillMethodSelect1")
    var basicTillMethodSelect1: String? = null

    @JsonProperty("meta/deprecatedID")
    var deprecatedId: String? = null

    @JsonProperty("fallowAge")
    var fallowAge: String? = null

    @JsonProperty("fallowGreen")
    var fallowGreen: String? = null

    @JsonProperty("fallowHeight")
    var fallowHeight: String? = null

    @JsonProperty("currentPracticeDetails/basicTillMethod2")
    var basicTillMethod2: String? = null

    @JsonProperty("currentPracticeDetails/basicTillMethodSelect2")
    var basicTillMethodSelect2: String? = null
}