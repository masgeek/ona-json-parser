package com.tsobu.ona.core.dto.json

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
        "banner",
        "intro",
        "project",
        "country",
        "login",
        "firstName",
        "surName",
        "geopoint-Latitude",
        "geopoint-Longitude",
        "geopoint-Altitude",
        "geopoint-Accuracy",
        "entity",
        "generated_table_list_label_23",
        "reserved_name_for_field_list_labels_24",
        "diseaseScoring",
        "rootQuality",
        "sampling",
        "fixedSize",
        "method",
        "densityFixed",
        "nrRowsFixed",
        "nrPlantsRowFixed",
        "plotDimNote",
        "L1Fixed",
        "W1Fixed",
        "L2Fixed",
        "W2Fixed",
        "betweenRowFixed",
        "withinRowFixed",
        "densityFixedCalc",
        "maxStandFixed",
        "plotSizeFixed",
        "noteFixed",
        "repeat",
        "SET-OF-yieldAssessment",
        "end",
        "instanceID",
        "KEY"
)
class RootYieldCassavaAcDto {

    @JsonProperty("SubmissionDate")
    var submissionDate: String? = null

    @JsonProperty("uuid")
    var uuid: String? = null

    @JsonProperty("start")
    var startDate: String? = null

    @JsonProperty("end")
    var endDate: String? = null

    @JsonProperty("today")
    var todayDate: String? = null

    @JsonProperty("deviceid")
    var deviceid: String? = null

    @JsonProperty("subscriberid")
    var subscriberId: String? = null

    @JsonProperty("email")
    var email: String? = null

    @JsonProperty("username")
    var userName: String? = null

    @JsonProperty("simserial")
    var simSerial: String? = null

    @JsonProperty("phonenumber")
    var phoneNumber: String? = null

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
    var surname: String? = null

    @JsonProperty("geopoint-Latitude")
    var geoPointLatitude: String? = null

    @JsonProperty("geopoint-Longitude")
    var geoPointLongitude: String? = null

    @JsonProperty("geopoint-Altitude")
    var geoPointAltitude: String? = null

    @JsonProperty("geopoint-Accuracy")
    var geoPointAccuracy: String? = null

    @JsonProperty("entity")
    var rootEntity: String? = null

    @JsonProperty("generated_table_list_label_23")
    var generatedTableListLabel23: String? = null

    @JsonProperty("reserved_name_for_field_list_labels_24")
    var reservedNameForFieldListLabels24: String? = null

    @JsonProperty("diseaseScoring")
    var diseaseScoring: String? = null

    @JsonProperty("rootQuality")
    var rootQuality: String? = null

    @JsonProperty("sampling")
    var sampling: String? = null

    @JsonProperty("fixedSize")
    var fixedSize: String? = null

    @JsonProperty("method")
    var method: String? = null

    @JsonProperty("densityFixed")
    var densityFixed: String? = null

    @JsonProperty("nrRowsFixed")
    var nrRowsFixed: String? = null

    @JsonProperty("nrPlantsRowFixed")
    var nrPlantsRowFixed: String? = null

    @JsonProperty("plotDimNote")
    var plotDimNote: String? = null

    @JsonProperty("L1Fixed")
    var l1Fixed: String? = null

    @JsonProperty("W1Fixed")
    var w1Fixed: String? = null

    @JsonProperty("L2Fixed")
    var l2Fixed: String? = null

    @JsonProperty("W2Fixed")
    var w2Fixed: String? = null

    @JsonProperty("betweenRowFixed")
    var betweenRowFixed: String? = null

    @JsonProperty("withinRowFixed")
    var withinRowFixed: String? = null

    @JsonProperty("densityFixedCalc")
    var densityFixedCalc: String? = null

    @JsonProperty("maxStandFixed")
    var maxStandFixed: String? = null

    @JsonProperty("plotSizeFixed")
    var plotSizeFixed: String? = null

    @JsonProperty("noteFixed")
    var noteFixed: String? = null

    @JsonProperty("repeat")
    var repeat: String? = null

    @JsonProperty("SET-OF-yieldAssessment")
    var setOfYieldAssessment: String? = null


    @JsonProperty("instanceID")
    var instanceId: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null
}