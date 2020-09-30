package com.tsobu.ona.forms.valform

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("_id", "end", "lat", "lon", "rec", "EAID", "HHID", "_tags", "_uuid", "plotL", "plotW", "start", "today", "_notes", "netRev", "split1", "split2", "_edited", "_status", "country", "rateMOP", "rateTSP", "ridging", "targetY", "variety", "_version", "currency", "currentY", "deviceid", "geopoint", "plotSize", "rateUrea", "username", "_duration", "_xform_id", "areaBasis", "increaseP", "increaseY", "lookup_id", "simserial", "totalCost", "conversion", "rateMOP_AB", "rateTSP_AB", "purpose/VAL", "quantityMOP", "quantityTSP", "rateMOP_min", "rateTSP_min", "rateUrea_AB", "_attachments", "_geolocation", "_media_count", "_total_media", "formhub/uuid", "increaseY_AB", "netRevLocCur", "plantingDate", "plantingWeek", "quantity1MOP", "quantity1TSP", "quantity2MOP", "quantity2TSP", "quantityUrea", "rateUrea_min", "subscriberid", "_submitted_by", "quantity1Urea", "quantity2Urea", "rateNafaka_AB", "thankyou/call", "quantityNafaka", "rateNafaka_min", "meta/instanceID", "netRevLocCur_AB", "plantingDensity", "quantity1Nafaka", "quantity2Nafaka", "totalCostLocCur", "_submission_time", "_xform_id_string", "netRevLocCurPlot", "_bamboo_dataset_id", "totalCostLocCur_AB", "_media_all_received", "netRevLocCur_ABcurr", "thankyou/confirmVAL", "totalCostLocCurPlot", "netRevLocCurPlotcurr", "totalCostLocCur_ABcurr", "totalCostLocCurPlotcurr", "countrySelect", "email", "rateNafaka", "phonenumber", "_last_edited", "meta/deprecatedID", "densityDetails/withinRow", "densityDetails/betweenRow", "FCY", "season", "rateDAP", "quantityDAP", "rateDAP_min", "quantity1DAP", "quantity2DAP", "rateDAP_AB", "rateNPK", "rateNPK_AB", "quantityNPK", "rateNPK_min", "quantity1NPK", "quantity2NPK")
class ValFrForm {
    @JsonProperty("_id")
    var id: Int? = null

    @JsonProperty("end")
    var end: String? = null

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
    var plotL: String? = null

    @JsonProperty("plotW")
    var plotW: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

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
    var rateMOP: String? = null

    @JsonProperty("rateTSP")
    var rateTSP: String? = null

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
    var deviceid: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("plotSize")
    var plotSize: String? = null

    @JsonProperty("rateUrea")
    var rateUrea: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId: Int? = null

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
    var rateMOPAB: String? = null

    @JsonProperty("rateTSP_AB")
    var rateTSPAB: String? = null

    @JsonProperty("purpose/VAL")
    var purposeVAL: String? = null

    @JsonProperty("quantityMOP")
    var quantityMOP: String? = null

    @JsonProperty("quantityTSP")
    var quantityTSP: String? = null

    @JsonProperty("rateMOP_min")
    var rateMOPMin: String? = null

    @JsonProperty("rateTSP_min")
    var rateTSPMin: String? = null

    @JsonProperty("rateUrea_AB")
    var rateUreaAB: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("increaseY_AB")
    var increaseYAB: String? = null

    @JsonProperty("netRevLocCur")
    var netRevLocCur: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("plantingWeek")
    var plantingWeek: String? = null

    @JsonProperty("quantity1MOP")
    var quantity1MOP: String? = null

    @JsonProperty("quantity1TSP")
    var quantity1TSP: String? = null

    @JsonProperty("quantity2MOP")
    var quantity2MOP: String? = null

    @JsonProperty("quantity2TSP")
    var quantity2TSP: String? = null

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
    var rateNafakaAB: String? = null

    @JsonProperty("thankyou/call")
    var thankyouCall: String? = null

    @JsonProperty("quantityNafaka")
    var quantityNafaka: String? = null

    @JsonProperty("rateNafaka_min")
    var rateNafakaMin: String? = null

    @JsonProperty("meta/instanceID")
    var metaInstanceID: String? = null

    @JsonProperty("netRevLocCur_AB")
    var netRevLocCurAB: String? = null

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
    var totalCostLocCurAB: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("netRevLocCur_ABcurr")
    var netRevLocCurABcurr: String? = null

    @JsonProperty("thankyou/confirmVAL")
    var thankyouConfirmVAL: String? = null

    @JsonProperty("totalCostLocCurPlot")
    var totalCostLocCurPlot: String? = null

    @JsonProperty("netRevLocCurPlotcurr")
    var netRevLocCurPlotcurr: String? = null

    @JsonProperty("totalCostLocCur_ABcurr")
    var totalCostLocCurABcurr: String? = null

    @JsonProperty("totalCostLocCurPlotcurr")
    var totalCostLocCurPlotcurr: String? = null

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
    var metaDeprecatedID: String? = null

    @JsonProperty("densityDetails/withinRow")
    var densityDetailsWithinRow: Double? = null

    @JsonProperty("densityDetails/betweenRow")
    var densityDetailsBetweenRow: Double? = null

    @JsonProperty("FCY")
    var fcy: String? = null

    @JsonProperty("season")
    var season: String? = null

    @JsonProperty("rateDAP")
    var rateDAP: String? = null

    @JsonProperty("quantityDAP")
    var quantityDAP: String? = null

    @JsonProperty("rateDAP_min")
    var rateDAPMin: String? = null

    @JsonProperty("quantity1DAP")
    var quantity1DAP: String? = null

    @JsonProperty("quantity2DAP")
    var quantity2DAP: String? = null

    @JsonProperty("rateDAP_AB")
    var rateDAPAB: String? = null

    @JsonProperty("rateNPK")
    var rateNPK: String? = null

    @JsonProperty("rateNPK_AB")
    var rateNPKAB: String? = null

    @JsonProperty("quantityNPK")
    var quantityNPK: String? = null

    @JsonProperty("rateNPK_min")
    var rateNPKMin: String? = null

    @JsonProperty("quantity1NPK")
    var quantity1NPK: String? = null

    @JsonProperty("quantity2NPK")
    var quantity2NPK: String? = null
}