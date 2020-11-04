package com.tsobu.ona.database.entities.monitorval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "monitor_val_problem_plot_some")
@Entity
class ProblemPlotSomeEntity : BaseEntity() {
    @Column(name = "problem_plot")
    var problemPlot: String? = null

    @Column(name = "problem_plot_label")
    var problemPlotLabel: String? = null

    @Column(name = "rate_incidence_some")
    var rateIncidenceSome: String? = null

    @Column(name = "rate_severity_some")
    var rateSeveritySome: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_problem_plot_some")
    var setOfProblemPlotSome: String? = null
}