package com.tsobu.ona.core.dto.json.batchcomposition

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "project", "country", "aim", "station", "stationOther", "entity", "batchType", "batchTypeNote", "sampleBatchID_exist", "description_pull", "batchName_pull", "receiveConfirm", "receiveErrorNote", "SET-OF-sampleList-sample", "countFW", "countDC", "countRS", "countSB", "confirmAll", "confirmFW", "confirmDC", "confirmRS", "confirmSB", "next_count", "SET-OF-nextStep-next", "end", "instanceID", "KEY")
class CompositionDto {
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

    @JsonProperty("aim")
    var aim: String? = null

    @JsonProperty("station")
    var station: String? = null

    @JsonProperty("stationOther")
    var stationOther: String? = null

    @JsonProperty("entity")
    var entity: String? = null

    @JsonProperty("batchType")
    var batchType: String? = null

    @JsonProperty("batchTypeNote")
    var batchTypeNote: String? = null

    @JsonProperty("sampleBatchID_exist")
    var sampleBatchIDExist: String? = null

    @JsonProperty("description_pull")
    var descriptionPull: String? = null

    @JsonProperty("batchName_pull")
    var batchNamePull: String? = null

    @JsonProperty("receiveConfirm")
    var receiveConfirm: String? = null

    @JsonProperty("receiveErrorNote")
    var receiveErrorNote: String? = null

    @JsonProperty("SET-OF-sampleList-sample")
    var sETOFSampleListSample: String? = null

    @JsonProperty("countFW")
    var countFW: String? = null

    @JsonProperty("countDC")
    var countDC: String? = null

    @JsonProperty("countRS")
    var countRS: String? = null

    @JsonProperty("countSB")
    var countSB: String? = null

    @JsonProperty("confirmAll")
    var confirmAll: String? = null

    @JsonProperty("confirmFW")
    var confirmFW: String? = null

    @JsonProperty("confirmDC")
    var confirmDC: String? = null

    @JsonProperty("confirmRS")
    var confirmRS: String? = null

    @JsonProperty("confirmSB")
    var confirmSB: String? = null

    @JsonProperty("next_count")
    var nextCount: String? = null

    @JsonProperty("SET-OF-nextStep-next")
    var sETOFNextStepNext: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("instanceID")
    var instanceID: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}