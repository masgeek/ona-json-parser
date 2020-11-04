package com.tsobu.ona.core.dto.json.addsample

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("nrLabels", "plantSampleID", "soilSampleID", "newLabel_count", "SET-OF-newLabel", "PARENT_KEY", "KEY", "SET-OF-sample")
class AcSampleDto {
    @JsonProperty("nrLabels")
    var nrLabels: String? = null

    @JsonProperty("plantSampleID")
    var plantSampleId: String? = null

    @JsonProperty("soilSampleID")
    var soilSampleId: String? = null

    @JsonProperty("newLabel_count")
    var newLabelCount: String? = null

    @JsonProperty("SET-OF-newLabel")
    var setOfNewLabel: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-sample")
    var setOfSample: String? = null
}