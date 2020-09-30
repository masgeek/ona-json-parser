package com.tsobu.ona.core.dto.json.valdto

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "intro2", "VAL", "EAID", "HHID", "countrySelect", "country", "currency", "conversion", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "lat", "lon", "plantingDate", "season", "heightMaize", "previousMaizeVarietySelect", "previousMaizeVarietyOther", "previousMaizeVarietyDuration", "maizeVarietySelect", "maizeVarietyOther", "maizeVarietyDuration", "maizeVariety", "cassavaVarietySelect", "cassavaVarietyOther", "cassavaVarietyType", "areaBasis", "bagSizeNPK", "costNPK", "bagSizeUrea", "costUrea", "priceMaizeCobFreshLarge", "priceRoots", "maizeGrain", "maizeGrainUnit", "maizeGrainPriceKg", "maizeGrainUnitName", "maizeGrainUnitWeight", "maizeGrainUnitPrice", "maizeGrainPrice", "numberExtraCobsLarge", "valueExtraCobsLarge", "quantityExtraGrain", "valueExtraGrain", "grossExtraValue", "unitPriceNPK50kg", "unitPriceUrea50kg", "costFertilizer", "costFertilizerAreaBasis", "costFertilizerAreaBasis_Text", "riskAttitude", "profitExtra", "riskRatio2", "numberExtraCobsLarge_AB", "valueExtraCobsLarge_AB", "quantityExtraGrain_AB", "valueExtraGrain_AB", "unitPriceNPK50kg_AB", "unitPriceUrea50kg_AB", "costFertilizer_AB", "costFertilizer_ABText", "profitExtra_AB", "profitExtra_ABText", "riskRatio2_AB", "NPK_AB", "urea1_AB", "urea2_AB", "yieldLoss_cassava_ABText", "valueLoss_cassava_ABText", "reasonHD", "plotSize", "numberExtraCobsLargePlot", "priceExtraCobsLargePlot", "quantityExtraGrainPlot", "valueExtraGrainPlot", "costFertilizerPlot", "profitExtraPlot", "profitExtraPlotText", "NPKPlot", "urea1Plot", "urea2Plot", "recCol", "lowDensity_recommendation", "blanket_recommendation", "riskNote1", "riskNote2", "riskNote3", "profitNote1", "profitNote2", "profitNote3", "profitNote3_maizeGrain", "validationNote", "validationPlot1", "validationPlot1Note1", "validationPlot1Note2", "validationPlot1Note2_maizeGrain", "validationPlot2", "validationPlot3", "recNote", "call", "confirmVAL", "end", "instanceID", "KEY")
class ValIcDto {
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

    @JsonProperty("season")
    var season: Int? = null

    @JsonProperty("heightMaize")
    var heightMaize: String? = null

    @JsonProperty("previousMaizeVarietySelect")
    var previousMaizeVarietySelect: String? = null

    @JsonProperty("previousMaizeVarietyOther")
    var previousMaizeVarietyOther: String? = null

    @JsonProperty("previousMaizeVarietyDuration")
    var previousMaizeVarietyDuration: String? = null

    @JsonProperty("maizeVarietySelect")
    var maizeVarietySelect: String? = null

    @JsonProperty("maizeVarietyOther")
    var maizeVarietyOther: String? = null

    @JsonProperty("maizeVarietyDuration")
    var maizeVarietyDuration: String? = null

    @JsonProperty("maizeVariety")
    var maizeVariety: String? = null

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

    @JsonProperty("bagSizeUrea")
    var bagSizeUrea: Int? = null

    @JsonProperty("costUrea")
    var costUrea: Int? = null

    @JsonProperty("priceMaizeCobFreshLarge")
    var priceMaizeCobFreshLarge: Int? = null

    @JsonProperty("priceRoots")
    var priceRoots: Int? = null

    @JsonProperty("maizeGrain")
    var maizeGrain: String? = null

    @JsonProperty("maizeGrainUnit")
    var maizeGrainUnit: String? = null

    @JsonProperty("maizeGrainPriceKg")
    var maizeGrainPriceKg: Any? = null

    @JsonProperty("maizeGrainUnitName")
    var maizeGrainUnitName: String? = null

    @JsonProperty("maizeGrainUnitWeight")
    var maizeGrainUnitWeight: Any? = null

    @JsonProperty("maizeGrainUnitPrice")
    var maizeGrainUnitPrice: Any? = null

    @JsonProperty("maizeGrainPrice")
    var maizeGrainPrice: Any? = null

    @JsonProperty("numberExtraCobsLarge")
    var numberExtraCobsLarge: Int? = null

    @JsonProperty("valueExtraCobsLarge")
    var valueExtraCobsLarge: Int? = null

    @JsonProperty("quantityExtraGrain")
    var quantityExtraGrain: Any? = null

    @JsonProperty("valueExtraGrain")
    var valueExtraGrain: Any? = null

    @JsonProperty("grossExtraValue")
    var grossExtraValue: Int? = null

    @JsonProperty("unitPriceNPK50kg")
    var unitPriceNPK50kg: Int? = null

    @JsonProperty("unitPriceUrea50kg")
    var unitPriceUrea50kg: Int? = null

    @JsonProperty("costFertilizer")
    var costFertilizer: Int? = null

    @JsonProperty("costFertilizerAreaBasis")
    var costFertilizerAreaBasis: Int? = null

    @JsonProperty("costFertilizerAreaBasis_Text")
    var costFertilizerAreaBasisText: String? = null

    @JsonProperty("riskAttitude")
    var riskAttitude: Int? = null

    @JsonProperty("profitExtra")
    var profitExtra: Int? = null

    @JsonProperty("riskRatio2")
    var riskRatio2: Int? = null

    @JsonProperty("numberExtraCobsLarge_AB")
    var numberExtraCobsLargeAB: Int? = null

    @JsonProperty("valueExtraCobsLarge_AB")
    var valueExtraCobsLargeAB: Int? = null

    @JsonProperty("quantityExtraGrain_AB")
    var quantityExtraGrainAB: Any? = null

    @JsonProperty("valueExtraGrain_AB")
    var valueExtraGrainAB: Any? = null

    @JsonProperty("unitPriceNPK50kg_AB")
    var unitPriceNPK50kgAB: Int? = null

    @JsonProperty("unitPriceUrea50kg_AB")
    var unitPriceUrea50kgAB: Int? = null

    @JsonProperty("costFertilizer_AB")
    var costFertilizerAB: Int? = null

    @JsonProperty("costFertilizer_ABText")
    var costFertilizerABText: String? = null

    @JsonProperty("profitExtra_AB")
    var profitExtraAB: Int? = null

    @JsonProperty("profitExtra_ABText")
    var profitExtraABText: String? = null

    @JsonProperty("riskRatio2_AB")
    var riskRatio2AB: Int? = null

    @JsonProperty("NPK_AB")
    var npkAb: Int? = null

    @JsonProperty("urea1_AB")
    var urea1AB: Int? = null

    @JsonProperty("urea2_AB")
    var urea2AB: Int? = null

    @JsonProperty("yieldLoss_cassava_ABText")
    var yieldLossCassavaABText: String? = null

    @JsonProperty("valueLoss_cassava_ABText")
    var valueLossCassavaABText: String? = null

    @JsonProperty("reasonHD")
    var reasonHD: String? = null

    @JsonProperty("plotSize")
    var plotSize: Double? = null

    @JsonProperty("numberExtraCobsLargePlot")
    var numberExtraCobsLargePlot: Int? = null

    @JsonProperty("priceExtraCobsLargePlot")
    var priceExtraCobsLargePlot: Int? = null

    @JsonProperty("quantityExtraGrainPlot")
    var quantityExtraGrainPlot: Any? = null

    @JsonProperty("valueExtraGrainPlot")
    var valueExtraGrainPlot: Any? = null

    @JsonProperty("costFertilizerPlot")
    var costFertilizerPlot: Int? = null

    @JsonProperty("profitExtraPlot")
    var profitExtraPlot: Int? = null

    @JsonProperty("profitExtraPlotText")
    var profitExtraPlotText: String? = null

    @JsonProperty("NPKPlot")
    var nPKPlot: Int? = null

    @JsonProperty("urea1Plot")
    var urea1Plot: Int? = null

    @JsonProperty("urea2Plot")
    var urea2Plot: Int? = null

    @JsonProperty("recCol")
    var recCol: String? = null

    @JsonProperty("lowDensity_recommendation")
    var lowDensityRecommendation: String? = null

    @JsonProperty("blanket_recommendation")
    var blanketRecommendation: String? = null

    @JsonProperty("riskNote1")
    var riskNote1: String? = null

    @JsonProperty("riskNote2")
    var riskNote2: String? = null

    @JsonProperty("riskNote3")
    var riskNote3: String? = null

    @JsonProperty("profitNote1")
    var profitNote1: String? = null

    @JsonProperty("profitNote2")
    var profitNote2: String? = null

    @JsonProperty("profitNote3")
    var profitNote3: String? = null

    @JsonProperty("profitNote3_maizeGrain")
    var profitNote3MaizeGrain: String? = null

    @JsonProperty("validationNote")
    var validationNote: String? = null

    @JsonProperty("validationPlot1")
    var validationPlot1: String? = null

    @JsonProperty("validationPlot1Note1")
    var validationPlot1Note1: String? = null

    @JsonProperty("validationPlot1Note2")
    var validationPlot1Note2: String? = null

    @JsonProperty("validationPlot1Note2_maizeGrain")
    var validationPlot1Note2MaizeGrain: String? = null

    @JsonProperty("validationPlot2")
    var validationPlot2: String? = null

    @JsonProperty("validationPlot3")
    var validationPlot3: String? = null

    @JsonProperty("recNote")
    var recNote: String? = null

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