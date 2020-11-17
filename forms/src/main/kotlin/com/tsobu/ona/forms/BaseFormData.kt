package com.tsobu.ona.forms

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty


@Suppress("unused")
@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
open class BaseFormData {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("EAID")
    var eAId: String? = null

    @JsonProperty("HHID")
    var hHId: String? = null

    @JsonProperty("zone")
    var zone: String? = null

    @JsonProperty("_tags")
    var tags: List<Any>? = null

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("_notes")
    var notes: List<Any>? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("currency")
    var currency: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: String?=null

    @JsonProperty("_xform_id")
    var xFormId: String? = null

    @JsonProperty("loc_field")
    var locField: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("conversion")
    var conversion: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any>? = null

    @JsonProperty("_geolocation")
    var geolocation: List<Double>? = null

    @JsonProperty("_media_count")
    var mediaCount: String? = null

    @JsonProperty("_total_media")
    var totalMedia: String? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("purpose/event")
    var purposeEvent: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("controlTreatment")
    var controlTreatment: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("inputs1/orgInputs1")
    var inputs1OrgInputs1: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("inputs1/fertilizer1")
    var inputs1Fertilizer1: String? = null

    @JsonProperty("plantingDetails/variety")
    var plantingDetailsVariety: String? = null

    @JsonProperty("plotLayout_P1/plotL1_P1")
    var plotLayoutP1PlotL1P1: String?=null

    @JsonProperty("plotLayout_P1/plotL2_P1")
    var plotLayoutP1PlotL2P1: String?=null

    @JsonProperty("plotLayout_P1/plotW1_P1")
    var plotLayoutP1PlotW1P1: String?=null

    @JsonProperty("plotLayout_P1/plotW2_P1")
    var plotLayoutP1PlotW2P1: String?=null

    @JsonProperty("plotLayout_P2/plotL1_P2")
    var plotLayoutP2PlotL1P2: String?=null

    @JsonProperty("plotLayout_P2/plotL2_P2")
    var plotLayoutP2PlotL2P2: String?=null

    @JsonProperty("plotLayout_P2/plotW1_P2")
    var plotLayoutP2PlotW1P2: String?=null

    @JsonProperty("plotLayout_P2/plotW2_P2")
    var plotLayoutP2PlotW2P2: String?=null

    @JsonProperty("plotLayout_P3/plotL1_P3")
    var plotLayoutP3PlotL1P3: String?=null

    @JsonProperty("plotLayout_P3/plotL2_P3")
    var plotLayoutP3PlotL2P3: String?=null

    @JsonProperty("plotLayout_P3/plotW1_P3")
    var plotLayoutP3PlotW1P3: String?=null

    @JsonProperty("plotLayout_P3/plotW2_P3")
    var plotLayoutP3PlotW2P3: String?=null

    @JsonProperty("plotLayout_P4/plotL1_P4")
    var plotLayoutP4PlotL1P4: String?=null

    @JsonProperty("plotLayout_P4/plotL2_P4")
    var plotLayoutP4PlotL2P4: String?=null

    @JsonProperty("plotLayout_P4/plotW1_P4")
    var plotLayoutP4PlotW1P4: String?=null

    @JsonProperty("plotLayout_P4/plotW2_P4")
    var plotLayoutP4PlotW2P4: String?=null

    @JsonProperty("weedAssessment_P1_count")
    var weedAssessmentP1Count: String? = null

    @JsonProperty("weedAssessment_P2_count")
    var weedAssessmentP2Count: String? = null

    @JsonProperty("weedAssessment_P3_count")
    var weedAssessmentP3Count: String? = null

    @JsonProperty("weedAssessment_P4_count")
    var weedAssessmentP4Count: String? = null

    @JsonProperty("weedAssessment_P5_count")
    var weedAssessmentP5Count: String? = null

    @JsonProperty("weedAssessment_P6_count")
    var weedAssessmentP6Count: String? = null

    @JsonProperty("landPreparation/clearing")
    var landPreparationClearing: String? = null

    @JsonProperty("landPreparation/vegetation")
    var vegetation: String? = null

    @JsonProperty("confirmTreatments/confirm_P1")
    var confirmTreatmentsConfirmP1: String? = null

    @JsonProperty("confirmTreatments/confirm_P2")
    var confirmTreatmentsConfirmP2: String? = null

    @JsonProperty("confirmTreatments/confirm_P3")
    var confirmTreatmentsConfirmP3: String? = null

    @JsonProperty("confirmTreatments/confirm_P4")
    var confirmTreatmentsConfirmP4: String? = null

    @JsonProperty("plantingDetails/plantingDate")
    var plantingDate: String? = null

    @JsonProperty("landPrepationDetails/ridgingMethod")
    var landPrepationDetailsRidgingMethod: String? = null

    @JsonProperty("landPrepationDetails/tillageMethod")
    var tillageMethod: String? = null
}