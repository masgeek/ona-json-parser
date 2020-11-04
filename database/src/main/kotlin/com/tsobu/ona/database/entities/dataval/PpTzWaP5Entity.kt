package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_pp_tz_wa_p5")
class PpTzWaP5Entity : BaseEntity() {
    @Column(name = "index_p5")
    var indexP5: Int? = null

    @Column(name = "weed_pic_p5")
    var weedPicP5: String? = null

    @Column(name = "weed_cover_p5")
    var weedCoverP5: String? = null

    @Column(name = "cassava_height_p5")
    var cassavaHeightP5: String? = null

    @Column(name = "weeds_height_p5")
    var weedsHeightP5: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_weed_assessment_p5")
    var setOfWeedAssessmentP5: String? = null
}