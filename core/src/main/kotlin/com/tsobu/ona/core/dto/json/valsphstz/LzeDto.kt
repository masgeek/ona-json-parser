package com.tsobu.ona.core.dto.json.valsphstz

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "intro2", "VAL", "EAID", "HHID", "countrySelect", "country", "currency", "conversion", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "lat", "lon", "plantingDate", "season", "plantingWeek0", "harvestDate", "harvestWeek0", "harvestWeekm1", "harvestWeekm2", "harvestWeekm3", "harvestWeekm4", "harvestWeekp1", "harvestWeekp2", "harvestWeekp3", "harvestWeekp4", "harvestAge0", "harvestAgem1", "harvestAgem2", "harvestAgem3", "harvestAgem4", "harvestAgep1", "harvestAgep2", "harvestAgep3", "harvestAgep4", "check_id", "check", "variety", "plantingDensity", "betweenRow", "withinRow", "areaBasis", "plotL", "plotW", "plotSize", "yieldLevel", "priceStarch", "starchFactory", "SC1", "SC2", "SC3", "SC4", "SC5", "SC6", "SC7", "SC8", "SC9", "SC10", "SC11", "SC12", "priceSC1", "priceSC2", "priceSC3", "priceSC4", "priceSC5", "priceSC6", "priceSC7", "priceSC8", "priceSC9", "priceSC10", "priceSC11", "priceSC12", "product", "transformRatio", "unit", "unitNameSelect", "unitNameOther", "unitWeightOther", "unitName", "unitLocalWeight", "unitWeight", "priceNote", "priceRm4", "priceRm2", "priceR0", "priceRp2", "priceRp4", "price0", "pricem1", "pricem2", "pricem3", "pricem4", "pricep1", "pricep2", "pricep3", "pricep4", "noRecommendationNote", "lookupp0h0_id", "lookupp0hm1_id", "lookupp0hm2_id", "lookupp0hm3_id", "lookupp0hm4_id", "lookupp0hp1_id", "lookupp0hp2_id", "lookupp0hp3_id", "lookupp0hp4_id", "WYp0h0", "WYp0hm1", "WYp0hm2", "WYp0hm3", "WYp0hm4", "WYp0hp1", "WYp0hp2", "WYp0hp3", "WYp0hp4", "CYp0h0", "CYp0hm1", "CYp0hm2", "CYp0hm3", "CYp0hm4", "CYp0hp1", "CYp0hp2", "CYp0hp3", "CYp0hp4", "SC0", "SCm1", "SCm2", "SCm3", "SCm4", "SCp1", "SCp2", "SCp3", "SCp4", "priceSC0", "priceSCm1", "priceSCm2", "priceSCm3", "priceSCm4", "priceSCp1", "priceSCp2", "priceSCp3", "priceSCp4", "Yp0h0", "Yp0h0_AB", "Yp0hm1", "Yp0hm2", "Yp0hm3", "Yp0hm4", "Yp0hp1", "Yp0hp2", "Yp0hp3", "Yp0hp4", "GRp0h0", "GRp0h0_AB", "GRp0h0_ABcurr", "GRp0hm1", "GRp0hm2", "GRp0hm3", "GRp0hm4", "GRp0hp1", "GRp0hp2", "GRp0hp3", "GRp0hp4", "Pp0h0", "Pp0hm1", "Pp0hm2", "Pp0hm3", "Pp0hm4", "Pp0hp1", "Pp0hp2", "Pp0hp3", "Pp0hp4", "GPp0h0", "GPp0h0curr", "GPp0hm1", "GPp0hm2", "GPp0hm3", "GPp0hm4", "GPp0hp1", "GPp0hp2", "GPp0hp3", "GPp0hp4", "GRmax", "GRmax_AB", "GRdif", "GRdif_AB", "GRdif_ABcurr", "GPmax", "GPdif", "GPdifcurr", "optHarvest", "optHarvestText", "Yh0p0Note", "optHarvestNote", "difHarvestNote", "GRdifNote", "GRmaxNote", "sensible", "validationNote", "validationNote2", "validationNote3", "call", "confirmVAL", "end", "instanceID", "KEY")
class LzeDto {
    @JsonProperty("lookupp0hp3_id")
    var lookupp0hp3Id: String? = null

    @JsonProperty("GRp0hm1")
    var grp0hm1: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("GRp0hm3")
    var grp0hm3: String? = null

    @JsonProperty("GRp0hm2")
    var grp0hm2: String? = null

    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("GRp0hm4")
    var grp0hm4: String? = null

    @JsonProperty("noRecommendationNote")
    var norecommendationnote: String? = null

    @JsonProperty("starchFactory")
    var starchfactory: String? = null

    @JsonProperty("lookupp0h0_id")
    var lookupp0h0Id: String? = null

    @JsonProperty("priceR0")
    var pricer0: String? = null

    @JsonProperty("priceSC2")
    var pricesc2: String? = null

    @JsonProperty("harvestDate")
    var harvestDate: String? = null

    @JsonProperty("priceSC1")
    var pricesc1: String? = null

    @JsonProperty("priceSC4")
    var pricesc4: String? = null

    @JsonProperty("priceSC3")
    var pricesc3: String? = null

    @JsonProperty("priceSC6")
    var pricesc6: String? = null

    @JsonProperty("priceSC5")
    var pricesc5: String? = null

    @JsonProperty("priceSC8")
    var pricesc8: String? = null

    @JsonProperty("priceSC7")
    var pricesc7: String? = null

    @JsonProperty("check_id")
    var checkId: String? = null

    @JsonProperty("GRp0h0")
    var grp0h0: String? = null

    @JsonProperty("priceSC0")
    var pricesc0: String? = null

    @JsonProperty("WYp0hm4")
    var wyp0hm4: String? = null

    @JsonProperty("SCp4")
    var scp4: String? = null

    @JsonProperty("WYp0hm3")
    var wyp0hm3: String? = null

    @JsonProperty("WYp0hm2")
    var wyp0hm2: String? = null

    @JsonProperty("SCp2")
    var scp2: String? = null

    @JsonProperty("WYp0hm1")
    var wyp0hm1: String? = null

    @JsonProperty("SCp3")
    var scp3: String? = null

    @JsonProperty("intro2")
    var intro2: String? = null

    @JsonProperty("SCp1")
    var scp1: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("Pp0h0")
    var pp0h0: String? = null

    @JsonProperty("SC10")
    var sc10: String? = null

    @JsonProperty("variety")
    var variety: String? = null

    @JsonProperty("SC11")
    var sc11: String? = null

    @JsonProperty("GRp0hp2")
    var grp0hp2: String? = null

    @JsonProperty("SC12")
    var sc12: String? = null

    @JsonProperty("GRp0hp1")
    var grp0hp1: String? = null

    @JsonProperty("GRdif_ABcurr")
    var grdifAbcurr: String? = null

    @JsonProperty("GPp0hm4")
    var gpp0hm4: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("GPp0hm3")
    var gpp0hm3: String? = null

    @JsonProperty("GPp0hm2")
    var gpp0hm2: String? = null

    @JsonProperty("GPp0hm1")
    var gpp0hm1: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("lookupp0hp2_id")
    var lookupp0hp2Id: String? = null

    @JsonProperty("unitWeightOther")
    var unitweightother: String? = null

    @JsonProperty("GRp0h0_AB")
    var grp0h0Ab: String? = null

    @JsonProperty("GRp0hp4")
    var grp0hp4: String? = null

    @JsonProperty("GRp0hp3")
    var grp0hp3: String? = null

    @JsonProperty("priceSC12")
    var pricesc12: String? = null

    @JsonProperty("call")
    var callValue: String? = null

    @JsonProperty("priceSC10")
    var pricesc10: String? = null

    @JsonProperty("priceRp2")
    var pricerp2: String? = null

    @JsonProperty("priceSC11")
    var pricesc11: String? = null

    @JsonProperty("priceRp4")
    var pricerp4: String? = null

    @JsonProperty("confirmVAL")
    var confirmval: String? = null

    @JsonProperty("countrySelect")
    var countryselect: String? = null

    @JsonProperty("transformRatio")
    var transformratio: String? = null

    @JsonProperty("lookupp0hm4_id")
    var lookupp0hm4Id: String? = null

    @JsonProperty("geopoint-Altitude")
    var geoPointAltitude: String? = null

    @JsonProperty("optHarvestText")
    var optharvesttext: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("GRdif_AB")
    var grdifAb: String? = null

    @JsonProperty("priceRm4")
    var pricerm4: String? = null

    @JsonProperty("harvestAge0")
    var harvestage0: String? = null

    @JsonProperty("CYp0h0")
    var cyp0h0: String? = null

    @JsonProperty("WYp0hp4")
    var wyp0hp4: String? = null

    @JsonProperty("WYp0hp3")
    var wyp0hp3: String? = null

    @JsonProperty("GRmax")
    var grmax: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("priceRm2")
    var pricerm2: String? = null

    @JsonProperty("WYp0hp2")
    var wyp0hp2: String? = null

    @JsonProperty("difHarvestNote")
    var difharvestnote: String? = null

    @JsonProperty("WYp0hp1")
    var wyp0hp1: String? = null

    @JsonProperty("unitName")
    var unitname: String? = null

    @JsonProperty("check")
    var checkValue: String? = null

    @JsonProperty("harvestAgem3")
    var harvestagem3: String? = null

    @JsonProperty("harvestAgem4")
    var harvestagem4: String? = null

    @JsonProperty("harvestAgem1")
    var harvestagem1: String? = null

    @JsonProperty("harvestAgem2")
    var harvestagem2: String? = null

    @JsonProperty("lookupp0hm2_id")
    var lookupp0hm2Id: String? = null

    @JsonProperty("lookupp0hp1_id")
    var lookupp0hp1Id: String? = null

    @JsonProperty("lookupp0hm3_id")
    var lookupp0hm3Id: String? = null

    @JsonProperty("Pp0hp4")
    var pp0hp4: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("Pp0hp1")
    var pp0hp1: String? = null

    @JsonProperty("GRp0h0_ABcurr")
    var grp0h0Abcurr: String? = null

    @JsonProperty("Pp0hp3")
    var pp0hp3: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("Pp0hp2")
    var pp0hp2: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("betweenRow")
    var betweenRow: String? = null

    @JsonProperty("GPdif")
    var gpdif: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("VAL")
    var purposeVal: String? = null

    @JsonProperty("Yp0h0_AB")
    var yp0h0Ab: String? = null

    @JsonProperty("priceStarch")
    var pricestarch: String? = null

    @JsonProperty("harvestAgep2")
    var harvestagep2: String? = null

    @JsonProperty("harvestAgep3")
    var harvestagep3: String? = null

    @JsonProperty("harvestAgep4")
    var harvestagep4: String? = null

    @JsonProperty("lookupp0hm1_id")
    var lookupp0hm1Id: String? = null

    @JsonProperty("season")
    var season: String? = null

    @JsonProperty("GPp0h0curr")
    var gpp0h0curr: String? = null

    @JsonProperty("plotSize")
    var plotSize: String? = null

    @JsonProperty("harvestAgep1")
    var harvestagep1: String? = null

    @JsonProperty("unitLocalWeight")
    var unitlocalweight: String? = null

    @JsonProperty("GRdifNote")
    var grdifnote: String? = null

    @JsonProperty("GPp0h0")
    var gpp0h0: String? = null

    @JsonProperty("CYp0hm1")
    var cyp0hm1: String? = null

    @JsonProperty("priceSCm2")
    var pricescm2: String? = null

    @JsonProperty("yieldLevel")
    var yieldlevel: String? = null

    @JsonProperty("CYp0hm2")
    var cyp0hm2: String? = null

    @JsonProperty("priceSCm3")
    var pricescm3: String? = null

    @JsonProperty("priceSCm1")
    var pricescm1: String? = null

    @JsonProperty("CYp0hm3")
    var cyp0hm3: String? = null

    @JsonProperty("CYp0hm4")
    var cyp0hm4: String? = null

    @JsonProperty("plantingDensity")
    var plantingdensity: String? = null

    @JsonProperty("GRmaxNote")
    var grmaxnote: String? = null

    @JsonProperty("unitNameOther")
    var unitnameother: String? = null

    @JsonProperty("GRmax_AB")
    var grmaxAb: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("pricem4")
    var pricem4: String? = null

    @JsonProperty("optHarvestNote")
    var optharvestnote: String? = null

    @JsonProperty("lon")
    var lon: String? = null

    @JsonProperty("pricem1")
    var pricem1: String? = null

    @JsonProperty("pricem2")
    var pricem2: String? = null

    @JsonProperty("pricem3")
    var pricem3: String? = null

    @JsonProperty("validationNote3")
    var validationnote3: String? = null

    @JsonProperty("validationNote2")
    var validationnote2: String? = null

    @JsonProperty("validationNote")
    var validationnote: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geoPointAccuracy: String? = null

    @JsonProperty("sensible")
    var sensible: String? = null

    @JsonProperty("product")
    var product: String? = null

    @JsonProperty("harvestWeekp3")
    var harvestweekp3: String? = null

    @JsonProperty("GPdifcurr")
    var gpdifcurr: String? = null

    @JsonProperty("harvestWeekp4")
    var harvestweekp4: String? = null

    @JsonProperty("Yp0hm1")
    var yp0hm1: String? = null

    @JsonProperty("Yp0hm2")
    var yp0hm2: String? = null

    @JsonProperty("Yp0hm3")
    var yp0hm3: String? = null

    @JsonProperty("Yp0hm4")
    var yp0hm4: String? = null

    @JsonProperty("Yp0h0")
    var yp0h0: String? = null

    @JsonProperty("Pp0hm2")
    var pp0hm2: String? = null

    @JsonProperty("Pp0hm1")
    var pp0hm1: String? = null

    @JsonProperty("Pp0hm4")
    var pp0hm4: String? = null

    @JsonProperty("Pp0hm3")
    var pp0hm3: String? = null

    @JsonProperty("geopoint-Longitude")
    var geoPointLongitude: String? = null

    @JsonProperty("unitNameSelect")
    var unitnameselect: String? = null

    @JsonProperty("uuid")
    var uuid: String? = null

    @JsonProperty("SCm3")
    var scm3: String? = null

    @JsonProperty("priceSCp1")
    var pricescp1: String? = null

    @JsonProperty("Yp0hp1")
    var yp0hp1: String? = null

    @JsonProperty("price0")
    var price0: String? = null

    @JsonProperty("SCm4")
    var scm4: String? = null

    @JsonProperty("priceSCp2")
    var pricescp2: String? = null

    @JsonProperty("Yp0hp2")
    var yp0hp2: String? = null

    @JsonProperty("harvestWeek0")
    var harvestweek0: String? = null

    @JsonProperty("priceNote")
    var pricenote: String? = null

    @JsonProperty("SCm1")
    var scm1: String? = null

    @JsonProperty("Yp0hp3")
    var yp0hp3: String? = null

    @JsonProperty("SCm2")
    var scm2: String? = null

    @JsonProperty("Yp0hp4")
    var yp0hp4: String? = null

    @JsonProperty("harvestWeekp1")
    var harvestweekp1: String? = null

    @JsonProperty("harvestWeekp2")
    var harvestweekp2: String? = null

    @JsonProperty("priceSCp3")
    var pricescp3: String? = null

    @JsonProperty("intro")
    var intro: String? = null

    @JsonProperty("priceSCp4")
    var pricescp4: String? = null

    @JsonProperty("lat")
    var lat: String? = null

    @JsonProperty("withinRow")
    var withinrow: String? = null

    @JsonProperty("lookupp0hp4_id")
    var lookupp0hp4Id: String? = null

    @JsonProperty("optHarvest")
    var optharvest: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("Yh0p0Note")
    var yh0p0note: String? = null

    @JsonProperty("unit")
    var unitValue: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("GRdif")
    var grdif: String? = null

    @JsonProperty("GPp0hp4")
    var gpp0hp4: String? = null

    @JsonProperty("GPp0hp3")
    var gpp0hp3: String? = null

    @JsonProperty("GPp0hp2")
    var gpp0hp2: String? = null

    @JsonProperty("GPp0hp1")
    var gpp0hp1: String? = null

    @JsonProperty("unitWeight")
    var unitweight: String? = null

    @JsonProperty("harvestWeekm2")
    var harvestweekm2: String? = null

    @JsonProperty("harvestWeekm3")
    var harvestweekm3: String? = null

    @JsonProperty("priceSCm4")
    var pricescm4: String? = null

    @JsonProperty("harvestWeekm1")
    var harvestweekm1: String? = null

    @JsonProperty("plotW")
    var plotw: String? = null

    @JsonProperty("harvestWeekm4")
    var harvestweekm4: String? = null

    @JsonProperty("CYp0hp1")
    var cyp0hp1: String? = null

    @JsonProperty("CYp0hp4")
    var cyp0hp4: String? = null

    @JsonProperty("GPmax")
    var gpmax: String? = null

    @JsonProperty("plotL")
    var plotl: String? = null

    @JsonProperty("CYp0hp2")
    var cyp0hp2: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("CYp0hp3")
    var cyp0hp3: String? = null

    @JsonProperty("priceSC9")
    var pricesc9: String? = null

    @JsonProperty("SC1")
    var sc1: String? = null

    @JsonProperty("SC0")
    var sc0: String? = null

    @JsonProperty("SC3")
    var sc3: String? = null

    @JsonProperty("SC2")
    var sc2: String? = null

    @JsonProperty("SC5")
    var sc5: String? = null

    @JsonProperty("SC4")
    var sc4: String? = null

    @JsonProperty("WYp0h0")
    var wyp0h0: String? = null

    @JsonProperty("SC7")
    var sc7: String? = null

    @JsonProperty("plantingWeek0")
    var plantingweek0: String? = null

    @JsonProperty("SC6")
    var sc6: String? = null

    @JsonProperty("SC9")
    var sc9: String? = null

    @JsonProperty("banner")
    var banner: String? = null

    @JsonProperty("SC8")
    var sc8: String? = null

    @JsonProperty("geopoint-Latitude")
    var geoPointLatitude: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("areaBasis")
    var areabasis: String? = null

    @JsonProperty("pricep1")
    var pricep1: String? = null

    @JsonProperty("pricep2")
    var pricep2: String? = null

    @JsonProperty("pricep3")
    var pricep3: String? = null

    @JsonProperty("pricep4")
    var pricep4: String? = null
}