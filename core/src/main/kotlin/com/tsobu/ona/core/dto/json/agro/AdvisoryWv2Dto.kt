package com.tsobu.ona.core.dto.json.agro

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "SubmissionDate",
    "uuid",
    "start",
    "today",
    "deviceid",
    "subscriberid",
    "email",
    "username",
    "simserial",
    "phonenumber",
    "generated_note_name_11",
    "banner",
    "intro",
    "generated_note_name_16",
    "EAID",
    "EAIDscan",
    "EAIDtext",
    "generated_note_name_22",
    "HHID",
    "HHIDscan",
    "HHIDtext",
    "country",
    "generated_note_name_29",
    "HASC1",
    "HASC2",
    "HASC3",
    "HASC4",
    "HASC5",
    "geopoint-Latitude",
    "geopoint-Longitude",
    "geopoint-Altitude",
    "geopoint-Accuracy",
    "plotSize",
    "rateUrea",
    "rateNPS",
    "quantityUreaK",
    "quantityNPSK",
    "quantityUrea",
    "quantityNPS",
    "rateUreaStand",
    "rateNPSStand",
    "rateUreaLocal",
    "rateNPSLocal",
    "noRecommendationNote",
    "noFertilizerNote",
    "generated_note_name_53",
    "validationNote2",
    "rateUrea1stapp",
    "rateUrea2ndapp",
    "rateUrea1stappStand",
    "rateUrea2ndappStand",
    "rateUrea1stappLocal",
    "rateUrea2ndappLocal",
    "rateNPSNoteVal",
    "rateUreaVal1",
    "rateUreaVal2",
    "generated_note_name_66",
    "validationNote21",
    "rateNPSNoteStand",
    "rateUreaStand1",
    "rateUreaStand2",
    "generated_note_name_73",
    "validationNote22",
    "rateNPSNoteLocal",
    "rateUreaLocal1",
    "rateUreaLocal2",
    "pldatenote",
    "earlyplm",
    "optimalplm",
    "lateplm",
    "earlypld",
    "optimalpld",
    "latepld",
    "OptimalDate",
    "EarlyDate",
    "LateDate",
    "generated_note_name_90",
    "rateFertilizerNoteVal",
    "rateUreaNPSha",
    "rateFertilizerNoteha",
    "rateUreaNPSkert",
    "spliadvice",
    "thankyou",
    "end",
    "instanceID",
    "KEY"
)
class AdvisoryWv2Dto {
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

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("username")
    var username: String? = null

    @JsonProperty("simserial")
    var simserial: String? = null

    @JsonProperty("phonenumber")
    var phonenumber: String? = null

    @JsonProperty("generated_note_name_11")
    var generatedNoteName11: String? = null

    @JsonProperty("banner")
    var banner: String? = null

    @JsonProperty("intro")
    var intro: String? = null

    @JsonProperty("generated_note_name_16")
    var generatedNoteName16: String? = null

    @JsonProperty("EAID")
    var eaid: String? = null

    @JsonProperty("EAIDscan")
    var eaidscan: String? = null

    @JsonProperty("EAIDtext")
    var eaidtext: String? = null

    @JsonProperty("generated_note_name_22")
    var generatedNoteName22: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("HHIDscan")
    var hhidscan: String? = null

    @JsonProperty("HHIDtext")
    var hhidtext: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("generated_note_name_29")
    var generatedNoteName29: String? = null

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

    @JsonProperty("geopoint-Latitude")
    var geopointLatitude: String? = null

    @JsonProperty("geopoint-Longitude")
    var geopointLongitude: String? = null

    @JsonProperty("geopoint-Altitude")
    var geopointAltitude: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geopointAccuracy: String? = null

    @JsonProperty("plotSize")
    var plotSize: String? = null

    @JsonProperty("rateUrea")
    var rateUrea: String? = null

    @JsonProperty("rateNPS")
    var rateNps: String? = null

    @JsonProperty("quantityUreaK")
    var quantityUreaK: String? = null

    @JsonProperty("quantityNPSK")
    var quantityNpsK: String? = null

    @JsonProperty("quantityUrea")
    var quantityUrea: String? = null

    @JsonProperty("quantityNPS")
    var quantityNps: String? = null

    @JsonProperty("rateUreaStand")
    var rateUreaStand: String? = null

    @JsonProperty("rateNPSStand")
    var rateNPSStand: String? = null

    @JsonProperty("rateUreaLocal")
    var rateUreaLocal: String? = null

    @JsonProperty("rateNPSLocal")
    var rateNPSLocal: String? = null

    @JsonProperty("noRecommendationNote")
    var noRecommendationNote: String? = null

    @JsonProperty("noFertilizerNote")
    var noFertilizerNote: String? = null

    @JsonProperty("generated_note_name_53")
    var generatedNoteName53: String? = null

    @JsonProperty("validationNote2")
    var validationNote2: String? = null

    @JsonProperty("rateUrea1stapp")
    var rateUrea1stapp: String? = null

    @JsonProperty("rateUrea2ndapp")
    var rateUrea2ndapp: String? = null

    @JsonProperty("rateUrea1stappStand")
    var rateUrea1stappStand: String? = null

    @JsonProperty("rateUrea2ndappStand")
    var rateUrea2ndappStand: String? = null

    @JsonProperty("rateUrea1stappLocal")
    var rateUrea1stappLocal: String? = null

    @JsonProperty("rateUrea2ndappLocal")
    var rateUrea2ndappLocal: String? = null

    @JsonProperty("rateNPSNoteVal")
    var rateNPSNoteVal: String? = null

    @JsonProperty("rateUreaVal1")
    var rateUreaVal1: String? = null

    @JsonProperty("rateUreaVal2")
    var rateUreaVal2: String? = null

    @JsonProperty("generated_note_name_66")
    var generatedNoteName66: String? = null

    @JsonProperty("validationNote21")
    var validationNote21: String? = null

    @JsonProperty("rateNPSNoteStand")
    var rateNPSNoteStand: String? = null

    @JsonProperty("rateUreaStand1")
    var rateUreaStand1: String? = null

    @JsonProperty("rateUreaStand2")
    var rateUreaStand2: String? = null

    @JsonProperty("generated_note_name_73")
    var generatedNoteName73: String? = null

    @JsonProperty("validationNote22")
    var validationNote22: String? = null

    @JsonProperty("rateNPSNoteLocal")
    var rateNPSNoteLocal: String? = null

    @JsonProperty("rateUreaLocal1")
    var rateUreaLocal1: String? = null

    @JsonProperty("rateUreaLocal2")
    var rateUreaLocal2: String? = null

    @JsonProperty("pldatenote")
    var pldatenote: String? = null

    @JsonProperty("earlyplm")
    var earlyplm: String? = null

    @JsonProperty("optimalplm")
    var optimalplm: String? = null

    @JsonProperty("lateplm")
    var lateplm: String? = null

    @JsonProperty("earlypld")
    var earlypld: String? = null

    @JsonProperty("optimalpld")
    var optimalpld: String? = null

    @JsonProperty("latepld")
    var latepld: String? = null

    @JsonProperty("OptimalDate")
    var optimalDate: String? = null

    @JsonProperty("EarlyDate")
    var earlyDate: String? = null

    @JsonProperty("LateDate")
    var lateDate: String? = null

    @JsonProperty("generated_note_name_90")
    var generatedNoteName90: String? = null

    @JsonProperty("rateFertilizerNoteVal")
    var rateFertilizerNoteVal: String? = null

    @JsonProperty("rateUreaNPSha")
    var rateUreaNPSha: String? = null

    @JsonProperty("rateFertilizerNoteha")
    var rateFertilizerNoteha: String? = null

    @JsonProperty("rateUreaNPSkert")
    var rateUreaNPSkert: String? = null

    @JsonProperty("spliadvice")
    var spliadvice: String? = null

    @JsonProperty("thankyou")
    var thankyou: String? = null

    @JsonProperty("end")
    var end: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}