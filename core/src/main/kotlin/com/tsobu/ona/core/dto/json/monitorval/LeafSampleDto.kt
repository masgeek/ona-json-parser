package com.tsobu.ona.core.dto.json.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("leafSamplePlot", "leafSamplePlotLabel", "plantSampleID", "PARENT_KEY", "KEY", "SET-OF-leafSample")
class LeafSampleDto {
    @JsonProperty("leafSamplePlot")
    var leafSamplePlot: String? = null

    @JsonProperty("leafSamplePlotLabel")
    var leafSamplePlotLabel: String? = null

    @JsonProperty("plantSampleID")
    var plantSampleID: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-leafSample")
    var setOfLeafSample: String? = null
}