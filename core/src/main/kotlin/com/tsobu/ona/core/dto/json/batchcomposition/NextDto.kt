package com.tsobu.ona.core.dto.json.batchcomposition

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("res", "batchName", "descriptionFW", "descriptionDC", "descriptionRS", "descriptionSB", "description", "confirmDC", "sampleBatchID", "confirmName", "nextAction", "nextStation", "batchQuality", "batchStatus", "PARENT_KEY", "KEY", "SET-OF-next")
class NextDto {
    @JsonProperty("res")
    var res: String? = null

    @JsonProperty("batchName")
    var batchName: String? = null

    @JsonProperty("descriptionFW")
    var descriptionFW: String? = null

    @JsonProperty("descriptionDC")
    var descriptionDC: String? = null

    @JsonProperty("descriptionRS")
    var descriptionRS: String? = null

    @JsonProperty("descriptionSB")
    var descriptionSB: String? = null

    @JsonProperty("description")
    var description: String? = null

    @JsonProperty("confirmDC")
    var confirmDC: String? = null

    @JsonProperty("sampleBatchID")
    var sampleBatchId: String? = null

    @JsonProperty("confirmName")
    var confirmName: String? = null

    @JsonProperty("nextAction")
    var nextAction: String? = null

    @JsonProperty("nextStation")
    var nextStation: String? = null

    @JsonProperty("batchQuality")
    var batchQuality: String? = null

    @JsonProperty("batchStatus")
    var batchStatus: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-next")
    var setOfNext: String? = null
}