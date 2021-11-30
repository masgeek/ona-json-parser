package com.tsobu.ona.core.dto.json.register

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "SubmissionDate",
    "formhub-uuid",
    "start",
    "today",
    "deviceid",
    "subscriberid",
    "email",
    "username",
    "simserial",
    "phonenumber",
    "purpose-banner",
    "purpose-intro",
    "Hhlocation-generated_note_name_15",
    "Hhlocation-EAEN",
    "Hhlocation-EAID",
    "Hhlocation-locHH",
    "Hhlocation-state",
    "Hhlocation-lga",
    "Hhlocation-geopoint-Latitude",
    "Hhlocation-geopoint-Longitude",
    "Hhlocation-geopoint-Altitude",
    "Hhlocation-geopoint-Accuracy",
    "detailsHH-generated_note_name_24",
    "detailsHH-firstNameHH",
    "detailsHH-surNameHH",
    "detailsHH-phoneNrHH",
    "detailsHH-phoneNr2HH",
    "detailsHH-genderHH",
    "detailsHH-ageHH",
    "detailsHH-relationHH",
    "detailsHH-maritalStatusHH",
    "detailsHH-HHtype",
    "detailsHH-educationHH",
    "detailsHH-occupationHH",
    "HHID",
    "accept",
    "end",
    "meta-instanceID",
    "KEY"
)
class SgRegisterHhDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("formhub-uuid")
    var formhubUuid: String? = null

    @JsonProperty("start")
    var start: String? = null

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

    @JsonProperty("purpose-banner")
    var purposeBanner: String? = null

    @JsonProperty("purpose-intro")
    var purposeIntro: String? = null

    @JsonProperty("Hhlocation-generated_note_name_15")
    var hhlocationGeneratedNoteName15: String? = null

    @JsonProperty("Hhlocation-EAEN")
    var hhlocationEAEN: String? = null

    @JsonProperty("Hhlocation-EAID")
    var hhlocationEAID: String? = null

    @JsonProperty("Hhlocation-locHH")
    var hhlocationLocHH: String? = null

    @JsonProperty("Hhlocation-state")
    var hhlocationState: String? = null

    @JsonProperty("Hhlocation-lga")
    var hhlocationLga: String? = null

    @JsonProperty("Hhlocation-geopoint-Latitude")
    var hhlocationGeopointLatitude: String? = null

    @JsonProperty("Hhlocation-geopoint-Longitude")
    var hhlocationGeopointLongitude: String? = null

    @JsonProperty("Hhlocation-geopoint-Altitude")
    var hhlocationGeopointAltitude: String? = null

    @JsonProperty("Hhlocation-geopoint-Accuracy")
    var hhlocationGeopointAccuracy: String? = null

    @JsonProperty("detailsHH-generated_note_name_24")
    var detailsHHGeneratedNoteName24: String? = null

    @JsonProperty("detailsHH-firstNameHH")
    var detailsHHFirstNameHH: String? = null

    @JsonProperty("detailsHH-surNameHH")
    var detailsHHSurNameHH: String? = null

    @JsonProperty("detailsHH-phoneNrHH")
    var detailsHHPhoneNrHH: String? = null

    @JsonProperty("detailsHH-phoneNr2HH")
    var detailsHHPhoneNr2HH: String? = null

    @JsonProperty("detailsHH-genderHH")
    var detailsHHGenderHH: String? = null

    @JsonProperty("detailsHH-ageHH")
    var detailsHHAgeHH: String? = null

    @JsonProperty("detailsHH-relationHH")
    var detailsHHRelationHH: String? = null

    @JsonProperty("detailsHH-maritalStatusHH")
    var detailsHHMaritalStatusHH: String? = null

    @JsonProperty("detailsHH-HHtype")
    var detailsHHHHtype: String? = null

    @JsonProperty("detailsHH-educationHH")
    var detailsHHEducationHH: String? = null

    @JsonProperty("detailsHH-occupationHH")
    var detailsHHOccupationHH: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("accept")
    var accept: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("meta-instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}