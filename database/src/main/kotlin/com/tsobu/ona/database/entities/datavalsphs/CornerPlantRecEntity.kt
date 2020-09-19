package com.tsobu.ona.database.entities.datavalsphs

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_sphs_corner_plant_rec")
class CornerPlantRecEntity : BaseEntity() {
    var nrRec: String? = null
    var mainStemNrRec: String? = null
    var primBranchNrRec: String? = null
    var heightRec: String? = null
    var marketableRootsNrRec: String? = null
    var marketableRootsFwRec: String? = null
    var parentKey: String? = null
    var controlKey: String? = null
    var setOfCornerPlantRec: String? = null
}