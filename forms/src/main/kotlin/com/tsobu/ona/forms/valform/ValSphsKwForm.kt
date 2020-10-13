package com.tsobu.ona.forms.valform

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("_id", "end", "lat", "lon", "EAID", "HHID", "unit", "_tags", "_uuid", "check", "plotL", "plotW", "start", "today", "_notes", "_edited", "_status", "country", "product", "variety", "_version", "check_id", "currency", "deviceid", "geopoint", "plotSize", "unitName", "username", "_duration", "_xform_id", "areaBasis", "simserial", "conversion", "unitWeight", "yieldLevel", "priceStarch", "purpose/VAL", "results/SC0", "_attachments", "_geolocation", "_media_count", "_total_media", "formhub/uuid", "plantingDate", "results/SCm1", "results/SCm2", "results/SCm3", "results/SCm4", "results/SCp1", "results/SCp2", "results/SCp3", "results/SCp4", "subscriberid", "_submitted_by", "plantingWeek0", "results/GPdif", "results/GPmax", "results/GRdif", "results/GRmax", "results/Pp0h0", "results/Yp0h0", "thankyou/call", "results/CYp0h0", "results/GPp0h0", "results/GRp0h0", "results/Pp0hm1", "results/Pp0hm2", "results/Pp0hm3", "results/Pp0hm4", "results/Pp0hp1", "results/WYp0h0", "results/Yp0hm1", "results/Yp0hm2", "results/Yp0hm3", "results/Yp0hm4", "results/Yp0hp1", "transformRatio", "meta/instanceID", "plantingDensity", "results/CYp0hm1", "results/CYp0hm2", "results/CYp0hm3", "results/CYp0hm4", "results/CYp0hp1", "results/GPp0hm1", "results/GPp0hm2", "results/GPp0hm3", "results/GPp0hm4", "results/GPp0hp1", "results/GRp0hm1", "results/GRp0hm2", "results/GRp0hm3", "results/GRp0hm4", "results/GRp0hp1", "results/WYp0hm1", "results/WYp0hm2", "results/WYp0hm3", "results/WYp0hm4", "results/WYp0hp1", "_submission_time", "_xform_id_string", "results/GRdif_AB", "results/GRmax_AB", "results/Yp0h0_AB", "results/sensible", "results/GPdifcurr", "results/GRp0h0_AB", "_bamboo_dataset_id", "results/GPp0h0curr", "results/optHarvest", "_media_all_received", "harvest/harvestAge0", "harvest/harvestDate", "priceDetails/price0", "thankyou/confirmVAL", "harvest/harvestAgem1", "harvest/harvestAgem2", "harvest/harvestAgem3", "harvest/harvestAgem4", "harvest/harvestAgep1", "harvest/harvestAgep2", "harvest/harvestAgep3", "harvest/harvestAgep4", "harvest/harvestWeek0", "priceDetails/priceR0", "priceDetails/pricem1", "priceDetails/pricem2", "priceDetails/pricem3", "priceDetails/pricem4", "priceDetails/pricep1", "priceDetails/pricep2", "priceDetails/pricep3", "priceDetails/pricep4", "results/GRdif_ABcurr", "harvest/harvestWeekm1", "harvest/harvestWeekm2", "harvest/harvestWeekm3", "harvest/harvestWeekm4", "harvest/harvestWeekp1", "harvest/harvestWeekp2", "harvest/harvestWeekp3", "harvest/harvestWeekp4", "priceDetails/priceRm2", "priceDetails/priceRm4", "priceDetails/priceRp2", "priceDetails/priceRp4", "results/GRp0h0_ABcurr", "results/lookupp0h0_id", "results/lookupp0hm1_id", "results/lookupp0hm2_id", "results/lookupp0hm3_id", "results/lookupp0hm4_id", "results/lookupp0hp1_id", "results/lookupp0hp2_id", "results/lookupp0hp3_id", "results/lookupp0hp4_id", "results/optHarvestText", "densityDetails/withinRow", "densityDetails/betweenRow", "results/Pp0hp2", "results/Yp0hp2", "results/CYp0hp2", "results/GPp0hp2", "results/GRp0hp2", "results/WYp0hp2", "results/Pp0hp3", "results/Pp0hp4", "results/Yp0hp3", "results/Yp0hp4", "results/CYp0hp3", "results/CYp0hp4", "results/GPp0hp3", "results/GPp0hp4", "results/GRp0hp3", "results/GRp0hp4", "results/WYp0hp3", "results/WYp0hp4", "unitNameSelect", "unitLocalWeight")
class ValSphsKwForm {
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

    @JsonProperty("unit")
    var unit: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("check")
    var checkValue: String? = null

    @JsonProperty("plotL")
    var plotL: String? = null

    @JsonProperty("plotW")
    var plotW: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

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
    var xformId: String? = null

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
    var purposeVAL: String? = null

    @JsonProperty("results/SC0")
    var SC0: String? = null

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
    var SCm1: String? = null

    @JsonProperty("results/SCm2")
    var SCm2: String? = null

    @JsonProperty("results/SCm3")
    var SCm3: String? = null

    @JsonProperty("results/SCm4")
    var SCm4: String? = null

    @JsonProperty("results/SCp1")
    var SCp1: String? = null

    @JsonProperty("results/SCp2")
    var SCp2: String? = null

    @JsonProperty("results/SCp3")
    var SCp3: String? = null

    @JsonProperty("results/SCp4")
    var SCp4: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("plantingWeek0")
    var plantingWeek0: String? = null

    @JsonProperty("results/GPdif")
    var gPdif: String? = null

    @JsonProperty("results/GPmax")
    var gPmax: String? = null

    @JsonProperty("results/GRdif")
    var grDif: String? = null

    @JsonProperty("results/GRmax")
    var grMax: String? = null

    @JsonProperty("results/Pp0h0")
    var pp0h0: String? = null

    @JsonProperty("results/Yp0h0")
    var yp0h0: String? = null

    @JsonProperty("thankyou/call")
    var callValue: String? = null

    @JsonProperty("results/CYp0h0")
    var cyP0h0: String? = null

    @JsonProperty("results/GPp0h0")
    var gpP0h0: String? = null

    @JsonProperty("results/GRp0h0")
    var grP0h0: String? = null

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

    @JsonProperty("results/WYp0h0")
    var wYp0h0: String? = null

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

    @JsonProperty("transformRatio")
    var transformRatio: String? = null

    @JsonProperty("meta/instanceID")
    var metaInstanceID: String? = null

    @JsonProperty("plantingDensity")
    var plantingDensity: String? = null

    @JsonProperty("results/CYp0hm1")
    var cyP0hm1: String? = null

    @JsonProperty("results/CYp0hm2")
    var cyP0hm2: String? = null

    @JsonProperty("results/CYp0hm3")
    var cyP0hm3: String? = null

    @JsonProperty("results/CYp0hm4")
    var cyP0hm4: String? = null

    @JsonProperty("results/CYp0hp1")
    var cyP0hp1: String? = null

    @JsonProperty("results/GPp0hm1")
    var gpP0hm1: String? = null

    @JsonProperty("results/GPp0hm2")
    var gpP0hm2: String? = null

    @JsonProperty("results/GPp0hm3")
    var gpP0hm3: String? = null

    @JsonProperty("results/GPp0hm4")
    var gpP0hm4: String? = null

    @JsonProperty("results/GPp0hp1")
    var gpP0hp1: String? = null

    @JsonProperty("results/GRp0hm1")
    var grP0hm1: String? = null

    @JsonProperty("results/GRp0hm2")
    var grP0hm2: String? = null

    @JsonProperty("results/GRp0hm3")
    var grP0hm3: String? = null

    @JsonProperty("results/GRp0hm4")
    var grP0hm4: String? = null

    @JsonProperty("results/GRp0hp1")
    var grP0hp1: String? = null

    @JsonProperty("results/WYp0hm1")
    var wYp0hm1: String? = null

    @JsonProperty("results/WYp0hm2")
    var wYp0hm2: String? = null

    @JsonProperty("results/WYp0hm3")
    var wYp0hm3: String? = null

    @JsonProperty("results/WYp0hm4")
    var wYp0hm4: String? = null

    @JsonProperty("results/WYp0hp1")
    var wYp0hp1: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("results/GRdif_AB")
    var grDifAB: String? = null

    @JsonProperty("results/GRmax_AB")
    var grMaxAB: String? = null

    @JsonProperty("results/Yp0h0_AB")
    var yp0h0AB: String? = null

    @JsonProperty("results/sensible")
    var Sensible: String? = null

    @JsonProperty("results/GPdifcurr")
    var gPdifcurr: String? = null

    @JsonProperty("results/GRp0h0_AB")
    var grP0h0AB: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("results/GPp0h0curr")
    var gpP0h0curr: String? = null

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
    var priceR0: String? = null

    @JsonProperty("priceDetails/pricem1")
    var pricem1: String? = null

    @JsonProperty("priceDetails/pricem2")
    var pricem2: String? = null

    @JsonProperty("priceDetails/pricem3")
    var pricem3: String? = null

    @JsonProperty("priceDetails/pricem4")
    var pricem4: String? = null

    @JsonProperty("priceDetails/pricep1")
    var pricep1: String? = null

    @JsonProperty("priceDetails/pricep2")
    var pricep2: String? = null

    @JsonProperty("priceDetails/pricep3")
    var pricep3: String? = null

    @JsonProperty("priceDetails/pricep4")
    var pricep4: String? = null

    @JsonProperty("results/GRdif_ABcurr")
    var grDifAbCurr: String? = null

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
    var priceRm2: String? = null

    @JsonProperty("priceDetails/priceRm4")
    var priceRm4: String? = null

    @JsonProperty("priceDetails/priceRp2")
    var priceRp2: String? = null

    @JsonProperty("priceDetails/priceRp4")
    var priceRp4: String? = null

    @JsonProperty("results/GRp0h0_ABcurr")
    var grP0h0ABcurr: String? = null

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

    @JsonProperty("densityDetails/withinRow")
    var withinRow: Double? = null

    @JsonProperty("densityDetails/betweenRow")
    var betweenRow: Double? = null

    @JsonProperty("results/Pp0hp2")
    var pp0hp2: String? = null

    @JsonProperty("results/Yp0hp2")
    var yp0hp2: String? = null

    @JsonProperty("results/CYp0hp2")
    var cyP0hp2: String? = null

    @JsonProperty("results/GPp0hp2")
    var gpP0hp2: String? = null

    @JsonProperty("results/GRp0hp2")
    var grP0hp2: String? = null

    @JsonProperty("results/WYp0hp2")
    var wYp0hp2: String? = null

    @JsonProperty("results/Pp0hp3")
    var pp0hp3: String? = null

    @JsonProperty("results/Pp0hp4")
    var pp0hp4: String? = null

    @JsonProperty("results/Yp0hp3")
    var yp0hp3: String? = null

    @JsonProperty("results/Yp0hp4")
    var yp0hp4: String? = null

    @JsonProperty("results/CYp0hp3")
    var cyP0hp3: String? = null

    @JsonProperty("results/CYp0hp4")
    var cyP0hp4: String? = null

    @JsonProperty("results/GPp0hp3")
    var gpP0hp3: String? = null

    @JsonProperty("results/GPp0hp4")
    var gpP0hp4: String? = null

    @JsonProperty("results/GRp0hp3")
    var grP0hp3: String? = null

    @JsonProperty("results/GRp0hp4")
    var grP0hp4: String? = null

    @JsonProperty("results/WYp0hp3")
    var wYp0hp3: String? = null

    @JsonProperty("results/WYp0hp4")
    var wYp0hp4: String? = null

    @JsonProperty("unitNameSelect")
    var unitNameSelect: String? = null

    @JsonProperty("unitLocalWeight")
    var unitLocalWeight: String? = null
}