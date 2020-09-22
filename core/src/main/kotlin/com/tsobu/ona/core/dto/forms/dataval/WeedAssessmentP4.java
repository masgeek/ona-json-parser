
package com.tsobu.ona.core.dto.forms.dataval;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeedAssessmentP4 {

    @JsonProperty("weedAssessment_P4/index_P4")
    public String weedAssessmentP4IndexP4;
    @JsonProperty("weedAssessment_P4/weedpic_P4")
    public String weedAssessmentP4WeedpicP4;
    @JsonProperty("weedAssessment_P4/weedCover_P4")
    public int weedAssessmentP4WeedCoverP4;
    @JsonProperty("weedAssessment_P4/weedsHeight_P4")
    public int weedAssessmentP4WeedsHeightP4;
    @JsonProperty("weedAssessment_P4/cassavaHeight_P4")
    public int weedAssessmentP4CassavaHeightP4;

}
