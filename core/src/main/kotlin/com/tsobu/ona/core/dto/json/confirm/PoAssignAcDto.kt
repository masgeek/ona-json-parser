package com.tsobu.ona.core.dto.json.confirm

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("SubmissionDate", "uuid", "start", "today", "deviceid", "subscriberid", "email", "username", "simserial", "phonenumber", "banner", "intro", "project", "country", "login", "firstName", "surName", "geopoint-Latitude", "geopoint-Longitude", "geopoint-Altitude", "geopoint-Accuracy", "fieldID", "trialID", "fieldbookID", "plantingDate", "trialCode", "nrTreatmentsComplete", "completeSetup", "treats", "nrTreatments", "noteBarcode", "plotLabeling_count", "SET-OF-plotLabeling", "end", "instanceID", "KEY")
class PoAssignAcDto {
    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var formHubUuId:String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("deviceid")
    var deviceId: String? = null

    @JsonProperty("subscriberid")
    var subscriberId: String? = null

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

    @JsonProperty("project")
    var project: String? = null

    @JsonProperty("country")
    var country: String? = null

    @JsonProperty("login")
    var login: String? = null

    @JsonProperty("firstName")
    var firstName: String? = null

    @JsonProperty("surName")
    var surName: String? = null

    @JsonProperty("geopoint-Latitude")
    var geopointLatitude: String? = null

    @JsonProperty("geopoint-Longitude")
    var geopointLongitude: String? = null

    @JsonProperty("geopoint-Altitude")
    var geopointAltitude: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geopointAccuracy: String? = null

    @JsonProperty("fieldID")
    var fieldId: String? = null

    @JsonProperty("trialID")
    var trialId: String? = null

    @JsonProperty("fieldbookID")
    var fieldbookId: String? = null

    @JsonProperty("plantingDate")
    var plantingDate: String? = null

    @JsonProperty("trialCode")
    var trialCode: String? = null

    @JsonProperty("nrTreatmentsComplete")
    var nrTreatmentsComplete: String? = null

    @JsonProperty("completeSetup")
    var completeSetup: String? = null

    @JsonProperty("treats")
    var treats: String? = null

    @JsonProperty("nrTreatments")
    var nrTreatments: String? = null

    @JsonProperty("noteBarcode")
    var noteBarcode: String? = null

    @JsonProperty("plotLabeling_count")
    var plotLabelingCount: String? = null

    @JsonProperty("SET-OF-plotLabeling")
    var setOfPlotLabeling: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}