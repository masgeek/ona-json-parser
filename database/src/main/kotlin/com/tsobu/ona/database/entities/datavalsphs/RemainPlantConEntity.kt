package com.tsobu.ona.database.entities.datavalsphs

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_sphs_remain_plant_con")
class RemainPlantConEntity : BaseEntity() {
    var remainPlantNrCon: String? = null
    var remainPlantMainStemNrCon: String? = null
    var remainPlantPrimBranchNrCon: String? = null
    var remainPlantHeightCon: String? = null
    var parentKey: String? = null
    var controlKey: String? = null
    var setOfRemainPlantCon: String? = null
}