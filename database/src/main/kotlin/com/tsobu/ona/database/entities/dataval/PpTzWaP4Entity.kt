package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_pp_tz_wa_p4")
class PpTzWaP4Entity : BaseEntity() {
    @Column(name = "index_p4")
    var indexP4: String? = null

    @Column(name = "weed_pic_p4")
    var weedPicP4: String? = null

    @Column(name = "weed_cover_p4")
    var weedCoverP4: String? = null

    @Column(name = "cassava_height_p4")
    var cassavaHeightP4: String? = null

    @Column(name = "weeds_height_p4")
    var weedsHeightP4: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_weed_assessment_p4")
    var setOfWeedAssessmentP4: String? = null
}