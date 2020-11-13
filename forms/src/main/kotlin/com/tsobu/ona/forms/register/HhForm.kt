package com.tsobu.ona.forms.register

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.tsobu.ona.forms.Attachment

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class HhForm {

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("EAEN")
    var eaen: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("_tags")
    var tags: List<Any>? = null

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("locHH")
    var locHh: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("state")
    var state: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("_notes")
    var notes: List<Any>? = null

    @JsonProperty("accept")
    var accept: String? = null

    @JsonProperty("_edited")
    var edited = false

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("photoHH")
    var photoHh: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("deviceid")
    var deviceId: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: String?=null

    @JsonProperty("_xform_id")
    var xFormId: String? = null

    @JsonProperty("simserial")
    var simSerial: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Attachment>? = null

    @JsonProperty("_geolocation")
    var geolocation: List<Double>? = null

    @JsonProperty("_media_count")
    var mediaCount :Int?=null

    @JsonProperty("_total_media")
    var totalMedia :Int?=null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("subscriberid")
    var subscriberId: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("photoProfileHH")
    var photoProfileHh: String? = null

    @JsonProperty("detailsHH/ageHH")
    var ageHh :Int?=null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("detailsHH/genderHH")
    var genderHh: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived = false

    @JsonProperty("detailsHH/phoneNrHH")
    var phoneNrHh: String? = null

    @JsonProperty("detailsHH/surNameHH")
    var surNameHh: String? = null

    @JsonProperty("enumerator/genderEN")
    var genderEn: String? = null

    @JsonProperty("involveHH/useCaseHH")
    var useCaseHh: String? = null

    @JsonProperty("detailsHH/phoneNr2HH")
    var phoneNr2Hh: String? = null

    @JsonProperty("detailsHH/relationHH")
    var relationHh: String? = null

    @JsonProperty("enumerator/phoneNrEN")
    var phoneNrEn: String? = null

    @JsonProperty("enumerator/surNameEN")
    var surNameEn: String? = null

    @JsonProperty("detailsHH/educationHH")
    var educationHh: String? = null

    @JsonProperty("detailsHH/firstNameHH")
    var firstNameHh: String? = null

    @JsonProperty("involveHH/startYearHH")
    var startYearHh: String? = null

    @JsonProperty("detailsHH/occupationHH")
    var occupationHh: String? = null

    @JsonProperty("enumerator/firstNameEN")
    var firstNameEn: String? = null

    @JsonProperty("involveHH/activitiesHH")
    var activitiesHh: String? = null

    @JsonProperty("detailsHH/maritalStatusHH")
    var maritalStatusHh: String? = null

    @JsonProperty("zone")
    var zone: String? = null


    @JsonProperty("login")
    var login: String? = null


    @JsonProperty("region")
    var region: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("_last_edited")
    var lastEdited: String? = null

    @JsonProperty("meta/deprecatedID")
    var metaDeprecatedId: String? = null
}