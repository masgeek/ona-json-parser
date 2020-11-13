package com.tsobu.ona.forms.valform

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("_id", "end", "lat", "lon", "rec", "EAID", "HHID", "_tags", "_uuid", "start", "today", "_notes", "_edited", "_status", "country", "_version", "currency", "deviceid", "geopoint", "rootGRIC", "rootGRMC", "username", "_duration", "_xform_id", "areaBasis", "extraGRIC", "rootGRICF", "rootGRMCF", "rootsUnit", "simserial", "totalGRIC", "tuberGRIC", "tuberUnit", "conversion", "extraGRICF", "extraGRMCF", "rootsPrice", "totalGRICF", "tuberGRICF", "tuberPrice", "yieldLevel", "extraProfit", "purpose/VAL", "rootYieldMC", "_attachments", "_geolocation", "_media_count", "_total_media", "formhub/uuid", "importanceIC", "plantingDate", "riskAttitude", "subscriberid", "tuberYieldMC", "_submitted_by", "rootsUnitName", "thankyou/call", "tuberUnitName", "costFertilizer", "rootYieldRedIC", "extraProfitPerc", "meta/instanceID", "tuberYieldRedIC", "_submission_time", "_xform_id_string", "costFertilizerAB", "unitPriceNPK50kg", "extraRootYieldMCF", "_bamboo_dataset_id", "extraTuberYieldMCF", "_media_all_received", "thankyou/confirmVAL", "cassavaVarietySelect", "costFertilizerAB_Text", "rateFertilizerAB_Text", "costDetailsNPK/costNPK", "sweetPotatoVarietySelect", "costDetailsNPK/bagSizeNPK", "rootsUnitDetails/rootsUnitPrice", "tuberUnitDetails/tuberUnitPrice", "rootsUnitDetails/rootsUnitWeight", "tuberUnitDetails/tuberUnitWeight", "tuberPriceSI", "rootsPriceSI")
class ValCisForm {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("lat")
    var lat: String? = null

    @JsonProperty("lon")
    var lon: String? = null

    @JsonProperty("rec")
    var rec: String? = null

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

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

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

    @JsonProperty("rootGRIC")
    var rootGrIc: String? = null

    @JsonProperty("rootGRMC")
    var rootGrMc: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: String?=null

    @JsonProperty("_xform_id")
    var xFormId: String? = null

    @JsonProperty("areaBasis")
    var areaBasis: String? = null

    @JsonProperty("extraGRIC")
    var extraGrIc: String? = null

    @JsonProperty("rootGRICF")
    var rootGriCf: String? = null

    @JsonProperty("rootGRMCF")
    var rootGrmCf: String? = null

    @JsonProperty("rootsUnit")
    var rootsUnit: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("totalGRIC")
    var totalGrIc: String? = null

    @JsonProperty("tuberGRIC")
    var tuberGrIc: String? = null

    @JsonProperty("tuberUnit")
    var tuberUnit: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("extraGRICF")
    var extraGriCf: String? = null

    @JsonProperty("extraGRMCF")
    var extraGrmCf: String? = null

    @JsonProperty("rootsPrice")
    var rootsPrice: String? = null

    @JsonProperty("totalGRICF")
    var totalGriCf: String? = null

    @JsonProperty("tuberGRICF")
    var tuberGriCf: String? = null

    @JsonProperty("tuberPrice")
    var tuberPrice: String? = null

    @JsonProperty("yieldLevel")
    var yieldLevel: String? = null

    @JsonProperty("extraProfit")
    var extraProfit: String? = null

    @JsonProperty("purpose/VAL")
    var purposeVal: String? = null

    @JsonProperty("rootYieldMC")
    var rootYieldMC: String? = null

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

    @JsonProperty("importanceIC")
    var importanceIc: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("riskAttitude")
    var riskAttitude: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("tuberYieldMC")
    var tuberYieldMC: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("rootsUnitName")
    var rootsUnitName: String? = null

    @JsonProperty("thankyou/call")
    var callValue: String? = null

    @JsonProperty("tuberUnitName")
    var tuberUnitName: String? = null

    @JsonProperty("costFertilizer")
    var costfertilizer: String? = null

    @JsonProperty("rootYieldRedIC")
    var rootYieldRedIc: String? = null

    @JsonProperty("extraProfitPerc")
    var extraProfitPerc: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("tuberYieldRedIC")
    var tuberYieldRedIc: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("costFertilizerAB")
    var costFertilizerAb: String? = null

    @JsonProperty("unitPriceNPK50kg")
    var unitPriceNpk50kg: String? = null

    @JsonProperty("extraRootYieldMCF")
    var extraRootYieldMcf: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("extraTuberYieldMCF")
    var extraTuberYieldMcf: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("thankyou/confirmVAL")
    var confirmVal: String? = null

    @JsonProperty("cassavaVarietySelect")
    var cassavaVarietySelect: String? = null

    @JsonProperty("costFertilizerAB_Text")
    var costFertilizerAbText: String? = null

    @JsonProperty("rateFertilizerAB_Text")
    var rateFertilizerAbText: String? = null

    @JsonProperty("costDetailsNPK/costNPK")
    var costNpk: String? = null

    @JsonProperty("sweetPotatoVarietySelect")
    var sweetPotatoVarietySelect: String? = null

    @JsonProperty("costDetailsNPK/bagSizeNPK")
    var bagSizeNpk: String? = null

    @JsonProperty("rootsUnitDetails/rootsUnitPrice")
    var rootsUnitPrice: String? = null

    @JsonProperty("tuberUnitDetails/tuberUnitPrice")
    var tuberUnitPrice: String? = null

    @JsonProperty("rootsUnitDetails/rootsUnitWeight")
    var rootsUnitWeight: String?=null

    @JsonProperty("tuberUnitDetails/tuberUnitWeight")
    var tuberUnitWeight: String?=null

    @JsonProperty("tuberPriceSI")
    var tuberPriceSi: String? = null

    @JsonProperty("rootsPriceSI")
    var rootsPriceSi: String? = null
}