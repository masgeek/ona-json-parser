package com.tsobu.ona.core.dto.json.addsample

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "project", "country", "login", "firstName", "surName", "entity", "repeat", "SET-OF-sample", "end", "instanceID", "KEY")
class AcDto {
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

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("login")
    var login: String? = null

    @JsonProperty("firstName")
    var firstName: String? = null

    @JsonProperty("surName")
    var surName: String? = null

    @JsonProperty("entity")
    var entity: String? = null

    @JsonProperty("repeat")
    var repeat: String? = null

    @JsonProperty("SET-OF-sample")
    var setOfSample: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}