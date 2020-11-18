package com.tsobu.ona.forms.valsphstz

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = false)
class LzeForm {
    @JsonProperty("_id")
    var dataId: Int? = null

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

    @JsonProperty("unit")
    var unit: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("check")
    var check: String? = null

    @JsonProperty("plotL")
    var plotLength: String? = null

    @JsonProperty("plotW")
    var plotWwidth: String? = null

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

    @JsonProperty("purpose/VAL")
    var purposeVAL: String? = null

    @JsonProperty("results/SC0")
    var resultsSC0: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("formhub/uuid")
    var formHubUuid: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("results/SCm1")
    var scM1: String? = null

    @JsonProperty("results/SCm2")
    var scM2: String? = null

    @JsonProperty("results/SCm3")
    var scM3: String? = null

    @JsonProperty("results/SCm4")
    var scM4: String? = null

    @JsonProperty("results/SCp1")
    var scP1: String? = null

    @JsonProperty("results/SCp2")
    var scP2: String? = null

    @JsonProperty("results/SCp3")
    var scP3: String? = null

    @JsonProperty("results/SCp4")
    var scP4: String? = null

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
    var yp0H0: String? = null

    @JsonProperty("thankyou/call")
    var callValue: String? = null

    @JsonProperty("results/CYp0h0")
    var cypP0h0: String? = null

    @JsonProperty("results/GPp0h0")
    var cpp0h0: String? = null

    @JsonProperty("results/GRp0h0")
    var grp0h0: String? = null

    @JsonProperty("results/Pp0hm1")
    var pp0HM1: String? = null

    @JsonProperty("results/Pp0hm2")
    var pp0Hm2: String? = null

    @JsonProperty("results/Pp0hm3")
    var pp0Hm3: String? = null

    @JsonProperty("results/Pp0hm4")
    var pp0Hm4: String? = null

    @JsonProperty("results/Pp0hp1")
    var pp0Hp1: String? = null

    @JsonProperty("results/Pp0hp2")
    var pp0Hp2: String? = null

    @JsonProperty("results/Pp0hp3")
    var pp0Hp3: String? = null

    @JsonProperty("results/Pp0hp4")
    var pp0Hp4: String? = null

    @JsonProperty("results/WYp0h0")
    var wyp0h0: String? = null

    @JsonProperty("results/Yp0hm1")
    var yp0HM1: String? = null

    @JsonProperty("results/Yp0hm2")
    var yp0Hm2: String? = null

    @JsonProperty("results/Yp0hm3")
    var yp0Hm3: String? = null

    @JsonProperty("results/Yp0hm4")
    var yp0Hm4: String? = null

    @JsonProperty("results/Yp0hp1")
    var yp0Hp1: String? = null

    @JsonProperty("results/Yp0hp2")
    var yp0Hp2: String? = null

    @JsonProperty("results/Yp0hp3")
    var yp0Hp3: String? = null

    @JsonProperty("results/Yp0hp4")
    var yp0Hp4: String? = null

    @JsonProperty("transformRatio")
    var transformRatio: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("plantingDensity")
    var plantingDensity: String? = null

    @JsonProperty("results/CYp0hm1")
    var cypP0hM1: String? = null

    @JsonProperty("results/CYp0hm2")
    var cypP0hm2: String? = null

    @JsonProperty("results/CYp0hm3")
    var cypP0hm3: String? = null

    @JsonProperty("results/CYp0hm4")
    var cypP0hm4: String? = null

    @JsonProperty("results/CYp0hp1")
    var cypP0hp1: String? = null

    @JsonProperty("results/CYp0hp2")
    var cypP0hp2: String? = null

    @JsonProperty("results/CYp0hp3")
    var cypP0hp3: String? = null

    @JsonProperty("results/CYp0hp4")
    var cypP0hp4: String? = null

    @JsonProperty("results/GPp0hm1")
    var cpp0hM1: String? = null

    @JsonProperty("results/GPp0hm2")
    var cpp0hm2: String? = null

    @JsonProperty("results/GPp0hm3")
    var cpp0hm3: String? = null

    @JsonProperty("results/GPp0hm4")
    var cpp0hm4: String? = null

    @JsonProperty("results/GPp0hp1")
    var cpp0hp1: String? = null

    @JsonProperty("results/GPp0hp2")
    var cpp0hp2: String? = null

    @JsonProperty("results/GPp0hp3")
    var cpp0hp3: String? = null

    @JsonProperty("results/GPp0hp4")
    var cpp0hp4: String? = null

    @JsonProperty("results/GRp0hm1")
    var grp0hM1: String? = null

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
    var wyp0hM1: String? = null

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
    var yp0H0Ab: String? = null

    @JsonProperty("results/sensible")
    var sensible: String? = null

    @JsonProperty("results/GPdifcurr")
    var gpDifCurr: String? = null

    @JsonProperty("results/GRp0h0_AB")
    var grp0h0Ab: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("results/GPp0h0curr")
    var cpp0h0Curr: String? = null

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
    var grDifAbCurr: String? = null

    @JsonProperty("harvest/harvestWeekm1")
    var harvestWeekM1: String? = null

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

    @JsonProperty("unitNameSelect")
    var unitNameSelect: String? = null

    @JsonProperty("unitLocalWeight")
    var unitLocalWeight: String? = null

    @JsonProperty("season")
    var season: String? = null

    @JsonProperty("priceStarch")
    var priceStarch: String? = null

    @JsonProperty("SC1")
    var sc1: String? = null

    @JsonProperty("priceSC1")
    var priceSc1: String? = null

    @JsonProperty("starchFactory")
    var starchFactory: String? = null

    @JsonProperty("results/priceSC0")
    var priceSc0: String? = null

    @JsonProperty("results/priceSCm1")
    var priceScM1: String? = null

    @JsonProperty("results/priceSCm2")
    var priceScm2: String? = null

    @JsonProperty("results/priceSCm3")
    var priceScm3: String? = null

    @JsonProperty("results/priceSCm4")
    var priceScm4: String? = null

    @JsonProperty("results/priceSCp1")
    var priceScP1: String? = null

    @JsonProperty("results/priceSCp2")
    var priceScP2: String? = null

    @JsonProperty("results/priceSCp3")
    var priceScP3: String? = null

    @JsonProperty("results/priceSCp4")
    var priceScP4: String? = null
}