package com.tsobu.ona.core.dto.forms.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("trialRating_All/problem_All", "trialRating_All/problemLabel_All", "trialRating_All/rateSeverity_All", "trialRating_All/rateIncidence_All")
class TrialRatingAll {
    @JsonProperty("trialRating_All/problem_All")
    var trialRatingAllProblemAll: String? = null

    @JsonProperty("trialRating_All/problemLabel_All")
    var trialRatingAllProblemLabelAll: String? = null

    @JsonProperty("trialRating_All/rateSeverity_All")
    var trialRatingAllRateSeverityAll: String? = null

    @JsonProperty("trialRating_All/rateIncidence_All")
    var trialRatingAllRateIncidenceAll: String? = null
}