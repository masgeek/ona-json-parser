package com.tsobu.ona.database.entities.pool

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "pool_samples_ac_sample")
class PoolSamplesAcSampleEntity : BaseEntity() {
    @Column(name = "nr_labels")
    var nrLabels: String? = null

    @Column(name = "old_label_count")
    var oldLabelCount: String? = null

    @Column(name = "set_of_old_label")
    var setOfOldLabel: String? = null

    @Column(name = "plant_sample_id_pooled")
    var plantSampleIdPooled: String? = null

    @Column(name = "soil_sample_id_pooled")
    var soilSampleIdPooled: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_sample")
    var setOfSample: String? = null
}