package com.tsobu.ona.forms.monitor

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class NonDestructiveCassAcIdForm {
    @JsonProperty("ID/NDM")
    var ndmList: List<NonDestructiveCassIdNdmForm> = ArrayList()

    @JsonProperty("ID/NDM_count")
    var ndmCount: String? = null
}