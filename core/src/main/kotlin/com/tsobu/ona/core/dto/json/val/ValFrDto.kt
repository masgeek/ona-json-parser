package com.tsobu.ona.core.dto.json.`val`

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "intro2", "VAL", "EAID", "HHID", "countrySelect", "country", "currency", "conversion", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "lat", "lon", "plantingDate", "season", "plantingWeek", "areaBasis", "FCY", "lookup_id", "rateUrea", "rateTSP", "rateNafaka", "rateDAP", "rateMOP", "rateNPK", "currentY", "targetY", "increaseY", "netRev", "totalCost", "ridging", "variety", "plantingDensity", "betweenRow", "withinRow", "plotL", "plotW", "plotSize", "rateUrea_AB", "rateTSP_AB", "rateNafaka_AB", "rateDAP_AB", "rateMOP_AB", "rateNPK_AB", "increaseY_AB", "rec", "quantityUrea", "quantityTSP", "quantityNafaka", "quantityDAP", "quantityMOP", "quantityNPK", "rateUrea_min", "rateTSP_min", "rateNafaka_min", "rateDAP_min", "rateMOP_min", "rateNPK_min", "quantity1Urea", "quantity2Urea", "quantity1TSP", "quantity2TSP", "quantity1Nafaka", "quantity2Nafaka", "quantity1DAP", "quantity2DAP", "quantity1MOP", "quantity2MOP", "quantity1NPK", "quantity2NPK", "split1", "split2", "increaseP", "netRevLocCur", "totalCostLocCur", "netRevLocCur_AB", "netRevLocCur_ABcurr", "totalCostLocCur_AB", "totalCostLocCur_ABcurr", "netRevLocCurPlot", "netRevLocCurPlotcurr", "totalCostLocCurPlot", "totalCostLocCurPlotcurr", "noRecommendationTZNote", "noRecommendationNGNote", "noFertilizerNote", "rateFertilizerNote", "rateUreaNote", "rateTSPNote", "rateNafakaNote", "rateDAPNote", "rateMOPNote", "rateNPKNote", "yieldNote", "validationNote", "NOTNote", "quantityUreaNote", "quantityTSPNote", "quantityNafakaNote", "quantityDAPNote", "quantityMOPNote", "quantityNPKNote", "productionNote", "production_HRNote", "split1Note", "quantity1UreaNote", "quantity1TSPNote", "quantity1NafakaNote", "quantity1DAPNote", "quantity1MOPNote", "quantity1NPKNote", "split2Note", "quantity2UreaNote", "quantity2TSPNote", "quantity2DAPNote", "quantity2NafakaNote", "quantity2MOPNote", "quantity2NPKNote", "call", "confirmVAL", "end", "instanceID", "KEY")
class ValFrDto {
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

    @JsonProperty("plantingWeek")
    var plantingWeek: String? = null

    @JsonProperty("areaBasis")
    var areaBasis: String? = null

    @JsonProperty("FCY")
    var fcy: String? = null

    @JsonProperty("lookup_id")
    var lookupId: String? = null

    @JsonProperty("rateUrea")
    var rateUrea: String? = null

    @JsonProperty("rateTSP")
    var rateTSp: String? = null

    @JsonProperty("rateNafaka")
    var rateNafaka: String? = null

    @JsonProperty("rateDAP")
    var rateDAP: String? = null

    @JsonProperty("rateMOP")
    var rateMOP: String? = null

    @JsonProperty("rateNPK")
    var rateNPK: String? = null

    @JsonProperty("currentY")
    var currentY: String? = null

    @JsonProperty("targetY")
    var targetY: String? = null

    @JsonProperty("increaseY")
    var increaseY: String? = null

    @JsonProperty("netRev")
    var netRev: String? = null

    @JsonProperty("totalCost")
    var totalCost: String? = null

    @JsonProperty("ridging")
    var ridging: String? = null

    @JsonProperty("variety")
    var variety: String? = null

    @JsonProperty("plantingDensity")
    var plantingDensity: String? = null

    @JsonProperty("betweenRow")
    var betweenRow: String? = null

    @JsonProperty("withinRow")
    var withinRow: String? = null

    @JsonProperty("plotL")
    var plotLength: String? = null

    @JsonProperty("plotW")
    var plotWidth: String? = null

    @JsonProperty("plotSize")
    var plotSize: String? = null

    @JsonProperty("rateUrea_AB")
    var rateUreaAB: Any? = null

    @JsonProperty("rateTSP_AB")
    var rateTSPAB: Any? = null

    @JsonProperty("rateNafaka_AB")
    var rateNafakaAB: Any? = null

    @JsonProperty("rateDAP_AB")
    var rateDAPAB: String? = null

    @JsonProperty("rateMOP_AB")
    var rateMOPAB: Any? = null

    @JsonProperty("rateNPK_AB")
    var rateNPKAB: String? = null

    @JsonProperty("increaseY_AB")
    var increaseYAB: Any? = null

    @JsonProperty("rec")
    var rec: String? = null

    @JsonProperty("quantityUrea")
    var quantityUrea: String? = null

    @JsonProperty("quantityTSP")
    var quantityTSp: String? = null

    @JsonProperty("quantityNafaka")
    var quantityNafaka: String? = null

    @JsonProperty("quantityDAP")
    var quantityDAP: String? = null

    @JsonProperty("quantityMOP")
    var quantityMOP: String? = null

    @JsonProperty("quantityNPK")
    var quantityNPK: String? = null

    @JsonProperty("rateUrea_min")
    var rateUreaMin: String? = null

    @JsonProperty("rateTSP_min")
    var rateTSPMin: String? = null

    @JsonProperty("rateNafaka_min")
    var rateNafakaMin: String? = null

    @JsonProperty("rateDAP_min")
    var rateDAPMin: String? = null

    @JsonProperty("rateMOP_min")
    var rateMOPMin: String? = null

    @JsonProperty("rateNPK_min")
    var rateNPKMin: String? = null

    @JsonProperty("quantity1Urea")
    var quantity1Urea: String? = null

    @JsonProperty("quantity2Urea")
    var quantity2Urea: String? = null

    @JsonProperty("quantity1TSP")
    var quantity1TSp: String? = null

    @JsonProperty("quantity2TSP")
    var quantity2TSp: String? = null

    @JsonProperty("quantity1Nafaka")
    var quantity1Nafaka: String? = null

    @JsonProperty("quantity2Nafaka")
    var quantity2Nafaka: String? = null

    @JsonProperty("quantity1DAP")
    var quantity1DAP: String? = null

    @JsonProperty("quantity2DAP")
    var quantity2DAP: String? = null

    @JsonProperty("quantity1MOP")
    var quantity1MOP: String? = null

    @JsonProperty("quantity2MOP")
    var quantity2MOP: String? = null

    @JsonProperty("quantity1NPK")
    var quantity1NPK: String? = null

    @JsonProperty("quantity2NPK")
    var quantity2NPK: String? = null

    @JsonProperty("split1")
    var split1: String? = null

    @JsonProperty("split2")
    var split2: String? = null

    @JsonProperty("increaseP")
    var increaseP: Any? = null

    @JsonProperty("netRevLocCur")
    var netRevLocCur: Any? = null

    @JsonProperty("totalCostLocCur")
    var totalCostLocCur: Any? = null

    @JsonProperty("netRevLocCur_AB")
    var netRevLocCurAB: Any? = null

    @JsonProperty("netRevLocCur_ABcurr")
    var netRevLocCurABCurr: String? = null

    @JsonProperty("totalCostLocCur_AB")
    var totalCostLocCurAB: Any? = null

    @JsonProperty("totalCostLocCur_ABcurr")
    var totalCostLocCurABCurr: String? = null

    @JsonProperty("netRevLocCurPlot")
    var netRevLocCurPlot: Any? = null

    @JsonProperty("netRevLocCurPlotcurr")
    var netRevLocCurPlotCurr: String? = null

    @JsonProperty("totalCostLocCurPlot")
    var totalCostLocCurPlot: Any? = null

    @JsonProperty("totalCostLocCurPlotcurr")
    var totalCostLocCurPlotCurr: String? = null

    @JsonProperty("noRecommendationTZNote")
    var noRecommendationTZNote: String? = null

    @JsonProperty("noRecommendationNGNote")
    var noRecommendationNGNote: String? = null

    @JsonProperty("noFertilizerNote")
    var noFertilizerNote: String? = null

    @JsonProperty("rateFertilizerNote")
    var rateFertilizerNote: String? = null

    @JsonProperty("rateUreaNote")
    var rateUreaNote: String? = null

    @JsonProperty("rateTSPNote")
    var rateTSPNote: String? = null

    @JsonProperty("rateNafakaNote")
    var rateNafakaNote: String? = null

    @JsonProperty("rateDAPNote")
    var rateDAPNote: String? = null

    @JsonProperty("rateMOPNote")
    var rateMOPNote: String? = null

    @JsonProperty("rateNPKNote")
    var rateNPKNote: String? = null

    @JsonProperty("yieldNote")
    var yieldNote: String? = null

    @JsonProperty("validationNote")
    var validationNote: String? = null

    @JsonProperty("NOTNote")
    var notNote: String? = null

    @JsonProperty("quantityUreaNote")
    var quantityUreaNote: String? = null

    @JsonProperty("quantityTSPNote")
    var quantityTSPNote: String? = null

    @JsonProperty("quantityNafakaNote")
    var quantityNafakaNote: String? = null

    @JsonProperty("quantityDAPNote")
    var quantityDAPNote: String? = null

    @JsonProperty("quantityMOPNote")
    var quantityMOPNote: String? = null

    @JsonProperty("quantityNPKNote")
    var quantityNPKNote: String? = null

    @JsonProperty("productionNote")
    var productionNote: String? = null

    @JsonProperty("production_HRNote")
    var productionHRNote: String? = null

    @JsonProperty("split1Note")
    var split1Note: String? = null

    @JsonProperty("quantity1UreaNote")
    var quantity1UreaNote: String? = null

    @JsonProperty("quantity1TSPNote")
    var quantity1TSPNote: String? = null

    @JsonProperty("quantity1NafakaNote")
    var quantity1NafakaNote: String? = null

    @JsonProperty("quantity1DAPNote")
    var quantity1DAPNote: String? = null

    @JsonProperty("quantity1MOPNote")
    var quantity1MOPNote: String? = null

    @JsonProperty("quantity1NPKNote")
    var quantity1NPKNote: String? = null

    @JsonProperty("split2Note")
    var split2Note: String? = null

    @JsonProperty("quantity2UreaNote")
    var quantity2UreaNote: String? = null

    @JsonProperty("quantity2TSPNote")
    var quantity2TSPNote: String? = null

    @JsonProperty("quantity2DAPNote")
    var quantity2DAPNote: String? = null

    @JsonProperty("quantity2NafakaNote")
    var quantity2NafakaNote: String? = null

    @JsonProperty("quantity2MOPNote")
    var quantity2MOPNote: String? = null

    @JsonProperty("quantity2NPKNote")
    var quantity2NPKNote: String? = null

    @JsonProperty("call")
    var callValue: String? = null

    @JsonProperty("confirmVAL")
    var confirmVal: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}