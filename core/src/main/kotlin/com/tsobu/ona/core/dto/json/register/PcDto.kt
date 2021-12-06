package com.tsobu.ona.core.dto.json.register

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonProperty
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
    "aim",
    "project_full",
    "project_abbr",
    "projectCode",
    "project_exist",
    "project_existNote",
    "projectCode_exist",
    "projectCode_existNote",
    "project",
    "country",
    "end",
    "instanceID",
    "KEY"
)
@Generated("jsonschema2pojo")
class PcDto {
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

    @JsonProperty("aim")
    var aim: String? = null

    @JsonProperty("project_full")
    var projectFull: String? = null

    @JsonProperty("project_abbr")
    var projectAbbr: String? = null

    @JsonProperty("projectCode")
    var projectCode: String? = null

    @JsonProperty("project_exist")
    var projectExist: String? = null

    @JsonProperty("project_existNote")
    var projectExistNote: String? = null

    @JsonProperty("projectCode_exist")
    var projectCodeExist: String? = null

    @JsonProperty("projectCode_existNote")
    var projectCodeExistNote: String? = null

    @JsonProperty("project")
    var project: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("instanceID")
    var instanceID: String? = null

    @JsonProperty("KEY")
    var key: String? = null
}