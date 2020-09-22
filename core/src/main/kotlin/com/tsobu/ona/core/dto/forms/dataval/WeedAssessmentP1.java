
package com.tsobu.ona.core.dto.forms.dataval;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeedAssessmentP1 {

    @JsonProperty("weedAssessment_P1/index_P1")
    public String weedAssessmentP1IndexP1;
    @JsonProperty("weedAssessment_P1/weedpic_P1")
    public String weedAssessmentP1WeedpicP1;
    @JsonProperty("weedAssessment_P1/weedCover_P1")
    public int weedAssessmentP1WeedCoverP1;
    @JsonProperty("weedAssessment_P1/weedsHeight_P1")
    public int weedAssessmentP1WeedsHeightP1;
    @JsonProperty("weedAssessment_P1/cassavaHeight_P1")
    public int weedAssessmentP1CassavaHeightP1;

}
