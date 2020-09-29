package com.tsobu.ona.database.entities.monitorval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "monitor_val_install_correct_details")
@Entity
class InstallCorrectDetailsEntity : BaseEntity() {
    @Column(name = "plot")
   var plot: String? = null

    @Column(name = "plot_label")
   var plotLabel: String? = null

    @Column(name = "correct")
   var correct: String? = null

    @Column(name = "correct_text")
   var correctText: String? = null

    @Column(name = "parent_key")
   var parentKey: String? = null

    @Column(name = "control_key")
   var controlKey: String? = null

    @Column(name = "set_of_install_correct_details")
   var setOfInstallCorrectDetails: String? = null
}