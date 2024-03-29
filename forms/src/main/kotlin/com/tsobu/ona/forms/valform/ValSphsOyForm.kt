package com.tsobu.ona.forms.valform

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SC1", "SC2", "SC3", "SC4", "SC5", "SC6", "_id", "end", "lat", "lon", "EAID", "HHID", "_tags", "_uuid", "check", "plotL", "plotW", "start", "today", "_notes", "_edited", "_status", "country", "variety", "_version", "check_id", "currency", "deviceid", "geopoint", "plotSize", "priceSC1", "priceSC2", "priceSC3", "priceSC4", "priceSC5", "priceSC6", "username", "_duration", "_xform_id", "areaBasis", "simserial", "conversion", "yieldLevel", "priceStarch", "purpose/VAL", "results/SC0", "_attachments", "_geolocation", "_media_count", "_total_media", "formhub/uuid", "plantingDate", "results/SCm1", "results/SCm2", "results/SCm3", "results/SCm4", "results/SCp1", "results/SCp2", "results/SCp3", "results/SCp4", "subscriberid", "_submitted_by", "plantingWeek0", "results/GPdif", "results/GPmax", "results/GRdif", "results/GRmax", "results/Pp0h0", "results/Yp0h0", "starchFactory", "thankyou/call", "results/CYp0h0", "results/GPp0h0", "results/GRp0h0", "results/Pp0hm1", "results/Pp0hm2", "results/Pp0hm3", "results/Pp0hm4", "results/Pp0hp1", "results/Pp0hp2", "results/Pp0hp3", "results/Pp0hp4", "results/WYp0h0", "results/Yp0hm1", "results/Yp0hm2", "results/Yp0hm3", "results/Yp0hm4", "results/Yp0hp1", "results/Yp0hp2", "results/Yp0hp3", "results/Yp0hp4", "meta/instanceID", "plantingDensity", "results/CYp0hm1", "results/CYp0hm2", "results/CYp0hm3", "results/CYp0hm4", "results/CYp0hp1", "results/CYp0hp2", "results/CYp0hp3", "results/CYp0hp4", "results/GPp0hm1", "results/GPp0hm2", "results/GPp0hm3", "results/GPp0hm4", "results/GPp0hp1", "results/GPp0hp2", "results/GPp0hp3", "results/GPp0hp4", "results/GRp0hm1", "results/GRp0hm2", "results/GRp0hm3", "results/GRp0hm4", "results/GRp0hp1", "results/GRp0hp2", "results/GRp0hp3", "results/GRp0hp4", "results/WYp0hm1", "results/WYp0hm2", "results/WYp0hm3", "results/WYp0hm4", "results/WYp0hp1", "results/WYp0hp2", "results/WYp0hp3", "results/WYp0hp4", "_submission_time", "_xform_id_string", "results/GRdif_AB", "results/GRmax_AB", "results/Yp0h0_AB", "results/priceSC0", "results/sensible", "results/GPdifcurr", "results/GRp0h0_AB", "results/priceSCm1", "results/priceSCm2", "results/priceSCm3", "results/priceSCm4", "results/priceSCp1", "results/priceSCp2", "results/priceSCp3", "results/priceSCp4", "_bamboo_dataset_id", "results/GPp0h0curr", "results/optHarvest", "_media_all_received", "harvest/harvestAge0", "harvest/harvestDate", "thankyou/confirmVAL", "harvest/harvestAgem1", "harvest/harvestAgem2", "harvest/harvestAgem3", "harvest/harvestAgem4", "harvest/harvestAgep1", "harvest/harvestAgep2", "harvest/harvestAgep3", "harvest/harvestAgep4", "harvest/harvestWeek0", "results/GRdif_ABcurr", "harvest/harvestWeekm1", "harvest/harvestWeekm2", "harvest/harvestWeekm3", "harvest/harvestWeekm4", "harvest/harvestWeekp1", "harvest/harvestWeekp2", "harvest/harvestWeekp3", "harvest/harvestWeekp4", "results/GRp0h0_ABcurr", "results/lookupp0h0_id", "results/lookupp0hm1_id", "results/lookupp0hm2_id", "results/lookupp0hm3_id", "results/lookupp0hm4_id", "results/lookupp0hp1_id", "results/lookupp0hp2_id", "results/lookupp0hp3_id", "results/lookupp0hp4_id", "results/optHarvestText", "unit", "product", "unitName", "unitWeight", "transformRatio", "unitNameSelect", "unitLocalWeight", "priceDetails/price0", "priceDetails/priceR0", "priceDetails/pricem1", "priceDetails/pricem2", "priceDetails/pricem3", "priceDetails/pricem4", "priceDetails/pricep1", "priceDetails/pricep2", "priceDetails/pricep3", "priceDetails/pricep4", "priceDetails/priceRm2", "priceDetails/priceRm4", "priceDetails/priceRp2", "priceDetails/priceRp4", "densityDetails/withinRow", "densityDetails/betweenRow", "email", "season", "SC7", "SC8", "priceSC7", "priceSC8")
class ValSphsOyForm {
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

    @JsonProperty("check")
    var checkValue: String? = null

    @JsonProperty("plotL")
    var plotLength: String? = null

    @JsonProperty("plotW")
    var plotWidth: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("variety")
    var variety: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("check_id")
    var checkId: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("deviceid")
    var deviceId: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("plotSize")
    var plotSize: String? = null

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

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("yieldLevel")
    var yieldLevel: String? = null

    @JsonProperty("priceStarch")
    var priceStarch: String? = null

    @JsonProperty("purpose/VAL")
    var purposeVal: String? = null

    @JsonProperty("results/SC0")
    var sc0: String? = null

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

    @JsonProperty("results/SCm1")
    var scm1: String? = null

    @JsonProperty("results/SCm2")
    var scm2: String? = null

    @JsonProperty("results/SCm3")
    var scm3: String? = null

    @JsonProperty("results/SCm4")
    var scm4: String? = null

    @JsonProperty("results/SCp1")
    var scp1: String? = null

    @JsonProperty("results/SCp2")
    var scp2: String? = null

    @JsonProperty("results/SCp3")
    var scp3: String? = null

    @JsonProperty("results/SCp4")
    var scp4: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("plantingWeek0")
    var plantingWeek0: String? = null

    @JsonProperty("results/GPdif")
    var gpDif: String? = null

    @JsonProperty("results/GPmax")
    var gpMax: String? = null

    @JsonProperty("results/GRdif")
    var grDif: String? = null

    @JsonProperty("results/GRmax")
    var grMax: String? = null

    @JsonProperty("results/Pp0h0")
    var pp0h0: String? = null

    @JsonProperty("results/Yp0h0")
    var yp0h0: String? = null

    @JsonProperty("starchFactory")
    var starchFactory: String? = null

    @JsonProperty("thankyou/call")
    var callValue: String? = null

    @JsonProperty("results/CYp0h0")
    var cyp0h0: String? = null

    @JsonProperty("results/GPp0h0")
    var gpp0h0: String? = null

    @JsonProperty("results/GRp0h0")
    var grp0h0: String? = null

    @JsonProperty("results/Pp0hm1")
    var pp0hm1: String? = null

    @JsonProperty("results/Pp0hm2")
    var pp0hm2: String? = null

    @JsonProperty("results/Pp0hm3")
    var pp0hm3: String? = null

    @JsonProperty("results/Pp0hm4")
    var pp0hm4: String? = null

    @JsonProperty("results/Pp0hp1")
    var pp0hp1: String? = null

    @JsonProperty("results/Pp0hp2")
    var pp0hp2: String? = null

    @JsonProperty("results/Pp0hp3")
    var pp0hp3: String? = null

    @JsonProperty("results/Pp0hp4")
    var pp0hp4: String? = null

    @JsonProperty("results/WYp0h0")
    var wyp0h0: String? = null

    @JsonProperty("results/Yp0hm1")
    var yp0hm1: String? = null

    @JsonProperty("results/Yp0hm2")
    var yp0hm2: String? = null

    @JsonProperty("results/Yp0hm3")
    var yp0hm3: String? = null

    @JsonProperty("results/Yp0hm4")
    var yp0hm4: String? = null

    @JsonProperty("results/Yp0hp1")
    var yp0hp1: String? = null

    @JsonProperty("results/Yp0hp2")
    var yp0hp2: String? = null

    @JsonProperty("results/Yp0hp3")
    var yp0hp3: String? = null

    @JsonProperty("results/Yp0hp4")
    var yp0hp4: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("plantingDensity")
    var plantingDensity: String? = null

    @JsonProperty("results/CYp0hm1")
    var cyp0hm1: String? = null

    @JsonProperty("results/CYp0hm2")
    var cyp0hm2: String? = null

    @JsonProperty("results/CYp0hm3")
    var cyp0hm3: String? = null

    @JsonProperty("results/CYp0hm4")
    var cyp0hm4: String? = null

    @JsonProperty("results/CYp0hp1")
    var cyp0hp1: String? = null

    @JsonProperty("results/CYp0hp2")
    var cyp0hp2: String? = null

    @JsonProperty("results/CYp0hp3")
    var cyp0hp3: String? = null

    @JsonProperty("results/CYp0hp4")
    var cyp0hp4: String? = null

    @JsonProperty("results/GPp0hm1")
    var gpp0hm1: String? = null

    @JsonProperty("results/GPp0hm2")
    var gpp0hm2: String? = null

    @JsonProperty("results/GPp0hm3")
    var gpp0hm3: String? = null

    @JsonProperty("results/GPp0hm4")
    var gpp0hm4: String? = null

    @JsonProperty("results/GPp0hp1")
    var gpp0hp1: String? = null

    @JsonProperty("results/GPp0hp2")
    var gpp0hp2: String? = null

    @JsonProperty("results/GPp0hp3")
    var gpp0hp3: String? = null

    @JsonProperty("results/GPp0hp4")
    var gpp0hp4: String? = null

    @JsonProperty("results/GRp0hm1")
    var grp0hm1: String? = null

    @JsonProperty("results/GRp0hm2")
    var grp0hm2: String? = null

    @JsonProperty("results/GRp0hm3")
    var grp0hm3: String? = null

    @JsonProperty("results/GRp0hm4")
    var grp0hm4: String? = null

    @JsonProperty("results/GRp0hp1")
    var grp0hp1: String? = null

    @JsonProperty("results/GRp0hp2")
    var grp0hp2: String? = null

    @JsonProperty("results/GRp0hp3")
    var grp0hp3: String? = null

    @JsonProperty("results/GRp0hp4")
    var grp0hp4: String? = null

    @JsonProperty("results/WYp0hm1")
    var wyp0hm1: String? = null

    @JsonProperty("results/WYp0hm2")
    var wyp0hm2: String? = null

    @JsonProperty("results/WYp0hm3")
    var wyp0hm3: String? = null

    @JsonProperty("results/WYp0hm4")
    var wyp0hm4: String? = null

    @JsonProperty("results/WYp0hp1")
    var wyp0hp1: String? = null

    @JsonProperty("results/WYp0hp2")
    var wyp0hp2: String? = null

    @JsonProperty("results/WYp0hp3")
    var wyp0hp3: String? = null

    @JsonProperty("results/WYp0hp4")
    var wyp0hp4: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("results/GRdif_AB")
    var grDifAb: String? = null

    @JsonProperty("results/GRmax_AB")
    var grMaxAb: String? = null

    @JsonProperty("results/Yp0h0_AB")
    var yp0h0Ab: String? = null

    @JsonProperty("results/priceSC0")
    var priceSc0: String? = null

    @JsonProperty("results/sensible")
    var sensible: String? = null

    @JsonProperty("results/GPdifcurr")
    var gpDifCurr: String? = null

    @JsonProperty("results/GRp0h0_AB")
    var grp0h0Ab: String? = null

    @JsonProperty("results/priceSCm1")
    var priceScm1: String? = null

    @JsonProperty("results/priceSCm2")
    var priceScm2: String? = null

    @JsonProperty("results/priceSCm3")
    var priceScm3: String? = null

    @JsonProperty("results/priceSCm4")
    var priceScm4: String? = null

    @JsonProperty("results/priceSCp1")
    var priceScp1: String? = null

    @JsonProperty("results/priceSCp2")
    var priceScp2: String? = null

    @JsonProperty("results/priceSCp3")
    var priceScp3: String? = null

    @JsonProperty("results/priceSCp4")
    var priceScp4: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("results/GPp0h0curr")
    var gpp0h0curr: String? = null

    @JsonProperty("results/optHarvest")
    var optHarvest: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("harvest/harvestAge0")
    var harvestAge0: String? = null

    @JsonProperty("harvest/harvestDate")
    var harvestDate: String? = null

    @JsonProperty("thankyou/confirmVAL")
    var confirmVal: String? = null

    @JsonProperty("harvest/harvestAgem1")
    var harvestAgeM1: String? = null

    @JsonProperty("harvest/harvestAgem2")
    var harvestAgeM2: String? = null

    @JsonProperty("harvest/harvestAgem3")
    var harvestAgeM3: String? = null

    @JsonProperty("harvest/harvestAgem4")
    var harvestAgeM4: String? = null

    @JsonProperty("harvest/harvestAgep1")
    var harvestAgeP1: String? = null

    @JsonProperty("harvest/harvestAgep2")
    var harvestAgeP2: String? = null

    @JsonProperty("harvest/harvestAgep3")
    var harvestAgeP3: String? = null

    @JsonProperty("harvest/harvestAgep4")
    var harvestAgeP4: String? = null

    @JsonProperty("harvest/harvestWeek0")
    var harvestWeek0: String? = null

    @JsonProperty("results/GRdif_ABcurr")
    var grDifAbCurr: String? = null

    @JsonProperty("harvest/harvestWeekm1")
    var harvestWeekM1: String? = null

    @JsonProperty("harvest/harvestWeekm2")
    var harvestWeekM2: String? = null

    @JsonProperty("harvest/harvestWeekm3")
    var harvestWeekM3: String? = null

    @JsonProperty("harvest/harvestWeekm4")
    var harvestWeekM4: String? = null

    @JsonProperty("harvest/harvestWeekp1")
    var harvestWeekP1: String? = null

    @JsonProperty("harvest/harvestWeekp2")
    var harvestWeekP2: String? = null

    @JsonProperty("harvest/harvestWeekp3")
    var harvestWeekP3: String? = null

    @JsonProperty("harvest/harvestWeekp4")
    var harvestWeekP4: String? = null

    @JsonProperty("results/GRp0h0_ABcurr")
    var grp0h0AbCurr: String? = null

    @JsonProperty("results/lookupp0h0_id")
    var lookupp0h0Id: String? = null

    @JsonProperty("results/lookupp0hm1_id")
    var lookupp0hm1Id: String? = null

    @JsonProperty("results/lookupp0hm2_id")
    var lookupp0hm2Id: String? = null

    @JsonProperty("results/lookupp0hm3_id")
    var lookupp0hm3Id: String? = null

    @JsonProperty("results/lookupp0hm4_id")
    var lookupp0hm4Id: String? = null

    @JsonProperty("results/lookupp0hp1_id")
    var lookupp0hp1Id: String? = null

    @JsonProperty("results/lookupp0hp2_id")
    var lookupp0hp2Id: String? = null

    @JsonProperty("results/lookupp0hp3_id")
    var lookupp0hp3Id: String? = null

    @JsonProperty("results/lookupp0hp4_id")
    var lookupp0hp4Id: String? = null

    @JsonProperty("results/optHarvestText")
    var optHarvestText: String? = null

    @JsonProperty("unit")
    var unit: String? = null

    @JsonProperty("product")
    var product: String? = null

    @JsonProperty("unitName")
    var unitName: String? = null

    @JsonProperty("unitWeight")
    var unitWeight: String? = null

    @JsonProperty("transformRatio")
    var transformRatio: String? = null

    @JsonProperty("unitNameSelect")
    var unitNameSelect: String? = null

    @JsonProperty("unitLocalWeight")
    var unitLocalWeight: String? = null

    @JsonProperty("priceDetails/price0")
    var price0: String? = null

    @JsonProperty("priceDetails/priceR0")
    var priceR0: String? = null

    @JsonProperty("priceDetails/pricem1")
    var priceM1: String? = null

    @JsonProperty("priceDetails/pricem2")
    var priceM2: String? = null

    @JsonProperty("priceDetails/pricem3")
    var priceM3: String? = null

    @JsonProperty("priceDetails/pricem4")
    var priceM4: String? = null

    @JsonProperty("priceDetails/pricep1")
    var priceP1: String? = null

    @JsonProperty("priceDetails/pricep2")
    var priceP2: String? = null

    @JsonProperty("priceDetails/pricep3")
    var priceP3: String? = null

    @JsonProperty("priceDetails/pricep4")
    var priceP4: String? = null

    @JsonProperty("priceDetails/priceRm2")
    var priceRm2: String? = null

    @JsonProperty("priceDetails/priceRm4")
    var priceRm4: String? = null

    @JsonProperty("priceDetails/priceRp2")
    var priceRp2: String? = null

    @JsonProperty("priceDetails/priceRp4")
    var priceRp4: String? = null

    @JsonProperty("densityDetails/withinRow")
    var withinRow: String?=null

    @JsonProperty("densityDetails/betweenRow")
    var betweenRow: String?=null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("season")
    var season: String? = null

    @JsonProperty("SC7")
    var sc7: String? = null

    @JsonProperty("SC8")
    var sc8: String? = null

    @JsonProperty("priceSC7")
    var priceSc7: String? = null

    @JsonProperty("priceSC8")
    var priceSc8: String? = null
}