package com.tsobu.ona.forms.pool

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class PoolSampleOldLabelForm {
    @JsonProperty("sample/oldLabel/pos")
    var posValue: String? = null

    @JsonProperty("sample/oldLabel/plantSampleID")
    var plantSampleId: String? = null
}