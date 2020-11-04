package com.tsobu.ona.forms.partition

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class PartitionPsAcDmForm {
    @JsonProperty("plantSample/DM/fraction")
    var fraction: String? = null

    @JsonProperty("plantSample/DM/fractionLabel")
    var fractionLabel: String? = null

    @JsonProperty("plantSample/DM/plantSampleIDFraction")
    var plantSampleIdFraction: String? = null
}