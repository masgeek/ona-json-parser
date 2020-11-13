package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_pp_tz_wa_p2")
class PpTzWaP2Entity : BaseEntity() {
    @Column(name = "index_p2")
    var indexP2: String? = null

    @Column(name = "weed_pic_p2")
    var weedPicP2: String? = null

    @Column(name = "weed_cover_p2")
    var weedCoverP2: String? = null

    @Column(name = "cassava_height_p2")
    var cassavaHeightP2: String? = null

    @Column(name = "weeds_height_p2")
    var weedsHeightP2: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_weed_assessment_p2")
    var setOfWeedAssessmentP2: String? = null
}