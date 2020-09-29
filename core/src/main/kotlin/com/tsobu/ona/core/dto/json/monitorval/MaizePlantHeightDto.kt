package com.tsobu.ona.core.dto.json.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plantHeightPlot", "plantHeightPlotLabel", "PH_count", "SET-OF-PH", "PARENT_KEY", "KEY", "SET-OF-maizePlantHeight")
class MaizePlantHeightDto {
    @JsonProperty("plantHeightPlot")
    var plantHeightPlot: String? = null

    @JsonProperty("plantHeightPlotLabel")
    var plantHeightPlotLabel: String? = null

    @JsonProperty("PH_count")
    var pHCount: String? = null

    @JsonProperty("SET-OF-PH")
    var setOfPh: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-maizePlantHeight")
    var setOfMaizePlantHeight: String? = null
}