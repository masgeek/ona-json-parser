package com.tsobu.ona.core.dto.json.greenbiomass

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plotID", "sectionID", "plantID", "nrPlantsNP", "nrPlantsSE", "sec", "generated_table_list_label_37", "leavesFW", "greenStemsFW", "greenStemsLeavesFW", "leavesSecFW", "greenStemsSecFW", "greenStemsLeavesSecFW", "leavesFWss", "plantSampleID_leaves", "greenStemsFWss", "plantSampleID_greenStems", "greenStemsLeavesFWss", "plantSampleID_greenStemsLeaves", "leavesSecFWss", "plantSampleID_leavesSec", "greenStemsSecFWss", "plantSampleID_greenStemsSec", "greenStemsLeavesSecFWss", "plantSampleID_greenStemsLeavesSec", "PARENT_KEY", "KEY", "SET-OF-yieldAssessmentForm")
class YieldAssessmentFormDto {
    @JsonProperty("plotID")
    var plotId: String? = null

    @JsonProperty("sectionID")
    var sectionId: String? = null

    @JsonProperty("plantID")
    var plantId: String? = null

    @JsonProperty("nrPlantsNP")
    var nrPlantsNp: String? = null

    @JsonProperty("nrPlantsSE")
    var nrPlantsSe: String? = null

    @JsonProperty("sec")
    var secValue: String? = null

    @JsonProperty("generated_table_list_label_37")
    var generatedTableListLabel37: String? = null

    @JsonProperty("leavesFW")
    var leavesFw: String? = null

    @JsonProperty("greenStemsFW")
    var greenStemsFw: String? = null

    @JsonProperty("greenStemsLeavesFW")
    var greenStemsLeavesFw: String? = null

    @JsonProperty("leavesSecFW")
    var leavesSecFw: String? = null

    @JsonProperty("greenStemsSecFW")
    var greenStemsSecFw: String? = null

    @JsonProperty("greenStemsLeavesSecFW")
    var greenStemsLeavesSecFw: String? = null

    @JsonProperty("leavesFWss")
    var leavesFwSs: String? = null

    @JsonProperty("plantSampleID_leaves")
    var plantSampleIdLeaves: String? = null

    @JsonProperty("greenStemsFWss")
    var greenStemsFwSs: String? = null

    @JsonProperty("plantSampleID_greenStems")
    var plantSampleIdGreenStems: String? = null

    @JsonProperty("greenStemsLeavesFWss")
    var greenStemsLeavesFwSs: String? = null

    @JsonProperty("plantSampleID_greenStemsLeaves")
    var plantSampleIdGreenStemsLeaves: String? = null

    @JsonProperty("leavesSecFWss")
    var leavesSecFwSs: String? = null

    @JsonProperty("plantSampleID_leavesSec")
    var plantSampleIdLeavesSec: String? = null

    @JsonProperty("greenStemsSecFWss")
    var greenStemsSecFwSs: String? = null

    @JsonProperty("plantSampleID_greenStemsSec")
    var plantSampleIdGreenStemsSec: String? = null

    @JsonProperty("greenStemsLeavesSecFWss")
    var greenStemsLeavesSecFwSs: String? = null

    @JsonProperty("plantSampleID_greenStemsLeavesSec")
    var plantSampleIdGreenStemsLeavesSec: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-yieldAssessmentForm")
    var setOfYieldAssessment: String? = null
}