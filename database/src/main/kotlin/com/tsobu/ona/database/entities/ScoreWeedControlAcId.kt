package com.tsobu.ona.database.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "score_weed_control_ac_id")
class ScoreWeedControlAcId : BaseEntity() {

    var sectionId: String? = null
    var plotId: String? = null

    @Column(name = "nr_days_last_weeded", columnDefinition = "decimal", precision = 10, scale = 6)
    var daysLastWeeded: Double? = null

    @Column(name = "score_weeding_eff", columnDefinition = "decimal", precision = 10, scale = 6)
    var scoreWeedingEff: Double? = null

    @Column(name = "score_crop_injury", columnDefinition = "decimal", precision = 10, scale = 6)
    var scoreCropInjury: Double? = null

    @Column(name = "wd_count", columnDefinition = "decimal", precision = 10, scale = 6)
    var weedcount: Double? = null

    var setOfWd: String? = null
    var parentKey: String? = null
    var controlKey: String? = null
    var setOfId: String? = null
}