package com.tsobu.ona.core.dto.json.partition

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("fraction", "fractionLabel", "plantSampleIDFraction", "PARENT_KEY", "KEY", "SET-OF-DM")
class PartitionPsAcDmDto {
    @JsonProperty("fraction")
    var fraction: String? = null

    @JsonProperty("fractionLabel")
    var fractionLabel: String? = null

    @JsonProperty("plantSampleIDFraction")
    var plantSampleIdFraction: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-DM")
    var setOfDm: String? = null
}