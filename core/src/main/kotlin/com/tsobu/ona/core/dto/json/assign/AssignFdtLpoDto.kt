package com.tsobu.ona.core.dto.json.assign

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
    "email",
    "username",
    "simserial",
    "phonenumber",
    "banner",
    "intro",
    "barcode",
    "ENID",
    "country",
    "projectCode",
    "entity",
    "geopoint-Latitude",
    "geopoint-Longitude",
    "geopoint-Altitude",
    "geopoint-Accuracy",
    "lat",
    "lon",
    "latr",
    "lonr",
    "lookup",
    "FDID_note",
    "FDID",
    "FD_name_new",
    "FDID2_new",
    "FD_owner",
    "HHID",
    "FDID2",
    "expCode",
    "expCode_label",
    "nrTreats",
    "TL_name1_new",
    "season",
    "plantingDate",
    "RCBD",
    "nrBlocks",
    "trial_count",
    "SET-OF-trial",
    "end",
    "instanceID",
    "KEY"
)
class AssignFdtLpoDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

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

    @JsonProperty("banner")
    var banner: String? = null

    @JsonProperty("intro")
    var intro: String? = null

    @JsonProperty("barcode")
    var barcode: String? = null

    @JsonProperty("ENID")
    var enid: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("projectCode")
    var projectCode: String? = null

    @JsonProperty("entity")
    var entity: String? = null

    @JsonProperty("geopoint-Latitude")
    var geoPointLatitude: String? = null

    @JsonProperty("geopoint-Longitude")
    var geoPointLongitude: String? = null

    @JsonProperty("geopoint-Altitude")
    var geoPointAltitude: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geoPointAccuracy: String? = null

    @JsonProperty("lat")
    var lat: String? = null

    @JsonProperty("lon")
    var lon: String? = null

    @JsonProperty("latr")
    var latr: String? = null

    @JsonProperty("lonr")
    var lonr: String? = null

    @JsonProperty("lookup")
    var lookup: String? = null

    @JsonProperty("FDID_note")
    var fDIDNote: String? = null

    @JsonProperty("FDID")
    var fdid: String? = null

    @JsonProperty("FD_name_new")
    var fDNameNew: String? = null

    @JsonProperty("FDID2_new")
    var fdId2New: String? = null

    @JsonProperty("FD_owner")
    var fDOwner: String? = null

    @JsonProperty("HHID")
    var hhid: String? = null

    @JsonProperty("FDID2")
    var fdid2: String? = null

    @JsonProperty("expCode")
    var expCode: String? = null

    @JsonProperty("expCode_label")
    var expCodeLabel: String? = null

    @JsonProperty("nrTreats")
    var nrTreats: String? = null

    @JsonProperty("TL_name1_new")
    var tLName1New: String? = null

    @JsonProperty("season")
    var season: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("RCBD")
    var rcbd: String? = null

    @JsonProperty("nrBlocks")
    var nrBlocks: String? = null

    @JsonProperty("trial_count")
    var trialCount: String? = null

    @JsonProperty("SET-OF-trial")
    var setOfTrial: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}