package com.tsobu.ona.forms.record

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)class RecordCanopyDimensionsCdForm {
    @JsonProperty("ID/CD/plantID")
    var plantID: String? = null

    @JsonProperty("ID/CD/canopy/canopyWidth")
    var canopyWidth: Int? = null

    @JsonProperty("ID/CD/canopy/canopyLength")
    var canopyLength: Int? = null

    @JsonProperty("ID/CD/canopy/canopyThickness")
    var canopyThickness: Int? = null
}