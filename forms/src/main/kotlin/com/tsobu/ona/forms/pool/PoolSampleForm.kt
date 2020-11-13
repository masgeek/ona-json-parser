package com.tsobu.ona.forms.pool

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class PoolSampleForm {
    @JsonProperty("sample/nrLabels")
    var nrLabels: String? = null

    @JsonProperty("sample/oldLabel")
    var oldLabel: List<PoolSampleOldLabelForm> = ArrayList()

    @JsonProperty("sample/oldLabel_count")
    var oldLabelCount: String? = null

    @JsonProperty("sample/plantSampleIDpooled")
    var plantSampleIdPooled: String? = null
}