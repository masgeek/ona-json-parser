package com.tsobu.ona.forms.rootyieldcassava

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class AssesRootYieldCassavaAcForm {

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
    var entity: String? = null

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
    var duration: String? = null

    @JsonProperty("_xform_id")
    var xFormId: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<String> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: String? = null

    @JsonProperty("_total_media")
    var totalMedia: String? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("detail/sampling")
    var sampling: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("purpose/country")
    var purposeCountry: String? = null

    @JsonProperty("purpose/project")
    var project: String? = null

    @JsonProperty("yieldAssessment")
    var yieldAssessment: List<YieldAssessmentForm> = ArrayList()

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("detail/rootQuality")
    var detailRootQuality: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("detail/diseaseScoring")
    var diseaseScoring: String? = null

    @JsonProperty("method")
    var method: String? = null

    @JsonProperty("fixedSize")
    var fixedSize: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("maxStandFixed")
    var maxStandFixed: String? = null

    @JsonProperty("plotSizeFixed")
    var plotSizeFixed: String? = null

    @JsonProperty("densityFixedCalc")
    var densityFixedCalc: String? = null

    @JsonProperty("Fixed/nrRowsFixed")
    var nrRowsFixed: String? = null

    @JsonProperty("Fixed/densityFixed")
    var densityFixed: String? = null

    @JsonProperty("Fixed/nrPlantsRowFixed")
    var nrPlantsRowFixed: String? = null

    @JsonProperty("enumerator/surName")
    var surName: String? = null

    @JsonProperty("enumerator/firstName")
    var firstName: String? = null

    @JsonProperty("Fixed/L1Fixed")
    var l1Fixed: String? = null

    @JsonProperty("Fixed/L2Fixed")
    var l2Fixed: String? = null

    @JsonProperty("Fixed/W1Fixed")
    var w1Fixed: String? = null

    @JsonProperty("Fixed/W2Fixed")
    var w2Fixed: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null
}