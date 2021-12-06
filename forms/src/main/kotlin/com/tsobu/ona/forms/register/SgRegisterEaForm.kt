package com.tsobu.ona.forms.register

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import javax.annotation.processing.Generated

class SgRegisterEaForm {
    @JsonProperty("_id")
    var id: Int? = null

    @JsonProperty("end")
    var end: String? = null

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
    var statusText: String? = null

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

    @JsonProperty("areaEA/lga")
    var areaEALga: String? = null

    @JsonProperty("_attachments")
    var attachments: List<Any> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("areaEA/state")
    var areaEAState: String? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("_date_modified")
    var dateModified: String? = null

    @JsonProperty("detailsEA/EAID")
    var detailsEAEAID: String? = null

    @JsonProperty("areaEA/geopoint")
    var areaEAGeopoint: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("detailsEA2/ageEA")
    var detailsEA2AgeEA: Int? = null

    @JsonProperty("operationEA/freq")
    var operationEAFreq: String? = null

    @JsonProperty("operationEA/nrHH")
    var operationEANrHH: Int? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("detailsEA/genderEA")
    var detailsEAGenderEA: String? = null

    @JsonProperty("organizationEA/gov")
    var organizationEAGov: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("detailsEA/phoneNrEA")
    var detailsEAPhoneNrEA: String? = null

    @JsonProperty("detailsEA/surNameEA")
    var detailsEASurNameEA: String? = null

    @JsonProperty("enumerator/genderEN")
    var enumeratorGenderEN: String? = null

    @JsonProperty("organizationEA/role")
    var organizationEARole: String? = null

    @JsonProperty("areaEA/areaOperation")
    var areaEAAreaOperation: String? = null

    @JsonProperty("enumerator/phoneNrEN")
    var enumeratorPhoneNrEN: String? = null

    @JsonProperty("enumerator/surNameEN")
    var enumeratorSurNameEN: String? = null

    @JsonProperty("organizationEA/level")
    var organizationEALevel: String? = null

    @JsonProperty("organizationEA/title")
    var organizationEATitle: String? = null

    @JsonProperty("detailsEA/firstNameEA")
    var detailsEAFirstNameEA: String? = null

    @JsonProperty("operationEA/levelName")
    var operationEALevelName: String? = null

    @JsonProperty("detailsEA2/educationEA")
    var detailsEA2EducationEA: String? = null

    @JsonProperty("enumerator/firstNameEN")
    var enumeratorFirstNameEN: String? = null
}