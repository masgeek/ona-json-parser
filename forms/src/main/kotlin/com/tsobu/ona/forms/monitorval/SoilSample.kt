package com.tsobu.ona.forms.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("soilSample/depth", "soilSample/soilSampleID")
class SoilSample {
    @JsonProperty("soilSample/depth")
    var depth: String? = null

    @JsonProperty("soilSample/soilSampleID")
    var soilSampleId: String? = null
}