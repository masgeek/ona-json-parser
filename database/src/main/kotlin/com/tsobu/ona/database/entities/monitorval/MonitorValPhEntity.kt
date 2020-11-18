package com.tsobu.ona.database.entities.monitorval

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "monitor_val_ph")
class MonitorValPhEntity : BaseEntity() {
    @Column(name = "plant_nr")
    var plantNr: String? = null

    @Column(name = "height")
    var height: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_ph")
    var setOfPh: String? = null
}