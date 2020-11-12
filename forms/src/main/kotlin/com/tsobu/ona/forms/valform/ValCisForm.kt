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
    var end: String? = null

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

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("rootGRIC")
    var rootGRIC: String? = null

    @JsonProperty("rootGRMC")
    var rootGRMC: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId: String? = null

    @JsonProperty("areaBasis")
    var areaBasis: String? = null

    @JsonProperty("extraGRIC")
    var extraGRIC: String? = null

    @JsonProperty("rootGRICF")
    var rootGRICF: String? = null

    @JsonProperty("rootGRMCF")
    var rootGRMCF: String? = null

    @JsonProperty("rootsUnit")
    var rootsUnit: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("totalGRIC")
    var totalGRIC: String? = null

    @JsonProperty("tuberGRIC")
    var tuberGRIC: String? = null

    @JsonProperty("tuberUnit")
    var tuberunit: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("extraGRICF")
    var extraGRICF: String? = null

    @JsonProperty("extraGRMCF")
    var extraGRMCF: String? = null

    @JsonProperty("rootsPrice")
    var rootsPrice: String? = null

    @JsonProperty("totalGRICF")
    var totalGRICF: String? = null

    @JsonProperty("tuberGRICF")
    var tuberGRICF: String? = null

    @JsonProperty("tuberPrice")
    var tuberPrice: String? = null

    @JsonProperty("yieldLevel")
    var yieldLevel: String? = null

    @JsonProperty("extraProfit")
    var extraProfit: String? = null

    @JsonProperty("purpose/VAL")
    var purposeVAL: String? = null

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
    var importanceIC: String? = null

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
    var rootYieldRedIC: String? = null

    @JsonProperty("extraProfitPerc")
    var extraProfitPerc: String? = null

    @JsonProperty("meta/instanceID")
    var metaInstanceId: String? = null

    @JsonProperty("tuberYieldRedIC")
    var tuberYieldRedIC: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("costFertilizerAB")
    var costFertilizerAb: String? = null

    @JsonProperty("unitPriceNPK50kg")
    var unitPriceNPK50kg: String? = null

    @JsonProperty("extraRootYieldMCF")
    var extraRootYieldMCF: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("extraTuberYieldMCF")
    var extraTuberYieldMCF: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("thankyou/confirmVAL")
    var confirmVal: String? = null

    @JsonProperty("cassavaVarietySelect")
    var cassavaVarietySelect: String? = null

    @JsonProperty("costFertilizerAB_Text")
    var costfertilizerabText: String? = null

    @JsonProperty("rateFertilizerAB_Text")
    var costFertilizerAbText: String? = null

    @JsonProperty("costDetailsNPK/costNPK")
    var costDetailsNPKCostNPK: String? = null

    @JsonProperty("sweetPotatoVarietySelect")
    var sweetPotatoVarietySelect: String? = null

    @JsonProperty("costDetailsNPK/bagSizeNPK")
    var bagsizenpk: String? = null

    @JsonProperty("rootsUnitDetails/rootsUnitPrice")
    var rootsunitprice: String? = null

    @JsonProperty("tuberUnitDetails/tuberUnitPrice")
    var tuberunitprice: String? = null

    @JsonProperty("rootsUnitDetails/rootsUnitWeight")
    var rootsunitweight: Double? = null

    @JsonProperty("tuberUnitDetails/tuberUnitWeight")
    var tuberunitweight: Double? = null

    @JsonProperty("tuberPriceSI")
    var tuberpricesi: String? = null

    @JsonProperty("rootsPriceSI")
    var rootspricesi: String? = null
}