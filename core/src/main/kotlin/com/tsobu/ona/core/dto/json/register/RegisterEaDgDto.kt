package com.tsobu.ona.core.dto.json.register

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "SubmissionDate",
    "uuid",
    "start",
    "today",
    "deviceid",
    "subscriberid",
    "username",
    "generated_note_name_8",
    "banner",
    "intro",
    "generated_note_name_13",
    "EAID",
    "EAIDscan",
    "EAIDtext",
    "country",
    "projectCode",
    "detailsEA_note",
    "firstName",
    "surName",
    "gender",
    "birthYear",
    "phoneNr",
    "phoneNr2",
    "WhatsApp",
    "email",
    "education",
    "generated_note_name_31",
    "HASC1",
    "HASC2",
    "HASC3",
    "HASC4",
    "HASC5",
    "base_location",
    "geopoint-Latitude",
    "geopoint-Longitude",
    "geopoint-Altitude",
    "geopoint-Accuracy",
    "signature",
    "conclusion",
    "end",
    "instanceID",
    "KEY"
)
class RegisterEaDgDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var start: String? = null

    @JsonProperty("today")
    var today: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("subscriberid")
    var subscriberid: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("generated_note_name_8")
    var generatedNoteName8: String? = null

    @JsonProperty("banner")
    var banner: String? = null

    @JsonProperty("intro")
    var intro: String? = null

    @JsonProperty("generated_note_name_13")
    var generatedNoteName13: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("EAIDscan")
    var eaidscan: String? = null

    @JsonProperty("EAIDtext")
    var eaidtext: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("projectCode")
    var projectCode: String? = null

    @JsonProperty("detailsEA_note")
    var detailsEaNote: String? = null

    @JsonProperty("firstName")
    var firstName: String? = null

    @JsonProperty("surName")
    var surName: String? = null

    @JsonProperty("gender")
    var gender: String? = null

    @JsonProperty("birthYear")
    var birthYear: String? = null

    @JsonProperty("phoneNr")
    var phoneNr: String? = null

    @JsonProperty("phoneNr2")
    var phoneNr2: String? = null

    @JsonProperty("WhatsApp")
    var whatsApp: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("education")
    var education: String? = null

    @JsonProperty("generated_note_name_31")
    var generatedNoteName31: String? = null

    @JsonProperty("HASC1")
    var hasc1: String? = null

    @JsonProperty("HASC2")
    var hasc2: String? = null

    @JsonProperty("HASC3")
    var hasc3: String? = null

    @JsonProperty("HASC4")
    var hasc4: String? = null

    @JsonProperty("HASC5")
    var hasc5: String? = null

    @JsonProperty("base_location")
    var baseLocation: String? = null

    @JsonProperty("geopoint-Latitude")
    var geopointLatitude: String? = null

    @JsonProperty("geopoint-Longitude")
    var geopointLongitude: String? = null

    @JsonProperty("geopoint-Altitude")
    var geopointAltitude: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geopointAccuracy: String? = null

    @JsonProperty("signature")
    var signature: String? = null

    @JsonProperty("conclusion")
    var conclusion: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}