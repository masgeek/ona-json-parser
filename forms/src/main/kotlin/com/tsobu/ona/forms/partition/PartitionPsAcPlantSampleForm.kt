package com.tsobu.ona.forms.partition

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class PartitionPsAcPlantSampleForm {
    @JsonProperty("plantSample/DM")
    var dmList: List<PartitionPsAcDmForm> = ArrayList()

    @JsonProperty("plantSample/DM_count")
    var dmCount: String? = null

    @JsonProperty("plantSample/plantPart")
    var plantPart: String? = null

    @JsonProperty("plantSample/plantSampleID")
    var plantSampleId: String? = null
}