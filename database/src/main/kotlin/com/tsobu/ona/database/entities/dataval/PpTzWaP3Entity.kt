package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_pp_tz_wa_p3")
class PpTzWaP3Entity : BaseEntity() {
    @Column(name = "index_p3")
    var indexP3: String? = null

    @Column(name = "weed_pic_p3")
    var weedPicP3: String? = null

    @Column(name = "weed_cover_p3")
    var weedCoverP3: String? = null

    @Column(name = "cassava_height_p3")
    var cassavaHeightP3: String? = null

    @Column(name = "weeds_height_p3")
    var weedsHeightP3: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_weed_assessment_p3")
    var setOfWeedAssessmentP3: String? = null
}