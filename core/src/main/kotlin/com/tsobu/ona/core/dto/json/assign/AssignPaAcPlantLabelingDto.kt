package com.tsobu.ona.core.dto.json.assign

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plantID", "PARENT_KEY", "KEY", "SET-OF-plantLabeling")
class AssignPaAcPlantLabelingDto {
    @JsonProperty("plantID")
    var plantID: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var key: String? = null

    @JsonProperty("SET-OF-plantLabeling")
    var sETOFPlantLabeling: String? = null
}