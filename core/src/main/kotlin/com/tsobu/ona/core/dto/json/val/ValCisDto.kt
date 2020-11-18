package com.tsobu.ona.core.dto.json.`val`

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "intro2", "VAL", "EAID", "HHID", "countrySelect", "country", "currency", "conversion", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "lat", "lon", "plantingDate", "yieldLevel", "sweetPotatoVarietySelect", "sweetPotatoVarietyOther", "cassavaVarietySelect", "cassavaVarietyOther", "cassavaVarietyType", "areaBasis", "bagSizeNPK", "costNPK", "rootsUnit", "rootsPriceSI", "rootsUnitName", "rootsUnitWeight", "rootsUnitPrice", "rootsPrice", "tuberUnit", "tuberPriceSI", "tuberUnitName", "tuberUnitWeight", "tuberUnitPrice", "tuberPrice", "rootYieldMC", "tuberYieldMC", "rootYieldRedIC", "tuberYieldRedIC", "extraRootYieldMCF", "extraTuberYieldMCF", "rootGRMC", "rootGRIC", "tuberGRIC", "totalGRIC", "extraGRIC", "importanceIC", "unitPriceNPK50kg", "costFertilizer", "rateFertilizerAB_Text", "costFertilizerAB", "costFertilizerAB_Text", "riskAttitude", "rootGRMCF", "rootGRICF", "tuberGRICF", "totalGRICF", "extraGRMCF", "extraGRICF", "rec", "extraProfit", "extraProfitPerc", "rec_MC", "rec_IC", "rec_ICF", "validationNote", "validationPlot1", "validationPlot2", "validationPlot3", "validationPlot4", "call", "confirmVAL", "end", "instanceID", "KEY")
class ValCisDto {
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

    @JsonProperty("yieldLevel")
    var yieldLevel: String? = null

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
    var bagSizeNPK: String? = null

    @JsonProperty("costNPK")
    var costNPK: String? = null

    @JsonProperty("rootsUnit")
    var rootsUnit: String? = null

    @JsonProperty("rootsPriceSI")
    var rootsPriceSi: Any? = null

    @JsonProperty("rootsUnitName")
    var rootsUnitName: String? = null

    @JsonProperty("rootsUnitWeight")
    var rootsUnitWeight: String? = null

    @JsonProperty("rootsUnitPrice")
    var rootsUnitPrice: String? = null

    @JsonProperty("rootsPrice")
    var rootsPrice: String? = null

    @JsonProperty("tuberUnit")
    var tuberUnit: String? = null

    @JsonProperty("tuberPriceSI")
    var tuberPriceSi: Any? = null

    @JsonProperty("tuberUnitName")
    var tuberUnitName: String? = null

    @JsonProperty("tuberUnitWeight")
    var tuberUnitWeight: String? = null

    @JsonProperty("tuberUnitPrice")
    var tuberUnitPrice: String? = null

    @JsonProperty("tuberPrice")
    var tuberPrice: String? = null

    @JsonProperty("rootYieldMC")
    var rootYieldMC: String? = null

    @JsonProperty("tuberYieldMC")
    var tuberYieldMC: String? = null

    @JsonProperty("rootYieldRedIC")
    var rootYieldRedIC: String? = null

    @JsonProperty("tuberYieldRedIC")
    var tuberYieldRedIC: String? = null

    @JsonProperty("extraRootYieldMCF")
    var extraRootYieldMCF: String? = null

    @JsonProperty("extraTuberYieldMCF")
    var extraTuberYieldMCF: String? = null

    @JsonProperty("rootGRMC")
    var rootGRMC: String? = null

    @JsonProperty("rootGRIC")
    var rootGRIC: String? = null

    @JsonProperty("tuberGRIC")
    var tuberGRIC: String? = null

    @JsonProperty("totalGRIC")
    var totalGRIC: String? = null

    @JsonProperty("extraGRIC")
    var extraGRIC: String? = null

    @JsonProperty("importanceIC")
    var importanceIC: String? = null

    @JsonProperty("unitPriceNPK50kg")
    var unitPriceNPK50kg: String? = null

    @JsonProperty("costFertilizer")
    var costFertilizer: String? = null

    @JsonProperty("rateFertilizerAB_Text")
    var rateFertilizerABText: String? = null

    @JsonProperty("costFertilizerAB")
    var costFertilizerAB: String? = null

    @JsonProperty("costFertilizerAB_Text")
    var costFertilizerABText: String? = null

    @JsonProperty("riskAttitude")
    var riskAttitude: String? = null

    @JsonProperty("rootGRMCF")
    var rootGRMCF: String? = null

    @JsonProperty("rootGRICF")
    var rootGRICF: String? = null

    @JsonProperty("tuberGRICF")
    var tuberGRICF: String? = null

    @JsonProperty("totalGRICF")
    var totalGRICF: String? = null

    @JsonProperty("extraGRMCF")
    var extraGRMCF: String? = null

    @JsonProperty("extraGRICF")
    var extraGRICF: String? = null

    @JsonProperty("rec")
    var rec: String? = null

    @JsonProperty("extraProfit")
    var extraProfit: String? = null

    @JsonProperty("extraProfitPerc")
    var extraProfitPerc: String? = null

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