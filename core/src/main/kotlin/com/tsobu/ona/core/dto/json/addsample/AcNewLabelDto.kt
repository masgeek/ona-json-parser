package com.tsobu.ona.core.dto.json.addsample

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plantSampleIDadd", "soilSampleIDadd", "PARENT_KEY", "KEY", "SET-OF-newLabel")
class AcNewLabelDto {
    @JsonProperty("plantSampleIDadd")
    var plantSampleIDadd: String? = null

    @JsonProperty("soilSampleIDadd")
    var soilSampleIDadd: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-newLabel")
    var setOfNewLabel: String? = null
}