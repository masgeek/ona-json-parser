package com.tsobu.ona.database.entities.monitor

import com.tsobu.ona.database.entities.BaseEntity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "non_destructive_cassava_ac_id")
class NonDestructiveCassAcIdEntity : BaseEntity() {
    @Column(name = "nr_measurements")
    var nrMeasurements: String? = null

    @Column(name = "section_id")
    var sectionId: String? = null

    @Column(name = "plot_id")
    var plotId: String? = null

    @Column(name = "ndm_count")
    var ndmCount: String? = null

    @Column(name = "set_of_ndm")
    var setOfNdm: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_id")
    var setOfId: String? = null
}