package com.tsobu.ona.core.dto.json.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("problemPlot", "problemPlotLabel", "rateIncidence_Some", "rateSeverity_Some", "PARENT_KEY", "KEY", "SET-OF-problemPlot_Some")
class ProblemPlotSomeDto {
    @JsonProperty("problemPlot")
    var problemPlot: String? = null

    @JsonProperty("problemPlotLabel")
    var problemPlotLabel: String? = null

    @JsonProperty("rateIncidence_Some")
    var rateIncidenceSome: String? = null

    @JsonProperty("rateSeverity_Some")
    var rateSeveritySome: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-problemPlot_Some")
    var setOfProblemPlotSome: String? = null
}