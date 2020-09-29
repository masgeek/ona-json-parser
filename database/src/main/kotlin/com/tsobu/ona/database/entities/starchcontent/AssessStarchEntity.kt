package com.tsobu.ona.database.entities.starchcontent

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "assess_starch_content_ac_assess_starch")
class AssessStarchEntity : BaseEntity() {
    @Column(name = "plot_id")
    var plotId: String? = null

    @Column(name = "section_id")
    var sectionId: String? = null

    @Column(name = "plant_id")
    var plantId: String? = null

    @Column(name = "generated_table_list_label_37")
    var generatedTableListLabel37: String? = null

    @Column(name = "air_fw")
    var airFw: String? = null

    @Column(name = "water_fw")
    var waterFw: String? = null

    @Column(name = "spec_grav")
    var specGrav: String? = null

    @Column(name = "star_cont")
    var starCont: String? = null

    @Column(name = "star_cont_class")
    var starContClass: String? = null

    @Column(name = "star_cont_note")
    var starContNote: String? = null

    @Column(name = "star_cont_error")
    var starContError: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_assess_starch")
    var setOfAssessStarch: String? = null
}