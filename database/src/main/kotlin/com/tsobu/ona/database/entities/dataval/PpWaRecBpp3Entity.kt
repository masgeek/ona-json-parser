package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_pp_wa_rec_bpp3")
class PpWaRecBpp3Entity : BaseEntity() {
    @Column(name = "index_rec_bpp3")
    var indexRecBpp3: String? = null

    @Column(name = "weed_cover_rec_bpp3")
    var weedCoverRecBpp3: String? = null

    @Column(name = "cassava_height_rec_bpp3")
    var cassavaHeightRecBpp3: String? = null

    @Column(name = "weeds_height_rec_bpp3")
    var weedsHeightRecBpp3: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_weed_assessment_rec_bpp3")
    var setOfWeedAssessmentRecBpp3: String? = null
}