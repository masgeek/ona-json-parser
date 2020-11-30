package com.tsobu.ona.core.dto.json

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "remark1", "remark2", "typeID", "EAID", "HHID", "locEA", "locHH", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "firstNameEA", "surNameEA", "phoneNrEA", "phoneNr2EA", "genderEA", "ageEA", "educationEA", "gov", "partner", "title", "role", "level", "levelName", "nrHH", "freq", "firstNameHH", "surNameHH", "phoneNrHH", "phoneNr2HH", "genderHH", "ageHH", "relationHH", "maritalStatusHH", "educationHH", "occupationHH", "startYearHH", "activitiesHH", "useCaseHH", "detailsEANote", "firstNameEANote", "surNameEANote", "phoneNrEANote", "phoneNr2EANote", "genderEANote", "ageEANote", "educationEANote", "govNote", "partnerNote", "titleNote", "AONote", "nrHHNote", "correctEA", "detailsHHNote", "firstNameHHNote", "surNameHHNote", "phoneNrHHNote", "phoneNr2HHNote", "genderHHNote", "ageHHNote", "relationHHNote", "maritalStatusHHNote", "educationHHNote", "occupationHHNote", "startYearHHNote", "activitiesHHNote", "useCaseHHNote", "correctHH", "endNote1", "endNote2", "endNote3", "endNote4", "endNote5", "end", "instanceID", "KEY")
class CheckIdRegDto {
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

    @JsonProperty("remark1")
    var remark1: String? = null

    @JsonProperty("remark2")
    var remark2: String? = null

    @JsonProperty("typeID")
    var typeId: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("locEA")
    var locEa: String? = null

    @JsonProperty("locHH")
    var locHh: String? = null

    @JsonProperty("geopoint-Latitude")
    var geopointLatitude: String? = null

    @JsonProperty("geopoint-Longitude")
    var geopointLongitude: String? = null

    @JsonProperty("geopoint-Altitude")
    var geopointAltitude: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geopointAccuracy: String? = null

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

    @JsonProperty("detailsEANote")
    var detailsEaNote: String? = null

    @JsonProperty("firstNameEANote")
    var firstNameEaNote: String? = null

    @JsonProperty("surNameEANote")
    var surNameEaNote: String? = null

    @JsonProperty("phoneNrEANote")
    var phoneNrEaNote: String? = null

    @JsonProperty("phoneNr2EANote")
    var phoneNr2EaNote: String? = null

    @JsonProperty("genderEANote")
    var genderEaNote: String? = null

    @JsonProperty("ageEANote")
    var ageEaNote: String? = null

    @JsonProperty("educationEANote")
    var educationEaNote: String? = null

    @JsonProperty("govNote")
    var govNote: String? = null

    @JsonProperty("partnerNote")
    var partnerNote: String? = null

    @JsonProperty("titleNote")
    var titleNote: String? = null

    @JsonProperty("AONote")
    var aoNote: String? = null

    @JsonProperty("nrHHNote")
    var nrHhNote: String? = null

    @JsonProperty("correctEA")
    var correctEa: String? = null

    @JsonProperty("detailsHHNote")
    var detailsHhNote: String? = null

    @JsonProperty("firstNameHHNote")
    var firstNameHhNote: String? = null

    @JsonProperty("surNameHHNote")
    var surNameHhNote: String? = null

    @JsonProperty("phoneNrHHNote")
    var phoneNrHhNote: String? = null

    @JsonProperty("phoneNr2HHNote")
    var phoneNr2HhNote: String? = null

    @JsonProperty("genderHHNote")
    var genderHhNote: String? = null

    @JsonProperty("ageHHNote")
    var ageHhNote: String? = null

    @JsonProperty("relationHHNote")
    var relationHhNote: String? = null

    @JsonProperty("maritalStatusHHNote")
    var maritalStatusHhNote: String? = null

    @JsonProperty("educationHHNote")
    var educationHhNote: String? = null

    @JsonProperty("occupationHHNote")
    var occupationHhNote: String? = null

    @JsonProperty("startYearHHNote")
    var startYearHhNote: String? = null

    @JsonProperty("activitiesHHNote")
    var activitiesHhNote: String? = null

    @JsonProperty("useCaseHHNote")
    var useCaseHhNote: String? = null

    @JsonProperty("correctHH")
    var correctHh: String? = null

    @JsonProperty("endNote1")
    var endNote1: String? = null

    @JsonProperty("endNote2")
    var endNote2: String? = null

    @JsonProperty("endNote3")
    var endNote3: String? = null

    @JsonProperty("endNote4")
    var endNote4: String? = null

    @JsonProperty("endNote5")
    var endNote5: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}