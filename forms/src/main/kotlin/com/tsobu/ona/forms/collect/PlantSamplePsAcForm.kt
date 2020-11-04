package com.tsobu.ona.forms.collect

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plantSample/plotID", "plantSample/plantSampleID", "plantSample/details/plantFW", "plantSample/details/plantPart")
class PlantSamplePsAcForm {
    @JsonProperty("plantSample/plotID")
    var plotId: String? = null

    @JsonProperty("plantSample/plantSampleID")
    var plantSampleId: String? = null

    @JsonProperty("plantSample/details/plantFW")
    var plantFw: Double? = null

    @JsonProperty("plantSample/details/plantPart")
    var plantPart: String? = null
}