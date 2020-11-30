package com.tsobu.ona.forms.valform

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("_id", "end", "lat", "lon", "rec", "EAID", "HHID", "_tags", "_uuid", "plotL", "plotW", "start", "today", "_notes", "netRev", "split1", "split2", "_edited", "_status", "country", "rateMOP", "rateTSP", "ridging", "targetY", "variety", "_version", "currency", "currentY", "deviceid", "geopoint", "plotSize", "rateUrea", "username", "_duration", "_xform_id", "areaBasis", "increaseP", "increaseY", "lookup_id", "simserial", "totalCost", "conversion", "rateMOP_AB", "rateTSP_AB", "purpose/VAL", "quantityMOP", "quantityTSP", "rateMOP_min", "rateTSP_min", "rateUrea_AB", "_attachments", "_geolocation", "_media_count", "_total_media", "formhub/uuid", "increaseY_AB", "netRevLocCur", "plantingDate", "plantingWeek", "quantity1MOP", "quantity1TSP", "quantity2MOP", "quantity2TSP", "quantityUrea", "rateUrea_min", "subscriberid", "_submitted_by", "quantity1Urea", "quantity2Urea", "rateNafaka_AB", "thankyou/call", "quantityNafaka", "rateNafaka_min", "meta/instanceID", "netRevLocCur_AB", "plantingDensity", "quantity1Nafaka", "quantity2Nafaka", "totalCostLocCur", "_submission_time", "_xform_id_string", "netRevLocCurPlot", "_bamboo_dataset_id", "totalCostLocCur_AB", "_media_all_received", "netRevLocCur_ABcurr", "thankyou/confirmVAL", "totalCostLocCurPlot", "netRevLocCurPlotcurr", "totalCostLocCur_ABcurr", "totalCostLocCurPlotcurr", "countrySelect", "email", "rateNafaka", "phonenumber", "_last_edited", "meta/deprecatedID", "densityDetails/withinRow", "densityDetails/betweenRow", "FCY", "season", "rateDAP", "quantityDAP", "rateDAP_min", "quantity1DAP", "quantity2DAP", "rateDAP_AB", "rateNPK", "rateNPK_AB", "quantityNPK", "rateNPK_min", "quantity1NPK", "quantity2NPK")
class ValFrForm {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("lat")
    var lat: String? = null

    @JsonProperty("lon")
    var lon: String? = null

    @JsonProperty("rec")
    var rec: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("plotL")
    var plotLength: String? = null

    @JsonProperty("plotW")
    var plotWidth: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("netRev")
    var netRev: String? = null

    @JsonProperty("split1")
    var split1: String? = null

    @JsonProperty("split2")
    var split2: String? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("rateMOP")
    var rateMop: String? = null

    @JsonProperty("rateTSP")
    var rateTsp: String? = null

    @JsonProperty("ridging")
    var ridging: String? = null

    @JsonProperty("targetY")
    var targetY: String? = null

    @JsonProperty("variety")
    var variety: String? = null

    @JsonProperty("_version")
    var version: String? = null

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

    @JsonProperty("rateUrea")
    var rateUrea: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: String? = null

    @JsonProperty("_xform_id")
    var xFormId: String? = null

    @JsonProperty("areaBasis")
    var areaBasis: String? = null

    @JsonProperty("increaseP")
    var increaseP: String? = null

    @JsonProperty("increaseY")
    var increaseY: String? = null

    @JsonProperty("lookup_id")
    var lookupId: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("totalCost")
    var totalCost: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("rateMOP_AB")
    var rateMopAb: String? = null

    @JsonProperty("rateTSP_AB")
    var rateTspAb: String? = null

    @JsonProperty("purpose/VAL")
    var purposeVal: String? = null

    @JsonProperty("quantityMOP")
    var quantityMop: String? = null

    @JsonProperty("quantityTSP")
    var quantityTsp: String? = null

    @JsonProperty("rateMOP_min")
    var rateMopMin: String? = null

    @JsonProperty("rateTSP_min")
    var rateTspMin: String? = null

    @JsonProperty("rateUrea_AB")
    var rateUreaAb: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: String? = null

    @JsonProperty("_total_media")
    var totalMedia: String? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("increaseY_AB")
    var increaseYAb: String? = null

    @JsonProperty("netRevLocCur")
    var netRevLocCur: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("plantingWeek")
    var plantingWeek: String? = null

    @JsonProperty("quantity1MOP")
    var quantity1Mop: String? = null

    @JsonProperty("quantity1TSP")
    var quantity1Tsp: String? = null

    @JsonProperty("quantity2MOP")
    var quantity2Mop: String? = null

    @JsonProperty("quantity2TSP")
    var quantity2Tsp: String? = null

    @JsonProperty("quantityUrea")
    var quantityUrea: String? = null

    @JsonProperty("rateUrea_min")
    var rateUreaMin: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("quantity1Urea")
    var quantity1Urea: String? = null

    @JsonProperty("quantity2Urea")
    var quantity2Urea: String? = null

    @JsonProperty("rateNafaka_AB")
    var rateNafakaAb: String? = null

    @JsonProperty("thankyou/call")
    var callValue: String? = null

    @JsonProperty("quantityNafaka")
    var quantityNafaka: String? = null

    @JsonProperty("rateNafaka_min")
    var rateNafakaMin: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("netRevLocCur_AB")
    var netRevLocCurAb: String? = null

    @JsonProperty("plantingDensity")
    var plantingDensity: String? = null

    @JsonProperty("quantity1Nafaka")
    var quantity1Nafaka: String? = null

    @JsonProperty("quantity2Nafaka")
    var quantity2Nafaka: String? = null

    @JsonProperty("totalCostLocCur")
    var totalCostLocCur: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("netRevLocCurPlot")
    var netRevLocCurPlot: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("totalCostLocCur_AB")
    var totalCostLocCurAb: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("netRevLocCur_ABcurr")
    var netRevLocCurAbCurr: String? = null

    @JsonProperty("thankyou/confirmVAL")
    var confirmVal: String? = null

    @JsonProperty("totalCostLocCurPlot")
    var totalCostLocCurPlot: String? = null

    @JsonProperty("netRevLocCurPlotcurr")
    var netRevLocCurPlotCurr: String? = null

    @JsonProperty("totalCostLocCur_ABcurr")
    var totalCostLocCurAbCurr: String? = null

    @JsonProperty("totalCostLocCurPlotcurr")
    var totalCostLocCurPlotCurr: String? = null

    @JsonProperty("countrySelect")
    var countrySelect: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("rateNafaka")
    var rateNafaka: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("_last_edited")
    var lastEdited: String? = null

    @JsonProperty("meta/deprecatedID")
    var deprecatedId: String? = null

    @JsonProperty("densityDetails/withinRow")
    var withinRow: String? = null

    @JsonProperty("densityDetails/betweenRow")
    var betweenRow: String? = null

    @JsonProperty("FCY")
    var fcy: String? = null

    @JsonProperty("season")
    var season: String? = null

    @JsonProperty("rateDAP")
    var rateDap: String? = null

    @JsonProperty("quantityDAP")
    var quantityDap: String? = null

    @JsonProperty("rateDAP_min")
    var rateDapMin: String? = null

    @JsonProperty("quantity1DAP")
    var quantity1Dap: String? = null

    @JsonProperty("quantity2DAP")
    var quantity2Dap: String? = null

    @JsonProperty("rateDAP_AB")
    var rateDapAb: String? = null

    @JsonProperty("rateNPK")
    var rateNpk: String? = null

    @JsonProperty("rateNPK_AB")
    var rateNpkAb: String? = null

    @JsonProperty("quantityNPK")
    var quantityNpk: String? = null

    @JsonProperty("rateNPK_min")
    var rateNpkMin: String? = null

    @JsonProperty("quantity1NPK")
    var quantity1Npk: String? = null

    @JsonProperty("quantity2NPK")
    var quantity2Npk: String? = null
}