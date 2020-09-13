package com.tsobu.ona.core.dto.json

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        "plotID",
        "sectionID",
        "plantID",
        "densityVariable",
        "nrRowsVariable",
        "nrPlantsRowVariable",
        "plotDimNote",
        "L1Variable",
        "W1Variable",
        "L2Variable",
        "W2Variable",
        "betweenRowVariable",
        "withinRowVariable",
        "densityVariableCalc",
        "maxStandVariable",
        "plotSizeVariable",
        "noteVariable",
        "nrPlantsNP",
        "nrPlantsSE",
        "generated_table_list_label_73",
        "tuberizedRootsNr",
        "tuberizedMarketableRootsNr",
        "generated_table_list_label_77",
        "tuberizedRootsFW",
        "tuberizedDiseasedRootsFW",
        "tuberizedSmallRootsFW",
        "tuberizedMarketableRootsFW",
        "tuberizedRootsFWss",
        "plantSampleID_tuberizedRoots",
        "tuberizedSmallRootsFWss",
        "plantSampleID_tuberizedSmallRoots",
        "tuberizedMarketableRootsFWss",
        "plantSampleID_tuberizedMarketableRoots",
        "disease",
        "diseaseScoreRoots",
        "diseaseScoreRoots_incidence",
        "diseaseScoreRoots_severity",
        "PARENT_KEY",
        "KEY",
        "SET-OF-yieldAssessment"
)
class RootYieldCassavaAcYieldAssessmentDto {

    @JsonProperty("plotID")
    var plotId: String? = null

    @JsonProperty("sectionID")
    var sectionId: String? = null

    @JsonProperty("plantID")
    var plantId: String? = null

    @JsonProperty("densityVariable")
    var densityVariable: String? = null

    @JsonProperty("nrRowsVariable")
    var nrRowsVariable: String? = null

    @JsonProperty("nrPlantsRowVariable")
    var nrPlantsRowVariable: String? = null

    @JsonProperty("plotDimNote")
    var plotDimNote: String? = null

    @JsonProperty("L1Variable")
    var l1Variable: String? = null

    @JsonProperty("W1Variable")
    var w1Variable: String? = null

    @JsonProperty("L2Variable")
    var l2Variable: String? = null

    @JsonProperty("W2Variable")
    var w2Variable: String? = null

    @JsonProperty("betweenRowVariable")
    var betweenRowVariable: String? = null

    @JsonProperty("withinRowVariable")
    var withinRowVariable: String? = null

    @JsonProperty("densityVariableCalc")
    var densityVariableCalc: String? = null

    @JsonProperty("maxStandVariable")
    var maxStandVariable: String? = null

    @JsonProperty("plotSizeVariable")
    var plotSizeVariable: String? = null

    @JsonProperty("noteVariable")
    var noteVariable: String? = null

    @JsonProperty("nrPlantsNP")
    var nrPlantsNp: String? = null

    @JsonProperty("nrPlantsSE")
    var nrPlantsSe: String? = null

    @JsonProperty("generated_table_list_label_73")
    var generatedTableListLabel73: String? = null

    @JsonProperty("tuberizedRootsNr")
    var tuberizedRootsNr: String? = null

    @JsonProperty("tuberizedMarketableRootsNr")
    var tuberizedMarketableRootsNr: String? = null

    @JsonProperty("generated_table_list_label_77")
    var generatedTableListLabel77: String? = null

    @JsonProperty("tuberizedRootsFW")
    var tuberizedRootsFw: String? = null

    @JsonProperty("tuberizedDiseasedRootsFW")
    var tuberizedDiseasedRootsFw: String? = null

    @JsonProperty("tuberizedSmallRootsFW")
    var tuberizedSmallRootsFw: String? = null

    @JsonProperty("tuberizedMarketableRootsFW")
    var tuberizedMarketableRootsFw: String? = null

    @JsonProperty("tuberizedRootsFWss")
    var tuberizedRootsFwSs: String? = null

    @JsonProperty("plantSampleID_tuberizedRoots")
    var plantSampleIdTuberizedRoots: String? = null

    @JsonProperty("tuberizedSmallRootsFWss")
    var tuberizedSmallRootsFwSs: String? = null

    @JsonProperty("plantSampleID_tuberizedSmallRoots")
    var plantSampleIdTuberizedSmallRoots: String? = null

    @JsonProperty("tuberizedMarketableRootsFWss")
    var tuberizedMarketableRootsFwSs: String? = null

    @JsonProperty("plantSampleID_tuberizedMarketableRoots")
    var plantSampleIdTuberizedMarketableRoots: String? = null

    @JsonProperty("disease")
    var disease: String? = null

    @JsonProperty("diseaseScoreRoots")
    var diseaseScoreRoots: String? = null

    @JsonProperty("diseaseScoreRoots_incidence")
    var diseaseScoreRootsIncidence: String? = null

    @JsonProperty("diseaseScoreRoots_severity")
    var diseaseScoreRootsSeverity: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-yieldAssessment")
    var setOfYieldAssessment: String? = null
}