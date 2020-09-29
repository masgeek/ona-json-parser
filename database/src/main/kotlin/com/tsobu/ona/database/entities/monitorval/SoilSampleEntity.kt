package com.tsobu.ona.database.entities.monitorval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "monitor_val_soil_sample")
class SoilSampleEntity : BaseEntity() {
    @Column(name = "depth")
    var depth: String? = null

    @Column(name = "soil_sample_id")
    var soilSampleId: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_soil_sample")
    var setOfSoilSample: String? = null
}