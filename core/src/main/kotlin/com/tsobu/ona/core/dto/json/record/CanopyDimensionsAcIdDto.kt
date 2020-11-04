package com.tsobu.ona.core.dto.json.record

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("nrMeasurements", "sectionID", "plotID", "CD_count", "SET-OF-CD", "PARENT_KEY", "KEY", "SET-OF-ID")
class CanopyDimensionsAcIdDto {
    @JsonProperty("nrMeasurements")
    var nrMeasurements: String? = null

    @JsonProperty("sectionID")
    var sectionID: String? = null

    @JsonProperty("plotID")
    var plotID: String? = null

    @JsonProperty("CD_count")
    var cDCount: String? = null

    @JsonProperty("SET-OF-CD")
    var setOfCd: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-ID")
    var setOfId: String? = null
}