package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedAssessmentP2 {
    @JsonProperty("weedAssessment_P2/index_P2")
    var indexP2: String? = null

    @JsonProperty("weedAssessment_P2/weedpic_P2")
    var weedPicP2: String? = null

    @JsonProperty("weedAssessment_P2/weedCover_P2")
    var weedCoverP2 :Int?=null

    @JsonProperty("weedAssessment_P2/weedsHeight_P2")
    var weedsHeightP2 :Int?=null

    @JsonProperty("weedAssessment_P2/cassavaHeight_P2")
    var cassavaHeightP2 :Int?=null
}