package com.tsobu.ona.core.dto.json.valdto

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "EAID", "HHID", "countrySelect", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "lat", "lon", "basicTillCP", "harrowSelectCP", "ridgingCP", "basicTillMethodSelect1CP", "basicTillMethodSelect2CP", "harrowCP", "ridgingMethodSelectCP", "basicTillREC", "harrowSelectREC", "ridgingREC", "basicTillMethodSelect1REC", "basicTillMethodSelect2REC", "harrowREC", "ridgingMethodSelectREC", "presenceRedPlot", "basicTillALT", "harrowSelectALT", "ridgingALT", "basicTillMethodSelect1ALT", "basicTillMethodSelect2ALT", "harrowALT", "ridgingMethodSelectALT", "end", "instanceID", "KEY")
class VaLPpTreatDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var formHubUuId:String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("deviceid")
    var deviceId: String? = null

    @JsonProperty("subscriberid")
    var subscriberId: String? = null

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

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("countrySelect")
    var countrySelect: String? = null

    @JsonProperty("geopoint-Latitude")
    var geopointLatitude: String? = null

    @JsonProperty("geopoint-Longitude")
    var geopointLongitude: String? = null

    @JsonProperty("geopoint-Altitude")
    var geopointAltitude: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geopointAccuracy: String? = null

    @JsonProperty("lat")
    var lat: String? = null

    @JsonProperty("lon")
    var lon: String? = null

    @JsonProperty("basicTillCP")
    var basicTillCp: String? = null

    @JsonProperty("harrowSelectCP")
    var harrowSelectCp: String? = null

    @JsonProperty("ridgingCP")
    var ridgingCp: String? = null

    @JsonProperty("basicTillMethodSelect1CP")
    var basicTillMethodSelect1Cp: String? = null

    @JsonProperty("basicTillMethodSelect2CP")
    var basicTillMethodSelect2Cp: String? = null

    @JsonProperty("harrowCP")
    var harrowCp: String? = null

    @JsonProperty("ridgingMethodSelectCP")
    var ridgingMethodSelectCp: String? = null

    @JsonProperty("basicTillREC")
    var basicTillREC: String? = null

    @JsonProperty("harrowSelectREC")
    var harrowSelectREC: String? = null

    @JsonProperty("ridgingREC")
    var ridgingREC: String? = null

    @JsonProperty("basicTillMethodSelect1REC")
    var basicTillMethodSelect1REC: String? = null

    @JsonProperty("basicTillMethodSelect2REC")
    var basicTillMethodSelect2REC: String? = null

    @JsonProperty("harrowREC")
    var harrowREC: String? = null

    @JsonProperty("ridgingMethodSelectREC")
    var ridgingMethodSelectREC: String? = null

    @JsonProperty("presenceRedPlot")
    var presenceRedPlot: String? = null

    @JsonProperty("basicTillALT")
    var basicTillALT: String? = null

    @JsonProperty("harrowSelectALT")
    var harrowSelectALT: String? = null

    @JsonProperty("ridgingALT")
    var ridgingALT: String? = null

    @JsonProperty("basicTillMethodSelect1ALT")
    var basicTillMethodSelect1ALT: String? = null

    @JsonProperty("basicTillMethodSelect2ALT")
    var basicTillMethodSelect2ALT: String? = null

    @JsonProperty("harrowALT")
    var harrowALT: String? = null

    @JsonProperty("ridgingMethodSelectALT")
    var ridgingMethodSelectALT: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}