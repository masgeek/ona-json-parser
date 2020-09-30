package com.tsobu.ona.core.dto.json.valdto

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "intro2", "VAL", "EAID", "HHID", "countrySelect", "country", "currency", "conversion", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "lat", "lon", "plantingDate", "season", "plantingWeek0", "harvestDate", "harvestWeek0", "harvestWeekm1", "harvestWeekm2", "harvestWeekm3", "harvestWeekm4", "harvestWeekp1", "harvestWeekp2", "harvestWeekp3", "harvestWeekp4", "harvestAge0", "harvestAgem1", "harvestAgem2", "harvestAgem3", "harvestAgem4", "harvestAgep1", "harvestAgep2", "harvestAgep3", "harvestAgep4", "check_id", "check", "variety", "plantingDensity", "betweenRow", "withinRow", "areaBasis", "plotL", "plotW", "plotSize", "yieldLevel", "priceStarch", "starchFactory", "SC1", "SC2", "SC3", "SC4", "SC5", "SC6", "SC7", "SC8", "SC9", "SC10", "SC11", "SC12", "priceSC1", "priceSC2", "priceSC3", "priceSC4", "priceSC5", "priceSC6", "priceSC7", "priceSC8", "priceSC9", "priceSC10", "priceSC11", "priceSC12", "product", "transformRatio", "unit", "unitNameSelect", "unitNameOther", "unitWeightOther", "unitName", "unitLocalWeight", "unitWeight", "priceNote", "priceRm4", "priceRm2", "priceR0", "priceRp2", "priceRp4", "price0", "pricem1", "pricem2", "pricem3", "pricem4", "pricep1", "pricep2", "pricep3", "pricep4", "noRecommendationNote", "lookupp0h0_id", "lookupp0hm1_id", "lookupp0hm2_id", "lookupp0hm3_id", "lookupp0hm4_id", "lookupp0hp1_id", "lookupp0hp2_id", "lookupp0hp3_id", "lookupp0hp4_id", "WYp0h0", "WYp0hm1", "WYp0hm2", "WYp0hm3", "WYp0hm4", "WYp0hp1", "WYp0hp2", "WYp0hp3", "WYp0hp4", "CYp0h0", "CYp0hm1", "CYp0hm2", "CYp0hm3", "CYp0hm4", "CYp0hp1", "CYp0hp2", "CYp0hp3", "CYp0hp4", "SC0", "SCm1", "SCm2", "SCm3", "SCm4", "SCp1", "SCp2", "SCp3", "SCp4", "priceSC0", "priceSCm1", "priceSCm2", "priceSCm3", "priceSCm4", "priceSCp1", "priceSCp2", "priceSCp3", "priceSCp4", "Yp0h0", "Yp0h0_AB", "Yp0hm1", "Yp0hm2", "Yp0hm3", "Yp0hm4", "Yp0hp1", "Yp0hp2", "Yp0hp3", "Yp0hp4", "GRp0h0", "GRp0h0_AB", "GRp0h0_ABcurr", "GRp0hm1", "GRp0hm2", "GRp0hm3", "GRp0hm4", "GRp0hp1", "GRp0hp2", "GRp0hp3", "GRp0hp4", "Pp0h0", "Pp0hm1", "Pp0hm2", "Pp0hm3", "Pp0hm4", "Pp0hp1", "Pp0hp2", "Pp0hp3", "Pp0hp4", "GPp0h0", "GPp0h0curr", "GPp0hm1", "GPp0hm2", "GPp0hm3", "GPp0hm4", "GPp0hp1", "GPp0hp2", "GPp0hp3", "GPp0hp4", "GRmax", "GRmax_AB", "GRdif", "GRdif_AB", "GRdif_ABcurr", "GPmax", "GPdif", "GPdifcurr", "optHarvest", "optHarvestText", "Yh0p0Note", "optHarvestNote", "difHarvestNote", "GRdifNote", "GRmaxNote", "sensible", "validationNote", "validationNote2", "validationNote3", "call", "confirmVAL", "end", "instanceID", "KEY")
class ValSphsOnDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

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
    var phonenumber: Any? = null

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
    var conversion: String? = null

    @JsonProperty("geopoint-Latitude")
    var geopointLatitude: Double? = null

    @JsonProperty("geopoint-Longitude")
    var geopointLongitude: Double? = null

    @JsonProperty("geopoint-Altitude")
    var geopointAltitude: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geopointAccuracy: Double? = null

    @JsonProperty("lat")
    var lat: Double? = null

    @JsonProperty("lon")
    var lon: Double? = null

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
    var check: Double? = null

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
    var plotL: Double? = null

    @JsonProperty("plotW")
    var plotW: String? = null

    @JsonProperty("plotSize")
    var plotSize: Double? = null

    @JsonProperty("yieldLevel")
    var yieldLevel: Double? = null

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
    var sc7: String? = null

    @JsonProperty("SC8")
    var sc8: String? = null

    @JsonProperty("SC9")
    var sc9: String? = null

    @JsonProperty("SC10")
    var sc10: String? = null

    @JsonProperty("SC11")
    var sc11: String? = null

    @JsonProperty("SC12")
    var sc12: String? = null

    @JsonProperty("priceSC1")
    var priceSC1: String? = null

    @JsonProperty("priceSC2")
    var priceSC2: String? = null

    @JsonProperty("priceSC3")
    var priceSC3: String? = null

    @JsonProperty("priceSC4")
    var priceSC4: String? = null

    @JsonProperty("priceSC5")
    var priceSC5: String? = null

    @JsonProperty("priceSC6")
    var priceSC6: String? = null

    @JsonProperty("priceSC7")
    var priceSC7: String? = null

    @JsonProperty("priceSC8")
    var priceSC8: String? = null

    @JsonProperty("priceSC9")
    var priceSC9: String? = null

    @JsonProperty("priceSC10")
    var priceSC10: String? = null

    @JsonProperty("priceSC11")
    var priceSC11: String? = null

    @JsonProperty("priceSC12")
    var priceSC12: String? = null

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
    var wYp0h0: Double? = null

    @JsonProperty("WYp0hm1")
    var wYp0hm1: Double? = null

    @JsonProperty("WYp0hm2")
    var wYp0hm2: Double? = null

    @JsonProperty("WYp0hm3")
    var wYp0hm3: Double? = null

    @JsonProperty("WYp0hm4")
    var wYp0hm4: Double? = null

    @JsonProperty("WYp0hp1")
    var wYp0hp1: Double? = null

    @JsonProperty("WYp0hp2")
    var wYp0hp2: Double? = null

    @JsonProperty("WYp0hp3")
    var wYp0hp3: Double? = null

    @JsonProperty("WYp0hp4")
    var wYp0hp4: Double? = null

    @JsonProperty("CYp0h0")
    var cYp0h0: Double? = null

    @JsonProperty("CYp0hm1")
    var cYp0hm1: Double? = null

    @JsonProperty("CYp0hm2")
    var cYp0hm2: Double? = null

    @JsonProperty("CYp0hm3")
    var cYp0hm3: Double? = null

    @JsonProperty("CYp0hm4")
    var cYp0hm4: Double? = null

    @JsonProperty("CYp0hp1")
    var cYp0hp1: Double? = null

    @JsonProperty("CYp0hp2")
    var cYp0hp2: Double? = null

    @JsonProperty("CYp0hp3")
    var cYp0hp3: Double? = null

    @JsonProperty("CYp0hp4")
    var cYp0hp4: Double? = null

    @JsonProperty("SC0")
    var sc0: Double? = null

    @JsonProperty("SCm1")
    var sCm1: String? = null

    @JsonProperty("SCm2")
    var sCm2: String? = null

    @JsonProperty("SCm3")
    var sCm3: String? = null

    @JsonProperty("SCm4")
    var sCm4: Double? = null

    @JsonProperty("SCp1")
    var sCp1: Double? = null

    @JsonProperty("SCp2")
    var sCp2: Double? = null

    @JsonProperty("SCp3")
    var sCp3: Double? = null

    @JsonProperty("SCp4")
    var sCp4: Double? = null

    @JsonProperty("priceSC0")
    var priceSC0: String? = null

    @JsonProperty("priceSCm1")
    var priceSCm1: String? = null

    @JsonProperty("priceSCm2")
    var priceSCm2: String? = null

    @JsonProperty("priceSCm3")
    var priceSCm3: String? = null

    @JsonProperty("priceSCm4")
    var priceSCm4: String? = null

    @JsonProperty("priceSCp1")
    var priceSCp1: String? = null

    @JsonProperty("priceSCp2")
    var priceSCp2: String? = null

    @JsonProperty("priceSCp3")
    var priceSCp3: String? = null

    @JsonProperty("priceSCp4")
    var priceSCp4: String? = null

    @JsonProperty("Yp0h0")
    var yp0h0: Double? = null

    @JsonProperty("Yp0h0_AB")
    var yp0h0AB: Double? = null

    @JsonProperty("Yp0hm1")
    var yp0hm1: Double? = null

    @JsonProperty("Yp0hm2")
    var yp0hm2: Double? = null

    @JsonProperty("Yp0hm3")
    var yp0hm3: Double? = null

    @JsonProperty("Yp0hm4")
    var yp0hm4: Double? = null

    @JsonProperty("Yp0hp1")
    var yp0hp1: Double? = null

    @JsonProperty("Yp0hp2")
    var yp0hp2: Double? = null

    @JsonProperty("Yp0hp3")
    var yp0hp3: Double? = null

    @JsonProperty("Yp0hp4")
    var yp0hp4: Double? = null

    @JsonProperty("GRp0h0")
    var gRp0h0: String? = null

    @JsonProperty("GRp0h0_AB")
    var gRp0h0AB: String? = null

    @JsonProperty("GRp0h0_ABcurr")
    var gRp0h0ABcurr: String? = null

    @JsonProperty("GRp0hm1")
    var gRp0hm1: String? = null

    @JsonProperty("GRp0hm2")
    var gRp0hm2: String? = null

    @JsonProperty("GRp0hm3")
    var gRp0hm3: String? = null

    @JsonProperty("GRp0hm4")
    var gRp0hm4: String? = null

    @JsonProperty("GRp0hp1")
    var gRp0hp1: String? = null

    @JsonProperty("GRp0hp2")
    var gRp0hp2: String? = null

    @JsonProperty("GRp0hp3")
    var gRp0hp3: String? = null

    @JsonProperty("GRp0hp4")
    var gRp0hp4: String? = null

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
    var pp0hp2: String? = null

    @JsonProperty("Pp0hp3")
    var pp0hp3: String? = null

    @JsonProperty("Pp0hp4")
    var pp0hp4: String? = null

    @JsonProperty("GPp0h0")
    var gPp0h0: String? = null

    @JsonProperty("GPp0h0curr")
    var gPp0h0curr: String? = null

    @JsonProperty("GPp0hm1")
    var gPp0hm1: String? = null

    @JsonProperty("GPp0hm2")
    var gPp0hm2: String? = null

    @JsonProperty("GPp0hm3")
    var gPp0hm3: String? = null

    @JsonProperty("GPp0hm4")
    var gPp0hm4: String? = null

    @JsonProperty("GPp0hp1")
    var gPp0hp1: String? = null

    @JsonProperty("GPp0hp2")
    var gPp0hp2: String? = null

    @JsonProperty("GPp0hp3")
    var gPp0hp3: String? = null

    @JsonProperty("GPp0hp4")
    var gPp0hp4: String? = null

    @JsonProperty("GRmax")
    var gRmax: String? = null

    @JsonProperty("GRmax_AB")
    var gRmaxAB: String? = null

    @JsonProperty("GRdif")
    var gRdif: String? = null

    @JsonProperty("GRdif_AB")
    var gRdifAB: String? = null

    @JsonProperty("GRdif_ABcurr")
    var gRdifABcurr: String? = null

    @JsonProperty("GPmax")
    var gPmax: String? = null

    @JsonProperty("GPdif")
    var gPdif: String? = null

    @JsonProperty("GPdifcurr")
    var gPdifcurr: String? = null

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
    var gRdifNote: String? = null

    @JsonProperty("GRmaxNote")
    var gRmaxNote: String? = null

    @JsonProperty("sensible")
    var sensible: String? = null

    @JsonProperty("validationNote")
    var validationNote: String? = null

    @JsonProperty("validationNote2")
    var validationNote2: String? = null

    @JsonProperty("validationNote3")
    var validationNote3: String? = null

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