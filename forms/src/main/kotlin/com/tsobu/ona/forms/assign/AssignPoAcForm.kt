package com.tsobu.ona.forms.assign

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("_id", "end", "_tags", "_uuid", "login", "start", "today", "_notes", "treats", "_edited", "_status", "trialID", "_version", "deviceid", "geopoint", "_duration", "_xform_id", "simserial", "trialCode", "_attachments", "_geolocation", "_media_count", "_total_media", "formhub/uuid", "nrTreatments", "plotLabeling", "subscriberid", "_submitted_by", "completeSetup", "meta/instanceID", "purpose/country", "purpose/project", "_submission_time", "_xform_id_string", "_bamboo_dataset_id", "plotLabeling_count", "_media_all_received", "nrTreatmentsComplete", "username", "email", "phonenumber", "enumerator/surName", "enumerator/firstName")
class AssignPoAcForm {
    @JsonProperty("_id")
    var Id: String? = null

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

    @JsonProperty("treats")
    var treats: String? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("trialID")
    var trialId: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("deviceid")
    var deviceId: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xFormId: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("trialCode")
    var trialCode: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: String? = null

    @JsonProperty("_total_media")
    var totalMedia: String? = null

    @JsonProperty("formhub/uuid")
    var formHubUuId: String? = null

    @JsonProperty("nrTreatments")
    var nrTreatments: String? = null

    @JsonProperty("plotLabeling")
    var plotLabelingList: List<PlotLabelingPoAcForm>? = null

    @JsonProperty("subscriberid")
    var subscriberId: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("completeSetup")
    var completeSetup: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

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

    @JsonProperty("plotLabeling_count")
    var plotLabelingCount: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("nrTreatmentsComplete")
    var nrTreatmentsComplete: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("enumerator/surName")
    var surName: String? = null

    @JsonProperty("enumerator/firstName")
    var firstName: String? = null
}