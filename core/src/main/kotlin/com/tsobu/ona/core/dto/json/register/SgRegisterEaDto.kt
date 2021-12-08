package com.tsobu.ona.core.dto.json.register

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

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
    "purpose-banner",
    "purpose-intro",
    "enumerator-generated_note_name_14",
    "enumerator-firstNameEN",
    "enumerator-surNameEN",
    "enumerator-genderEN",
    "enumerator-phoneNrEN",
    "areaEA-generated_note_name_21",
    "areaEA-areaOperation",
    "areaEA-state",
    "areaEA-lga",
    "areaEA-geopoint-Latitude",
    "areaEA-geopoint-Longitude",
    "areaEA-geopoint-Altitude",
    "areaEA-geopoint-Accuracy",
    "detailsEA-generated_note_name_28",
    "detailsEA-firstNameEA",
    "detailsEA-surNameEA",
    "detailsEA-phoneNrEA",
    "detailsEA-genderEA",
    "detailsEA-EAID",
    "detailsEA2-ageEA",
    "detailsEA2-educationEA",
    "organizationEA-generated_note_name_40",
    "organizationEA-gov",
    "organizationEA-title",
    "organizationEA-role",
    "organizationEA-level",
    "operationEA-generated_note_name_47",
    "operationEA-levelName",
    "operationEA-nrHH",
    "operationEA-freq",
    "accept",
    "end",
    "meta-instanceID",
    "KEY"
)
class SgRegisterEaDto {
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

    @JsonProperty("purpose-banner")
    var purposeBanner: String? = null

    @JsonProperty("purpose-intro")
    var purposeIntro: String? = null

    @JsonProperty("enumerator-generated_note_name_14")
    var enumeratorGeneratedNoteName14: String? = null

    @JsonProperty("enumerator-firstNameEN")
    var enumeratorFirstNameEn: String? = null

    @JsonProperty("enumerator-surNameEN")
    var enumeratorSurNameEn: String? = null

    @JsonProperty("enumerator-genderEN")
    var enumeratorGenderEn: String? = null

    @JsonProperty("enumerator-phoneNrEN")
    var enumeratorPhoneNrEn: String? = null

    @JsonProperty("areaEA-generated_note_name_21")
    var areaEaGeneratedNoteName21: String? = null

    @JsonProperty("areaEA-areaOperation")
    var areaEaareaOperation: String? = null

    @JsonProperty("areaEA-state")
    var areaEaState: String? = null

    @JsonProperty("areaEA-lga")
    var areaEaLga: String? = null

    @JsonProperty("areaEA-geopoint-Latitude")
    var areaEaGeopointLatitude: String? = null

    @JsonProperty("areaEA-geopoint-Longitude")
    var areaEaGeopointLongitude: String? = null

    @JsonProperty("areaEA-geopoint-Altitude")
    var areaEaGeopointAltitude: String? = null

    @JsonProperty("areaEA-geopoint-Accuracy")
    var areaEaGeopointAccuracy: String? = null

    @JsonProperty("detailsEA-generated_note_name_28")
    var detailsEaGeneratedNoteName28: String? = null

    @JsonProperty("detailsEA-firstNameEA")
    var detailsEaFirstNameEa: String? = null

    @JsonProperty("detailsEA-surNameEA")
    var detailsEaSurNameEa: String? = null

    @JsonProperty("detailsEA-phoneNrEA")
    var detailsEaPhoneNrEa: String? = null

    @JsonProperty("detailsEA-genderEA")
    var detailsEaGenderEa: String? = null

    @JsonProperty("detailsEA-EAID")
    var detailsEaEaId: String? = null

    @JsonProperty("detailsEA2-ageEA")
    var detailsEa2AgeEa: String? = null

    @JsonProperty("detailsEA2-educationEA")
    var detailsEa2EducationEa: String? = null

    @JsonProperty("organizationEA-generated_note_name_40")
    var organizationEaGeneratedNoteName40: String? = null

    @JsonProperty("organizationEA-gov")
    var organizationEaGov: String? = null

    @JsonProperty("organizationEA-title")
    var organizationEaTitle: String? = null

    @JsonProperty("organizationEA-role")
    var organizationEaRole: String? = null

    @JsonProperty("organizationEA-level")
    var organizationEaLevel: String? = null

    @JsonProperty("operationEA-generated_note_name_47")
    var operationEaGeneratedNoteName47: String? = null

    @JsonProperty("operationEA-levelName")
    var operationEaLevelName: String? = null

    @JsonProperty("operationEA-nrHH")
    var operationEaNrHh: String? = null

    @JsonProperty("operationEA-freq")
    var operationEaFreq: String? = null

    @JsonProperty("accept")
    var accept: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("meta-instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}