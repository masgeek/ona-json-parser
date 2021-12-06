package com.tsobu.ona.forms.agro

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class AdvisoryWV2Form {
    @JsonProperty("_id")
    var id: Int? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("HASC3")
    var hasc3: String? = null

    @JsonProperty("HASC4")
    var hasc4: String? = null

    @JsonProperty("HASC5")
    var hasc5: String? = null

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

    @JsonProperty("rateNPS")
    var rateNPS: String? = null

    @JsonProperty("_version")
    var version: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("geopoint")
    var geopoint: String? = null

    @JsonProperty("plotSize")
    var plotSize: String? = null

    @JsonProperty("rateUrea")
    var rateUrea: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("_duration")
    var duration: Double? = null

    @JsonProperty("_xform_id")
    var xformId: Int? = null

    @JsonProperty("quantityNPS")
    var quantityNPS: String? = null

    @JsonProperty("EAHHIDS/EAID")
    var eaid: String? = null

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

    @JsonProperty("quantityNPSK")
    var quantityNPSK: String? = null

    @JsonProperty("quantityUrea")
    var quantityUrea: String? = null

    @JsonProperty("rateNPSLocal")
    var rateNPSLocal: String? = null

    @JsonProperty("rateNPSStand")
    var rateNPSStand: String? = null

    @JsonProperty("_submitted_by")
    var submittedBy: String? = null

    @JsonProperty("hhidscan/HHID")
    var hhid: String? = null

    @JsonProperty("quantityUreaK")
    var quantityUreaK: String? = null

    @JsonProperty("rateUreaLocal")
    var rateUreaLocal: String? = null

    @JsonProperty("rateUreaStand")
    var rateUreaStand: String? = null

    @JsonProperty("_date_modified")
    var dateModified: String? = null

    @JsonProperty("meta/instanceID")
    var instanceId: String? = null

    @JsonProperty("EAHHIDS/EAIDscan")
    var eaidscan: String? = null

    @JsonProperty("_submission_time")
    var submissionTime: String? = null

    @JsonProperty("_xform_id_string")
    var xformIdString: String? = null

    @JsonProperty("hhidscan/country")
    var country: String? = null

    @JsonProperty("hhidscan/HHIDscan")
    var hhidscan: String? = null

    @JsonProperty("_bamboo_dataset_id")
    var bambooDatasetId: String? = null

    @JsonProperty("regionWoreda/HASC1")
    var hasc1: String? = null

    @JsonProperty("regionWoreda/HASC2")
    var hasc2: String? = null

    @JsonProperty("_media_all_received")
    var mediaAllReceived: Boolean? = null

    @JsonProperty("plantingDate/latepld")
    var latepld: String? = null

    @JsonProperty("plantingDate/lateplm")
    var lateplm: String? = null

    @JsonProperty("plantingDate/earlypld")
    var earlypld: String? = null

    @JsonProperty("plantingDate/earlyplm")
    var earlyplm: String? = null

    @JsonProperty("plantingDate/optimalpld")
    var optimalpld: String? = null

    @JsonProperty("plantingDate/optimalplm")
    var optimalplm: String? = null

    @JsonProperty("plotRatesred/rateUrea1stapp")
   var rateUrea1stapp: String? = null

    @JsonProperty("plotRatesred/rateUrea2ndapp")
   var rateUrea2ndapp: String? = null

    @JsonProperty("plotRatesred/rateUrea1stappLocal")
   var rateUrea1stappLocal: String? = null

    @JsonProperty("plotRatesred/rateUrea1stappStand")
   var  rateUrea1stappStand: String? = null

    @JsonProperty("plotRatesred/rateUrea2ndappLocal")
   var  rateUrea2ndappLocal: String? = null

    @JsonProperty("plotRatesred/rateUrea2ndappStand")
   var  rateUrea2ndappStand: String? = null

    @JsonProperty("EAHHIDS/EAIDtext")
    var eaidtext: String? = null

    @JsonProperty("hhidscan/HHIDtext")
    var hhidtext: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null
}