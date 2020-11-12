package com.tsobu.ona.forms.record

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)class RecordCanopyDimensionsAcForm {
    @JsonProperty("ID")
    var idList: List<RecordCanopyDimensionsIdForm> = ArrayList()

    @JsonProperty("_id")
    var id: Int? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("login")
    var login: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("entity")
    var entityValue: String? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

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

    @JsonProperty("enumerator/surName")
    var surName: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("enumerator/firstName")
    var firstName: String? = null

    @JsonProperty("purpose/country")
    var country: String? = null

    @JsonProperty("purpose/project")
    var project: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null
}