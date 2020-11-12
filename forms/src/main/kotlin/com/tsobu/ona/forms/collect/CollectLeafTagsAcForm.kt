package com.tsobu.ona.forms.collect

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("ID", "_id_discard", "end", "_tags", "_uuid", "login", "start", "today", "_notes", "entity", "_edited", "_status", "_version", "deviceid", "geopoint", "username", "_duration", "_xform_id", "_attachments", "_geolocation", "_media_count", "_total_media", "formhub/uuid", "_submitted_by", "meta/instanceID", "_submission_time", "_xform_id_string", "_bamboo_dataset_id", "_media_all_received")
class CollectLeafTagsAcForm {
    @JsonProperty("ID")
    var leafTagsAcIdList: List<CollectLeafTagsAcIdForm> = ArrayList()

    @JsonProperty("_id")
    var id: String? = null

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

    @JsonProperty("repeat")
    var repeatValue: String? = null

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

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("subscriberid")
    var subscriberId: String? = null

    @JsonProperty("phonenumber")
    var phoneNumber: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xFormId: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: String? = null

    @JsonProperty("_total_media")
    var totalMedia: String? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

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
}