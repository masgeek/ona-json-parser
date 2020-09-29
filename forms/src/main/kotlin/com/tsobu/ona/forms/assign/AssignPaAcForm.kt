package com.tsobu.ona.forms.assign

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("_id", "end", "_tags", "_uuid", "login", "start", "today", "_notes", "entity", "plotID", "_edited", "_status", "_version", "deviceid", "geopoint", "nrPlants", "_duration", "_xform_id", "simserial", "_attachments", "_geolocation", "_media_count", "_total_media", "formhub/uuid", "subscriberid", "_submitted_by", "plantLabeling", "meta/instanceID", "purpose/country", "purpose/project", "_submission_time", "_xform_id_string", "_bamboo_dataset_id", "_media_all_received", "plantLabeling_count", "username", "enumerator/surName", "enumerator/firstName", "email", "phonenumber")
class AssignPaAcForm {
    @JsonProperty("_id")
    var Id: Int? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuId: String? = null

    @JsonProperty("login")
    var login: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("entity")
    var entityValue: String? = null

    @JsonProperty("plotID")
    var plotId: String? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("deviceid")
    var deviceId: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("nrPlants")
    var nrPlants: Int? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId: Int? = null

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
    var formhubUuId: String? = null

    @JsonProperty("subscriberid")
    var subscriberId: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("plantLabeling")
    var plantLabelingList: List<PlantLabelingPaAcForm> ?=null

    @JsonProperty("meta/instanceID")
    var metaInstanceId: String? = null

    @JsonProperty("purpose/country")
    var purposeCountry: String? = null

    @JsonProperty("purpose/project")
    var purposeProject: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("plantLabeling_count")
    var plantLabelingCount: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("enumerator/surName")
    var surName: String? = null

    @JsonProperty("enumerator/firstName")
    var firstName: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null
}