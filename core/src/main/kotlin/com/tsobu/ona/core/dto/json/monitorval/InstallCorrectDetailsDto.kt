package com.tsobu.ona.core.dto.json.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plot", "plotLabel", "correct", "correctText", "PARENT_KEY", "KEY", "SET-OF-installCorrectDetails")
class InstallCorrectDetailsDto {
    @JsonProperty("plot")
    var plot: String? = null

    @JsonProperty("plotLabel")
    var plotLabel: String? = null

    @JsonProperty("correct")
    var correct: String? = null

    @JsonProperty("correctText")
    var correctText: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-installCorrectDetails")
    var setOfInstallCorrectDetails: String? = null
}