package com.tsobu.ona.forms.record

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class RecordCanopyDimensionsIdForm {
    @JsonProperty("ID/CD")
    var cdList: List<RecordCanopyDimensionsCdForm> = ArrayList()

    @JsonProperty("ID/CD_count")
    var cdCount: String? = null

    @JsonProperty("ID/plotID")
    var plotId: String? = null

    @JsonProperty("ID/nrMeasurements")
    var nrMeasurements: Int? = null
}