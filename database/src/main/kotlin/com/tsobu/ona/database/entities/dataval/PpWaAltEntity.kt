package com.tsobu.ona.database.entities.dataval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "dataval_pp_wa_alt")
class PpWaAltEntity : BaseEntity() {
    @Column(name = "index_alt")
    private val indexAlt: String? = null

    @Column(name = "weed_cover_alt")
    private val weedCoverAlt: String? = null

    @Column(name = "cassava_height_alt")
    private val cassavaHeightAlt: String? = null

    @Column(name = "weeds_height_alt")
    private val weedsHeightAlt: String? = null

    @Column(name = "parent_key")
    private val parentKey: String? = null

    @Column(name = "control_key")
    private val controlKey: String? = null

    @Column(name = "set_of_weed_assessment_alt")
    private val setOfWeedAssessmentAlt: String? = null
}