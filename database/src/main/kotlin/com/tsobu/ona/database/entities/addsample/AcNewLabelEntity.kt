package com.tsobu.ona.database.entities.addsample

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "add_sample_label_ac_new_label")
class AcNewLabelEntity : BaseEntity() {
    @Column(name = "plant_sample_id_add")
    var plantSampleIdAdd: String? = null

    @Column(name = "soil_sample_id_add")
    var soilSampleIdAdd: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_new_label")
    var setOfNewLabel: String? = null
}