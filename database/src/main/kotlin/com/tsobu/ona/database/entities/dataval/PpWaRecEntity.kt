package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_pp_wa_rec")
class PpWaRecEntity : BaseEntity() {
    @Column(name = "index_rec")
    var indexRec: String? = null

    @Column(name = "weed_cover_rec")
    var weedCoverRec: String? = null

    @Column(name = "cassava_height_rec")
    var cassavaHeightRec: String? = null

    @Column(name = "weeds_height_rec")
    var weedsHeightRec: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_weed_assessment_rec")
    var setOfWeedAssessmentRec: String? = null
}