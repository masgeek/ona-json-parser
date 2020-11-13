package com.tsobu.ona.forms.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("installCorrectDetails/plot", "installCorrectDetails/correct", "installCorrectDetails/plotLabel", "installCorrectDetails/correctText")
class InstallCorrectDetail {
    @JsonProperty("installCorrectDetails/plot")
    var plot: String? = null

    @JsonProperty("installCorrectDetails/correct")
    var correct: String? = null

    @JsonProperty("installCorrectDetails/plotLabel")
    var plotLabel: String? = null

    @JsonProperty("installCorrectDetails/correctText")
    var correctText: String? = null
}