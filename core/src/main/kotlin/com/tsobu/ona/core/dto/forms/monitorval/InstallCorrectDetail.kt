package com.tsobu.ona.core.dto.forms.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("installCorrectDetails/plot", "installCorrectDetails/correct", "installCorrectDetails/plotLabel", "installCorrectDetails/correctText")
class InstallCorrectDetail {
    @JsonProperty("installCorrectDetails/plot")
    var installCorrectDetailsPlot: String? = null

    @JsonProperty("installCorrectDetails/correct")
    var installCorrectDetailsCorrect: String? = null

    @JsonProperty("installCorrectDetails/plotLabel")
    var installCorrectDetailsPlotLabel: String? = null

    @JsonProperty("installCorrectDetails/correctText")
    var installCorrectDetailsCorrectText: String? = null
}