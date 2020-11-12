package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedAssessmentP6 {
    @JsonProperty("weedAssessment_P6/index_P6")
    var indexP6: String? = null

    @JsonProperty("weedAssessment_P6/weedpic_P6")
    var weedPicP6: String? = null

    @JsonProperty("weedAssessment_P6/weedCover_P6")
    var weedCoverP6 :Int?=null

    @JsonProperty("weedAssessment_P6/weedsHeight_P6")
    var weedsHeightP6 :Int?=null

    @JsonProperty("weedAssessment_P6/cassavaHeight_P6")
    var cassavaHeightP6 :Int?=null
}