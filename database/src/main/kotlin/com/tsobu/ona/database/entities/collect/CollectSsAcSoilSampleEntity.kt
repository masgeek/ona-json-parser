package com.tsobu.ona.database.entities.collect

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "collect_ss_ac_soil_sample")
class CollectSsAcSoilSampleEntity : BaseEntity() {
    @Column(name = "field_id")
    var fieldId: String? = null

    @Column(name = "trial_id")
    var trialId: String? = null

    @Column(name = "plot_id")
    var plotId: String? = null

    @Column(name = "section_id")
    var sectionId: String? = null

    @Column(name = "soil_sample_id")
    var soilSampleId: String? = null

    @Column(name = "placing")
    var placing: String? = null

    @Column(name = "depth")
    var depth: String? = null

    @Column(name = "upper_limit")
    var upperLimit: String? = null

    @Column(name = "lower_limit")
    var lowerLimit: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_soil_sample")
    var setOfSoilSample: String? = null
}