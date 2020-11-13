package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_sphs_corner_plant_con")
class CornerPlantConEntity : BaseEntity() {
    @Column(name = "corner_plant_nr_con")
    var cornerPlantNrCon: String? = null

    @Column(name = "corner_plant_main_stem_nr_con")
    var cornerPlantMainStemNrCon: String? = null

    @Column(name = "corner_plant_prim_branch_nr_con")
    var cornerPlantPrimBranchNrCon: String? = null

    @Column(name = "corner_plant_height_con")
    var cornerPlantHeightCon: String? = null

    @Column(name = "corner_plant_marketable_roots_nr_con")
    var cornerPlantMarketableRootsNrCon: String? = null

    @Column(name = "corner_plant_marketable_roots_fw_con")
    var cornerPlantMarketableRootsFwCon: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_corner_plant_con")
    var setOfCornerPlantCon: String? = null
}