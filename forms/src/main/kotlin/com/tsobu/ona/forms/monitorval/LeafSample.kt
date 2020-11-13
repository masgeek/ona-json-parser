package com.tsobu.ona.forms.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("leafSample/plantSampleID", "leafSample/leafSamplePlot", "leafSample/leafSamplePlotLabel")
class LeafSample {
    @JsonProperty("leafSample/plantSampleID")
    var plantSampleId: String? = null

    @JsonProperty("leafSample/leafSamplePlot")
    var leafSamplePlot: String? = null

    @JsonProperty("leafSample/leafSamplePlotLabel")
    var leafSamplePlotLabel: String? = null
}