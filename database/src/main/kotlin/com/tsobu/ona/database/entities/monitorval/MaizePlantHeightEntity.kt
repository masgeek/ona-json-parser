package com.tsobu.ona.database.entities.monitorval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "monitor_val_maize_plant_height")
class MaizePlantHeightEntity : BaseEntity() {
    @Column(name = "plant_height_plot")
    var plantHeightPlot: String? = null

    @Column(name = "plant_height_plot_label")
    var plantHeightPlotLabel: String? = null

    @Column(name = "ph_count")
    var phCount: String? = null

    @Column(name = "set_of_ph")
    var setOfPh: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_maize_plant_height")
    var setOfMaizePlantHeight: String? = null
}