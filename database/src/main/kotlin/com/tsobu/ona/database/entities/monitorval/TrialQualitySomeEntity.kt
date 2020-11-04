package com.tsobu.ona.database.entities.monitorval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "monitor_val_trial_quality_some")
class TrialQualitySomeEntity : BaseEntity() {
    @Column(name = "trial_quality_plot")
    var trialQualityPlot: String? = null

    @Column(name = "trial_quality_plot_label")
    var trialQualityPlotLabel: String? = null

    @Column(name = "trial_quality_incidence_some")
    var trialQualityIncidenceSome: String? = null

    @Column(name = "trial_quality_severity_some")
    var trialQualitySeveritySome: String? = null

    @Column(name = "trial_quality_score_some")
    var trialQualityScoreSome: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_trial_quality_some")
    var setOfTrialQualitySome: String? = null
}