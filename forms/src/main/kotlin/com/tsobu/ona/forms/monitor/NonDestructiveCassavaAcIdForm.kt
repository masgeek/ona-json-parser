package com.tsobu.ona.forms.monitor

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class NonDestructiveCassavaAcIdForm {
    @JsonProperty("ID/NDM")
    var ndmList: List<NonDestructiveCassavaIdNdmForm> = ArrayList()

    @JsonProperty("ID/NDM_count")
    var ndmCount: String? = null

    @JsonProperty("ID/plotID")
    var plotID: String? = null

    @JsonProperty("ID/nrMeasurements")
    var nrMeasurements: Int? = null

    @JsonProperty("ID/sectionID")
    var sectionID: String? = null
}