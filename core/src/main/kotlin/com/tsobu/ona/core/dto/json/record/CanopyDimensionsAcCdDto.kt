package com.tsobu.ona.core.dto.json.record

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plantID", "generated_table_list_label_30", "canopyWidth", "canopyLength", "canopyThickness", "PARENT_KEY", "KEY", "SET-OF-CD")
class CanopyDimensionsAcCdDto {
    @JsonProperty("plantID")
    var plantId: String? = null

    @JsonProperty("generated_table_list_label_30")
    var generatedTableListLabel30: String? = null

    @JsonProperty("canopyWidth")
    var canopyWidth: String? = null

    @JsonProperty("canopyLength")
    var canopyLength: String? = null

    @JsonProperty("canopyThickness")
    var canopyThickness: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-CD")
    var setOfCd: String? = null
}