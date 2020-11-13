package com.tsobu.ona.core.dto.json.pool

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("nrLabels", "oldLabel_count", "SET-OF-oldLabel", "plantSampleIDpooled", "soilSampleIDpooled", "PARENT_KEY", "KEY", "SET-OF-sample")
class PoolSamplesAcSampleDto {
    @JsonProperty("nrLabels")
    var nrLabels: String? = null

    @JsonProperty("oldLabel_count")
    var oldLabelCount: String? = null

    @JsonProperty("SET-OF-oldLabel")
    var setOfOldLabel: String? = null

    @JsonProperty("plantSampleIDpooled")
    var plantSampleIdPooled: String? = null

    @JsonProperty("soilSampleIDpooled")
    var soilSampleIdPooled: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-sample")
    var setOfSample: String? = null
}