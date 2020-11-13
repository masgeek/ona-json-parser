package com.tsobu.ona.database.entities.replace

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "replace_po_ac_replace_label")
class ReplacePoAcReplaceLabelEntity : BaseEntity() {
    @Column(name = "plant_label")
    var plantLabel: String? = null

    @Column(name = "plant_id")
    var plantId: String? = null

    @Column(name = "section_label")
    var sectionLabel: String? = null

    @Column(name = "section_id")
    var sectionId: String? = null

    @Column(name = "trial_id")
    var trialId: String? = null

    @Column(name = "trial_code")
    var trialCode: String? = null

    @Column(name = "treats")
    var treats: String? = null

    @Column(name = "plot_id")
    var plotId: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_replace_label")
    var setOfReplaceLabel: String? = null
}