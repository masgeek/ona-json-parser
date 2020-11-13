package com.tsobu.ona.forms.register

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.tsobu.ona.forms.Attachment
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class EaForm {
    @JsonProperty("_id")
    var id: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("_tags")
    var tags: List<Any> = ArrayList()

    @JsonProperty("_uuid")
    var uuid: String? = null

    @JsonProperty("login")
    var login: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("state")
    var state: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("_notes")
    var notes: List<Any> = ArrayList()

    @JsonProperty("accept")
    var accept: String? = null

    @JsonProperty("_edited")
    var edited: Boolean? = null

    @JsonProperty("_status")
    var status: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("photoEA")
    var photoEA: String? = null

    @JsonProperty("_version")
    var version: String? = null

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

    @JsonProperty("_attachments")
    var attachments: List<Attachment> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: String? = null

    @JsonProperty("_total_media")
    var totalMedia: String? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("areaOperation")
    var areaOperation: String? = null

    @JsonProperty("photoProfileEA")
    var photoProfileEA: String? = null

    @JsonProperty("detailsEA/ageEA")
    var detailsEAAgeEA: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("operationEA/freq")
    var operationEAFreq: String? = null

    @JsonProperty("operationEA/nrHH")
    var operationEANrHH: String? = null

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

    @JsonProperty("organizationEA/role")
    var organizationEARole: String? = null

    @JsonProperty("organizationEA/level")
    var organizationEALevel: String? = null

    @JsonProperty("organizationEA/title")
    var organizationEATitle: String? = null

    @JsonProperty("detailsEA/educationEA")
    var detailsEAEducationEA: String? = null

    @JsonProperty("detailsEA/firstNameEA")
    var detailsEAFirstNameEA: String? = null

    @JsonProperty("operationEA/levelName")
    var operationEALevelName: String? = null

    @JsonProperty("organizationEA/partner")
    var organizationEAPartner: String? = null

    @JsonProperty("enumerator/genderEN")
    var enumeratorGenderEN: String? = null

    @JsonProperty("enumerator/phoneNrEN")
    var enumeratorPhoneNrEN: String? = null

    @JsonProperty("enumerator/surNameEN")
    var enumeratorSurNameEN: String? = null

    @JsonProperty("enumerator/firstNameEN")
    var enumeratorFirstNameEN: String? = null

    @JsonProperty("detailsEA/phoneNr2EA")
    var detailsEAPhoneNr2EA: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("zone")
    var zone: String? = null

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