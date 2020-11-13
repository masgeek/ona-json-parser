package com.tsobu.ona.forms.rootyieldcassava

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class YieldAssessmentForm {

    @JsonProperty("yieldAssessment/plantID")
    var plantId: String? = null

    @JsonProperty("yieldAssessment/PD/disease")
    var disease: String? = null

    @JsonProperty("yieldAssessment/rootFW/tuberizedSmallRootsFW")
    var tuberizedSmallRootsFw: String? = null

    @JsonProperty("yieldAssessment/PD/diseaseScoreRoots_severity")
    var diseaseScoreRootsSeverity: String? = null

    @JsonProperty("yieldAssessment/rootFW/tuberizedDiseasedRootsFW")
    var tuberizedDiseasedRootsFw: String? = null

    @JsonProperty("yieldAssessment/rootFW/tuberizedMarketableRootsFW")
    var tuberizedMarketableRootsFw: String? = null

    @JsonProperty("yieldAssessment/rootNr/tuberizedMarketableRootsNr")
    var rootNrTuberizedMarketableRootsNr: String? = null

    @JsonProperty("yieldAssessment/plotID")
    var plotId: String? = null

    @JsonProperty("yieldAssessment/nrPlantsNP")
    var nrPlantsNp: String? = null

    @JsonProperty("yieldAssessment/tuberizedMarketableRootsFWss")
    var tuberizedMarketableRootsFwSs: String? = null

    @JsonProperty("yieldAssessment/PD/diseaseScoreRoots_incidence")
    var diseaseScoreRootsIncidence: String? = null

    @JsonProperty("yieldAssessment/plantSampleID_tuberizedMarketableRoots")
    var plantSampleIDTuberizedMarketableRoots: String? = null

    @JsonProperty("yieldAssessment/rootFW/tuberizedRootsFW")
    var tuberizedRootsFw: String? = null

    @JsonProperty("yieldAssessment/rootNr/tuberizedRootsNr")
    var rootNrTuberizedRootsNr: String? = null

    @JsonProperty("yieldAssessment/tuberizedRootsFWss")
    var tuberizedRootsFwSs: String? = null

    @JsonProperty("yieldAssessment/plantSampleID_tuberizedRoots")
    var plantSampleIDTuberizedRoots: String? = null

    @JsonProperty("yieldAssessment/tuberizedSmallRootsFWss")
    var tuberizedSmallRootsFwSs: String? = null

    @JsonProperty("yieldAssessment/plantSampleID_tuberizedSmallRoots")
    var plantSampleIdTuberizedSmallRoots: String? = null

    @JsonProperty("yieldAssessment/maxStandVariable")
    var maxStandVariable: String? = null

    @JsonProperty("yieldAssessment/plotSizeVariable")
    var plotSizeVariable: String? = null

    @JsonProperty("yieldAssessment/densityVariableCalc")
    var densityVariableCalc: String? = null

    @JsonProperty("yieldAssessment/Variable/nrRowsVariable")
    var nrRowsVariable: String? = null

    @JsonProperty("yieldAssessment/Variable/densityVariable")
    var densityVariable: String? = null

    @JsonProperty("yieldAssessment/Variable/nrPlantsRowVariable")
    var nrPlantsRowVariable: String? = null

    @JsonProperty("yieldAssessment/Variable/L1Variable")
    var l1Variable: String? = null

    @JsonProperty("yieldAssessment/Variable/L2Variable")
    var l2Variable: String? = null

    @JsonProperty("yieldAssessment/Variable/W1Variable")
    var w1Variable: String? = null

    @JsonProperty("yieldAssessment/Variable/W2Variable")
    var w2Variable: String? = null

}