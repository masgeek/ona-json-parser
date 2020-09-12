package com.tsobu.ona.core.dto.forms.scoreweed

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@Suppress("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedId {
    @JsonProperty("ID/WD")
    var weedIdentifierList: List<WeedIdentifier>? = null

    @JsonProperty("ID/sectionID")
    var sectionId: String? = null

    @JsonProperty("ID/plotID")
    var plotId: String? = null

    @JsonProperty("ID/WD_count")
    var weedCount: Double? = null

    @JsonProperty("ID/scoreCropInjury")
    var scoreCropInjury: Double? = null

    @JsonProperty("ID/scoreWeedingEff")
    var scoreWeedingEff: Double? = null

    @JsonProperty("ID/nrDaysLastWeeded")
    var daysLastWeeded: Double? = null
}