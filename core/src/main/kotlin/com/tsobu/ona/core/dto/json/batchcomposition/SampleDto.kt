package com.tsobu.ona.core.dto.json.batchcomposition

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("nr", "plantSampleID", "soilSampleID", "PS_key", "SS_key", "reportAction_PS", "reportAction_SS", "FW", "DC", "RS", "NA", "SB", "noteFW", "noteDC", "noteRS", "noteNA", "noteSB", "PARENT_KEY", "KEY", "SET-OF-sample")
class SampleDto {
    @JsonProperty("nr")
    var nr: String? = null

    @JsonProperty("plantSampleID")
    var plantSampleId: String? = null

    @JsonProperty("soilSampleID")
    var soilSampleId: String? = null

    @JsonProperty("PS_key")
    var psKey: String? = null

    @JsonProperty("SS_key")
    var ssKey: String? = null

    @JsonProperty("reportAction_PS")
    var reportActionPs: String? = null

    @JsonProperty("reportAction_SS")
    var reportActionSs: String? = null

    @JsonProperty("FW")
    var fw: String? = null

    @JsonProperty("DC")
    var dc: String? = null

    @JsonProperty("RS")
    var rs: String? = null

    @JsonProperty("NA")
    var na: String? = null

    @JsonProperty("SB")
    var sb: String? = null

    @JsonProperty("noteFW")
    var noteFw: String? = null

    @JsonProperty("noteDC")
    var noteDc: String? = null

    @JsonProperty("noteRS")
    var noteRs: String? = null

    @JsonProperty("noteNA")
    var noteNa: String? = null

    @JsonProperty("noteSB")
    var noteSb: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-sample")
    var setOfSample: String? = null
}