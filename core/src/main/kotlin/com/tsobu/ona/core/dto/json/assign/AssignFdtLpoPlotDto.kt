package com.tsobu.ona.core.dto.json.assign

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonProperty
import javax.annotation.processing.Generated

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "treatNr",
    "expCode_treatNr",
    "treatCode_label",
    "treatCode",
    "treatName",
    "coordNote",
    "x",
    "y",
    "POID",
    "POID2_new",
    "plotName",
    "PARENT_KEY",
    "KEY",
    "SET-OF-plot"
)
@Generated("jsonschema2pojo")
class AssignFdtLpoPlotDto {
    @JsonProperty("treatNr")
    var treatNr: String? = null

    @JsonProperty("expCode_treatNr")
    var expCodeTreatNr: String? = null

    @JsonProperty("treatCode_label")
    var treatCodeLabel: String? = null

    @JsonProperty("treatCode")
    var treatCode: String? = null

    @JsonProperty("treatName")
    var treatName: String? = null

    @JsonProperty("coordNote")
    var coordNote: String? = null

    @JsonProperty("x")
    var x: String? = null

    @JsonProperty("y")
    var y: String? = null

    @JsonProperty("POID")
    var poId: String? = null

    @JsonProperty("POID2_new")
    var poId2New: String? = null

    @JsonProperty("plotName")
    var plotName: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-plot")
    var setOfPlot: String? = null
}