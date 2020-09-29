package com.tsobu.ona.forms.assign

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plantLabeling/plantID")
class PlantLabelingPaAcForm {
    @JsonProperty("plantLabeling/plantID")
    var plantId: String? = null
}