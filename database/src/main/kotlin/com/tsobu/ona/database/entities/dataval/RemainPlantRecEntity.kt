package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_sphs_remain_plant_rec")
class RemainPlantRecEntity : BaseEntity() {
    var remainPlantNrRec: String? = null
    var remainPlantMainStemNrRec: String? = null
    var remainPlantPrimBranchNrRec: String? = null
    var remainPlantHeightRec: String? = null
    var parentKey: String? = null
    var controlKey: String? = null
    var setOfRemainPlantRec: String? = null
}