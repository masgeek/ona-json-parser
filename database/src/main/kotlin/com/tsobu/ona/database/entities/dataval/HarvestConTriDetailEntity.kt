package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_sphs_harvest_con_tri_detail")
class HarvestConTriDetailEntity : BaseEntity() {
    var triangleNrConDetail: String? = null
    var nrPlantsConTriDetail: String? = null
    var cornerPlantConCount: String? = null
    var setOfCornerPlantCon: String? = null
    var remainPlantTotalNrCon: String? = null
    var remainPlantConCount: String? = null
    var setOfRemainPlantCon: String? = null
    var tuberizedMarketableRootsNrConTriDetail: String? = null
    var tuberizedMarketableRootsFwConTriDetail: String? = null
    var parentKey: String? = null
    var controlKey: String? = null
    var setOfHarvestConTriDetail: String? = null
}