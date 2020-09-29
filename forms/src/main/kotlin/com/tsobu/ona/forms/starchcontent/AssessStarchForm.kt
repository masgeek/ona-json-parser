package com.tsobu.ona.forms.starchcontent

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("assessStarch/plotID", "assessStarch/FW/airFW", "assessStarch/FW/waterFW", "assessStarch/SCNote/specGrav", "assessStarch/SCNote/starCont", "assessStarch/SCNote/starContClass")
class AssessStarchForm {
    @JsonProperty("assessStarch/plotID")
    var plotId: String? = null

    @JsonProperty("assessStarch/FW/airFW")
    var airFw: Int? = null

    @JsonProperty("assessStarch/FW/waterFW")
    var waterFw: Int? = null

    @JsonProperty("assessStarch/SCNote/specGrav")
    var specGrav: String? = null

    @JsonProperty("assessStarch/SCNote/starCont")
    var starCont: String? = null

    @JsonProperty("assessStarch/SCNote/starContClass")
    var starContClass: String? = null
}