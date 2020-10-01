package com.tsobu.ona.forms.addsample

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("sample/newLabel", "sample/nrLabels", "sample/plantSampleID", "sample/newLabel_count", "sample/soilSampleID")
class AcSample {
    @JsonProperty("sample/newLabel")
    var acNewLabel: List<AcNewLabel>? = null

    @JsonProperty("sample/nrLabels")
    var nrLabels: String? = null

    @JsonProperty("sample/plantSampleID")
    var plantSampleID: String? = null

    @JsonProperty("sample/newLabel_count")
    var newLabelCount: String? = null

    @JsonProperty("sample/soilSampleID")
    var soilSampleId: String? = null
}