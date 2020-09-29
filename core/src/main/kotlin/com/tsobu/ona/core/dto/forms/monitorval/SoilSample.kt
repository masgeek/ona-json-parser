package com.tsobu.ona.core.dto.forms.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("soilSample/depth", "soilSample/soilSampleID")
class SoilSample {
    @JsonProperty("soilSample/depth")
    var soilSampleDepth: String? = null

    @JsonProperty("soilSample/soilSampleID")
    var soilSampleSoilSampleID: String? = null
}