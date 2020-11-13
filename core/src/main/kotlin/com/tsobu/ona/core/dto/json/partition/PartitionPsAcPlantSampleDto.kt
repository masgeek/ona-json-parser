package com.tsobu.ona.core.dto.json.partition

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plantSampleID", "plantPart", "DM_count", "SET-OF-DM", "PARENT_KEY", "KEY", "SET-OF-plantSample")
class PartitionPsAcPlantSampleDto {
    @JsonProperty("plantSampleID")
    var plantSampleId: String? = null

    @JsonProperty("plantPart")
    var plantPart: String? = null

    @JsonProperty("DM_count")
    var dmCount: String? = null

    @JsonProperty("SET-OF-DM")
    var setOfDm: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-plantSample")
    var setOfPlantSample: String? = null
}