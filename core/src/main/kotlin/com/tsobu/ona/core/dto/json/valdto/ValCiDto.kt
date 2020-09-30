package com.tsobu.ona.core.dto.json.valdto

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "intro2", "VAL", "EAID", "HHID", "countrySelect", "country", "currency", "conversion", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "lat", "lon", "plantingDate", "yieldLevel", "sweetPotatoVarietySelect", "sweetPotatoVarietyOther", "cassavaVarietySelect", "cassavaVarietyOther", "cassavaVarietyType", "areaBasis", "bagSizeNPK", "costNPK", "rootsUnit", "rootsPriceSI", "rootsUnitName", "rootsUnitWeight", "rootsUnitPrice", "rootsPrice", "tuberUnit", "tuberPriceSI", "tuberUnitName", "tuberUnitWeight", "tuberUnitPrice", "tuberPrice", "rootYieldMC", "tuberYieldMC", "rootYieldRedIC", "tuberYieldRedIC", "extraRootYieldMCF", "extraTuberYieldMCF", "rootGRMC", "rootGRIC", "tuberGRIC", "totalGRIC", "extraGRIC", "importanceIC", "unitPriceNPK50kg", "costFertilizer", "rateFertilizerAB_Text", "costFertilizerAB", "costFertilizerAB_Text", "riskAttitude", "rootGRMCF", "rootGRICF", "tuberGRICF", "totalGRICF", "extraGRMCF", "extraGRICF", "rec", "extraProfit", "extraProfitPerc", "rec_MC", "rec_IC", "rec_ICF", "validationNote", "validationPlot1", "validationPlot2", "validationPlot3", "validationPlot4", "call", "confirmVAL", "end", "instanceID", "KEY")
class ValCiDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("deviceid")
    var deviceid: Int? = null

    @JsonProperty("subscriberid")
    var subscriberid: Int? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("simserial")
    var simserial: Int? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("banner")
    var banner: String? = null

    @JsonProperty("intro")
    var intro: String? = null

    @JsonProperty("intro2")
    var intro2: String? = null

    @JsonProperty("VAL")
    var `val`: String? = null

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
    var conversion: Int? = null

    @JsonProperty("geopoint-Latitude")
    var geopointLatitude: Double? = null

    @JsonProperty("geopoint-Longitude")
    var geopointLongitude: Double? = null

    @JsonProperty("geopoint-Altitude")
    var geopointAltitude: Double? = null

    @JsonProperty("geopoint-Accuracy")
    var geopointAccuracy: Int? = null

    @JsonProperty("lat")
    var lat: Double? = null

    @JsonProperty("lon")
    var lon: Double? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("yieldLevel")
    var yieldLevel: Double? = null

    @JsonProperty("sweetPotatoVarietySelect")
    var sweetPotatoVarietySelect: String? = null

    @JsonProperty("sweetPotatoVarietyOther")
    var sweetPotatoVarietyOther: String? = null

    @JsonProperty("cassavaVarietySelect")
    var cassavaVarietySelect: String? = null

    @JsonProperty("cassavaVarietyOther")
    var cassavaVarietyOther: String? = null

    @JsonProperty("cassavaVarietyType")
    var cassavaVarietyType: String? = null

    @JsonProperty("areaBasis")
    var areaBasis: String? = null

    @JsonProperty("bagSizeNPK")
    var bagSizeNPK: Int? = null

    @JsonProperty("costNPK")
    var costNPK: Int? = null

    @JsonProperty("rootsUnit")
    var rootsUnit: String? = null

    @JsonProperty("rootsPriceSI")
    var rootsPriceSI: Any? = null

    @JsonProperty("rootsUnitName")
    var rootsUnitName: String? = null

    @JsonProperty("rootsUnitWeight")
    var rootsUnitWeight: Int? = null

    @JsonProperty("rootsUnitPrice")
    var rootsUnitPrice: Int? = null

    @JsonProperty("rootsPrice")
    var rootsPrice: Double? = null

    @JsonProperty("tuberUnit")
    var tuberUnit: String? = null

    @JsonProperty("tuberPriceSI")
    var tuberPriceSI: Any? = null

    @JsonProperty("tuberUnitName")
    var tuberUnitName: String? = null

    @JsonProperty("tuberUnitWeight")
    var tuberUnitWeight: Int? = null

    @JsonProperty("tuberUnitPrice")
    var tuberUnitPrice: Int? = null

    @JsonProperty("tuberPrice")
    var tuberPrice: Double? = null

    @JsonProperty("rootYieldMC")
    var rootYieldMC: Int? = null

    @JsonProperty("tuberYieldMC")
    var tuberYieldMC: Int? = null

    @JsonProperty("rootYieldRedIC")
    var rootYieldRedIC: Double? = null

    @JsonProperty("tuberYieldRedIC")
    var tuberYieldRedIC: Double? = null

    @JsonProperty("extraRootYieldMCF")
    var extraRootYieldMCF: Int? = null

    @JsonProperty("extraTuberYieldMCF")
    var extraTuberYieldMCF: Int? = null

    @JsonProperty("rootGRMC")
    var rootGRMC: Double? = null

    @JsonProperty("rootGRIC")
    var rootGRIC: Double? = null

    @JsonProperty("tuberGRIC")
    var tuberGRIC: Int? = null

    @JsonProperty("totalGRIC")
    var totalGRIC: Double? = null

    @JsonProperty("extraGRIC")
    var extraGRIC: Double? = null

    @JsonProperty("importanceIC")
    var importanceIC: Int? = null

    @JsonProperty("unitPriceNPK50kg")
    var unitPriceNPK50kg: Int? = null

    @JsonProperty("costFertilizer")
    var costFertilizer: Int? = null

    @JsonProperty("rateFertilizerAB_Text")
    var rateFertilizerABText: String? = null

    @JsonProperty("costFertilizerAB")
    var costFertilizerAB: Int? = null

    @JsonProperty("costFertilizerAB_Text")
    var costFertilizerABText: String? = null

    @JsonProperty("riskAttitude")
    var riskAttitude: Int? = null

    @JsonProperty("rootGRMCF")
    var rootGRMCF: Double? = null

    @JsonProperty("rootGRICF")
    var rootGRICF: Double? = null

    @JsonProperty("tuberGRICF")
    var tuberGRICF: Int? = null

    @JsonProperty("totalGRICF")
    var totalGRICF: Double? = null

    @JsonProperty("extraGRMCF")
    var extraGRMCF: Double? = null

    @JsonProperty("extraGRICF")
    var extraGRICF: Double? = null

    @JsonProperty("rec")
    var rec: String? = null

    @JsonProperty("extraProfit")
    var extraProfit: Double? = null

    @JsonProperty("extraProfitPerc")
    var extraProfitPerc: Int? = null

    @JsonProperty("rec_MC")
    var recMC: String? = null

    @JsonProperty("rec_IC")
    var recIC: String? = null

    @JsonProperty("rec_ICF")
    var recICF: String? = null

    @JsonProperty("validationNote")
    var validationNote: String? = null

    @JsonProperty("validationPlot1")
    var validationPlot1: String? = null

    @JsonProperty("validationPlot2")
    var validationPlot2: String? = null

    @JsonProperty("validationPlot3")
    var validationPlot3: String? = null

    @JsonProperty("validationPlot4")
    var validationPlot4: String? = null

    @JsonProperty("call")
    var call: String? = null

    @JsonProperty("confirmVAL")
    var confirmVAL: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("instanceID")
    var instanceID: String? = null

    @JsonProperty("KEY")
    var key: String? = null
}