package com.tsobu.ona.database.entities.monitorval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "monitor_val_trial_rating_some")
class TrialRatingSomeEntity : BaseEntity() {
    @Column(name = "problem_some")
    var problemSome: String? = null

    @Column(name = "problem_label_some")
    var problemLabelSome: String? = null

    @Column(name = "problem_plot_some_count")
    var problemPlotSomeCount: String? = null

    @Column(name = "set_of_problem_plot_some")
    var setOfProblemPlotSome: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_trial_rating_some")
    var setOfTrialRatingSome: String? = null
}