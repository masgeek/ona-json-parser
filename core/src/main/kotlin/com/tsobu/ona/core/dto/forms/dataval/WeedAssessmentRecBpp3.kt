package com.tsobu.ona.core.dto.forms.dataval

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonInclude(JsonInclude.Include.NON_NULL)
class WeedAssessmentRecBpp3 {

    @JsonProperty("weedAssessment_REC_BPP3/index_REC_BPP3")
    var indexRecBpp3: String? = null

    @JsonProperty("weedAssessment_REC_BPP3/weedCover_REC_BPP3")
    var weedCoverRecBpp3: Int? = null

    @JsonProperty("weedAssessment_REC_BPP3/weedsHeight_REC_BPP3")
    var weedsHeightRecBpp3: Int? = null

    @JsonProperty("weedAssessment_REC_BPP3/cassavaHeight_REC_BPP3")
    var cassavaHeightRecBpp3: Int? = null
}