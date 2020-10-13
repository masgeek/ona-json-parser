package com.tsobu.ona.forms.batchcomposition

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("nextStep/next/lab", "nextStep/next/res", "nextStep/next/analysis", "nextStep/next/batchName", "nextStep/next/nextAction", "nextStep/next/confirmName", "nextStep/next/description", "nextStep/next/sampleBatchID", "nextStep/next/nextStation", "nextStep/next/noteDescription", "nextStep/next/batchStatus", "nextStep/next/batchQuality", "nextStep/next/descriptionSB", "nextStep/next/descriptionFW", "nextStep/next/descriptionDC", "nextStep/next/descriptionRS", "nextStep/next/confirmDC")
class NextStepNextForm {
    @JsonProperty("nextStep/next/lab")
    var nextStepNextLab: String? = null

    @JsonProperty("nextStep/next/res")
    var nextStepNextRes: String? = null

    @JsonProperty("nextStep/next/analysis")
    var nextStepNextAnalysis: String? = null

    @JsonProperty("nextStep/next/batchName")
    var nextStepNextBatchName: String? = null

    @JsonProperty("nextStep/next/nextAction")
    var nextStepNextNextAction: String? = null

    @JsonProperty("nextStep/next/confirmName")
    var nextStepNextConfirmName: String? = null

    @JsonProperty("nextStep/next/description")
    var nextStepNextDescription: String? = null

    @JsonProperty("nextStep/next/sampleBatchID")
    var nextStepNextSampleBatchID: String? = null

    @JsonProperty("nextStep/next/nextStation")
    var nextStepNextNextStation: String? = null

    @JsonProperty("nextStep/next/noteDescription")
    var nextStepNextNoteDescription: String? = null

    @JsonProperty("nextStep/next/batchStatus")
    var nextStepNextBatchStatus: String? = null

    @JsonProperty("nextStep/next/batchQuality")
    var nextStepNextBatchQuality: String? = null

    @JsonProperty("nextStep/next/descriptionSB")
    var nextStepNextDescriptionSB: String? = null

    @JsonProperty("nextStep/next/descriptionFW")
    var nextStepNextDescriptionFW: String? = null

    @JsonProperty("nextStep/next/descriptionDC")
    var nextStepNextDescriptionDC: String? = null

    @JsonProperty("nextStep/next/descriptionRS")
    var nextStepNextDescriptionRS: String? = null

    @JsonProperty("nextStep/next/confirmDC")
    var nextStepNextConfirmDC: String? = null
}