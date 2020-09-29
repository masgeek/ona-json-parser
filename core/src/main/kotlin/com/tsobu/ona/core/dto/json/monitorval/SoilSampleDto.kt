package com.tsobu.ona.core.dto.json.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("depth", "soilSampleID", "PARENT_KEY", "KEY", "SET-OF-soilSample")
class SoilSampleDto {
    @JsonProperty("depth")
    var depth: String? = null

    @JsonProperty("soilSampleID")
    var soilSampleID: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-soilSample")
    var setOfSoilSample: String? = null
}