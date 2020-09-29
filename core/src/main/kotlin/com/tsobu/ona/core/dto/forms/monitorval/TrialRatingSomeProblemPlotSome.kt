package com.tsobu.ona.core.dto.forms.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("trialRating_Some/problemPlot_Some/problemPlot", "trialRating_Some/problemPlot_Some/problemPlotLabel", "trialRating_Some/problemPlot_Some/rateSeverity_Some", "trialRating_Some/problemPlot_Some/rateIncidence_Some")
class TrialRatingSomeProblemPlotSome {
    @JsonProperty("trialRating_Some/problemPlot_Some/problemPlot")
    var trialRatingSomeProblemPlotSomeProblemPlot: String? = null

    @JsonProperty("trialRating_Some/problemPlot_Some/problemPlotLabel")
    var trialRatingSomeProblemPlotSomeProblemPlotLabel: String? = null

    @JsonProperty("trialRating_Some/problemPlot_Some/rateSeverity_Some")
    var trialRatingSomeProblemPlotSomeRateSeveritySome: String? = null

    @JsonProperty("trialRating_Some/problemPlot_Some/rateIncidence_Some")
    var trialRatingSomeProblemPlotSomeRateIncidenceSome: String? = null
}