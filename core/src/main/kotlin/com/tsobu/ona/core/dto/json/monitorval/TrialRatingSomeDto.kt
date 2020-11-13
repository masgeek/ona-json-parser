package com.tsobu.ona.core.dto.json.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("problem_Some", "problemLabel_Some", "problemPlot_Some_count", "SET-OF-problemPlot_Some", "PARENT_KEY", "KEY", "SET-OF-trialRating_Some")
class TrialRatingSomeDto {
    @JsonProperty("problem_Some")
    var problemSome: String? = null

    @JsonProperty("problemLabel_Some")
    var problemLabelSome: String? = null

    @JsonProperty("problemPlot_Some_count")
    var problemPlotSomeCount: String? = null

    @JsonProperty("SET-OF-problemPlot_Some")
    var setOfProblemPlotSome: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-trialRating_Some")
    var setOfTrialRatingSome: String? = null
}