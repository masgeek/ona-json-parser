package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_pp_wa_con")
class PpWaConEntity : BaseEntity() {
    @Column(name = "index_con")
    var indexCon: String? = null

    @Column(name = "weed_cover_con")
    var weedCoverCon: String? = null

    @Column(name = "cassava_height_con")
    var cassavaHeightCon: String? = null

    @Column(name = "weeds_height_con")
    var weedsHeightCon: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_weed_assessment_con")
    var setOfWeedAssessmentCon: String? = null
}