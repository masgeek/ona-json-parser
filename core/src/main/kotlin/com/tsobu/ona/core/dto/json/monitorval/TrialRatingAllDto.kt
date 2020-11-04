package com.tsobu.ona.core.dto.json.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("problem_All", "problemLabel_All", "rateIncidence_All", "rateSeverity_All", "PARENT_KEY", "KEY", "SET-OF-trialRating_All")
class TrialRatingAllDto {
    @JsonProperty("problem_All")
    var problemAll: String? = null

    @JsonProperty("problemLabel_All")
    var problemLabelAll: String? = null

    @JsonProperty("rateIncidence_All")
    var rateIncidenceAll: String? = null

    @JsonProperty("rateSeverity_All")
    var rateSeverityAll: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-trialRating_All")
    var setOfTrialRatingAll: String? = null
}