package com.tsobu.ona.core.dto.json.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plantNr", "height", "PARENT_KEY", "KEY", "SET-OF-PH")
class MonitorValPhDto {
    @JsonProperty("plantNr")
    var plantNr: String? = null

    @JsonProperty("height")
    var height: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-PH")
    var setOfPh: String? = null
}