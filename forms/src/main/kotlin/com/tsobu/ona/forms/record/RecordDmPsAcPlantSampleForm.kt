package com.tsobu.ona.forms.record

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class RecordDmPsAcPlantSampleForm {
    @JsonProperty("plantSample/plantDW")
    var plantDw: String?=null

    @JsonProperty("plantSample/plantSampleID")
    var plantSampleId: String? = null
}