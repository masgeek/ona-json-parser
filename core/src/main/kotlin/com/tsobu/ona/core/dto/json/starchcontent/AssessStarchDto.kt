package com.tsobu.ona.core.dto.json.starchcontent

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plotID", "sectionID", "plantID", "generated_table_list_label_37", "airFW", "waterFW", "specGrav", "starCont", "starContClass", "starContNote", "starContError", "PARENT_KEY", "KEY", "SET-OF-assessStarch")
class AssessStarchDto {
    @JsonProperty("plotID")
    var plotId: String? = null

    @JsonProperty("sectionID")
    var sectionId: String? = null

    @JsonProperty("plantID")
    var plantId: String? = null

    @JsonProperty("generated_table_list_label_37")
    var generatedTableListLabel37: String? = null

    @JsonProperty("airFW")
    var airFw: String? = null

    @JsonProperty("waterFW")
    var waterFw: String? = null

    @JsonProperty("specGrav")
    var specGrav: String? = null

    @JsonProperty("starCont")
    var starCont: String? = null

    @JsonProperty("starContClass")
    var starContClass: String? = null

    @JsonProperty("starContNote")
    var starContNote: String? = null

    @JsonProperty("starContError")
    var starContError: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-assessStarch")
    var setOfAssessStarch: String? = null
}