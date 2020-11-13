package com.tsobu.ona.database.entities.record

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "record_dm_ps_ac_plant_sample")
class RecordDmPsAcPlantSampleEntity : BaseEntity() {
    @Column(name = "plant_sample_id")
    var plantSampleId: String? = null

    @Column(name = "plant_dw")
    var plantDw: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_plant_sample")
    var setOfPlantSample: String? = null
}