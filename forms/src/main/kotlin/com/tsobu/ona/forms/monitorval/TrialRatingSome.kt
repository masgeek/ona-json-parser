package com.tsobu.ona.forms.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("trialRating_Some/problem_Some", "trialRating_Some/problemPlot_Some", "trialRating_Some/problemLabel_Some", "trialRating_Some/problemPlot_Some_count")
class TrialRatingSome {
    @JsonProperty("trialRating_Some/problem_Some")
    var trialRatingSomeProblemSome: String? = null

    @JsonProperty("trialRating_Some/problemPlot_Some")
    var problemPlotSome: List<TrialRatingSomeProblemPlotSome>? = null

    @JsonProperty("trialRating_Some/problemLabel_Some")
    var trialRatingSomeProblemLabelSome: String? = null

    @JsonProperty("trialRating_Some/problemPlot_Some_count")
    var trialRatingSomeProblemPlotSomeCount: String? = null
}