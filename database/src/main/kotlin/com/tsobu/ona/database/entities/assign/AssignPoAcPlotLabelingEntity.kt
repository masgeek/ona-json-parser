package com.tsobu.ona.database.entities.assign

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "assign_po_ac_plot_labeling")
class AssignPoAcPlotLabelingEntity : BaseEntity() {
    @Column(name = "treat_code")
    var treatCode: String? = null

    @Column(name = "treat_code_label")
    var treatCodeLabel: String? = null

    @Column(name = "treat_nr")
    var treatNr: String? = null

    @Column(name = "plot_id")
    var plotId: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_plot_labeling")
    var setOfPlotLabeling: String? = null
}