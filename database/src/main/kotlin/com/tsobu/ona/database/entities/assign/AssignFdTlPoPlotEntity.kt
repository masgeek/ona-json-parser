package com.tsobu.ona.database.entities.assign

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "assign_fd_tl_po_plot")
class AssignFdTlPoPlotEntity : BaseEntity() {
    @Column(name = "treat_nr")
    var treatNr: String? = null

    @Column(name = "exp_code_treat_nr")
    var expCodeTreatNr: String? = null

    @Column(name = "treat_code_label")
    var treatCodeLabel: String? = null

    @Column(name = "treat_code")
    var treatCode: String? = null

    @Column(name = "treat_name")
    var treatName: String? = null

    @Column(name = "coord_note")
    var coordNote: String? = null

    @Column(name = "x")
    var x: String? = null

    @Column(name = "y")
    var y: String? = null

    @Column(name = "po_id")
    var poId: String? = null

    @Column(name = "po_id2_new")
    var poId2New: String? = null

    @Column(name = "plot_name")
    var plotName: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_plot")
    var setOfPlot: String? = null
}