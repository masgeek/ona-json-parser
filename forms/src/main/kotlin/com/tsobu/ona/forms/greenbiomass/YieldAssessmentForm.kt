package com.tsobu.ona.forms.greenbiomass

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("yieldAssessment/plotID", "yieldAssessment/leavesFWss", "yieldAssessment/nrPlantsNP", "yieldAssessment/greenStemsFWss", "yieldAssessment/plantSampleID_leaves", "yieldAssessment/plantSampleID_greenStems", "yieldAssessment/abovegroundBiomassFW/leavesFW", "yieldAssessment/abovegroundBiomassFW/greenStemsFW", "yieldAssessment/greenStemsLeavesFWss", "yieldAssessment/plantSampleID_greenStemsLeaves", "yieldAssessment/abovegroundBiomassFW/greenStemsLeavesFW", "yieldAssessment/sec", "yieldAssessment/plantID", "yieldAssessment/abovegroundBiomassFW/leavesSecFW", "yieldAssessment/abovegroundBiomassFW/greenStemsSecFW")
class YieldAssessmentForm {
    @JsonProperty("yieldAssessment/plotID")
    var yieldAssessmentPlotId: String? = null

    @JsonProperty("yieldAssessment/leavesFWss")
    var yieldAssessmentLeavesFWss: String? = null

    @JsonProperty("yieldAssessment/nrPlantsNP")
    var yieldAssessmentNrPlantsNP: String? = null

    @JsonProperty("yieldAssessment/greenStemsFWss")
    var yieldAssessmentGreenStemsFWss: String? = null

    @JsonProperty("yieldAssessment/plantSampleID_leaves")
    var yieldAssessmentPlantSampleIDLeaves: String? = null

    @JsonProperty("yieldAssessment/plantSampleID_greenStems")
    var yieldAssessmentPlantSampleIDGreenStems: String? = null

    @JsonProperty("yieldAssessment/abovegroundBiomassFW/leavesFW")
    var yieldAssessmentAbovegroundBiomassFWLeavesFW: Double? = null

    @JsonProperty("yieldAssessment/abovegroundBiomassFW/greenStemsFW")
    var yieldAssessmentAbovegroundBiomassFWGreenStemsFW: Double? = null

    @JsonProperty("yieldAssessment/greenStemsLeavesFWss")
    var yieldAssessmentGreenStemsLeavesFWss: String? = null

    @JsonProperty("yieldAssessment/plantSampleID_greenStemsLeaves")
    var yieldAssessmentPlantSampleIDGreenStemsLeaves: String? = null

    @JsonProperty("yieldAssessment/abovegroundBiomassFW/greenStemsLeavesFW")
    var yieldAssessmentAbovegroundBiomassFWGreenStemsLeavesFW: Double? = null

    @JsonProperty("yieldAssessment/sec")
    var yieldAssessmentSec: String? = null

    @JsonProperty("yieldAssessment/plantID")
    var yieldAssessmentPlantId: String? = null

    @JsonProperty("yieldAssessment/abovegroundBiomassFW/leavesSecFW")
    var yieldAssessmentAbovegroundBiomassFWLeavesSecFW: Double? = null

    @JsonProperty("yieldAssessment/abovegroundBiomassFW/greenStemsSecFW")
    var yieldAssessmentAbovegroundBiomassFWGreenStemsSecFW: Double? = null
}