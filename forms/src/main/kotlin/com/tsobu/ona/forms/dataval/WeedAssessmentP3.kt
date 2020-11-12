package com.tsobu.ona.forms.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedAssessmentP3 {
    @JsonProperty("weedAssessment_P3/index_P3")
    var indexP3: String? = null

    @JsonProperty("weedAssessment_P3/weedpic_P3")
    var weedPicP3: String? = null

    @JsonProperty("weedAssessment_P3/weedCover_P3")
    var weedCoverP3 :Int?=null

    @JsonProperty("weedAssessment_P3/weedsHeight_P3")
    var weedsHeightP3 :Int?=null

    @JsonProperty("weedAssessment_P3/cassavaHeight_P3")
    var cassavaHeightP3 :Int?=null
}