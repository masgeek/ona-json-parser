package com.tsobu.ona.core.dto.forms.datavalsphs

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
class HarvestRecTriDetail {
    @JsonProperty("harvest_REC_Tri_detail/cornerPlant_REC")
    var cornerPlantRec: List<HarvestRecTriDetailCornerPlantRec>? = null

    @JsonProperty("harvest_REC_Tri_detail/remainPlant_REC")
    var remainPlantRec: List<HarvestRecTriDetailRemainPlantRec>? = null

    @JsonProperty("harvest_REC_Tri_detail/cornerPlant_REC_count")
    var cornerPlantRecCount: String? = null

    @JsonProperty("harvest_REC_Tri_detail/remainPlant_REC_count")
    var remainPlantRecCount: String? = null

    @JsonProperty("harvest_REC_Tri_detail/triangleNr_REC_detail")
    var triangleNr: String? = null

    @JsonProperty("harvest_REC_Tri_detail/remainPlantTotalNr_REC")
    var remainPlantTotalNr: String? = null

    @JsonProperty("harvest_REC_Tri_detail/nrPlants_REC_Tri_detail")
    var nrPlants: String? = null

    @JsonProperty("harvest_REC_Tri_detail/remainPlant_tuberizedMarketableRootsFW_REC_Tri_detail")
    var remainPlantTuberizedMarketableRootsFw: String? = null

    @JsonProperty("harvest_REC_Tri_detail/remainPlants_tuberizedMarketableRootsNr_REC_Tri_detail")
    var remainPlantsTuberizedMarketableRootsNr: String? = null
}