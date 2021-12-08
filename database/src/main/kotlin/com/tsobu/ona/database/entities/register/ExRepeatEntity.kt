package com.tsobu.ona.database.entities.register

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "register_ex_treatment_repeat")
class ExRepeatEntity : BaseEntity() {
    @Column(name = "treat_nr")
    var treatNr: String? = null

    @Column(name = "treat_nr_note")
    var treatNrNote: String? = null

    @Column(name = "treat_code_label")
    var treatCodeLabel: String? = null

    @Column(name = "treat_name")
    var treatName: String? = null

    @Column(name = "treat_code")
    var treatCode: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_treatment_repeat")
    var setOfTreatmentRepeat: String? = null
}