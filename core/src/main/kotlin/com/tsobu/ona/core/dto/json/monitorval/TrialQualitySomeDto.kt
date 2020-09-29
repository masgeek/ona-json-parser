package com.tsobu.ona.core.dto.json.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("trialQualityPlot", "trialQualityPlotLabel", "trialQualityIncidence_Some", "trialQualitySeverity_Some", "trialQualityScore_Some", "PARENT_KEY", "KEY", "SET-OF-trialQuality_Some")
class TrialQualitySomeDto {
    @JsonProperty("trialQualityPlot")
    var trialQualityPlot: String? = null

    @JsonProperty("trialQualityPlotLabel")
    var trialQualityPlotLabel: String? = null

    @JsonProperty("trialQualityIncidence_Some")
    var trialQualityIncidenceSome: String? = null

    @JsonProperty("trialQualitySeverity_Some")
    var trialQualitySeveritySome: String? = null

    @JsonProperty("trialQualityScore_Some")
    var trialQualityScoreSome: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-trialQuality_Some")
    var setOfTrialQualitySome: String? = null
}