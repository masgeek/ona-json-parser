package com.tsobu.ona.core.dto.json.assign

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "blockNr",
    "TL_name_new",
    "TL_name_new_note",
    "TLID2_new",
    "TLID_note",
    "TLID",
    "TLID2",
    "TL_layout_note",
    "TL_layout",
    "plot_count",
    "SET-OF-plot",
    "PARENT_KEY",
    "KEY",
    "SET-OF-trial"
)
class AssignFdtLpoTrialDto {
    @JsonProperty("blockNr")
    var blockNr: String? = null

    @JsonProperty("TL_name_new")
    var tLNameNew: String? = null

    @JsonProperty("TL_name_new_note")
    var tLNameNewNote: String? = null

    @JsonProperty("TLID2_new")
    var tLId2New: String? = null

    @JsonProperty("TLID_note")
    var tLIdNote: String? = null

    @JsonProperty("TLID")
    var tlId: String? = null

    @JsonProperty("TLID2")
    var tlid2: String? = null

    @JsonProperty("TL_layout_note")
    var tLLayoutNote: String? = null

    @JsonProperty("TL_layout")
    var tLLayout: String? = null

    @JsonProperty("plot_count")
    var plotCount: String? = null

    @JsonProperty("SET-OF-plot")
    var setOfPlot: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-trial")
    var setOfTrial: String? = null
}