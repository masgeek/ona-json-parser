package com.tsobu.ona.database.entities.collect

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "collect_ps_ac_plant_sample")
class CollectPsAcPlantSampleEntity : BaseEntity() {
    @Column(name = "plot_id")
    var plotId: String? = null

    @Column(name = "section_id")
    var sectionId: String? = null

    @Column(name = "plant_id")
    var plantId: String? = null

    @Column(name = "plant_sample_id")
    var plantSampleId: String? = null

    @Column(name = "plant_part")
    var plantPart: String? = null

    @Column(name = "plant_fw")
    var plantFw: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_plant_sample")
    var setOfPlantSample: String? = null
}