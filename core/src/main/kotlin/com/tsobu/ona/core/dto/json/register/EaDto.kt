package com.tsobu.ona.core.dto.json.register

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "country", "zone", "region", "state", "areaOperation", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "login", "firstNameEN", "surNameEN", "genderEN", "phoneNrEN", "firstNameEA", "surNameEA", "phoneNrEA", "phoneNr2EA", "genderEA", "ageEA", "educationEA", "gov", "partner", "title", "role", "level", "levelName", "nrHH", "freq", "photoEA", "photoProfileEA", "EAID", "accept", "end", "instanceID", "KEY")
class EaDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

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

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("zone")
    var zone: String? = null

    @JsonProperty("region")
    var region: String? = null

    @JsonProperty("state")
    var state: String? = null

    @JsonProperty("areaOperation")
    var areaOperation: String? = null

    @JsonProperty("geopoint-Latitude")
    var geopointLatitude: String? = null

    @JsonProperty("geopoint-Longitude")
    var geopointLongitude: String? = null

    @JsonProperty("geopoint-Altitude")
    var geopointAltitude: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geopointAccuracy: String? = null

    @JsonProperty("login")
    var login: String? = null

    @JsonProperty("firstNameEN")
    var firstNameEN: String? = null

    @JsonProperty("surNameEN")
    var surNameEN: String? = null

    @JsonProperty("genderEN")
    var genderEN: String? = null

    @JsonProperty("phoneNrEN")
    var phoneNrEN: String? = null

    @JsonProperty("firstNameEA")
    var firstNameEA: String? = null

    @JsonProperty("surNameEA")
    var surNameEA: String? = null

    @JsonProperty("phoneNrEA")
    var phoneNrEA: String? = null

    @JsonProperty("phoneNr2EA")
    var phoneNr2EA: String? = null

    @JsonProperty("genderEA")
    var genderEA: String? = null

    @JsonProperty("ageEA")
    var ageEA: String? = null

    @JsonProperty("educationEA")
    var educationEA: String? = null

    @JsonProperty("gov")
    var gov: String? = null

    @JsonProperty("partner")
    var partner: String? = null

    @JsonProperty("title")
    var title: String? = null

    @JsonProperty("role")
    var role: String? = null

    @JsonProperty("level")
    var level: String? = null

    @JsonProperty("levelName")
    var levelName: String? = null

    @JsonProperty("nrHH")
    var nrHH: String? = null

    @JsonProperty("freq")
    var freq: String? = null

    @JsonProperty("photoEA")
    var photoEA: String? = null

    @JsonProperty("photoProfileEA")
    var photoProfileEA: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("accept")
    var accept: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("instanceID")
    var instanceID: String? = null

    @JsonProperty("KEY")
    var key: String? = null
}