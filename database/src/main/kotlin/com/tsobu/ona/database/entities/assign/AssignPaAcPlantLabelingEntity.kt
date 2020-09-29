package com.tsobu.ona.database.entities.assign

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "assign_pa_ac_plant_labeling")
class AssignPaAcPlantLabelingEntity : BaseEntity() {
    @Column(name = "plant_id")
    var plantId: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_plant_labeling")
    var setOfPlantLabeling: String? = null
}