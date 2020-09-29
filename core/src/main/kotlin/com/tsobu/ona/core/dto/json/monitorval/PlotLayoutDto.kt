package com.tsobu.ona.core.dto.json.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plotDimPlot", "plotDimPlotLabel", "plotDim", "plotL1", "plotW1", "plotL2", "plotW2", "PARENT_KEY", "KEY", "SET-OF-plotLayout")
class PlotLayoutDto {
    @JsonProperty("plotDimPlot")
    var plotDimPlot: String? = null

    @JsonProperty("plotDimPlotLabel")
    var plotDimPlotLabel: String? = null

    @JsonProperty("plotDim")
    var plotDim: String? = null

    @JsonProperty("plotL1")
    var plotL1: String? = null

    @JsonProperty("plotW1")
    var plotW1: String? = null

    @JsonProperty("plotL2")
    var plotL2: String? = null

    @JsonProperty("plotW2")
    var plotW2: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-plotLayout")
    var setOfPlotLayout: String? = null
}