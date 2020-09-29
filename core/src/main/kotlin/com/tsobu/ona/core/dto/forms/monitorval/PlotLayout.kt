package com.tsobu.ona.core.dto.forms.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plotLayout/plotL1", "plotLayout/plotL2", "plotLayout/plotW1", "plotLayout/plotW2", "plotLayout/plotDimPlot", "plotLayout/plotDimPlotLabel")
class PlotLayout {
    @JsonProperty("plotLayout/plotL1")
    var plotLayoutPlotL1: Double? = null

    @JsonProperty("plotLayout/plotL2")
    var plotLayoutPlotL2: Double? = null

    @JsonProperty("plotLayout/plotW1")
    var plotLayoutPlotW1: Double? = null

    @JsonProperty("plotLayout/plotW2")
    var plotLayoutPlotW2: Double? = null

    @JsonProperty("plotLayout/plotDimPlot")
    var plotLayoutPlotDimPlot: String? = null

    @JsonProperty("plotLayout/plotDimPlotLabel")
    var plotLayoutPlotDimPlotLabel: String? = null
}