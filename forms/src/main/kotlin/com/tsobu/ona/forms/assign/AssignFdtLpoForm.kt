package com.tsobu.ona.forms.assign

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class AssignFdtLpoForm {
    @JsonProperty("_id")
    var id: Int? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("lat")
    var lat: String? = null

    @JsonProperty("lon")
    var lon: String? = null

    @JsonProperty("ENID")
    var enid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("latr")
    var latr: String? = null

    @JsonProperty("lonr")
    var lonr: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("entity")
    var entity: String? = null

    @JsonProperty("lookup")
    var lookup: String? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("FD_owner")
    var fdOwner: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("FDID2_new")
    var fdId2New: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId: Int? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("FD_name_new")
    var fdNameNew: String? = null

    @JsonProperty("projectCode")
    var projectCode: String? = null

    @JsonProperty("trial_count")
    var trialCount: String? = null

    @JsonProperty("_attachments")
    var attachments: List<AssignFdtLpoAttachmentForm> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("formhub/uuid")
    var formHubUuid: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("meta/instanceID")
    var metaInstanceID: String? = null

    @JsonProperty("purpose/barcode")
    var purposeBarcode: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("_last_edited")
    var lastEdited: String? = null

    @JsonProperty("meta/deprecatedID")
    var metaDeprecatedID: String? = null

    @JsonProperty("RCBD")
    var rcbd: String? = null

    @JsonProperty("FDID2")
    var fdid2: String? = null

    @JsonProperty("trial")
    var trial: List<AssignFdtLpoTrialForm> = ArrayList()

    @JsonProperty("season")
    var season: String? = null

    @JsonProperty("expCode")
    var expCode: String? = null

    @JsonProperty("nrTreats")
    var nrTreats: String? = null

    @JsonProperty("TL_name1_new")
    var tLName1New: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("expCode_label")
    var expCodeLabel: String? = null

    @JsonProperty("_date_modified")
    var dateModified: String? = null

    @JsonProperty("nrBlocks")
    var nrBlocks: Int? = null
}