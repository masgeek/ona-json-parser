package com.tsobu.ona.database.entities.assign

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "assign_fd_tl_po_trial")
class AssignFdTlPoTrialEntity : BaseEntity() {
    @Column(name = "block_nr")
    var blockNr: String? = null

    @Column(name = "tl_name_new")
    var tlNameNew: String? = null

    @Column(name = "tl_name_new_note")
    var tlNameNewNote: String? = null

    @Column(name = "tl_id2_new")
    var tlId2New: String? = null

    @Column(name = "tl_id_note")
    var tlIdNote: String? = null

    @Column(name = "tl_id")
    var tlId: String? = null

    @Column(name = "tl_id2")
    var tlId2: String? = null

    @Column(name = "tl_layout_note")
    var tlLayoutNote: String? = null

    @Column(name = "tl_layout")
    var tlLayout: String? = null

    @Column(name = "plot_count")
    var plotCount: String? = null

    @Column(name = "set_of_plot")
    var setOfPlot: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_trial")
    var setOfTrial: String? = null
}