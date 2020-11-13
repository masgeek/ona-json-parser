package com.tsobu.ona.forms.record

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)class RecordCanopyDimensionsCdForm {
    @JsonProperty("ID/CD/plantID")
    var plantId: String? = null

    @JsonProperty("ID/CD/canopy/canopyWidth")
    var canopyWidth: String? = null

    @JsonProperty("ID/CD/canopy/canopyLength")
    var canopyLength: String? = null

    @JsonProperty("ID/CD/canopy/canopyThickness")
    var canopyThickness: String? = null
}