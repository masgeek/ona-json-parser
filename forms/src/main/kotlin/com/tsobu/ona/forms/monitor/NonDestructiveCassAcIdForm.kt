package com.tsobu.ona.forms.monitor

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class NonDestructiveCassAcIdForm {
    @JsonProperty("ID/NDM")
    var ndmList: List<NonDestructiveCassIdNdmForm> = ArrayList()

    @JsonProperty("ID/plotID")
    var plotId: String? = null

    @JsonProperty("ID/sectionID")
    var sectionId: String? = null

    @JsonProperty("ID/nrMeasurements")
    var nrMeasurements: String? = null

    @JsonProperty("ID/NDM_count")
    var ndmCount: String? = null
}