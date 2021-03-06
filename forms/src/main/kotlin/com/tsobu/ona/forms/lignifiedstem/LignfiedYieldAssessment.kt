package com.tsobu.ona.forms.lignifiedstem

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("yieldAssessment/plantID", "yieldAssessment/lignifiedStemsFWss", "yieldAssessment/oldPlantingStickFWss", "yieldAssessment/plantSampleID_lignifiedStems", "yieldAssessment/plantSampleID_oldPlantingStick", "yieldAssessment/abovegroundBiomassFW/lignifiedStemsFW", "yieldAssessment/abovegroundBiomassFW/oldPlantingStickFW", "yieldAssessment/plotID", "yieldAssessment/nrPlantsNP", "yieldAssessment/stemNr/nrMainStems", "yieldAssessment/stemNr/nrPrimaryBranches")
class LignfiedYieldAssessment {
    @JsonProperty("yieldAssessment/plantID")
    var plantId: String? = null

    @JsonProperty("yieldAssessment/lignifiedStemsFWss")
    var lignifiedStemsFwSs: String? = null

    @JsonProperty("yieldAssessment/oldPlantingStickFWss")
    var oldPlantingStickFwSs: String? = null

    @JsonProperty("yieldAssessment/plantSampleID_lignifiedStems")
    var plantSampleIdLignifiedStems: String? = null

    @JsonProperty("yieldAssessment/plantSampleID_oldPlantingStick")
    var plantSampleIdOldPlantingStick: String? = null

    @JsonProperty("yieldAssessment/abovegroundBiomassFW/lignifiedStemsFW")
    var lignifiedStemsFw: String?=null

    @JsonProperty("yieldAssessment/abovegroundBiomassFW/oldPlantingStickFW")
    var oldPlantingStickFw: String?=null

    @JsonProperty("yieldAssessment/plotID")
    var plotId: String? = null

    @JsonProperty("yieldAssessment/nrPlantsNP")
    var nrPlantsNP: String? = null

    @JsonProperty("yieldAssessment/stemNr/nrMainStems")
    var nrMainStems: String? = null

    @JsonProperty("yieldAssessment/stemNr/nrPrimaryBranches")
    var nrPrimaryBranches: String? = null
}