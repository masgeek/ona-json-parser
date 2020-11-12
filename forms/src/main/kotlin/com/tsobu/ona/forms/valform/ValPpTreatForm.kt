package com.tsobu.ona.forms.valform

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("_id", "end", "lat", "lon", "EAID", "HHID", "_tags", "_uuid", "start", "today", "_notes", "_edited", "_status", "_version", "deviceid", "geopoint", "username", "_duration", "_xform_id", "simserial", "_attachments", "_geolocation", "_media_count", "_total_media", "formhub/uuid", "subscriberid", "_submitted_by", "countrySelect", "meta/instanceID", "_submission_time", "_xform_id_string", "_bamboo_dataset_id", "_media_all_received", "currentPracticeTillage/ridgingCP", "currentPracticeTillage/basicTillCP", "alternativePractice/presenceRedPlot", "alternativePracticeMethod/harrowALT", "recommendedPracticeMethod/harrowREC", "alternativePracticeTillage/ridgingALT", "currentPracticeTillage/harrowSelectCP", "recommendedPracticeTillage/ridgingREC", "alternativePracticeTillage/basicTillALT", "recommendedPracticeTillage/basicTillREC", "alternativePracticeTillage/harrowSelectALT", "recommendedPracticeTillage/harrowSelectREC", "currentPracticeMethod/ridgingMethodSelectCP", "currentPracticeMethod/basicTillMethodSelect1CP", "currentPracticeMethod/basicTillMethodSelect2CP", "recommendedPracticeMethod/ridgingMethodSelectREC", "alternativePracticeMethod/basicTillMethodSelect1ALT", "recommendedPracticeMethod/basicTillMethodSelect1REC", "email", "recommendedPracticeMethod/basicTillMethodSelect2REC", "alternativePracticeMethod/ridgingMethodSelectALT", "alternativePracticeMethod/basicTillMethodSelect2ALT", "phonenumber", "_last_edited", "meta/deprecatedID", "currentPracticeMethod/harrowCP")
class ValPpTreatForm {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("lat")
    var lat: String? = null

    @JsonProperty("lon")
    var lon: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

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

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

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

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("countrySelect")
    var countrySelect: String? = null

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

    @JsonProperty("currentPracticeTillage/ridgingCP")
    var currentPracticeTillageRidgingCP: String? = null

    @JsonProperty("currentPracticeTillage/basicTillCP")
    var currentPracticeTillageBasicTillCP: String? = null

    @JsonProperty("alternativePractice/presenceRedPlot")
    var alternativePracticePresenceRedPlot: String? = null

    @JsonProperty("alternativePracticeMethod/harrowALT")
    var alternativePracticeMethodHarrowALT: String? = null

    @JsonProperty("recommendedPracticeMethod/harrowREC")
    var recommendedPracticeMethodHarrowREC: String? = null

    @JsonProperty("alternativePracticeTillage/ridgingALT")
    var alternativePracticeTillageRidgingALT: String? = null

    @JsonProperty("currentPracticeTillage/harrowSelectCP")
    var currentPracticeTillageHarrowSelectCP: String? = null

    @JsonProperty("recommendedPracticeTillage/ridgingREC")
    var recommendedPracticeTillageRidgingREC: String? = null

    @JsonProperty("alternativePracticeTillage/basicTillALT")
    var alternativePracticeTillageBasicTillALT: String? = null

    @JsonProperty("recommendedPracticeTillage/basicTillREC")
    var recommendedPracticeTillageBasicTillREC: String? = null

    @JsonProperty("alternativePracticeTillage/harrowSelectALT")
    var alternativePracticeTillageHarrowSelectALT: String? = null

    @JsonProperty("recommendedPracticeTillage/harrowSelectREC")
    var recommendedPracticeTillageHarrowSelectREC: String? = null

    @JsonProperty("currentPracticeMethod/ridgingMethodSelectCP")
    var currentPracticeMethodRidgingMethodSelectCP: String? = null

    @JsonProperty("currentPracticeMethod/basicTillMethodSelect1CP")
    var currentPracticeMethodBasicTillMethodSelect1CP: String? = null

    @JsonProperty("currentPracticeMethod/basicTillMethodSelect2CP")
    var currentPracticeMethodBasicTillMethodSelect2CP: String? = null

    @JsonProperty("recommendedPracticeMethod/ridgingMethodSelectREC")
    var recommendedPracticeMethodRidgingMethodSelectREC: String? = null

    @JsonProperty("alternativePracticeMethod/basicTillMethodSelect1ALT")
    var alternativePracticeMethodBasicTillMethodSelect1ALT: String? = null

    @JsonProperty("recommendedPracticeMethod/basicTillMethodSelect1REC")
    var recommendedPracticeMethodBasicTillMethodSelect1REC: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("recommendedPracticeMethod/basicTillMethodSelect2REC")
    var recommendedPracticeMethodBasicTillMethodSelect2REC: String? = null

    @JsonProperty("alternativePracticeMethod/ridgingMethodSelectALT")
    var alternativePracticeMethodRidgingMethodSelectALT: String? = null

    @JsonProperty("alternativePracticeMethod/basicTillMethodSelect2ALT")
    var alternativePracticeMethodBasicTillMethodSelect2ALT: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("_last_edited")
    var lastEdited: String? = null

    @JsonProperty("meta/deprecatedID")
    var metaDeprecatedId: String? = null

    @JsonProperty("currentPracticeMethod/harrowCP")
    var currentPracticeMethodHarrowCP: String? = null
}