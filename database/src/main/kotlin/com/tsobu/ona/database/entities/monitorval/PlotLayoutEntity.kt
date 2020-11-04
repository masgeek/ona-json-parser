package com.tsobu.ona.database.entities.monitorval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "monitor_val_plot_layout")
class PlotLayoutEntity : BaseEntity() {
    @Column(name = "plot_dim_plot")
    var plotDimPlot: String? = null

    @Column(name = "plot_dim_plot_label")
    var plotDimPlotLabel: String? = null

    @Column(name = "plot_dim")
    var plotDim: String? = null

    @Column(name = "plot_l1")
    var plotL1: String? = null

    @Column(name = "plot_w1")
    var plotW1: String? = null

    @Column(name = "plot_l2")
    var plotL2: String? = null

    @Column(name = "plot_w2")
    var plotW2: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_plot_layout")
    var setOfPlotLayout: String? = null
}