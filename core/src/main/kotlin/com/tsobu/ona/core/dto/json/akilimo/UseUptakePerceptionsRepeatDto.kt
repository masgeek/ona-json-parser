package com.tsobu.ona.core.dto.json.akilimo

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.annotation.JsonProperty
import javax.annotation.Generated

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("repeat_nr", "run_choice", "statement_nr", "statement", "response", "PARENT_KEY", "KEY", "SET-OF-perceptions_repeat")
class UseUptakePerceptionsRepeatDto {
    @JsonProperty("repeat_nr")
    var repeatNr: String? = null

    @JsonProperty("run_choice")
    var runChoice: String? = null

    @JsonProperty("statement_nr")
    var statementNr: String? = null

    @JsonProperty("statement")
    var statement: String? = null

    @JsonProperty("response")
    var response: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-perceptions_repeat")
    var setOfPerceptionsRepeat: String? = null
}