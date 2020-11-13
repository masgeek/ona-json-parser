package com.tsobu.ona.core.dto.json.`val`

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "intro2", "VAL", "EAID", "HHID", "countrySelect", "country", "currency", "conversion", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "lat", "lon", "plantingDate", "season", "plantingWeek0", "harvestDate", "harvestWeek0", "harvestWeekm1", "harvestWeekm2", "harvestWeekm3", "harvestWeekm4", "harvestWeekp1", "harvestWeekp2", "harvestWeekp3", "harvestWeekp4", "harvestAge0", "harvestAgem1", "harvestAgem2", "harvestAgem3", "harvestAgem4", "harvestAgep1", "harvestAgep2", "harvestAgep3", "harvestAgep4", "check_id", "check", "variety", "plantingDensity", "betweenRow", "withinRow", "areaBasis", "plotL", "plotW", "plotSize", "yieldLevel", "priceStarch", "starchFactory", "SC1", "SC2", "SC3", "SC4", "SC5", "SC6", "SC7", "SC8", "SC9", "SC10", "SC11", "SC12", "priceSC1", "priceSC2", "priceSC3", "priceSC4", "priceSC5", "priceSC6", "priceSC7", "priceSC8", "priceSC9", "priceSC10", "priceSC11", "priceSC12", "product", "transformRatio", "unit", "unitNameSelect", "unitNameOther", "unitWeightOther", "unitName", "unitLocalWeight", "unitWeight", "priceNote", "priceRm4", "priceRm2", "priceR0", "priceRp2", "priceRp4", "price0", "pricem1", "pricem2", "pricem3", "pricem4", "pricep1", "pricep2", "pricep3", "pricep4", "noRecommendationNote", "lookupp0h0_id", "lookupp0hm1_id", "lookupp0hm2_id", "lookupp0hm3_id", "lookupp0hm4_id", "lookupp0hp1_id", "lookupp0hp2_id", "lookupp0hp3_id", "lookupp0hp4_id", "WYp0h0", "WYp0hm1", "WYp0hm2", "WYp0hm3", "WYp0hm4", "WYp0hp1", "WYp0hp2", "WYp0hp3", "WYp0hp4", "CYp0h0", "CYp0hm1", "CYp0hm2", "CYp0hm3", "CYp0hm4", "CYp0hp1", "CYp0hp2", "CYp0hp3", "CYp0hp4", "SC0", "SCm1", "SCm2", "SCm3", "SCm4", "SCp1", "SCp2", "SCp3", "SCp4", "priceSC0", "priceSCm1", "priceSCm2", "priceSCm3", "priceSCm4", "priceSCp1", "priceSCp2", "priceSCp3", "priceSCp4", "Yp0h0", "Yp0h0_AB", "Yp0hm1", "Yp0hm2", "Yp0hm3", "Yp0hm4", "Yp0hp1", "Yp0hp2", "Yp0hp3", "Yp0hp4", "GRp0h0", "GRp0h0_AB", "GRp0h0_ABcurr", "GRp0hm1", "GRp0hm2", "GRp0hm3", "GRp0hm4", "GRp0hp1", "GRp0hp2", "GRp0hp3", "GRp0hp4", "Pp0h0", "Pp0hm1", "Pp0hm2", "Pp0hm3", "Pp0hm4", "Pp0hp1", "Pp0hp2", "Pp0hp3", "Pp0hp4", "GPp0h0", "GPp0h0curr", "GPp0hm1", "GPp0hm2", "GPp0hm3", "GPp0hm4", "GPp0hp1", "GPp0hp2", "GPp0hp3", "GPp0hp4", "GRmax", "GRmax_AB", "GRdif", "GRdif_AB", "GRdif_ABcurr", "GPmax", "GPdif", "GPdifcurr", "optHarvest", "optHarvestText", "Yh0p0Note", "optHarvestNote", "difHarvestNote", "GRdifNote", "GRmaxNote", "sensible", "validationNote", "validationNote2", "validationNote3", "call", "confirmVAL", "end", "instanceID", "KEY")
class ValSphsOgDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var formHubUuId:String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

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
    var geoPointLatitude: String? = null

    @JsonProperty("geopoint-Longitude")
    var geoPointLongitude: String? = null

    @JsonProperty("geopoint-Altitude")
    var geoPointAltitude: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geoPointAccuracy: String? = null

    @JsonProperty("lat")
    var lat: String? = null

    @JsonProperty("lon")
    var lon: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("season")
    var season: String? = null

    @JsonProperty("plantingWeek0")
    var plantingWeek0: String? = null

    @JsonProperty("harvestDate")
    var harvestDate: String? = null

    @JsonProperty("harvestWeek0")
    var harvestWeek0: String? = null

    @JsonProperty("harvestWeekm1")
    var harvestWeekm1: String? = null

    @JsonProperty("harvestWeekm2")
    var harvestWeekm2: String? = null

    @JsonProperty("harvestWeekm3")
    var harvestWeekm3: String? = null

    @JsonProperty("harvestWeekm4")
    var harvestWeekm4: String? = null

    @JsonProperty("harvestWeekp1")
    var harvestWeekp1: String? = null

    @JsonProperty("harvestWeekp2")
    var harvestWeekp2: String? = null

    @JsonProperty("harvestWeekp3")
    var harvestWeekp3: String? = null

    @JsonProperty("harvestWeekp4")
    var harvestWeekp4: String? = null

    @JsonProperty("harvestAge0")
    var harvestAge0: String? = null

    @JsonProperty("harvestAgem1")
    var harvestAgem1: String? = null

    @JsonProperty("harvestAgem2")
    var harvestAgem2: String? = null

    @JsonProperty("harvestAgem3")
    var harvestAgem3: String? = null

    @JsonProperty("harvestAgem4")
    var harvestAgem4: String? = null

    @JsonProperty("harvestAgep1")
    var harvestAgep1: String? = null

    @JsonProperty("harvestAgep2")
    var harvestAgep2: String? = null

    @JsonProperty("harvestAgep3")
    var harvestAgep3: String? = null

    @JsonProperty("harvestAgep4")
    var harvestAgep4: String? = null

    @JsonProperty("check_id")
    var checkId: String? = null

    @JsonProperty("check")
    var checkValue: String? = null

    @JsonProperty("variety")
    var variety: String? = null

    @JsonProperty("plantingDensity")
    var plantingDensity: String? = null

    @JsonProperty("betweenRow")
    var betweenRow: Any? = null

    @JsonProperty("withinRow")
    var withinRow: Any? = null

    @JsonProperty("areaBasis")
    var areaBasis: String? = null

    @JsonProperty("plotL")
    var plotLength: String? = null

    @JsonProperty("plotW")
    var plotWidth: String? = null

    @JsonProperty("plotSize")
    var plotSize: String? = null

    @JsonProperty("yieldLevel")
    var yieldLevel: String? = null

    @JsonProperty("priceStarch")
    var priceStarch: String? = null

    @JsonProperty("starchFactory")
    var starchFactory: String? = null

    @JsonProperty("SC1")
    var sc1: String? = null

    @JsonProperty("SC2")
    var sc2: String? = null

    @JsonProperty("SC3")
    var sc3: String? = null

    @JsonProperty("SC4")
    var sc4: String? = null

    @JsonProperty("SC5")
    var sc5: String? = null

    @JsonProperty("SC6")
    var sc6: String? = null

    @JsonProperty("SC7")
    var sc7: Any? = null

    @JsonProperty("SC8")
    var sc8: Any? = null

    @JsonProperty("SC9")
    var sc9: String? = null

    @JsonProperty("SC10")
    var sc10: String? = null

    @JsonProperty("SC11")
    var sc11: String? = null

    @JsonProperty("SC12")
    var sc12: String? = null

    @JsonProperty("priceSC1")
    var priceSc1: String? = null

    @JsonProperty("priceSC2")
    var priceSc2: String? = null

    @JsonProperty("priceSC3")
    var priceSc3: String? = null

    @JsonProperty("priceSC4")
    var priceSc4: String? = null

    @JsonProperty("priceSC5")
    var priceSc5: String? = null

    @JsonProperty("priceSC6")
    var priceSc6: String? = null

    @JsonProperty("priceSC7")
    var priceSc7: Any? = null

    @JsonProperty("priceSC8")
    var priceSc8: Any? = null

    @JsonProperty("priceSC9")
    var priceSc9: String? = null

    @JsonProperty("priceSC10")
    var priceSc10: String? = null

    @JsonProperty("priceSC11")
    var priceSc11: String? = null

    @JsonProperty("priceSC12")
    var priceSc12: String? = null

    @JsonProperty("product")
    var product: String? = null

    @JsonProperty("transformRatio")
    var transformRatio: Any? = null

    @JsonProperty("unit")
    var unit: String? = null

    @JsonProperty("unitNameSelect")
    var unitNameSelect: String? = null

    @JsonProperty("unitNameOther")
    var unitNameOther: String? = null

    @JsonProperty("unitWeightOther")
    var unitWeightOther: String? = null

    @JsonProperty("unitName")
    var unitName: String? = null

    @JsonProperty("unitLocalWeight")
    var unitLocalWeight: Any? = null

    @JsonProperty("unitWeight")
    var unitWeight: Any? = null

    @JsonProperty("priceNote")
    var priceNote: String? = null

    @JsonProperty("priceRm4")
    var priceRm4: Any? = null

    @JsonProperty("priceRm2")
    var priceRm2: Any? = null

    @JsonProperty("priceR0")
    var priceR0: Any? = null

    @JsonProperty("priceRp2")
    var priceRp2: Any? = null

    @JsonProperty("priceRp4")
    var priceRp4: Any? = null

    @JsonProperty("price0")
    var price0: Any? = null

    @JsonProperty("pricem1")
    var pricem1: Any? = null

    @JsonProperty("pricem2")
    var pricem2: Any? = null

    @JsonProperty("pricem3")
    var pricem3: Any? = null

    @JsonProperty("pricem4")
    var pricem4: Any? = null

    @JsonProperty("pricep1")
    var pricep1: Any? = null

    @JsonProperty("pricep2")
    var pricep2: Any? = null

    @JsonProperty("pricep3")
    var pricep3: Any? = null

    @JsonProperty("pricep4")
    var pricep4: Any? = null

    @JsonProperty("noRecommendationNote")
    var noRecommendationNote: String? = null

    @JsonProperty("lookupp0h0_id")
    var lookupp0h0Id: String? = null

    @JsonProperty("lookupp0hm1_id")
    var lookupp0hm1Id: String? = null

    @JsonProperty("lookupp0hm2_id")
    var lookupp0hm2Id: String? = null

    @JsonProperty("lookupp0hm3_id")
    var lookupp0hm3Id: String? = null

    @JsonProperty("lookupp0hm4_id")
    var lookupp0hm4Id: String? = null

    @JsonProperty("lookupp0hp1_id")
    var lookupp0hp1Id: String? = null

    @JsonProperty("lookupp0hp2_id")
    var lookupp0hp2Id: String? = null

    @JsonProperty("lookupp0hp3_id")
    var lookupp0hp3Id: String? = null

    @JsonProperty("lookupp0hp4_id")
    var lookupp0hp4Id: String? = null

    @JsonProperty("WYp0h0")
    var wyP0h0: String? = null

    @JsonProperty("WYp0hm1")
    var wyP0hm1: String? = null

    @JsonProperty("WYp0hm2")
    var wyP0hm2: String? = null

    @JsonProperty("WYp0hm3")
    var wyP0hm3: String? = null

    @JsonProperty("WYp0hm4")
    var wyP0hm4: String? = null

    @JsonProperty("WYp0hp1")
    var wyP0hp1: String? = null

    @JsonProperty("WYp0hp2")
    var wyP0hp2: Any? = null

    @JsonProperty("WYp0hp3")
    var wyP0hp3: Any? = null

    @JsonProperty("WYp0hp4")
    var wyP0hp4: Any? = null

    @JsonProperty("CYp0h0")
    var cyP0h0: String? = null

    @JsonProperty("CYp0hm1")
    var cyP0hm1: String? = null

    @JsonProperty("CYp0hm2")
    var cyP0hm2: String? = null

    @JsonProperty("CYp0hm3")
    var cyP0hm3: String? = null

    @JsonProperty("CYp0hm4")
    var cyP0hm4: String? = null

    @JsonProperty("CYp0hp1")
    var cyP0hp1: String? = null

    @JsonProperty("CYp0hp2")
    var cyP0hp2: Any? = null

    @JsonProperty("CYp0hp3")
    var cyP0hp3: Any? = null

    @JsonProperty("CYp0hp4")
    var cyP0hp4: Any? = null

    @JsonProperty("SC0")
    var sc0: String? = null

    @JsonProperty("SCm1")
    var scM1: String? = null

    @JsonProperty("SCm2")
    var scM2: String? = null

    @JsonProperty("SCm3")
    var scM3: String? = null

    @JsonProperty("SCm4")
    var scM4: String? = null

    @JsonProperty("SCp1")
    var scP1: String? = null

    @JsonProperty("SCp2")
    var scP2: String? = null

    @JsonProperty("SCp3")
    var scP3: String? = null

    @JsonProperty("SCp4")
    var scP4: String? = null

    @JsonProperty("priceSC0")
    var priceSc0: String? = null

    @JsonProperty("priceSCm1")
    var priceScm1: String? = null

    @JsonProperty("priceSCm2")
    var priceScm2: String? = null

    @JsonProperty("priceSCm3")
    var priceScm3: String? = null

    @JsonProperty("priceSCm4")
    var priceScm4: String? = null

    @JsonProperty("priceSCp1")
    var priceScp1: String? = null

    @JsonProperty("priceSCp2")
    var priceScp2: String? = null

    @JsonProperty("priceSCp3")
    var priceScp3: String? = null

    @JsonProperty("priceSCp4")
    var priceScp4: String? = null

    @JsonProperty("Yp0h0")
    var yp0h0: String? = null

    @JsonProperty("Yp0h0_AB")
    var yp0h0Ab: String? = null

    @JsonProperty("Yp0hm1")
    var yp0hm1: String? = null

    @JsonProperty("Yp0hm2")
    var yp0hm2: String? = null

    @JsonProperty("Yp0hm3")
    var yp0hm3: String? = null

    @JsonProperty("Yp0hm4")
    var yp0hm4: String? = null

    @JsonProperty("Yp0hp1")
    var yp0hp1: String? = null

    @JsonProperty("Yp0hp2")
    var yp0hp2: Any? = null

    @JsonProperty("Yp0hp3")
    var yp0hp3: Any? = null

    @JsonProperty("Yp0hp4")
    var yp0hp4: Any? = null

    @JsonProperty("GRp0h0")
    var grP0h0: String? = null

    @JsonProperty("GRp0h0_AB")
    var grP0h0Ab: String? = null

    @JsonProperty("GRp0h0_ABcurr")
    var grP0h0ABCurr: String? = null

    @JsonProperty("GRp0hm1")
    var grP0hm1: String? = null

    @JsonProperty("GRp0hm2")
    var grP0hm2: String? = null

    @JsonProperty("GRp0hm3")
    var grP0hm3: String? = null

    @JsonProperty("GRp0hm4")
    var grP0hm4: String? = null

    @JsonProperty("GRp0hp1")
    var grP0hp1: String? = null

    @JsonProperty("GRp0hp2")
    var grP0hp2: Any? = null

    @JsonProperty("GRp0hp3")
    var grP0hp3: Any? = null

    @JsonProperty("GRp0hp4")
    var grP0hp4: Any? = null

    @JsonProperty("Pp0h0")
    var pp0h0: String? = null

    @JsonProperty("Pp0hm1")
    var pp0hm1: String? = null

    @JsonProperty("Pp0hm2")
    var pp0hm2: String? = null

    @JsonProperty("Pp0hm3")
    var pp0hm3: String? = null

    @JsonProperty("Pp0hm4")
    var pp0hm4: String? = null

    @JsonProperty("Pp0hp1")
    var pp0hp1: String? = null

    @JsonProperty("Pp0hp2")
    var pp0hp2: Any? = null

    @JsonProperty("Pp0hp3")
    var pp0hp3: Any? = null

    @JsonProperty("Pp0hp4")
    var pp0hp4: Any? = null

    @JsonProperty("GPp0h0")
    var gpP0h0: String? = null

    @JsonProperty("GPp0h0curr")
    var gpP0h0Curr: String? = null

    @JsonProperty("GPp0hm1")
    var gpP0hm1: String? = null

    @JsonProperty("GPp0hm2")
    var gpP0hm2: String? = null

    @JsonProperty("GPp0hm3")
    var gpP0hm3: String? = null

    @JsonProperty("GPp0hm4")
    var gpP0hm4: String? = null

    @JsonProperty("GPp0hp1")
    var gpP0hp1: String? = null

    @JsonProperty("GPp0hp2")
    var gpP0hp2: Any? = null

    @JsonProperty("GPp0hp3")
    var gpP0hp3: Any? = null

    @JsonProperty("GPp0hp4")
    var gpP0hp4: Any? = null

    @JsonProperty("GRmax")
    var grMax: String? = null

    @JsonProperty("GRmax_AB")
    var grMaxAb: String? = null

    @JsonProperty("GRdif")
    var grDif: String? = null

    @JsonProperty("GRdif_AB")
    var grDifAb: String? = null

    @JsonProperty("GRdif_ABcurr")
    var grDifAbCurr: String? = null

    @JsonProperty("GPmax")
    var gpMax: String? = null

    @JsonProperty("GPdif")
    var gpDif: String? = null

    @JsonProperty("GPdifcurr")
    var gpDifCurr: String? = null

    @JsonProperty("optHarvest")
    var optHarvest: String? = null

    @JsonProperty("optHarvestText")
    var optHarvestText: String? = null

    @JsonProperty("Yh0p0Note")
    var yh0p0Note: String? = null

    @JsonProperty("optHarvestNote")
    var optHarvestNote: String? = null

    @JsonProperty("difHarvestNote")
    var difHarvestNote: String? = null

    @JsonProperty("GRdifNote")
    var grDifNote: String? = null

    @JsonProperty("GRmaxNote")
    var grMaxNote: String? = null

    @JsonProperty("sensible")
    var sensible: String? = null

    @JsonProperty("validationNote")
    var validationNote: String? = null

    @JsonProperty("validationNote2")
    var validationNote2: String? = null

    @JsonProperty("validationNote3")
    var validationNote3: String? = null

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