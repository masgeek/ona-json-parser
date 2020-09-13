package com.tsobu.ona.core.dto.forms.rootyieldcassava

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class YieldAssessment {

    @JsonProperty("yieldAssessment/plotID")
    var plotId: String? = null

    @JsonProperty("yieldAssessment/nrPlantsNP")
    var nrPlantsNp: String? = null

    @JsonProperty("yieldAssessment/tuberizedRootsFWss")
    var tuberizedRootsFwSs: String? = null

    @JsonProperty("yieldAssessment/rootFW/tuberizedRootsFW")
    var tuberizedRootsFw: String? = null

    @JsonProperty("yieldAssessment/rootNr/tuberizedRootsNr")
    var tuberizedRootsNr: String? = null

    @JsonProperty("yieldAssessment/plantSampleID_tuberizedRoots")
    var plantSampleIDTuberizedRoots: String? = null

    @JsonProperty("yieldAssessment/plantID")
    var plantID: String? = null

    @JsonProperty("yieldAssessment/PD/disease")
    var disease: String? = null

    @JsonProperty("yieldAssessment/rootFW/tuberizedSmallRootsFW")
    var tuberizedSmallRootsFw: String? = null

    @JsonProperty("yieldAssessment/tuberizedSmallRootsFWss")
    var tuberizedSmallRootsFwSs: String? = null

    @JsonProperty("yieldAssessment/PD/diseaseScoreRoots_severity")
    var diseaseScoreRootsSeverity: String? = null

    @JsonProperty("yieldAssessment/PD/diseaseScoreRoots_incidence")
    var diseaseScoreRootsIncidence: String? = null

    @JsonProperty("yieldAssessment/rootFW/tuberizedDiseasedRootsFW")
    var tuberizedDiseasedRootsFw: String? = null

    @JsonProperty("yieldAssessment/rootFW/tuberizedMarketableRootsFW")
    var tuberizedMarketableRootsFw: String? = null

    @JsonProperty("yieldAssessment/rootNr/tuberizedMarketableRootsNr")
    var tuberizedMarketableRootsNr: String? = null

}