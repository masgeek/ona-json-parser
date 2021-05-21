package com.tsobu.ona.forms.assign

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class PlotLabelingPoAcForm {
    @JsonProperty("plotLabeling/plotID")
    var plotId: String? = null

    @JsonProperty("plotLabeling/treatNr")
    var treatNr: String? = null

    @JsonProperty("plotLabeling/treatCode")
    var treatCode: String? = null

    @JsonProperty("plotLabeling/treatCode_label")
    var treatCodeLabel: String? = null
}