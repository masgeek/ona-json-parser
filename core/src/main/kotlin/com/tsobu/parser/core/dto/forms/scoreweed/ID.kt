package com.tsobu.parser.core.dto.forms.scoreweed

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@Suppress("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class ID {
    @JsonProperty("ID/WD")
    var iDWD: List<WeedIdentifier>? = null

    @JsonProperty("ID/plotID")
    var iDPlotID: String? = null

    @JsonProperty("ID/WD_count")
    var iDWDCount: String? = null

    @JsonProperty("ID/scoreCropInjury")
    var iDScoreCropInjury: String? = null

    @JsonProperty("ID/scoreWeedingEff")
    var iDScoreWeedingEff: String? = null

    @JsonProperty("ID/nrDaysLastWeeded")
    var iDNrDaysLastWeeded: String? = null
}