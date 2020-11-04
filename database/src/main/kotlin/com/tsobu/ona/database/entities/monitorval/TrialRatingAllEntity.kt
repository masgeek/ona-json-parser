package com.tsobu.ona.database.entities.monitorval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "monitor_val_trial_rating_all")
class TrialRatingAllEntity : BaseEntity() {
    @Column(name = "problem_all")
    var problemAll: String? = null

    @Column(name = "problem_label_all")
    var problemLabelAll: String? = null

    @Column(name = "rate_incidence_all")
    var rateIncidenceAll: String? = null

    @Column(name = "rate_severity_all")
    var rateSeverityAll: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_trial_rating_all")
    var setOfTrialRatingAll: String? = null
}