package com.tsobu.ona.forms.assign

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("_id", "end", "_tags", "_uuid", "login", "start", "today", "_notes", "_edited", "_status", "country", "fieldID", "trialID", "_version", "deviceid", "geopoint", "username", "_duration", "_xform_id", "simserial", "trialCode", "fieldbookID", "_attachments", "_geolocation", "_media_count", "_total_media", "formhub/uuid", "plantingDate", "subscriberid", "_submitted_by", "meta/instanceID", "_submission_time", "_xform_id_string", "_bamboo_dataset_id", "_media_all_received", "purpose/country", "purpose/project", "enumerator/surName", "enumerator/firstName", "email", "phonenumber", "meta/deprecatedID")
class AssignTlAcForm {
    @JsonProperty("_id")
    var Id: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuId: String? = null

    @JsonProperty("login")
    var login: String? = null

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

    @JsonProperty("country")
    var countryOld: String? = null

    @JsonProperty("fieldID")
    var fieldId: String? = null

    @JsonProperty("trialID")
    var trialId: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("deviceid")
    var deviceId: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xFormId: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("trialCode")
    var trialCode: String? = null

    @JsonProperty("fieldbookID")
    var fieldbookId: String? = null

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

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("subscriberid")
    var subscriberId: String? = null

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

    @JsonProperty("purpose/country")
    var country: String? = null

    @JsonProperty("purpose/project")
    var purposeProject: String? = null

    @JsonProperty("enumerator/surName")
    var surName: String? = null

    @JsonProperty("enumerator/firstName")
    var firstName: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("meta/deprecatedID")
    var metaDeprecatedId: String? = null
}