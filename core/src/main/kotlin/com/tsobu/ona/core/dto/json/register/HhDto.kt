package com.tsobu.ona.core.dto.json.register

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "country", "zone", "region", "state", "locHH", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "EAEN", "EAID", "login", "firstNameEN", "surNameEN", "genderEN", "phoneNrEN", "firstNameHH", "surNameHH", "phoneNrHH", "phoneNr2HH", "genderHH", "ageHH", "relationHH", "maritalStatusHH", "educationHH", "occupationHH", "startYearHH", "activitiesHH", "useCaseHH", "photoHH", "photoProfileHH", "HHID", "accept", "end", "instanceID", "KEY")
class HhDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var uuid: String? = null

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
    var simSerial: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("banner")
    var banner: String? = null

    @JsonProperty("intro")
    var intro: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("zone")
    var zone: String? = null

    @JsonProperty("region")
    var region: String? = null

    @JsonProperty("state")
    var state: String? = null

    @JsonProperty("locHH")
    var locHh: String? = null

    @JsonProperty("geopoint-Latitude")
    var geoPointLatitude: String? = null

    @JsonProperty("geopoint-Longitude")
    var geoPointLongitude: String? = null

    @JsonProperty("geopoint-Altitude")
    var geoPointAltitude: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geoPointAccuracy: String? = null

    @JsonProperty("EAEN")
    var eaen: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("login")
    var login: String? = null

    @JsonProperty("firstNameEN")
    var firstNameEn: String? = null

    @JsonProperty("surNameEN")
    var surNameEn: String? = null

    @JsonProperty("genderEN")
    var genderEn: String? = null

    @JsonProperty("phoneNrEN")
    var phoneNrEn: String? = null

    @JsonProperty("firstNameHH")
    var firstNameHh: String? = null

    @JsonProperty("surNameHH")
    var surNameHh: String? = null

    @JsonProperty("phoneNrHH")
    var phoneNrHh: String? = null

    @JsonProperty("phoneNr2HH")
    var phoneNr2Hh: String? = null

    @JsonProperty("genderHH")
    var genderHh: String? = null

    @JsonProperty("ageHH")
    var ageHh: String? = null

    @JsonProperty("relationHH")
    var relationHh: String? = null

    @JsonProperty("maritalStatusHH")
    var maritalStatusHh: String? = null

    @JsonProperty("educationHH")
    var educationHh: String? = null

    @JsonProperty("occupationHH")
    var occupationHh: String? = null

    @JsonProperty("startYearHH")
    var startYearHh: String? = null

    @JsonProperty("activitiesHH")
    var activitiesHh: String? = null

    @JsonProperty("useCaseHH")
    var useCaseHh: String? = null

    @JsonProperty("photoHH")
    var photoHh: String? = null

    @JsonProperty("photoProfileHH")
    var photoProfileHh: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("accept")
    var accept: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}