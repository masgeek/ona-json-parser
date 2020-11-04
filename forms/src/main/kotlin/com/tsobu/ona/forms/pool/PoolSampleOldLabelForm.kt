package com.tsobu.ona.forms.pool

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class PoolSampleOldLabelForm {
    @JsonProperty("sample/oldLabel/pos")
    var posValue: String? = null

    @JsonProperty("sample/oldLabel/plantSampleID")
    var plantSampleID: String? = null
}