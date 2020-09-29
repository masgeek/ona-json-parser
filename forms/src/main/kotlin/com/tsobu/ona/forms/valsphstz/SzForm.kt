package com.tsobu.ona.forms.valsphstz


import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class SzForm {
    @JsonProperty("_id")
    var submissionId: Int? = null

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

    @JsonProperty("unit")
    var unit: String? = null

    @JsonProperty("_tags")
    var tags: List<Any>? = null

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("check")
    var checkValue: String? = null

    @JsonProperty("plotL")
    var plotLength: String? = null

    @JsonProperty("plotW")
    var plotWidth: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("_notes")
    var notes: List<Any>? = null

    @JsonProperty("season")
    var season: String? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("product")
    var product: String? = null

    @JsonProperty("variety")
    var variety: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("check_id")
    var checkId: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("plotSize")
    var plotSize: String? = null

    @JsonProperty("unitName")
    var unitName: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId: Int? = null

    @JsonProperty("areaBasis")
    var areaBasis: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("unitWeight")
    var unitWeight: String? = null

    @JsonProperty("yieldLevel")
    var yieldLevel: String? = null

    @JsonProperty("priceStarch")
    var priceStarch: String? = null

    @JsonProperty("purpose/VAL")
    var valSphs: String? = null

    @JsonProperty("results/SC0")
    var sc0: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any>? = null

    @JsonProperty("_geolocation")
    var geolocation: List<Double>? = null

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

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
    var subscriberId: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("plantingWeek0")
    var plantingWeek0: String? = null

    @JsonProperty("results/GPdif")
    var gpdif: String? = null

    @JsonProperty("results/GPmax")
    var gpmax: String? = null

    @JsonProperty("results/GRdif")
    var grdif: String? = null

    @JsonProperty("results/GRmax")
    var grmax: String? = null

    @JsonProperty("results/Pp0h0")
    var pp0h0: String? = null

    @JsonProperty("results/Yp0h0")
    var yp0h0: String? = null

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

    @JsonProperty("transformRatio")
    var transformRatio: String? = null

    @JsonProperty("unitNameSelect")
    var unitNameSelect: String? = null

    @JsonProperty("meta/instanceID")
    var metaInstanceID: String? = null

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

    @JsonProperty("unitLocalWeight")
    var unitLocalWeight: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("results/GRdif_AB")
    var grdifAB: String? = null

    @JsonProperty("results/GRmax_AB")
    var grmaxAB: String? = null

    @JsonProperty("results/Yp0h0_AB")
    var yp0h0ab: String? = null

    @JsonProperty("results/sensible")
    var sensible: String? = null

    @JsonProperty("results/GPdifcurr")
    var gpdifcurr: String? = null

    @JsonProperty("results/GRp0h0_AB")
    var grp0h0AB: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("results/GPp0h0curr")
    var gpp0h0Curr: String? = null

    @JsonProperty("results/optHarvest")
    var optHarvest: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("harvest/harvestAge0")
    var harvestAge0: String? = null

    @JsonProperty("harvest/harvestDate")
    var harvestDate: String? = null

    @JsonProperty("priceDetails/price0")
    var price0: String? = null

    @JsonProperty("thankyou/confirmVAL")
    var confirmVal: String? = null

    @JsonProperty("harvest/harvestAgem1")
    var harvestAgem1: String? = null

    @JsonProperty("harvest/harvestAgem2")
    var harvestAgem2: String? = null

    @JsonProperty("harvest/harvestAgem3")
    var harvestAgem3: String? = null

    @JsonProperty("harvest/harvestAgem4")
    var harvestAgem4: String? = null

    @JsonProperty("harvest/harvestAgep1")
    var harvestAgep1: String? = null

    @JsonProperty("harvest/harvestAgep2")
    var harvestAgep2: String? = null

    @JsonProperty("harvest/harvestAgep3")
    var harvestAgep3: String? = null

    @JsonProperty("harvest/harvestAgep4")
    var harvestAgep4: String? = null

    @JsonProperty("harvest/harvestWeek0")
    var harvestWeek0: String? = null

    @JsonProperty("priceDetails/priceR0")
    var priceR0: Int? = null

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

    @JsonProperty("results/GRdif_ABcurr")
    var grdifAbcurr: String? = null

    @JsonProperty("harvest/harvestWeekm1")
    var harvestWeekm1: String? = null

    @JsonProperty("harvest/harvestWeekm2")
    var harvestWeekm2: String? = null

    @JsonProperty("harvest/harvestWeekm3")
    var harvestWeekm3: String? = null

    @JsonProperty("harvest/harvestWeekm4")
    var harvestWeekm4: String? = null

    @JsonProperty("harvest/harvestWeekp1")
    var harvestWeekp1: String? = null

    @JsonProperty("harvest/harvestWeekp2")
    var harvestWeekp2: String? = null

    @JsonProperty("harvest/harvestWeekp3")
    var harvestWeekp3: String? = null

    @JsonProperty("harvest/harvestWeekp4")
    var harvestWeekp4: String? = null

    @JsonProperty("priceDetails/priceRm2")
    var priceRm2: Int? = null

    @JsonProperty("priceDetails/priceRm4")
    var priceRm4: Int? = null

    @JsonProperty("priceDetails/priceRp2")
    var priceRp2: Int? = null

    @JsonProperty("priceDetails/priceRp4")
    var priceRp4: Int? = null

    @JsonProperty("results/GRp0h0_ABcurr")
    var grp0h0Abcurr: String? = null

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
}