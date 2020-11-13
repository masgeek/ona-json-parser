package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_pp_wa_alt_bpp3")
class PpWaAltBpp3Entity : BaseEntity() {
    @Column(name = "index_alt_bpp3")
    var indexAltBpp3: String? = null

    @Column(name = "weed_cover_alt_bpp3")
    var weedCoverAltBpp3: String? = null

    @Column(name = "cassava_height_alt_bpp3")
    var cassavaHeightAltBpp3: String? = null

    @Column(name = "weeds_height_alt_bpp3")
    var weedsHeightAltBpp3: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_weed_assessment_alt_bpp3")
    var setOfWeedAssessmentAltBpp3: String? = null
}