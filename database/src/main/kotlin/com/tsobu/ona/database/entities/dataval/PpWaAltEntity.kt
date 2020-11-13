package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_pp_wa_alt")
class PpWaAltEntity : BaseEntity() {
    @Column(name = "index_alt")
    var indexAlt: String? = null

    @Column(name = "weed_cover_alt")
    var weedCoverAlt: String? = null

    @Column(name = "cassava_height_alt")
    var cassavaHeightAlt: String? = null

    @Column(name = "weeds_height_alt")
    var weedsHeightAlt: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_weed_assessment_alt")
    var setOfWeedAssessmentAlt: String? = null
}