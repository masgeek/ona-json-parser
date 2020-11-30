package com.tsobu.ona.forms

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.ArrayList

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("_id", "end", "gov", "EAID", "freq", "nrHH", "role", "_tags", "_uuid", "ageEA", "level", "locEA", "start", "title", "today", "_notes", "typeID", "_edited", "_status", "partner", "_version", "deviceid", "genderEA", "username", "_duration", "_xform_id", "levelName", "phoneNrEA", "simserial", "surNameEA", "educationEA", "firstNameEA", "phonenumber", "_attachments", "_geolocation", "_media_count", "_total_media", "formhub/uuid", "subscriberid", "_submitted_by", "meta/instanceID", "_submission_time", "_xform_id_string", "_bamboo_dataset_id", "_media_all_received", "detailsEA/correctEA", "phoneNr2EA", "HHID", "ageHH", "locHH", "genderHH", "geopoint", "phoneNrHH", "surNameHH", "phoneNr2HH", "relationHH", "educationHH", "firstNameHH", "occupationHH", "maritalStatusHH", "detailsHH/correctHH", "email", "startYearHH")
class CheckIdRegForm {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("gov")
    var gov: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("freq")
    var freq: String? = null

    @JsonProperty("nrHH")
    var nrHH: String? = null

    @JsonProperty("role")
    var role: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("ageEA")
    var ageEA: String? = null

    @JsonProperty("level")
    var level: String? = null

    @JsonProperty("locEA")
    var locEA: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("title")
    var title: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("typeID")
    var typeId: String? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("partner")
    var partner: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("deviceid")
    var deviceId: String? = null

    @JsonProperty("genderEA")
    var genderEA: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: String?=null

    @JsonProperty("_xform_id")
    var xFormId: String? = null

    @JsonProperty("levelName")
    var levelName: String? = null

    @JsonProperty("phoneNrEA")
    var phoneNrEA: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("surNameEA")
    var surNameEA: String? = null

    @JsonProperty("educationEA")
    var educationEA: String? = null

    @JsonProperty("firstNameEA")
    var firstNameEA: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Any> = ArrayList()

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

    @JsonProperty("detailsEA/correctEA")
    var detailsEACorrectEA: String? = null

    @JsonProperty("phoneNr2EA")
    var phoneNr2EA: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("ageHH")
    var ageHH: String? = null

    @JsonProperty("locHH")
    var locHH: String? = null

    @JsonProperty("genderHH")
    var genderHH: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("phoneNrHH")
    var phoneNrHH: String? = null

    @JsonProperty("surNameHH")
    var surNameHH: String? = null

    @JsonProperty("phoneNr2HH")
    var phoneNr2HH: String? = null

    @JsonProperty("relationHH")
    var relationHH: String? = null

    @JsonProperty("educationHH")
    var educationHH: String? = null

    @JsonProperty("firstNameHH")
    var firstNameHH: String? = null

    @JsonProperty("occupationHH")
    var occupationHH: String? = null

    @JsonProperty("maritalStatusHH")
    var maritalStatusHH: String? = null

    @JsonProperty("detailsHH/correctHH")
    var detailsHHCorrectHH: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("startYearHH")
    var startYearHH: String? = null
}