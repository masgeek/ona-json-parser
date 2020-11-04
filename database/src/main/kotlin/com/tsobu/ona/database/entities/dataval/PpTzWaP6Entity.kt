package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_pp_tz_wa_p6")
class PpTzWaP6Entity : BaseEntity() {
    @Column(name = "index_p6")
    var indexP6: Int? = null

    @Column(name = "weed_pic_p6")
    var weedPicP6: String? = null

    @Column(name = "weed_cover_p6")
    var weedCoverP6: String? = null

    @Column(name = "cassava_height_p6")
    var cassavaHeightP6: String? = null

    @Column(name = "weeds_height_p6")
    var weedsHeightP6: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_weed_assessment_p6")
    var setOfWeedAssessmentP6: String? = null
}