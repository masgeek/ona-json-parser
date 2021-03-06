package com.tsobu.ona.forms.monitorval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("maizePlantHeight/PH/height", "maizePlantHeight/PH/plantNr")
class MonitorValPhForm {
    @JsonProperty("maizePlantHeight/PH/height")
    var height: String? = null

    @JsonProperty("maizePlantHeight/PH/plantNr")
    var plantNr: String? = null
}