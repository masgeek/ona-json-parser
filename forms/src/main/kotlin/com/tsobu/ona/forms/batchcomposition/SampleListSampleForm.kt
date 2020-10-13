package com.tsobu.ona.forms.batchcomposition

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("sampleList/sample/FW", "sampleList/sample/NA", "sampleList/sample/NF", "sampleList/sample/SB", "sampleList/sample/nr", "sampleList/sample/soilSampleID", "sampleList/sample/plantSampleID", "sampleList/sample/PS_key", "sampleList/sample/noteSB", "sampleList/sample/DC", "sampleList/sample/RS", "sampleList/sample/SS_key", "sampleList/sample/noteRS", "sampleList/sample/reportAction_SS", "sampleList/sample/noteFW", "sampleList/sample/noteDC", "sampleList/sample/noteNA", "sampleList/sample/reportAction_PS")
class SampleListSampleForm {
    @JsonProperty("sampleList/sample/FW")
    var sampleListSampleFW: String? = null

    @JsonProperty("sampleList/sample/NA")
    var sampleListSampleNA: String? = null

    @JsonProperty("sampleList/sample/NF")
    var sampleListSampleNF: String? = null

    @JsonProperty("sampleList/sample/SB")
    var sampleListSampleSB: String? = null

    @JsonProperty("sampleList/sample/nr")
    var sampleListSampleNr: String? = null

    @JsonProperty("sampleList/sample/soilSampleID")
    var sampleListSampleSoilSampleID: String? = null

    @JsonProperty("sampleList/sample/plantSampleID")
    var sampleListSamplePlantSampleID: String? = null

    @JsonProperty("sampleList/sample/PS_key")
    var sampleListSamplePSKey: String? = null

    @JsonProperty("sampleList/sample/noteSB")
    var sampleListSampleNoteSB: String? = null

    @JsonProperty("sampleList/sample/DC")
    var sampleListSampleDC: String? = null

    @JsonProperty("sampleList/sample/RS")
    var sampleListSampleRS: String? = null

    @JsonProperty("sampleList/sample/SS_key")
    var sampleListSampleSSKey: String? = null

    @JsonProperty("sampleList/sample/noteRS")
    var sampleListSampleNoteRS: String? = null

    @JsonProperty("sampleList/sample/reportAction_SS")
    var sampleListSampleReportActionSS: String? = null

    @JsonProperty("sampleList/sample/noteFW")
    var sampleListSampleNoteFW: String? = null

    @JsonProperty("sampleList/sample/noteDC")
    var sampleListSampleNoteDC: String? = null

    @JsonProperty("sampleList/sample/noteNA")
    var sampleListSampleNoteNA: String? = null

    @JsonProperty("sampleList/sample/reportAction_PS")
    var sampleListSampleReportActionPS: String? = null
}