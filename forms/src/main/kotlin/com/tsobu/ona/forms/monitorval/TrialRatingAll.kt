package com.tsobu.ona.forms.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("trialRating_All/problem_All", "trialRating_All/problemLabel_All", "trialRating_All/rateSeverity_All", "trialRating_All/rateIncidence_All")
class TrialRatingAll {
    @JsonProperty("trialRating_All/problem_All")
    var problemAll: String? = null

    @JsonProperty("trialRating_All/problemLabel_All")
    var problemLabelAll: String? = null

    @JsonProperty("trialRating_All/rateSeverity_All")
    var rateSeverityAll: String? = null

    @JsonProperty("trialRating_All/rateIncidence_All")
    var rateIncidenceAll: String? = null
}