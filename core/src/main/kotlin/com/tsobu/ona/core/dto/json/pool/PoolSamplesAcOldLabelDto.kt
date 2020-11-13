package com.tsobu.ona.core.dto.json.pool

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("pos", "plantSampleID", "soilSampleID", "PARENT_KEY", "KEY", "SET-OF-oldLabel")
class PoolSamplesAcOldLabelDto {
    @JsonProperty("pos")
    var posValue: String? = null

    @JsonProperty("plantSampleID")
    var plantSampleId: String? = null

    @JsonProperty("soilSampleID")
    var soilSampleId: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-oldLabel")
    var setOfOldLabel: String? = null
}