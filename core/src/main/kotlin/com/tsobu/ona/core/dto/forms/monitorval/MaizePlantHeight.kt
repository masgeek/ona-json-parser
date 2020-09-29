package com.tsobu.ona.core.dto.forms.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("maizePlantHeight/PH", "maizePlantHeight/PH_count", "maizePlantHeight/plantHeightPlot", "maizePlantHeight/plantHeightPlotLabel")
class MaizePlantHeight {
    @JsonProperty("maizePlantHeight/PH")
    var maizePlantHeightPh: List<MaizePlantHeightPh>? = null

    @JsonProperty("maizePlantHeight/PH_count")
    var phCount: String? = null

    @JsonProperty("maizePlantHeight/plantHeightPlot")
    var plantHeightPlot: String? = null

    @JsonProperty("maizePlantHeight/plantHeightPlotLabel")
    var plantHeightPlotLabel: String? = null
}