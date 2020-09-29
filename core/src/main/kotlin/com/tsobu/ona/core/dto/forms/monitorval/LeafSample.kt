package com.tsobu.ona.core.dto.forms.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("leafSample/plantSampleID", "leafSample/leafSamplePlot", "leafSample/leafSamplePlotLabel")
class LeafSample {
    @JsonProperty("leafSample/plantSampleID")
    var leafSamplePlantSampleID: String? = null

    @JsonProperty("leafSample/leafSamplePlot")
    var leafSampleLeafSamplePlot: String? = null

    @JsonProperty("leafSample/leafSamplePlotLabel")
    var leafSampleLeafSamplePlotLabel: String? = null
}