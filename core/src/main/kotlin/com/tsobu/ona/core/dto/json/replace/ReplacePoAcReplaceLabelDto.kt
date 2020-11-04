package com.tsobu.ona.core.dto.json.replace

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plantLabel", "plantID", "sectionLabel", "sectionID", "trialID", "trialCode", "treats", "plotID", "PARENT_KEY", "KEY", "SET-OF-replaceLabel")
class ReplacePoAcReplaceLabelDto {
    @JsonProperty("plantLabel")
    var plantLabel: String? = null

    @JsonProperty("plantID")
    var plantId: String? = null

    @JsonProperty("sectionLabel")
    var sectionLabel: String? = null

    @JsonProperty("sectionID")
    var sectionId: String? = null

    @JsonProperty("trialID")
    var trialId: String? = null

    @JsonProperty("trialCode")
    var trialCode: String? = null

    @JsonProperty("treats")
    var treats: String? = null

    @JsonProperty("plotID")
    var plotId: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-replaceLabel")
    var setOfReplaceLabel: String? = null
}