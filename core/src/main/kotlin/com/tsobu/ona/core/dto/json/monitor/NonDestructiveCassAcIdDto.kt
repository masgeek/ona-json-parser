package com.tsobu.ona.core.dto.json.monitor

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("nrMeasurements", "sectionID", "plotID", "NDM_count", "SET-OF-NDM", "PARENT_KEY", "KEY", "SET-OF-ID")
class NonDestructiveCassAcIdDto {
    @JsonProperty("nrMeasurements")
    var nrMeasurements: String? = null

    @JsonProperty("sectionID")
    var sectionId: String? = null

    @JsonProperty("plotID")
    var plotId: String? = null

    @JsonProperty("NDM_count")
    var ndmCount: String? = null

    @JsonProperty("SET-OF-NDM")
    var setOfNdm: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-ID")
    var setOfId: String? = null
}