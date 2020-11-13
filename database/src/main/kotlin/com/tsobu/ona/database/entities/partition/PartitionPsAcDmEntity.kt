package com.tsobu.ona.database.entities.partition

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "partition_ps_ac_dm")
class PartitionPsAcDmEntity : BaseEntity() {
    @Column(name = "fraction")
    var fraction: String? = null

    @Column(name = "fraction_label")
    var fractionLabel: String? = null

    @Column(name = "plant_sample_id_fraction")
    var plantSampleIdFraction: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_dm")
    var setOfDm: String? = null
}