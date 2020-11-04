package com.tsobu.ona.forms.batchcomposition

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("nextStep/next/lab", "nextStep/next/res", "nextStep/next/analysis", "nextStep/next/batchName", "nextStep/next/nextAction", "nextStep/next/confirmName", "nextStep/next/description", "nextStep/next/sampleBatchID", "nextStep/next/nextStation", "nextStep/next/noteDescription", "nextStep/next/batchStatus", "nextStep/next/batchQuality", "nextStep/next/descriptionSB", "nextStep/next/descriptionFW", "nextStep/next/descriptionDC", "nextStep/next/descriptionRS", "nextStep/next/confirmDC")
class NextStepNextForm {
    @JsonProperty("nextStep/next/lab")
    var lab: String? = null

    @JsonProperty("nextStep/next/res")
    var res: String? = null

    @JsonProperty("nextStep/next/analysis")
    var analysis: String? = null

    @JsonProperty("nextStep/next/batchName")
    var batchName: String? = null

    @JsonProperty("nextStep/next/nextAction")
    var nextAction: String? = null

    @JsonProperty("nextStep/next/confirmName")
    var confirmName: String? = null

    @JsonProperty("nextStep/next/description")
    var description: String? = null

    @JsonProperty("nextStep/next/sampleBatchID")
    var sampleBatchId: String? = null

    @JsonProperty("nextStep/next/nextStation")
    var nextStation: String? = null

    @JsonProperty("nextStep/next/noteDescription")
    var noteDescription: String? = null

    @JsonProperty("nextStep/next/batchStatus")
    var batchStatus: String? = null

    @JsonProperty("nextStep/next/batchQuality")
    var batchQuality: String? = null

    @JsonProperty("nextStep/next/descriptionSB")
    var descriptionSb: String? = null

    @JsonProperty("nextStep/next/descriptionFW")
    var descriptionFw: String? = null

    @JsonProperty("nextStep/next/descriptionDC")
    var descriptionDc: String? = null

    @JsonProperty("nextStep/next/descriptionRS")
    var descriptionRS: String? = null

    @JsonProperty("nextStep/next/confirmDC")
    var confirmDc: String? = null
}