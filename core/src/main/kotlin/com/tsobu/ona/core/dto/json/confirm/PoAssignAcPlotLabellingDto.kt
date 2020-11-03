package com.tsobu.ona.core.dto.json.confirm

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("treatCode", "treatCode_label", "treatNr", "plotID", "PARENT_KEY", "KEY", "SET-OF-plotLabeling")
class PoAssignAcPlotLabellingDto {
    @JsonProperty("treatCode")
    var treatCode: String? = null

    @JsonProperty("treatCode_label")
    var treatCodeLabel: String? = null

    @JsonProperty("treatNr")
    var treatNr: String? = null

    @JsonProperty("plotID")
    var plotId: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-plotLabeling")
    var setOfPlotLabeling: String? = null
}