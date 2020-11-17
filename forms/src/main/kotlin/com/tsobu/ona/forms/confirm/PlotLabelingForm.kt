package com.tsobu.ona.forms.confirm

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class PlotLabelingForm {
    @JsonProperty("plotLabeling/plotID")
    var plotId: String? = null

    @JsonProperty("plotLabeling/treatNr")
    var treatNr: String? = null

    @JsonProperty("plotLabeling/treatCode")
    var treatCode: String? = null

    @JsonProperty("plotLabeling/treatCode_label")
    var treatCodeLabel: String? = null
}