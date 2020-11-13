package com.tsobu.ona.core.dto.json

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("imageLeafArea",
        "PARENT_KEY",
        "KEY",
        "SET-OF-WD")
class ScoreWeedControlAcWdDto {

    @JsonProperty("imageLeafArea")
    var imageLeafArea: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-WD")
    var setOfWd: String? = null
}