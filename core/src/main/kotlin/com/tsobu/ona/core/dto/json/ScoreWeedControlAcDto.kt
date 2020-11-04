package com.tsobu.ona.core.dto.json

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        "SubmissionDate",
        "uuid",
        "start",
        "today",
        "deviceid",
        "subscriberid",
        "email",
        "username",
        "simserial",
        "phonenumber",
        "banner",
        "intro",
        "project",
        "country",
        "login",
        "firstName",
        "surName",
        "geopoint-Latitude",
        "geopoint-Longitude",
        "geopoint-Altitude",
        "geopoint-Accuracy",
        "entity",
        "detail",
        "nrQuadrants",
        "repeat",
        "SET-OF-ID",
        "end",
        "instanceID",
        "KEY"
)
class ScoreWeedControlAcDto {
    var uuid: String? = null

    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("deviceid")
    var deviceId: String? = null

    @JsonProperty("subscriberid")
    var subscriberId: String? = null

    var email: String? = null

    @JsonProperty("userName")
    var username: String? = null

    @JsonProperty("simserial")
    var simSerial: String? = null

    @JsonProperty("phonenumber")
    var phoneNumber: String? = null
    var banner: String? = null
    var intro: String? = null

    var project: String? = null
    var country: String? = null
    var login: String? = null

    @JsonProperty("firstName")
    var firstName: String? = null

    @JsonProperty("surName")
    var surname: String? = null

    @JsonProperty("geopoint-Latitude")
    var geoPointLatitude: Double? = null

    @JsonProperty("geopoint-Longitude")
    var geoPointLongitude: Double? = null

    @JsonProperty("geopoint-Altitude")
    var geoPointAltitude: Double? = null

    @JsonProperty("geopoint-Accuracy")
    var geoPointAccuracy: Double? = null

    @JsonProperty("entity")
    var weedEntity: String? = null

    @JsonProperty("detail")
    var weedDetail: String? = null

    @JsonProperty("nrQuadrants")
    var nrQuadrants: Int? = null

    @JsonProperty("repeat")
    var weedRepeat: String? = null

    @JsonProperty("SET-OF-ID")
    var setOfId: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var weedKey: String? = null
}