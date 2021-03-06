package com.tsobu.ona.forms.addsample

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("sample/newLabel/plantSampleIDadd", "sample/newLabel/soilSampleIDadd")
class AcNewLabelForm {
    @JsonProperty("sample/newLabel/plantSampleIDadd")
    var plantSampleIdAdd: String? = null

    @JsonProperty("sample/newLabel/soilSampleIDadd")
    var soilSampleIdAdd: String? = null
}