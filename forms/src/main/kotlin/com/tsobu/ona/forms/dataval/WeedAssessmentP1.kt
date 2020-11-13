package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedAssessmentP1 {
    @JsonProperty("weedAssessment_P1/index_P1")
    var indexP1: String? = null

    @JsonProperty("weedAssessment_P1/weedpic_P1")
    var weedPicP1: String? = null

    @JsonProperty("weedAssessment_P1/weedCover_P1")
    var weedCoverP1 :String?=null

    @JsonProperty("weedAssessment_P1/weedsHeight_P1")
    var weedsHeightP1 :String?=null

    @JsonProperty("weedAssessment_P1/cassavaHeight_P1")
    var cassavaHeightP1 :String?=null
}