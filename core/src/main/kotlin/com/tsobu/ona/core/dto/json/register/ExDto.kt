package com.tsobu.ona.core.dto.json.register

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import javax.annotation.Generated

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
    "projectCode",
    "aim",
    "expName",
    "expFamily",
    "expVersion",
    "expCode",
    "expCode_label",
    "expCode_exist",
    "expCode_existNote",
    "nrTreats",
    "expCode_copy",
    "country",
    "treatmentDetails_note",
    "treatmentRepeat_count",
    "SET-OF-treatmentDetails-treatmentRepeat",
    "end",
    "instanceID",
    "KEY"
)

class ExDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var uuid: String? = null

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

    @JsonProperty("banner")
    var banner: String? = null

    @JsonProperty("intro")
    var intro: String? = null

    @JsonProperty("project")
    var project: String? = null

    @JsonProperty("projectCode")
    var projectCode: String? = null

    @JsonProperty("aim")
    var aim: String? = null

    @JsonProperty("expName")
    var expName: String? = null

    @JsonProperty("expFamily")
    var expFamily: String? = null

    @JsonProperty("expVersion")
    var expVersion: String? = null

    @JsonProperty("expCode")
    var expCode: String? = null

    @JsonProperty("expCode_label")
    var expCodeLabel: String? = null

    @JsonProperty("expCode_exist")
    var expCodeExist: String? = null

    @JsonProperty("expCode_existNote")
    var expCodeExistNote: String? = null

    @JsonProperty("nrTreats")
    var nrTreats: String? = null

    @JsonProperty("expCode_copy")
    var expCodeCopy: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("treatmentDetails_note")
    var treatmentDetailsNote: String? = null

    @JsonProperty("treatmentRepeat_count")
    var treatmentRepeatCount: String? = null

    @JsonProperty("SET-OF-treatmentDetails-treatmentRepeat")
    var sETOFTreatmentDetailsTreatmentRepeat: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("instanceID")
    var instanceID: String? = null

    @JsonProperty("KEY")
    var key: String? = null
}