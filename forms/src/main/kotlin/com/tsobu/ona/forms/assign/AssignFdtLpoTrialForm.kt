package com.tsobu.ona.forms.assign

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class AssignFdtLpoTrialForm {
    @JsonProperty("trial/plot")
    var plot: List<AssignFdtLpoTrialPlotForm> = ArrayList()

    @JsonProperty("trial/TLID2_new")
    var tLId2New: String? = null

    @JsonProperty("trial/TL_layout")
    var tlLayout: String? = null

    @JsonProperty("trial/plot_count")
    var plotCount: String? = null

    @JsonProperty("trial/TL_name_new")
    var tLNameNew: String? = null

    @JsonProperty("trial/blockNr")
    var blockNr: String? = null
}