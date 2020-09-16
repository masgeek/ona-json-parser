package com.tsobu.ona.database.entities

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_sphs_harvest_rec_tri_detail")
class DataValSphsHarvestRecTriDetailEntity : BaseEntity() {
    var triangleNr: String? = null
    var nrPlants: String? = null
    var cornerPlantRecCount: String? = null
    var setOfCornerPlant: String? = null
    var remainPlantTotalNr: String? = null
    var remainPlantRecCount: String? = null
    var setOfRemainPlant: String? = null
    var remainPlantsTuberizedMarketableRootsNr: String? = null
    var remainPlantTuberizedMarketableRootsFw: String? = null
    var parentKey: String? = null
    var controlKey: String? = null
    var setOfHarvest: String? = null
}