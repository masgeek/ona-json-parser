package com.tsobu.ona.forms.valform

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("_id", "end", "lat", "lon", "EAID", "HHID", "_tags", "_uuid", "start", "today", "NPK_AB", "_notes", "NPKPlot", "_edited", "_status", "country", "_version", "currency", "deviceid", "geopoint", "plotSize", "urea1_AB", "urea2_AB", "username", "_duration", "_xform_id", "areaBasis", "simserial", "urea1Plot", "urea2Plot", "conversion", "riskRatio2", "profitExtra", "purpose/VAL", "_attachments", "_geolocation", "_media_count", "_total_media", "formhub/uuid", "plantingDate", "subscriberid", "_submitted_by", "riskRatio2_AB", "thankyou/call", "costFertilizer", "profitExtra_AB", "meta/instanceID", "profitExtraPlot", "_submission_time", "_xform_id_string", "unitPriceNPK50kg", "costFertilizer_AB", "unitPriceUrea50kg", "_bamboo_dataset_id", "costFertilizerPlot", "maizeVarietySelect", "profitExtra_ABText", "_media_all_received", "profitExtraPlotText", "thankyou/confirmVAL", "unitPriceNPK50kg_AB", "valueExtraCobsLarge", "cassavaVarietySelect", "numberExtraCobsLarge", "unitPriceUrea50kg_AB", "costFertilizer_ABText", "costDetailsNPK/costNPK", "valueExtraCobsLarge_AB", "numberExtraCobsLarge_AB", "priceDetails/priceRoots", "priceExtraCobsLargePlot", "costDetailsUrea/costUrea", "numberExtraCobsLargePlot", "costDetailsNPK/bagSizeNPK", "previousMaize/heightMaize", "costDetailsUrea/bagSizeUrea", "priceDetails/priceMaizeCobFreshLarge", "previousMaize/previousMaizeVarietySelect", "previousMaizeVarietyDetails/previousMaizeVarietyOther", "previousMaizeVarietyDetails/previousMaizeVarietyDuration", "recCol", "season", "reasonHD", "maizeGrain", "maizeVariety", "riskAttitude", "grossExtraValue", "costFertilizerAreaBasis", "valueLoss_cassava_ABText", "yieldLoss_cassava_ABText", "costFertilizerAreaBasis_Text", "maizeGrainUnit", "maizeGrainPrice", "valueExtraGrain", "maizeGrainPriceKg", "quantityExtraGrain", "valueExtraGrain_AB", "valueExtraGrainPlot", "quantityExtraGrain_AB", "quantityExtraGrainPlot", "maizeGrainUnitName", "maizeGrainUnitDetails/maizeGrainUnitPrice", "maizeGrainUnitDetails/maizeGrainUnitWeight")
class ValIcForm {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var end: String? = null

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

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("NPK_AB")
    var npkAb: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("NPKPlot")
    var nPKPlot: String? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("plotSize")
    var plotSize: String? = null

    @JsonProperty("urea1_AB")
    var urea1AB: String? = null

    @JsonProperty("urea2_AB")
    var urea2AB: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId: String? = null

    @JsonProperty("areaBasis")
    var areaBasis: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("urea1Plot")
    var urea1Plot: String? = null

    @JsonProperty("urea2Plot")
    var urea2Plot: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("riskRatio2")
    var riskRatio2: String? = null

    @JsonProperty("profitExtra")
    var profitExtra: String? = null

    @JsonProperty("purpose/VAL")
    var purposeVAL: String? = null

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

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("riskRatio2_AB")
    var riskRatio2AB: String? = null

    @JsonProperty("thankyou/call")
    var callValue: String? = null

    @JsonProperty("costFertilizer")
    var costFertilizer: String? = null

    @JsonProperty("profitExtra_AB")
    var profitExtraAB: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("profitExtraPlot")
    var profitExtraPlot: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("unitPriceNPK50kg")
    var unitPriceNPK50kg: String? = null

    @JsonProperty("costFertilizer_AB")
    var costFertilizerAB: String? = null

    @JsonProperty("unitPriceUrea50kg")
    var unitPriceUrea50kg: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("costFertilizerPlot")
    var costFertilizerPlot: String? = null

    @JsonProperty("maizeVarietySelect")
    var maizeVarietySelect: String? = null

    @JsonProperty("profitExtra_ABText")
    var profitExtraABText: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("profitExtraPlotText")
    var profitExtraPlotText: String? = null

    @JsonProperty("thankyou/confirmVAL")
    var confirmVal: String? = null

    @JsonProperty("unitPriceNPK50kg_AB")
    var unitPriceNPK50kgAB: String? = null

    @JsonProperty("valueExtraCobsLarge")
    var valueExtraCobsLarge: String? = null

    @JsonProperty("cassavaVarietySelect")
    var cassavaVarietySelect: String? = null

    @JsonProperty("numberExtraCobsLarge")
    var numberExtraCobsLarge: String? = null

    @JsonProperty("unitPriceUrea50kg_AB")
    var unitPriceUrea50kgAB: String? = null

    @JsonProperty("costFertilizer_ABText")
    var costFertilizerABText: String? = null

    @JsonProperty("costDetailsNPK/costNPK")
    var costDetailsNPKCostNPK: String? = null

    @JsonProperty("valueExtraCobsLarge_AB")
    var valueExtraCobsLargeAB: String? = null

    @JsonProperty("numberExtraCobsLarge_AB")
    var numberExtraCobsLargeAB: String? = null

    @JsonProperty("priceDetails/priceRoots")
    var priceDetailsPriceRoots: String? = null

    @JsonProperty("priceExtraCobsLargePlot")
    var priceExtraCobsLargePlot: String? = null

    @JsonProperty("costDetailsUrea/costUrea")
    var costDetailsUreaCostUrea: String? = null

    @JsonProperty("numberExtraCobsLargePlot")
    var numberExtraCobsLargePlot: String? = null

    @JsonProperty("costDetailsNPK/bagSizeNPK")
    var costDetailsNPKBagSizeNPK: String? = null

    @JsonProperty("previousMaize/heightMaize")
    var previousMaizeHeightMaize: String? = null

    @JsonProperty("costDetailsUrea/bagSizeUrea")
    var costDetailsUreaBagSizeUrea: String? = null

    @JsonProperty("priceDetails/priceMaizeCobFreshLarge")
    var priceDetailsPriceMaizeCobFreshLarge: String? = null

    @JsonProperty("previousMaize/previousMaizeVarietySelect")
    var previousMaizePreviousMaizeVarietySelect: String? = null

    @JsonProperty("previousMaizeVarietyDetails/previousMaizeVarietyOther")
    var previousMaizeVarietyDetailsPreviousMaizeVarietyOther: String? = null

    @JsonProperty("previousMaizeVarietyDetails/previousMaizeVarietyDuration")
    var previousMaizeVarietyDetailsPreviousMaizeVarietyDuration: String? = null

    @JsonProperty("recCol")
    var recCol: String? = null

    @JsonProperty("season")
    var season: String? = null

    @JsonProperty("reasonHD")
    var reasonHD: String? = null

    @JsonProperty("maizeGrain")
    var maizeGrain: String? = null

    @JsonProperty("maizeVariety")
    var maizeVariety: String? = null

    @JsonProperty("riskAttitude")
    var riskAttitude: String? = null

    @JsonProperty("grossExtraValue")
    var grossExtraValue: String? = null

    @JsonProperty("costFertilizerAreaBasis")
    var costFertilizerAreaBasis: String? = null

    @JsonProperty("valueLoss_cassava_ABText")
    var valueLossCassavaABText: String? = null

    @JsonProperty("yieldLoss_cassava_ABText")
    var yieldLossCassavaABText: String? = null

    @JsonProperty("costFertilizerAreaBasis_Text")
    var costFertilizerAreaBasisText: String? = null

    @JsonProperty("maizeGrainUnit")
    var maizeGrainUnit: String? = null

    @JsonProperty("maizeGrainPrice")
    var maizeGrainPrice: String? = null

    @JsonProperty("valueExtraGrain")
    var valueExtraGrain: String? = null

    @JsonProperty("maizeGrainPriceKg")
    var maizeGrainPriceKg: String? = null

    @JsonProperty("quantityExtraGrain")
    var quantityExtraGrain: String? = null

    @JsonProperty("valueExtraGrain_AB")
    var valueExtraGrainAB: String? = null

    @JsonProperty("valueExtraGrainPlot")
    var valueExtraGrainPlot: String? = null

    @JsonProperty("quantityExtraGrain_AB")
    var quantityExtraGrainAB: String? = null

    @JsonProperty("quantityExtraGrainPlot")
    var quantityExtraGrainPlot: String? = null

    @JsonProperty("maizeGrainUnitName")
    var maizeGrainUnitName: String? = null

    @JsonProperty("maizeGrainUnitDetails/maizeGrainUnitPrice")
    var maizeGrainUnitDetailsMaizeGrainUnitPrice: String? = null

    @JsonProperty("maizeGrainUnitDetails/maizeGrainUnitWeight")
    var maizeGrainUnitDetailsMaizeGrainUnitWeight: Double? = null
}