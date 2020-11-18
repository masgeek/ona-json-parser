package com.tsobu.ona.forms.monitor

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class NonDestructiveCassIdNdmForm {
    @JsonProperty("ID/NDM/plantID")
    var plantId: String? = null

    @JsonProperty("ID/NDM/apex/stemSize")
    var stemSize: String? = null

    @JsonProperty("ID/NDM/plantData1D/Length0")
    var length0: String? = null

    @JsonProperty("ID/NDM/plantData1A/NrStems0")
    var nrStems0: String? = null

    @JsonProperty("ID/NDM/plantData1B/NrLeaves0")
    var nrLeaves0: String? = null

    @JsonProperty("ID/NDM/plantData1E/Diameter0")
    var diameter0: String? = null

    @JsonProperty("ID/NDM/apex/nrBranchingPoints")
    var nrBranchingPoints: String? = null

    @JsonProperty("ID/NDM/plantData1C/NrLeafScars0")
    var nrLeafScars0: String? = null

    @JsonProperty("ID/NDM/sec")
    var sec: String? = null

    @JsonProperty("ID/NDM/plantData1D/Length1")
    var length1: String? = null

    @JsonProperty("ID/NDM/plantData1D/Length2")
    var length2: String? = null

    @JsonProperty("ID/NDM/plantData1D/Length3")
    var length3: String? = null

    @JsonProperty("ID/NDM/plantData1A/NrStems1")
    var nrStems1: String? = null

    @JsonProperty("ID/NDM/plantData1A/NrStems2")
    var nrStems2: String? = null

    @JsonProperty("ID/NDM/plantData1A/NrStems3")
    var nrStems3: String? = null

    @JsonProperty("ID/NDM/plantData1D/Length4")
    var length4: String? = null

    @JsonProperty("ID/NDM/plantData1A/NrStems4")
    var nrStems4: String? = null

    @JsonProperty("ID/NDM/plantData1D/Length5")
    var length5: String? = null

    @JsonProperty("ID/NDM/plantData1A/NrStems5")
    var nrStems5: String? = null

    @JsonProperty("ID/NDM/plantData1E/Diameter1")
    var diameter1: String? = null

    @JsonProperty("ID/NDM/plantData1E/Diameter2")
    var diameter2: String? = null

    @JsonProperty("ID/NDM/plantData1E/Diameter3")
    var diameter3: String? = null

    @JsonProperty("ID/NDM/plantData1B/NrLeaves1")
    var nrLeaves1: String? = null

    @JsonProperty("ID/NDM/plantData1C/NrLeafScars1")
    var nrLeafScars1: String? = null

    @JsonProperty("ID/NDM/plantData1B/NrLeaves2")
    var nrLeaves2: String? = null

    @JsonProperty("ID/NDM/plantData1B/NrLeaves3")
    var nrLeaves3: String? = null

    @JsonProperty("ID/NDM/plantData1C/NrLeafScars2")
    var nrLeafScars2: String? = null

    @JsonProperty("ID/NDM/plantData1C/NrLeafScars3")
    var nrLeafScars3: String? = null

    @JsonProperty("ID/NDM/plantData1B/NrLeaves4")
    var nrLeaves4: String? = null

    @JsonProperty("ID/NDM/plantData1E/Diameter4")
    var diameter4: String? = null

    @JsonProperty("ID/NDM/plantData1C/NrLeafScars4")
    var nrLeafScars4: String? = null

    @JsonProperty("ID/NDM/plantData1D/Length6")
    var length6: String? = null

    @JsonProperty("ID/NDM/plantData1A/NrStems6")
    var nrStems6: String? = null

    @JsonProperty("ID/NDM/plantData1E/Diameter5")
    var diameter5: String? = null

    @JsonProperty("ID/NDM/plantData1E/Diameter6")
    var diameter6: String? = null

    @JsonProperty("ID/NDM/plantData1B/NrLeaves5")
    var nrLeaves5: String? = null

    @JsonProperty("ID/NDM/plantData1C/NrLeafScars5")
    var nrLeafScars5: String? = null

    @JsonProperty("ID/NDM/plantDataSec1C/NrLeafScarsSec0")
    var nrLeafScarsSec0: String? = null

    @JsonProperty("ID/NDM/apexSec/stemSizeSec")
    var stemSizeSec: String? = null

    @JsonProperty("ID/NDM/plantDataSec1D/LengthSec1")
    var lengthSec1: String? = null

    @JsonProperty("ID/NDM/plantDataSec1D/LengthSec2")
    var lengthSec2: String? = null

    @JsonProperty("ID/NDM/plantDataSec1A/NrStemsSec0")
    var nrStemsSec0: String? = null

    @JsonProperty("ID/NDM/plantDataSec1A/NrStemsSec1")
    var nrStemsSec1: String? = null

    @JsonProperty("ID/NDM/plantDataSec1A/NrStemsSec2")
    var nrStemsSec2: String? = null

    @JsonProperty("ID/NDM/apexSec/nrBranchingPointsSec")
    var nrBranchingPointsSec: String? = null
}