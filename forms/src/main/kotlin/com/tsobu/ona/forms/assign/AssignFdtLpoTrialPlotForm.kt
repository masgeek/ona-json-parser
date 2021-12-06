package com.tsobu.ona.forms.assign

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class AssignFdtLpoTrialPlotForm {
    @JsonProperty("trial/plot/coord/x")
    var trialPlotCoordX: Int? = null

    @JsonProperty("trial/plot/coord/y")
    var trialPlotCoordY: Int? = null

    @JsonProperty("trial/plot/treatNr")
    var trialPlotTreatNr: String? = null

    @JsonProperty("trial/plot/plotName")
    var trialPlotPlotName: String? = null

    @JsonProperty("trial/plot/POID2_new")
    var trialPlotPOID2New: String? = null

    @JsonProperty("trial/plot/treatCode")
    var trialPlotTreatCode: String? = null

    @JsonProperty("trial/plot/treatName")
    var trialPlotTreatName: String? = null

    @JsonProperty("trial/plot/expCode_treatNr")
    var trialPlotExpCodeTreatNr: String? = null

    @JsonProperty("trial/plot/treatCode_label")
    var trialPlotTreatCodeLabel: String? = null
}