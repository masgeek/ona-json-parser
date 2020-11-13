package com.tsobu.ona.core.dto.json.lignifiedstem

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plotID", "sectionID", "plantID", "nrPlantsNP", "nrPlantsSE", "generated_table_list_label_32", "nrMainStems", "nrPrimaryBranches", "generated_table_list_label_36", "lignifiedStemsFW", "oldPlantingStickFW", "lignifiedStemsFWss", "plantSampleID_lignifiedStems", "oldPlantingStickFWss", "plantSampleID_oldPlantingStick", "PARENT_KEY", "KEY", "SET-OF-yieldAssessment")
class LignifiedStemYieldCassAcYaDto {
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

    @JsonProperty("generated_table_list_label_32")
    var generatedTableListLabel32: String? = null

    @JsonProperty("nrMainStems")
    var nrMainStems: String? = null

    @JsonProperty("nrPrimaryBranches")
    var nrPrimaryBranches: String? = null

    @JsonProperty("generated_table_list_label_36")
    var generatedTableListLabel36: String? = null

    @JsonProperty("lignifiedStemsFW")
    var lignifiedStemsFw: String? = null

    @JsonProperty("oldPlantingStickFW")
    var oldPlantingStickFw: String? = null

    @JsonProperty("lignifiedStemsFWss")
    var lignifiedStemsFwSs: String? = null

    @JsonProperty("plantSampleID_lignifiedStems")
    var plantSampleIdLignifiedStems: String? = null

    @JsonProperty("oldPlantingStickFWss")
    var oldPlantingStickFwSs: String? = null

    @JsonProperty("plantSampleID_oldPlantingStick")
    var plantSampleIDOldPlantingStick: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-yieldAssessment")
    var setOfYieldAssessment: String? = null
}