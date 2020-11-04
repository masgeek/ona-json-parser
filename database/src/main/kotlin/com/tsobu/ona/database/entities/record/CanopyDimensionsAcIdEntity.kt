package com.tsobu.ona.database.entities.record

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "record_canopy_dimensions_ac_id")
class CanopyDimensionsAcIdEntity : BaseEntity() {
    @Column(name = "nr_measurements")
    var nrMeasurements: String? = null

    @Column(name = "section_id")
    var sectionId: String? = null

    @Column(name = "plot_id")
    var plotId: String? = null

    @Column(name = "cd_count")
    var cdCount: String? = null

    @Column(name = "set_of_cd")
    var setOfCd: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_id")
    var setOfId: String? = null
}