
package com.tsobu.ona.core.dto.forms.dataval;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeedAssessmentP3 {

    @JsonProperty("weedAssessment_P3/index_P3")
    public String weedAssessmentP3IndexP3;
    @JsonProperty("weedAssessment_P3/weedpic_P3")
    public String weedAssessmentP3WeedpicP3;
    @JsonProperty("weedAssessment_P3/weedCover_P3")
    public int weedAssessmentP3WeedCoverP3;
    @JsonProperty("weedAssessment_P3/weedsHeight_P3")
    public int weedAssessmentP3WeedsHeightP3;
    @JsonProperty("weedAssessment_P3/cassavaHeight_P3")
    public int weedAssessmentP3CassavaHeightP3;

}
