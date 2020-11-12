package com.tsobu.ona.database.entities.scoreweedcontrol

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "score_weed_control_ac_id")
class AcIdEntity : BaseEntity() {

    @Column(name = "section_id")
    var sectionId: String? = null

    @Column(name = "plot_id")
    var plotId: String? = null

    @Column(name = "nr_days_last_weeded")
    var nrDaysLastWeeded: Double? = null

    @Column(name = "score_weeding_eff")
    var scoreWeedingEff: Double? = null

    @Column(name = "score_crop_injury")
    var scoreCropInjury: Double? = null

    @Column(name = "wd_count")
    var wdCount: Double? = null

    @Column(name = "set_of_wd")
    var setOfWd: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_id")
    var setOfId: String? = null
}