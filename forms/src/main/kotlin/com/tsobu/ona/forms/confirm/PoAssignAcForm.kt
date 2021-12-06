package com.tsobu.ona.forms.confirm

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class PoAssignAcForm {
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

    @JsonProperty("treats")
    var treats: String? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

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

    @JsonProperty("_duration")
    var duration: String?=null

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
    var formhubUuid: String? = null

    @JsonProperty("nrTreatments")
    var nrTreatments: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("plotLabeling")
    var plotLabeling: List<PlotLabelingForm> = ArrayList()

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("completeSetup")
    var completeSetup: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("purpose/country")
    var country: String? = null

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

    @JsonProperty("enumerator/surName")
    var furName: String? = null

    @JsonProperty("enumerator/firstName")
    var firstName: String? = null
}