package com.tsobu.ona.forms.register

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.ArrayList

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class PcForm {
    @JsonProperty("_id")
    var id: Int? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

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
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId: Int? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("phonenumber")
    var phoneNumber: String? = null

    @JsonProperty("purpose/aim")
    var purposeAim: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Any> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("formhub/uuid")
    var formHubUuid: String? = null

    @JsonProperty("subscriberid")
    var subscriberId: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("meta/instanceID")
    var metaInstanceId: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("projectDetails/country")
    var projectDetailsCountry: String? = null

    @JsonProperty("projectDetails/projectCode")
    var projectDetailsProjectCode: String? = null

    @JsonProperty("projectDetails/project_abbr")
    var projectDetailsProjectAbbr: String? = null

    @JsonProperty("projectDetails/project_full")
    var projectDetailsProjectFull: String? = null

    @JsonProperty("_date_modified")
    var dateModified: String? = null
}