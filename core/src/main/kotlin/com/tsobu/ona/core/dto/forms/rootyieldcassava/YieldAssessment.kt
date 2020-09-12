package com.tsobu.ona.core.dto.forms.rootyieldcassava

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class YieldAssessment {
    @JsonProperty("yieldAssessment/plantID")
    var yieldAssessmentPlantID: String? = null

    @JsonProperty("yieldAssessment/PD/disease")
    var yieldAssessmentPDDisease: String? = null

    @JsonProperty("yieldAssessment/rootFW/tuberizedSmallRootsFW")
    var yieldAssessmentRootFWTuberizedSmallRootsFW: String? = null

    @JsonProperty("yieldAssessment/PD/diseaseScoreRoots_severity")
    var yieldAssessmentPDDiseaseScoreRootsSeverity: String? = null

    @JsonProperty("yieldAssessment/rootFW/tuberizedDiseasedRootsFW")
    var yieldAssessmentRootFWTuberizedDiseasedRootsFW: Double? = null

    @JsonProperty("yieldAssessment/rootFW/tuberizedMarketableRootsFW")
    var yieldAssessmentRootFWTuberizedMarketableRootsFW: Double? = null

    @JsonProperty("yieldAssessment/rootNr/tuberizedMarketableRootsNr")
    var yieldAssessmentRootNrTuberizedMarketableRootsNr: Int? = null
}