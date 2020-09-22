
package com.tsobu.ona.core.dto.forms.dataval;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeedAssessmentP2 {

    @JsonProperty("weedAssessment_P2/index_P2")
    public String weedAssessmentP2IndexP2;
    @JsonProperty("weedAssessment_P2/weedpic_P2")
    public String weedAssessmentP2WeedpicP2;
    @JsonProperty("weedAssessment_P2/weedCover_P2")
    public int weedAssessmentP2WeedCoverP2;
    @JsonProperty("weedAssessment_P2/weedsHeight_P2")
    public int weedAssessmentP2WeedsHeightP2;
    @JsonProperty("weedAssessment_P2/cassavaHeight_P2")
    public int weedAssessmentP2CassavaHeightP2;

}
