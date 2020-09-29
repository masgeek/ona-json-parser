package com.tsobu.ona.core.dto.forms.rootyieldcassava

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class YieldAssessmentForm {

    @JsonProperty("yieldAssessmentForm/plotID")
    var plotId: String? = null

    @JsonProperty("yieldAssessmentForm/nrPlantsNP")
    var nrPlantsNp: String? = null

    @JsonProperty("yieldAssessmentForm/tuberizedRootsFWss")
    var tuberizedRootsFwSs: String? = null

    @JsonProperty("yieldAssessmentForm/rootFW/tuberizedRootsFW")
    var tuberizedRootsFw: String? = null

    @JsonProperty("yieldAssessmentForm/rootNr/tuberizedRootsNr")
    var tuberizedRootsNr: String? = null

    @JsonProperty("yieldAssessmentForm/plantSampleID_tuberizedRoots")
    var plantSampleIDTuberizedRoots: String? = null

    @JsonProperty("yieldAssessmentForm/plantID")
    var plantID: String? = null

    @JsonProperty("yieldAssessmentForm/PD/disease")
    var disease: String? = null

    @JsonProperty("yieldAssessmentForm/rootFW/tuberizedSmallRootsFW")
    var tuberizedSmallRootsFw: String? = null

    @JsonProperty("yieldAssessmentForm/tuberizedSmallRootsFWss")
    var tuberizedSmallRootsFwSs: String? = null

    @JsonProperty("yieldAssessmentForm/PD/diseaseScoreRoots_severity")
    var diseaseScoreRootsSeverity: String? = null

    @JsonProperty("yieldAssessmentForm/PD/diseaseScoreRoots_incidence")
    var diseaseScoreRootsIncidence: String? = null

    @JsonProperty("yieldAssessmentForm/rootFW/tuberizedDiseasedRootsFW")
    var tuberizedDiseasedRootsFw: String? = null

    @JsonProperty("yieldAssessmentForm/rootFW/tuberizedMarketableRootsFW")
    var tuberizedMarketableRootsFw: String? = null

    @JsonProperty("yieldAssessmentForm/rootNr/tuberizedMarketableRootsNr")
    var tuberizedMarketableRootsNr: String? = null

}