package com.tsobu.ona.database.entities.pool

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "pool_samples_ac_old_label")
class PoolSamplesAcOldLabelEntity : BaseEntity() {
    @Column(name = "pos_value")
    var posValue: String? = null

    @Column(name = "plant_sample_id")
    var plantSampleId: String? = null

    @Column(name = "soil_sample_id")
    var soilSampleId: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_old_label")
    var setOfOldLabel: String? = null
}