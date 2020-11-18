package com.tsobu.ona.forms.replace

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class ReplacePoAcLabelForm {
    @JsonProperty("replaceLabel/plotID")
    var plotId: String? = null

    @JsonProperty("replaceLabel/plantID")
    var plantId: String? = null

    @JsonProperty("replaceLabel/plantLabel")
    var plantLabel: String? = null

    @JsonProperty("replaceLabel/treats")
    var treats: String? = null

    @JsonProperty("replaceLabel/trialID")
    var trialId: String? = null

    @JsonProperty("replaceLabel/trialCode")
    var trialCode: String? = null

    @JsonProperty("replaceLabel/sectionLabel")
    var sectionLabel: String? = null
}