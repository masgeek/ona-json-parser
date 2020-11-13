package com.tsobu.ona.forms.collect

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("soilSample/depth", "soilSample/fieldID", "soilSample/placing", "soilSample/soilSampleID", "soilSample/depthOther/lowerLimit", "soilSample/depthOther/upperLimit", "soilSample/trialID", "soilSample/plotID")
class SoilSampleSsAcForm {
    @JsonProperty("soilSample/depth")
    var depth: String? = null

    @JsonProperty("soilSample/fieldID")
    var fieldId: String? = null

    @JsonProperty("soilSample/placing")
    var placing: String? = null

    @JsonProperty("soilSample/soilSampleID")
    var soilSampleId: String? = null

    @JsonProperty("soilSample/depthOther/lowerLimit")
    var lowerLimit: String? = null

    @JsonProperty("soilSample/depthOther/upperLimit")
    var upperLimit: String? = null

    @JsonProperty("soilSample/trialID")
    var trialId: String? = null

    @JsonProperty("soilSample/plotID")
    var plotId: String? = null
}