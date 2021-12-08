package com.tsobu.ona.core.dto.json.register

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("treatNr", "treatNr_note", "treatCode_label", "treatName", "treatCode", "PARENT_KEY", "KEY", "SET-OF-treatmentRepeat")
class ExRepeatDto {
    @JsonProperty("treatNr")
    var treatNr: String? = null

    @JsonProperty("treatNr_note")
    var treatNrNote: String? = null

    @JsonProperty("treatCode_label")
    var treatCodeLabel: String? = null

    @JsonProperty("treatName")
    var treatName: String? = null

    @JsonProperty("treatCode")
    var treatCode: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-treatmentRepeat")
    var setOfTreatmentRepeat: String? = null
}