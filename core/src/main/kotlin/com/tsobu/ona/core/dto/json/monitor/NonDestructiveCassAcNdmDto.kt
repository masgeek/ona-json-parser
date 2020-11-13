package com.tsobu.ona.core.dto.json.monitor

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder("plantID", "nrBranchingPoints", "stemSize", "sec", "nrBranchingPointsSec", "stemSizeSec", "generated_table_list_label_45", "NrStems0", "NrStems1", "NrStems2", "NrStems3", "NrStems4", "NrStems5", "NrStems6", "NrStems7", "generated_table_list_label_55", "NrStemsSec0", "NrStemsSec1", "NrStemsSec2", "NrStemsSec3", "NrStemsSec4", "NrStemsSec5", "NrStemsSec6", "NrStemsSec7", "generated_table_list_label_65", "NrLeaves0", "NrLeaves1", "NrLeaves2", "NrLeaves3", "NrLeaves4", "NrLeaves5", "NrLeaves6", "NrLeaves7", "generated_table_list_label_75", "NrLeavesSec0", "NrLeavesSec1", "NrLeavesSec2", "NrLeavesSec3", "NrLeavesSec4", "NrLeavesSec5", "NrLeavesSec6", "NrLeavesSec7", "generated_table_list_label_85", "NrLeafScars0", "NrLeafScars1", "NrLeafScars2", "NrLeafScars3", "NrLeafScars4", "NrLeafScars5", "NrLeafScars6", "NrLeafScars7", "generated_table_list_label_95", "NrLeafScarsSec0", "NrLeafScarsSec1", "NrLeafScarsSec2", "NrLeafScarsSec3", "NrLeafScarsSec4", "NrLeafScarsSec5", "NrLeafScarsSec6", "NrLeafScarsSec7", "generated_table_list_label_105", "Length0", "Length1", "Length2", "Length3", "Length4", "Length5", "Length6", "Length7", "generated_table_list_label_115", "LengthSec0", "LengthSec1", "LengthSec2", "LengthSec3", "LengthSec4", "LengthSec5", "LengthSec6", "LengthSec7", "generated_table_list_label_125", "Diameter0", "Diameter1", "Diameter2", "Diameter3", "Diameter4", "Diameter5", "Diameter6", "Diameter7", "generated_table_list_label_135", "DiameterSec0", "DiameterSec1", "DiameterSec2", "DiameterSec3", "DiameterSec4", "DiameterSec5", "DiameterSec6", "DiameterSec7", "PARENT_KEY", "KEY", "SET-OF-NDM")
class NonDestructiveCassAcNdmDto {
    @JsonProperty("plantID")
    var plantId: String? = null

    @JsonProperty("nrBranchingPoints")
    var nrBranchingPoints: String? = null

    @JsonProperty("stemSize")
    var stemSize: String? = null

    @JsonProperty("sec")
    var sec: String? = null

    @JsonProperty("nrBranchingPointsSec")
    var nrBranchingPointsSec: String? = null

    @JsonProperty("stemSizeSec")
    var stemSizeSec: String? = null

    @JsonProperty("generated_table_list_label_45")
    var generatedTableListLabel45: String? = null

    @JsonProperty("NrStems0")
    var nrStems0: String? = null

    @JsonProperty("NrStems1")
    var nrStems1: String? = null

    @JsonProperty("NrStems2")
    var nrStems2: String? = null

    @JsonProperty("NrStems3")
    var nrStems3: String? = null

    @JsonProperty("NrStems4")
    var nrStems4: String? = null

    @JsonProperty("NrStems5")
    var nrStems5: String? = null

    @JsonProperty("NrStems6")
    var nrStems6: String? = null

    @JsonProperty("NrStems7")
    var nrStems7: String? = null

    @JsonProperty("generated_table_list_label_55")
    var generatedTableListLabel55: String? = null

    @JsonProperty("NrStemsSec0")
    var nrStemsSec0: String? = null

    @JsonProperty("NrStemsSec1")
    var nrStemsSec1: String? = null

    @JsonProperty("NrStemsSec2")
    var nrStemsSec2: String? = null

    @JsonProperty("NrStemsSec3")
    var nrStemsSec3: String? = null

    @JsonProperty("NrStemsSec4")
    var nrStemsSec4: String? = null

    @JsonProperty("NrStemsSec5")
    var nrStemsSec5: String? = null

    @JsonProperty("NrStemsSec6")
    var nrStemsSec6: String? = null

    @JsonProperty("NrStemsSec7")
    var nrStemsSec7: String? = null

    @JsonProperty("generated_table_list_label_65")
    var generatedTableListLabel65: String? = null

    @JsonProperty("NrLeaves0")
    var nrLeaves0: String? = null

    @JsonProperty("NrLeaves1")
    var nrLeaves1: String? = null

    @JsonProperty("NrLeaves2")
    var nrLeaves2: String? = null

    @JsonProperty("NrLeaves3")
    var nrLeaves3: String? = null

    @JsonProperty("NrLeaves4")
    var nrLeaves4: String? = null

    @JsonProperty("NrLeaves5")
    var nrLeaves5: String? = null

    @JsonProperty("NrLeaves6")
    var nrLeaves6: String? = null

    @JsonProperty("NrLeaves7")
    var nrLeaves7: String? = null

    @JsonProperty("generated_table_list_label_75")
    var generatedTableListLabel75: String? = null

    @JsonProperty("NrLeavesSec0")
    var nrLeavesSec0: String? = null

    @JsonProperty("NrLeavesSec1")
    var nrLeavesSec1: String? = null

    @JsonProperty("NrLeavesSec2")
    var nrLeavesSec2: String? = null

    @JsonProperty("NrLeavesSec3")
    var nrLeavesSec3: String? = null

    @JsonProperty("NrLeavesSec4")
    var nrLeavesSec4: String? = null

    @JsonProperty("NrLeavesSec5")
    var nrLeavesSec5: String? = null

    @JsonProperty("NrLeavesSec6")
    var nrLeavesSec6: String? = null

    @JsonProperty("NrLeavesSec7")
    var nrLeavesSec7: String? = null

    @JsonProperty("generated_table_list_label_85")
    var generatedTableListLabel85: String? = null

    @JsonProperty("NrLeafScars0")
    var nrLeafScars0: String? = null

    @JsonProperty("NrLeafScars1")
    var nrLeafScars1: String? = null

    @JsonProperty("NrLeafScars2")
    var nrLeafScars2: String? = null

    @JsonProperty("NrLeafScars3")
    var nrLeafScars3: String? = null

    @JsonProperty("NrLeafScars4")
    var nrLeafScars4: String? = null

    @JsonProperty("NrLeafScars5")
    var nrLeafScars5: String? = null

    @JsonProperty("NrLeafScars6")
    var nrLeafScars6: String? = null

    @JsonProperty("NrLeafScars7")
    var nrLeafScars7: String? = null

    @JsonProperty("generated_table_list_label_95")
    var generatedTableListLabel95: String? = null

    @JsonProperty("NrLeafScarsSec0")
    var nrLeafScarsSec0: String? = null

    @JsonProperty("NrLeafScarsSec1")
    var nrLeafScarsSec1: String? = null

    @JsonProperty("NrLeafScarsSec2")
    var nrLeafScarsSec2: String? = null

    @JsonProperty("NrLeafScarsSec3")
    var nrLeafScarsSec3: String? = null

    @JsonProperty("NrLeafScarsSec4")
    var nrLeafScarsSec4: String? = null

    @JsonProperty("NrLeafScarsSec5")
    var nrLeafScarsSec5: String? = null

    @JsonProperty("NrLeafScarsSec6")
    var nrLeafScarsSec6: String? = null

    @JsonProperty("NrLeafScarsSec7")
    var nrLeafScarsSec7: String? = null

    @JsonProperty("generated_table_list_label_105")
    var generatedTableListLabel105: String? = null

    @JsonProperty("Length0")
    var length0: String? = null

    @JsonProperty("Length1")
    var length1: String? = null

    @JsonProperty("Length2")
    var length2: String? = null

    @JsonProperty("Length3")
    var length3: String? = null

    @JsonProperty("Length4")
    var length4: String? = null

    @JsonProperty("Length5")
    var length5: String? = null

    @JsonProperty("Length6")
    var length6: String? = null

    @JsonProperty("Length7")
    var length7: String? = null

    @JsonProperty("generated_table_list_label_115")
    var generatedTableListLabel115: String? = null

    @JsonProperty("LengthSec0")
    var lengthSec0: String? = null

    @JsonProperty("LengthSec1")
    var lengthSec1: String? = null

    @JsonProperty("LengthSec2")
    var lengthSec2: String? = null

    @JsonProperty("LengthSec3")
    var lengthSec3: String? = null

    @JsonProperty("LengthSec4")
    var lengthSec4: String? = null

    @JsonProperty("LengthSec5")
    var lengthSec5: String? = null

    @JsonProperty("LengthSec6")
    var lengthSec6: String? = null

    @JsonProperty("LengthSec7")
    var lengthSec7: String? = null

    @JsonProperty("generated_table_list_label_125")
    var generatedTableListLabel125: String? = null

    @JsonProperty("Diameter0")
    var diameter0: String? = null

    @JsonProperty("Diameter1")
    var diameter1: String? = null

    @JsonProperty("Diameter2")
    var diameter2: String? = null

    @JsonProperty("Diameter3")
    var diameter3: String? = null

    @JsonProperty("Diameter4")
    var diameter4: String? = null

    @JsonProperty("Diameter5")
    var diameter5: String? = null

    @JsonProperty("Diameter6")
    var diameter6: String? = null

    @JsonProperty("Diameter7")
    var diameter7: String? = null

    @JsonProperty("generated_table_list_label_135")
    var generatedTableListLabel135: String? = null

    @JsonProperty("DiameterSec0")
    var diameterSec0: String? = null

    @JsonProperty("DiameterSec1")
    var diameterSec1: String? = null

    @JsonProperty("DiameterSec2")
    var diameterSec2: String? = null

    @JsonProperty("DiameterSec3")
    var diameterSec3: String? = null

    @JsonProperty("DiameterSec4")
    var diameterSec4: String? = null

    @JsonProperty("DiameterSec5")
    var diameterSec5: String? = null

    @JsonProperty("DiameterSec6")
    var diameterSec6: String? = null

    @JsonProperty("DiameterSec7")
    var diameterSec7: String? = null

    @JsonProperty("PARENT_KEY")
    var parentKey: String? = null

    @JsonProperty("KEY")
    var controlKey: String? = null

    @JsonProperty("SET-OF-NDM")
    var setOfNdm: String? = null
}