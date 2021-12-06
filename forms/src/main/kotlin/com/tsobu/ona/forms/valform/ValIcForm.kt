package com.tsobu.ona.forms.valform

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class ValIcForm {
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

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

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
    var deviceId: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("plotSize")
    var plotSize: String? = null

    @JsonProperty("urea1_AB")
    var urea1Ab: String? = null

    @JsonProperty("urea2_AB")
    var urea2Ab: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: String?=null

    @JsonProperty("_xform_id")
    var xFormId: String? = null

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
    var purposeVal: String? = null

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
    var riskRatio2Ab: String? = null

    @JsonProperty("thankyou/call")
    var callValue: String? = null

    @JsonProperty("costFertilizer")
    var costFertilizer: String? = null

    @JsonProperty("profitExtra_AB")
    var profitExtraAb: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("profitExtraPlot")
    var profitExtraPlot: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("unitPriceNPK50kg")
    var unitPriceNpk50kg: String? = null

    @JsonProperty("costFertilizer_AB")
    var costFertilizerAb: String? = null

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
    var unitPriceNpk50kgAb: String? = null

    @JsonProperty("valueExtraCobsLarge")
    var valueExtraCobsLarge: String? = null

    @JsonProperty("cassavaVarietySelect")
    var cassavaVarietySelect: String? = null

    @JsonProperty("numberExtraCobsLarge")
    var numberExtraCobsLarge: String? = null

    @JsonProperty("unitPriceUrea50kg_AB")
    var unitPriceUrea50kgAb: String? = null

    @JsonProperty("costFertilizer_ABText")
    var costFertilizerABText: String? = null

    @JsonProperty("costDetailsNPK/costNPK")
    var costNpk: String? = null

    @JsonProperty("valueExtraCobsLarge_AB")
    var valueExtraCobsLargeAb: String? = null

    @JsonProperty("numberExtraCobsLarge_AB")
    var numberExtraCobsLargeAb: String? = null

    @JsonProperty("priceDetails/priceRoots")
    var priceRoots: String? = null

    @JsonProperty("priceExtraCobsLargePlot")
    var priceExtraCobsLargePlot: String? = null

    @JsonProperty("costDetailsUrea/costUrea")
    var costDetailsUreaCostUrea: String? = null

    @JsonProperty("numberExtraCobsLargePlot")
    var numberExtraCobsLargePlot: String? = null

    @JsonProperty("costDetailsNPK/bagSizeNPK")
    var costDetailsNPKBagSizeNpk: String? = null

    @JsonProperty("previousMaize/heightMaize")
    var previousMaizeHeightMaize: String? = null

    @JsonProperty("costDetailsUrea/bagSizeUrea")
    var costDetailsUreaBagSizeUrea: String? = null

    @JsonProperty("priceDetails/priceMaizeCobFreshLarge")
    var priceMaizeCobFreshLarge: String? = null

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
    var valueExtraGrainAb: String? = null

    @JsonProperty("valueExtraGrainPlot")
    var valueExtraGrainPlot: String? = null

    @JsonProperty("quantityExtraGrain_AB")
    var quantityExtraGrainAb: String? = null

    @JsonProperty("quantityExtraGrainPlot")
    var quantityExtraGrainPlot: String? = null

    @JsonProperty("maizeGrainUnitName")
    var maizeGrainUnitName: String? = null

    @JsonProperty("maizeGrainUnitDetails/maizeGrainUnitPrice")
    var maizeGrainUnitDetailsMaizeGrainUnitPrice: String? = null

    @JsonProperty("maizeGrainUnitDetails/maizeGrainUnitWeight")
    var maizeGrainUnitDetailsMaizeGrainUnitWeight: String?=null
}