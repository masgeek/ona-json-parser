package com.tsobu.ona.forms.register

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.ArrayList

@JsonInclude(JsonInclude.Include.NON_NULL)
class SgRegisterHhForm {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var end: String? = null

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

    @JsonProperty("accept")
    var accept: String? = null

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

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("Hhlocation/lga")
    var hhlocationLga: String? = null

    @JsonProperty("_date_modified")
    var dateModified: String? = null

    @JsonProperty("Hhlocation/EAEN")
    var hhlocationEAEN: String? = null

    @JsonProperty("Hhlocation/EAID")
    var hhlocationEAID: String? = null

    @JsonProperty("detailsHH/ageHH")
    var detailsHHAgeHH: Int? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("Hhlocation/locHH")
    var hhlocationLocHH: String? = null

    @JsonProperty("Hhlocation/state")
    var hhlocationState: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("detailsHH/HHtype")
    var detailsHHHHtype: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("detailsHH/genderHH")
    var detailsHHGenderHH: String? = null

    @JsonProperty("Hhlocation/geopoint")
    var hhlocationGeopoint: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("detailsHH/phoneNrHH")
    var detailsHHPhoneNrHH: String? = null

    @JsonProperty("detailsHH/surNameHH")
    var detailsHHSurNameHH: String? = null

    @JsonProperty("detailsHH/relationHH")
    var detailsHHRelationHH: String? = null

    @JsonProperty("detailsHH/educationHH")
    var detailsHHEducationHH: String? = null

    @JsonProperty("detailsHH/firstNameHH")
    var detailsHHFirstNameHH: String? = null

    @JsonProperty("detailsHH/occupationHH")
    var detailsHHOccupationHH: String? = null

    @JsonProperty("detailsHH/maritalStatusHH")
    var detailsHHMaritalStatusHH: String? = null

    @JsonProperty("detailsHH/phoneNr2HH")
    var detailsHHPhoneNr2HH: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null
}