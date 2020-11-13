package com.tsobu.ona.core.dto.json.record

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plantSampleID", "plantDW", "PARENT_KEY", "KEY", "SET-OF-plantSample")
class RecordDmPsAcPlantSampleDto {
    @JsonProperty("plantSampleID")
    var plantSampleId: String? = null

    @JsonProperty("plantDW")
    var plantDw: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-plantSample")
    var setOfPlantSample: String? = null
}