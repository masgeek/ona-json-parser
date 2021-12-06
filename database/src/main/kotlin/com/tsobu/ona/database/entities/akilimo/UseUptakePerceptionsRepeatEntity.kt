package com.tsobu.ona.database.entities.akilimo


import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "akilimo_use_uptake_perceptions_repeat")
class UseUptakePerceptionsRepeatEntity : BaseEntity() {
    @Column(name = "repeat_nr")
    var repeatNr: String? = null

    @Column(name = "run_choice")
    var runChoice: String? = null

    @Column(name = "statement_nr")
    var statementNr: String? = null

    @Column(name = "statement")
    var statement: String? = null

    @Column(name = "response")
    var response: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_perceptions_repeat")
    var setOfPerceptionsRepeat: String? = null
}