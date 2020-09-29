package com.tsobu.ona.core.dto.forms.rootyieldcassava

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class AssesRootYieldCassavaForm {


    @JsonProperty("_id")
    var id: Int? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("_tags")
    var tags: List<Any>? = null

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("login")
    var login: String? = null

    @JsonProperty("enumerator/firstName")
    var firstName: String? = null

    @JsonProperty("enumerator/surName")
    var surname: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("_notes")
    var notes: List<Any>? = null

    @JsonProperty("entity")
    var rootEntity: String? = null

    @JsonProperty("method")
    var rootMethod: String? = null

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

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("phonenumber")
    var phoneNumber: String? = null


    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId: Int? = null

    @JsonProperty("fixedSize")
    var fixedSize: String? = null

    @JsonProperty("simserial")
    var simSerial: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any>? = null

    @JsonProperty("_geolocation")
    var geolocation: List<Double>? = null

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("subscriberid")
    var subscriberId: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("maxStandFixed")
    var maxStandFixed: String? = null

    @JsonProperty("plotSizeFixed")
    var plotSizeFixed: String? = null

    @JsonProperty("detail/sampling")
    var detailSampling: String? = null

    @JsonProperty("meta/instanceID")
    var metaInstanceID: String? = null

    @JsonProperty("purpose/country")
    var country: String? = null

    @JsonProperty("purpose/project")
    var purpprojectseProject: String? = null

    @JsonProperty("yieldAssessmentForm")
    var yieldAssessmentForm: List<YieldAssessmentForm>? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("densityFixedCalc")
    var densityFixedCalc: String? = null

    @JsonProperty("Fixed/nrRowsFixed")
    var nrRowsFixed: Int? = null

    @JsonProperty("Fixed/densityFixed")
    var densityFixed: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("detail/rootQuality")
    var rootQuality: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("detail/diseaseScoring")
    var diseaseScoring: String? = null

    @JsonProperty("Fixed/nrPlantsRowFixed")
    var nrPlantsRowFixed: Int? = null
}