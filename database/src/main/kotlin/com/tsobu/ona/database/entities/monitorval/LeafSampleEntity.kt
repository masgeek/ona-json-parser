package com.tsobu.ona.database.entities.monitorval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "monitor_val_leaf_sample")
class LeafSampleEntity : BaseEntity() {
    @Column(name = "leaf_sample_plot")
    var leafSamplePlot: String? = null

    @Column(name = "leaf_sample_plot_label")
    var leafSamplePlotLabel: String? = null

    @Column(name = "plant_sample_id")
    var plantSampleId: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_leaf_sample")
    var setOfLeafSample: String? = null
}