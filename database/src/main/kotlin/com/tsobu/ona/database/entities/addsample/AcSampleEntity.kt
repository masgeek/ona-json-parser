package com.tsobu.ona.database.entities.addsample

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "add_sample_label_ac_sample")
class AcSampleEntity : BaseEntity() {
    @Column(name = "nr_labels")
    var nrLabels: String? = null

    @Column(name = "plant_sample_id")
    var plantSampleId: String? = null

    @Column(name = "soil_sample_id")
    var soilSampleId: String? = null

    @Column(name = "new_label_count")
    var newLabelCount: String? = null

    @Column(name = "set_of_new_label")
    var setOfNewLabel: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_sample")
    var setOfSample: String? = null
}