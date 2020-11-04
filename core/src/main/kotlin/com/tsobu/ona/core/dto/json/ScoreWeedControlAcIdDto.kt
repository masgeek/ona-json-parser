package com.tsobu.ona.core.dto.json

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
        "sectionID",
        "plotID",
        "nrDaysLastWeeded",
        "scoreWeedingEff",
        "scoreCropInjury",
        "WD_count",
        "SET-OF-WD",
        "PARENT_KEY",
        "KEY",
        "SET-OF-ID"
)
class ScoreWeedControlAcIdDto {

    @JsonProperty("sectionID")
    var sectionId: String? = null

    @JsonProperty("plotID")
    var plotId: String? = null

    @JsonProperty("nrDaysLastWeeded")
    var daysLastWeeded: Double? = null

    @JsonProperty("scoreWeedingEff")
    var scoreWeedingEff: Double? = null

    @JsonProperty("scoreCropInjury")
    var scoreCropInjury: Double? = null

    @JsonProperty("WD_count")
    var weedcount: Double? = null

    @JsonProperty("SET-OF-WD")
    var setOfWd: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-ID")
    var setOfId: String? = null
}