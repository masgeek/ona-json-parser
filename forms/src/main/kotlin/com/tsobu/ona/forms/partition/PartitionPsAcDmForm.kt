package com.tsobu.ona.forms.partition

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class PartitionPsAcDmForm {
    @JsonProperty("plantSample/DM/fraction")
    var fraction: String? = null

    @JsonProperty("plantSample/DM/fractionLabel")
    var fractionLabel: String? = null

    @JsonProperty("plantSample/DM/plantSampleIDFraction")
    var plantSampleIdFraction: String? = null
}