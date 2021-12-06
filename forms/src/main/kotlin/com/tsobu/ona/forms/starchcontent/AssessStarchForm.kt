package com.tsobu.ona.forms.starchcontent

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class AssessStarchForm {
    @JsonProperty("assessStarch/plotID")
    var plotId: String? = null

    @JsonProperty("assessStarch/FW/airFW")
    var airFw: String? = null

    @JsonProperty("assessStarch/FW/waterFW")
    var waterFw: String? = null

    @JsonProperty("assessStarch/SCNote/specGrav")
    var specGrav: String? = null

    @JsonProperty("assessStarch/SCNote/starCont")
    var starCont: String? = null

    @JsonProperty("assessStarch/SCNote/starContClass")
    var starContClass: String? = null
}