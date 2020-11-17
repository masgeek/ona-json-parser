package com.tsobu.ona.forms.datavalsphs

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty


@JsonIgnoreProperties(ignoreUnknown = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
class HarvestConTriDetailForm {
    @JsonProperty("harvest_CON_Tri_detail/cornerPlant_CON")
    var cornerPlantConFormList: List<HarvestConTriDetailCornerPlantConForm>? = null

    @JsonProperty("harvest_CON_Tri_detail/remainPlant_CON")
    var remainPlantConFormList: List<HarvestConTriDetailRemainPlantConForm>? = null

    @JsonProperty("harvest_CON_Tri_detail/cornerPlant_CON_count")
    var cornerPlantConCount: String? = null

    @JsonProperty("harvest_CON_Tri_detail/remainPlant_CON_count")
    var remainPlantConCount: String? = null

    @JsonProperty("harvest_CON_Tri_detail/triangleNr_CON_detail")
    var triangleNrConDetail: String? = null

    @JsonProperty("harvest_CON_Tri_detail/remainPlantTotalNr_CON")
    var remainPlantTotalNrCon: String? = null

    @JsonProperty("harvest_CON_Tri_detail/nrPlants_CON_Tri_detail")
    var nrPlantsConTriDetail: String? = null

    @JsonProperty("harvest_CON_Tri_detail/remainPlant_tuberizedMarketableRootsFW_CON_Tri_detail")
    var tuberizedMarketableRootsFwConTriDetail: String? = null

    @JsonProperty("harvest_CON_Tri_detail/remainPlants_tuberizedMarketableRootsNr_CON_Tri_detail")
    var tuberizedMarketableRootsNrConTriDetail: String? = null
}