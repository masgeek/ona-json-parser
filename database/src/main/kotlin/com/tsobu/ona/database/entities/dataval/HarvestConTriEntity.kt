package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_sphs_harvest_con_tri")
class HarvestConTriEntity : BaseEntity() {
    @Column(name = "triangle_nr_con")
    var triangleNrCon: String? = null

    @Column(name = "nr_plants_con_tri")
    var nrPlantsConTri: String? = null

    @Column(name = "tuberized_marketable_roots_nr_con_tri")
    var tuberizedMarketableRootsNrConTri: String? = null

    @Column(name = "tuberized_marketable_roots_fw_con_tri")
    var tuberizedMarketableRootsFwConTri: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_harvest_con_tri")
    var setOfHarvestConTri: String? = null
}