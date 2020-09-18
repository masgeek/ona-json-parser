package com.tsobu.ona.database.entities.datavalsphs

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_sphs_harvest_rec_tri")
class SphsHarvestRecTriEntity : BaseEntity() {
    var triangleNrRec: String? = null
    var nrPlantsRecTri: String? = null
    var tuberizedMarketableRootsNrRecTri: String? = null
    var tuberizedMarketableRootsFwRecTri: String? = null
    var parentKey: String? = null
    var controlKey: String? = null
    var setOfHarvestRecTri: String? = null
}