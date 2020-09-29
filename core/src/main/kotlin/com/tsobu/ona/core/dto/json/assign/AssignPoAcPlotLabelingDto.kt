package com.tsobu.ona.core.dto.json.assign

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("treatCode", "treatCode_label", "treatNr", "plotID", "PARENT_KEY", "KEY", "SET-OF-plotLabeling")
class AssignPoAcPlotLabelingDto {
    @JsonProperty("treatCode")
    var treatCode: String? = null

    @JsonProperty("treatCode_label")
    var treatCodeLabel: String? = null

    @JsonProperty("treatNr")
    var treatNr: String? = null

    @JsonProperty("plotID")
    var plotID: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var key: String? = null

    @JsonProperty("SET-OF-plotLabeling")
    var sETOFPlotLabeling: String? = null
}