package com.tsobu.ona.forms.batchcomposition

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("_id", "end", "_tags", "_uuid", "email", "start", "today", "_notes", "_edited", "_status", "_version", "deviceid", "username", "_duration", "_xform_id", "intro/aim", "simserial", "phonenumber", "_attachments", "_geolocation", "_media_count", "_total_media", "formhub/uuid", "intro/entity", "subscriberid", "_submitted_by", "intro/station", "nextStep/next", "intro/batchType", "meta/instanceID", "_submission_time", "_xform_id_string", "sampleList/sample", "_bamboo_dataset_id", "sampleList/countFW", "sampleList/countNA", "sampleList/countNF", "sampleList/countSB", "_media_all_received", "intro/batchTypeNote", "nextStep/next_count", "sampleList/confirmSB", "sampleList/confirmAll", "meta/deprecatedID", "sampleList/confirmNA", "batchDetails/batchName_pull", "batchDetails/receiveConfirm", "batchDetails/description_pull", "batchDetails/sampleBatchID_exist", "intro/country", "intro/project", "sampleList/countDC", "sampleList/countRS", "sampleList/confirmDC", "sampleList/confirmFW", "sampleList/confirmRS")
class SampleBatchCompositionForm {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: String?=null

    @JsonProperty("_xform_id")
    var xFormId: String? = null

    @JsonProperty("intro/aim")
    var aim: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Any> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: String? = null

    @JsonProperty("_total_media")
    var totalMedia: String? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("intro/entity")
    var entityValue: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("intro/station")
    var station: String? = null

    @JsonProperty("nextStep/next")
    var nextList: List<NextStepNextForm>? = null

    @JsonProperty("intro/batchType")
    var batchType: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("sampleList/sample")
    var sampleList: List<SampleListSampleForm>? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("sampleList/countFW")
    var countFW: String? = null

    @JsonProperty("sampleList/countNA")
    var countNA: String? = null

    @JsonProperty("sampleList/countNF")
    var countNF: String? = null

    @JsonProperty("sampleList/countSB")
    var countSB: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("intro/batchTypeNote")
    var batchTypeNote: String? = null

    @JsonProperty("nextStep/next_count")
    var nextCount: String? = null

    @JsonProperty("sampleList/confirmSB")
    var confirmSB: String? = null

    @JsonProperty("sampleList/confirmAll")
    var confirmAll: String? = null

    @JsonProperty("meta/deprecatedID")
    var deprecatedId: String? = null

    @JsonProperty("sampleList/confirmNA")
    var confirmNA: String? = null

    @JsonProperty("batchDetails/batchName_pull")
    var batchNamePull: String? = null

    @JsonProperty("batchDetails/receiveConfirm")
    var receiveConfirm: String? = null

    @JsonProperty("batchDetails/description_pull")
    var descriptionPull: String? = null

    @JsonProperty("batchDetails/sampleBatchID_exist")
    var sampleBatchIDExist: String? = null

    @JsonProperty("intro/country")
    var country: String? = null

    @JsonProperty("intro/project")
    var project: String? = null

    @JsonProperty("sampleList/countDC")
    var countDC: String? = null

    @JsonProperty("sampleList/countRS")
    var countRS: String? = null

    @JsonProperty("sampleList/confirmDC")
    var confirmDC: String? = null

    @JsonProperty("sampleList/confirmFW")
    var confirmFW: String? = null

    @JsonProperty("sampleList/confirmRS")
    var confirmRS: String? = null
}