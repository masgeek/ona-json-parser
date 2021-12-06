package com.tsobu.ona.forms.register

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class ExTreatmentRepeatForm {
    @JsonProperty("treatmentDetails/treatmentRepeat/treatNr")
    var treatNr: String? = null

    @JsonProperty("treatmentDetails/treatmentRepeat/treatCode")
    var treatCode: String? = null

    @JsonProperty("treatmentDetails/treatmentRepeat/treatName")
    var treatName: String? = null

    @JsonProperty("treatmentDetails/treatmentRepeat/treatCode_label")
    var treatCodeLabel: String? = null
}