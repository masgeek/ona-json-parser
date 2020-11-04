package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_pp_wa_con_bpp3")
class PpWaConBpp3Entity : BaseEntity() {
    @Column(name = "index_con_bpp3")
    var indexConBpp3: String? = null

    @Column(name = "weed_cover_con_bpp3")
    var weedCoverConBpp3: String? = null

    @Column(name = "cassava_height_con_bpp3")
    var cassavaHeightConBpp3: String? = null

    @Column(name = "weeds_height_con_bpp3")
    var weedsHeightConBpp3: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_weed_assessment_con_bpp3")
    var setOfWeedAssessmentConBpp3: String? = null
}