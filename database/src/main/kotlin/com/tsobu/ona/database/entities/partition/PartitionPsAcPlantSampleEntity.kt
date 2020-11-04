package com.tsobu.ona.database.entities.partition

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "partition_ps_ac_plant_sample")
class PartitionPsAcPlantSampleEntity : BaseEntity() {
    @Column(name = "plant_sample_id")
    var plantSampleId: String? = null

    @Column(name = "plant_part")
    var plantPart: String? = null

    @Column(name = "dm_count")
    var dmCount: String? = null

    @Column(name = "set_of_dm")
    var setOfDm: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_plant_sample")
    var setOfPlantSample: String? = null
}