package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedAssessmentP5 {
    @JsonProperty("weedAssessment_P5/index_P5")
    var indexP5: String? = null

    @JsonProperty("weedAssessment_P5/weedpic_P5")
    var weedPicP5: String? = null

    @JsonProperty("weedAssessment_P5/weedCover_P5")
    var weedCoverP5 :String?=null

    @JsonProperty("weedAssessment_P5/weedsHeight_P5")
    var weedsHeightP5 :String?=null

    @JsonProperty("weedAssessment_P5/cassavaHeight_P5")
    var cassavaHeightP5 :String?=null
}