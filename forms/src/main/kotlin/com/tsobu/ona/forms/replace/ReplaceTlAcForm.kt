package com.tsobu.ona.forms.replace

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("_id", "end", "_tags", "_uuid", "login", "start", "today", "_notes", "plotID", "_edited", "_status", "trialID", "_version", "deviceid", "geopoint", "username", "_duration", "_xform_id", "plotLabel", "simserial", "_attachments", "_geolocation", "_media_count", "_total_media", "formhub/uuid", "subscriberid", "_submitted_by", "meta/instanceID", "_submission_time", "_xform_id_string", "_bamboo_dataset_id", "_media_all_received", "fieldLabel", "fieldbookID", "purpose/country", "purpose/project", "trialCode", "email", "fieldID", "phonenumber", "enumerator/surName", "enumerator/firstName")
class ReplaceTlAcForm {
    @JsonProperty("_id")
    var id: Int? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("login")
    var login: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("plotID")
    var plotId: String? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("trialID")
    var trialId: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xFormId: Int? = null

    @JsonProperty("plotLabel")
    var plotLabel: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("fieldLabel")
    var fieldLabel: String? = null

    @JsonProperty("fieldbookID")
    var fieldbookId: String? = null

    @JsonProperty("purpose/country")
    var country: String? = null

    @JsonProperty("purpose/project")
    var project: String? = null

    @JsonProperty("trialCode")
    var trialCode: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("fieldID")
    var fieldId: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("enumerator/surName")
    var enumeratorSurName: String? = null

    @JsonProperty("enumerator/firstName")
    var enumeratorFirstName: String? = null
}