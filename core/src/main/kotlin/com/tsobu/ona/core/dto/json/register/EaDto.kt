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
    var formHubUuId:String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

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
    var firstNameEa: String? = null

    @JsonProperty("surNameEA")
    var surNameEa: String? = null

    @JsonProperty("phoneNrEA")
    var phoneNrEa: String? = null

    @JsonProperty("phoneNr2EA")
    var phoneNr2Ea: String? = null

    @JsonProperty("genderEA")
    var genderEa: String? = null

    @JsonProperty("ageEA")
    var ageEa: String? = null

    @JsonProperty("educationEA")
    var educationEa: String? = null

    @JsonProperty("gov")
    var gov: String? = null

    @JsonProperty("partner")
    var partner: String? = null

    @JsonProperty("title")
    var titleValue: String? = null

    @JsonProperty("role")
    var role: String? = null

    @JsonProperty("level")
    var levelValue: String? = null

    @JsonProperty("levelName")
    var levelName: String? = null

    @JsonProperty("nrHH")
    var nrHh: String? = null

    @JsonProperty("freq")
    var freq: String? = null

    @JsonProperty("photoEA")
    var photoEa: String? = null

    @JsonProperty("photoProfileEA")
    var photoProfileEa: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("accept")
    var accept: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}