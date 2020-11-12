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
    var locEA: String? = null

    @JsonProperty("locHH")
    var locHH: String? = null

    @JsonProperty("geopoint-Latitude")
    var geopointLatitude: String? = null

    @JsonProperty("geopoint-Longitude")
    var geopointLongitude: String? = null

    @JsonProperty("geopoint-Altitude")
    var geopointAltitude: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geopointAccuracy: String? = null

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
    var titleValue: String? = null

    @JsonProperty("role")
    var role: String? = null

    @JsonProperty("level")
    var levelValue: String? = null

    @JsonProperty("levelName")
    var levelName: String? = null

    @JsonProperty("nrHH")
    var nrHH: String? = null

    @JsonProperty("freq")
    var freq: String? = null

    @JsonProperty("firstNameHH")
    var firstNameHH: String? = null

    @JsonProperty("surNameHH")
    var surNameHH: String? = null

    @JsonProperty("phoneNrHH")
    var phoneNrHH: String? = null

    @JsonProperty("phoneNr2HH")
    var phoneNr2HH: String? = null

    @JsonProperty("genderHH")
    var genderHH: String? = null

    @JsonProperty("ageHH")
    var ageHH: String? = null

    @JsonProperty("relationHH")
    var relationHH: String? = null

    @JsonProperty("maritalStatusHH")
    var maritalStatusHH: String? = null

    @JsonProperty("educationHH")
    var educationHH: String? = null

    @JsonProperty("occupationHH")
    var occupationHH: String? = null

    @JsonProperty("startYearHH")
    var startYearHH: String? = null

    @JsonProperty("activitiesHH")
    var activitiesHH: String? = null

    @JsonProperty("useCaseHH")
    var useCaseHH: String? = null

    @JsonProperty("detailsEANote")
    var detailsEANote: String? = null

    @JsonProperty("firstNameEANote")
    var firstNameEANote: String? = null

    @JsonProperty("surNameEANote")
    var surNameEANote: String? = null

    @JsonProperty("phoneNrEANote")
    var phoneNrEANote: String? = null

    @JsonProperty("phoneNr2EANote")
    var phoneNr2EANote: String? = null

    @JsonProperty("genderEANote")
    var genderEANote: String? = null

    @JsonProperty("ageEANote")
    var ageEANote: String? = null

    @JsonProperty("educationEANote")
    var educationEANote: String? = null

    @JsonProperty("govNote")
    var govNote: String? = null

    @JsonProperty("partnerNote")
    var partnerNote: String? = null

    @JsonProperty("titleNote")
    var titleNote: String? = null

    @JsonProperty("AONote")
    var aONote: String? = null

    @JsonProperty("nrHHNote")
    var nrHHNote: String? = null

    @JsonProperty("correctEA")
    var correctEA: String? = null

    @JsonProperty("detailsHHNote")
    var detailsHHNote: String? = null

    @JsonProperty("firstNameHHNote")
    var firstNameHHNote: String? = null

    @JsonProperty("surNameHHNote")
    var surNameHHNote: String? = null

    @JsonProperty("phoneNrHHNote")
    var phoneNrHHNote: String? = null

    @JsonProperty("phoneNr2HHNote")
    var phoneNr2HHNote: String? = null

    @JsonProperty("genderHHNote")
    var genderHHNote: String? = null

    @JsonProperty("ageHHNote")
    var ageHHNote: String? = null

    @JsonProperty("relationHHNote")
    var relationHHNote: String? = null

    @JsonProperty("maritalStatusHHNote")
    var maritalStatusHHNote: String? = null

    @JsonProperty("educationHHNote")
    var educationHHNote: String? = null

    @JsonProperty("occupationHHNote")
    var occupationHHNote: String? = null

    @JsonProperty("startYearHHNote")
    var startYearHHNote: String? = null

    @JsonProperty("activitiesHHNote")
    var activitiesHHNote: String? = null

    @JsonProperty("useCaseHHNote")
    var useCaseHHNote: String? = null

    @JsonProperty("correctHH")
    var correctHH: String? = null

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