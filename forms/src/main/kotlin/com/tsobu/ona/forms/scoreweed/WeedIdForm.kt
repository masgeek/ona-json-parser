package com.tsobu.ona.forms.scoreweed

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@Suppress("unused")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedIdForm {
    @JsonProperty("ID/WD")
    var weedIdentifierFormList: List<WeedIdentifierForm>? = null

    @JsonProperty("ID/sectionID")
    var sectionId: String? = null

    @JsonProperty("ID/plotID")
    var plotId: String? = null

    @JsonProperty("ID/WD_count")
    var wdCount: String?=null

    @JsonProperty("ID/scoreCropInjury")
    var scoreCropInjury: String?=null

    @JsonProperty("ID/scoreWeedingEff")
    var scoreWeedingEff: String?=null

    @JsonProperty("ID/nrDaysLastWeeded")
    var nrDaysLastWeeded: String?=null
}