package com.tsobu.ona.forms.register

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.tsobu.ona.forms.Attachment
import java.util.ArrayList

@JsonInclude(JsonInclude.Include.NON_NULL)
class RegisterHhDgForm {
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
    var attachments: List<Attachment> = ArrayList()

    @JsonProperty("_geolocation")
    var geolocation: List<Double> = ArrayList()

    @JsonProperty("_media_count")
    var mediaCount: Int? = null

    @JsonProperty("_total_media")
    var totalMedia: Int? = null

    @JsonProperty("formhub/uuid")
    var formhubUuid: String? = null

    @JsonProperty("scanids/HHID")
    var hhid: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("_date_modified")
    var dateModified: String? = null

    @JsonProperty("addressHH/home")
    var Home: String? = null

    @JsonProperty("addressHH/HASC1")
    var hasc1: String? = null

    @JsonProperty("addressHH/HASC2")
    var hasc2: String? = null

    @JsonProperty("addressHH/HASC3")
    var hasc3: String? = null

    @JsonProperty("addressHH/HASC4")
    var hasc4: String? = null

    @JsonProperty("addressHH/HASC5")
    var hasc5: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("detailsHH/gender")
    var Gender: String? = null

    @JsonProperty("detailsHH/member")
    var Member: String? = null

    @JsonProperty("scanids/EAIDscan")
    var eaidscan: String? = null

    @JsonProperty("scanids/EAIDtext")
    var eaidtext: String? = null

    @JsonProperty("scanids/HHIDscan")
    var hhidscan: String? = null

    @JsonProperty("detailsHH/phoneNr")
    var phoneNr: String? = null

    @JsonProperty("detailsHH/surName")
    var surName: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("addressHH/geopoint")
    var geopoint: String? = null

    @JsonProperty("detailsHH/WhatsApp")
    var whatsApp: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("addressHH/signature")
    var signature: String? = null

    @JsonProperty("detailsHH/birthYear")
    var birthYear: Int? = null

    @JsonProperty("detailsHH/education")
    var education: String? = null

    @JsonProperty("detailsHH/firstName")
    var firstName: String? = null

    @JsonProperty("detailsHH/occupation")
    var occupation: String? = null

    @JsonProperty("detailsHH/relationHH")
    var relationHh: String? = null

    @JsonProperty("detailsHH/maritalStatus")
    var maritalStatus: String? = null

    @JsonProperty("scanids/HHIDtext")
    var hhidtext: String? = null

    @JsonProperty("detailsHH/coopassoc")
    var coopassoc: String? = null

    @JsonProperty("scanids/EAID")
    var eaid: String? = null

    @JsonProperty("scanids/country")
    var country: String? = null

    @JsonProperty("scanids/projectCode")
    var projectCode: String? = null

    @JsonProperty("detailsHH/phoneNr2")
    var phoneNr2: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null
}