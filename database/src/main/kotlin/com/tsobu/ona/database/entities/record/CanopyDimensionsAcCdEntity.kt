package com.tsobu.ona.database.entities.record

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "record_canopy_dimensions_ac_cd")
class CanopyDimensionsAcCdEntity : BaseEntity() {
    @Column(name = "plant_id")
    var plantId: String? = null

    @Column(name = "generated_table_list_label_30")
    var generatedTableListLabel30: String? = null

    @Column(name = "canopy_width")
    var canopyWidth: String? = null

    @Column(name = "canopy_length")
    var canopyLength: String? = null

    @Column(name = "canopy_thickness")
    var canopyThickness: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_cd")
    var setOfCd: String? = null
}