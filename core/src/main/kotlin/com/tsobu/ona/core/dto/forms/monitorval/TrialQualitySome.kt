package com.tsobu.ona.core.dto.forms.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("trialQuality_Some/trialQualityPlot", "trialQuality_Some/trialQualityPlotLabel", "trialQuality_Some/trialQualityScore_Some", "trialQuality_Some/trialQualitySeverity_Some", "trialQuality_Some/trialQualityIncidence_Some")
class TrialQualitySome {
    @JsonProperty("trialQuality_Some/trialQualityPlot")
    var trialQualitySomeTrialQualityPlot: String? = null

    @JsonProperty("trialQuality_Some/trialQualityPlotLabel")
    var trialQualitySomeTrialQualityPlotLabel: String? = null

    @JsonProperty("trialQuality_Some/trialQualityScore_Some")
    var trialQualitySomeTrialQualityScoreSome: String? = null

    @JsonProperty("trialQuality_Some/trialQualitySeverity_Some")
    var trialQualitySomeTrialQualitySeveritySome: String? = null

    @JsonProperty("trialQuality_Some/trialQualityIncidence_Some")
    var trialQualitySomeTrialQualityIncidenceSome: String? = null
}