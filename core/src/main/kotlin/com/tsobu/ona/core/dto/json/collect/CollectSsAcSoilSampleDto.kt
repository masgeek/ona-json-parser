package com.tsobu.ona.core.dto.json.collect

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("fieldID", "trialID", "plotID", "sectionID", "soilSampleID", "placing", "depth", "upperLimit", "lowerLimit", "PARENT_KEY", "KEY", "SET-OF-soilSample")
class CollectSsAcSoilSampleDto {
    @JsonProperty("fieldID")
    var fieldId: String? = null

    @JsonProperty("trialID")
    var trialId: String? = null

    @JsonProperty("plotID")
    var plotId: String? = null

    @JsonProperty("sectionID")
    var sectionId: String? = null

    @JsonProperty("soilSampleID")
    var soilSampleId: String? = null

    @JsonProperty("placing")
    var placing: String? = null

    @JsonProperty("depth")
    var depth: String? = null

    @JsonProperty("upperLimit")
    var upperLimit: Any? = null

    @JsonProperty("lowerLimit")
    var lowerLimit: Any? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var key: String? = null

    @JsonProperty("SET-OF-soilSample")
    var setOfSoilSample: String? = null
}