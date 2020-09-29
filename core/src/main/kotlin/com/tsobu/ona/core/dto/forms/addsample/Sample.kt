package com.tsobu.ona.core.dto.forms.addsample

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.util.*

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("sample/newLabel", "sample/nrLabels", "sample/plantSampleID", "sample/newLabel_count", "sample/soilSampleID")
class Sample {
    @JsonProperty("sample/newLabel")
    var newLabel: List<SampleNewLabel> = ArrayList()

    @JsonProperty("sample/nrLabels")
    var nrLabels: Int? = null

    @JsonProperty("sample/plantSampleID")
    var plantSampleID: String? = null

    @JsonProperty("sample/newLabel_count")
    var newLabelCount: String? = null

    @JsonProperty("sample/soilSampleID")
    var soilSampleID: String? = null
}