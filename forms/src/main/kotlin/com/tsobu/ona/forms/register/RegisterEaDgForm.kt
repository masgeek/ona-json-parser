package com.tsobu.ona.forms.register

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.tsobu.ona.forms.Attachment

@JsonInclude(JsonInclude.Include.NON_NULL)
class RegisterEaDgForm {
    @JsonProperty("_id")
    var id: String? = null

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
    var attachments: List<Attachment> = ArrayList<Attachment>()

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

    @JsonProperty("_date_modified")
    var dateModified: String? = null

    @JsonProperty("detailsEA/EAID")
    var EAID: String? = null

    @JsonProperty("addressEA/HASC1")
    var hasc1: String? = null

    @JsonProperty("addressEA/HASC2")
    var hasc2: String? = null

    @JsonProperty("addressEA/HASC3")
    var hasc3: String? = null

    @JsonProperty("addressEA/HASC4")
    var hasc4: String? = null

    @JsonProperty("addressEA/HASC5")
    var hasc5: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("detailsEA/gender")
    var gender: String? = null

    @JsonProperty("detailsEA/country")
    var country: String? = null

    @JsonProperty("detailsEA/phoneNr")
    var phoneNr: String? = null

    @JsonProperty("detailsEA/surName")
    var surName: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("addressEA/geopoint")
    var geopoint: String? = null

    @JsonProperty("detailsEA/EAIDscan")
    var eaidscan: String? = null

    @JsonProperty("detailsEA/WhatsApp")
    var whatsApp: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("addressEA/signature")
    var Signature: String? = null

    @JsonProperty("detailsEA/birthYear")
    var birthYear: Int? = null

    @JsonProperty("detailsEA/education")
    var education: String? = null

    @JsonProperty("detailsEA/firstName")
    var firstName: String? = null

    @JsonProperty("detailsEA/projectCode")
    var projectCode: String? = null

    @JsonProperty("addressEA/base_location")
    var baseLocation: String? = null

    @JsonProperty("detailsEA/phoneNr2")
    var phoneNr2: String? = null

    @JsonProperty("detailsEA/email")
    var email: String? = null

    @JsonProperty("detailsEA/EAIDtext")
    var eaidtext: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null
}