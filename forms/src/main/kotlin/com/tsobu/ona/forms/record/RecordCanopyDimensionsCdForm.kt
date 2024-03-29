package com.tsobu.ona.forms.record

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = false)
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