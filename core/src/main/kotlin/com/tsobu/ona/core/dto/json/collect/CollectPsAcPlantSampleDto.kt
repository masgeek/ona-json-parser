package com.tsobu.ona.core.dto.json.collect

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plotID", "sectionID", "plantID", "plantSampleID", "plantPart", "plantFW", "PARENT_KEY", "KEY", "SET-OF-plantSample")
class CollectPsAcPlantSampleDto {
    @JsonProperty("plotID")
    var plotId: String? = null

    @JsonProperty("sectionID")
    var sectionId: String? = null

    @JsonProperty("plantID")
    var plantId: String? = null

    @JsonProperty("plantSampleID")
    var plantSampleId: String? = null

    @JsonProperty("plantPart")
    var plantPart: String? = null

    @JsonProperty("plantFW")
    var plantFw: Any? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-plantSample")
    var setOfPlantSample: String? = null
}