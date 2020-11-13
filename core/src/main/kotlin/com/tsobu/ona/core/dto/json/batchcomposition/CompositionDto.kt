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
    var setOfSampleListSample: String? = null

    @JsonProperty("countFW")
    var countFw: String? = null

    @JsonProperty("countDC")
    var countDc: String? = null

    @JsonProperty("countRS")
    var countRs: String? = null

    @JsonProperty("countSB")
    var countSb: String? = null

    @JsonProperty("confirmAll")
    var confirmAll: String? = null

    @JsonProperty("confirmFW")
    var confirmFw: String? = null

    @JsonProperty("confirmDC")
    var confirmDc: String? = null

    @JsonProperty("confirmRS")
    var confirmRs: String? = null

    @JsonProperty("confirmSB")
    var confirmSb: String? = null

    @JsonProperty("next_count")
    var nextCount: String? = null

    @JsonProperty("SET-OF-nextStep-next")
    var setOfNextStepNext: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}