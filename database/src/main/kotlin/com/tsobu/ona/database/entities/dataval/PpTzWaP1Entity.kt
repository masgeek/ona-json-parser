package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_pp_tz_wa_p1")
class PpTzWaP1Entity : BaseEntity() {
    @Column(name = "index_p1")
    var indexP1: String? = null

    @Column(name = "weed_pic_p1")
    var weedPicP1: String? = null

    @Column(name = "weed_cover_p1")
    var weedCoverP1: String? = null

    @Column(name = "cassava_height_p1")
    var cassavaHeightP1: String? = null

    @Column(name = "weeds_height_p1")
    var weedsHeightP1: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_weed_assessment_p1")
    var setOfWeedAssessmentP1: String? = null
}