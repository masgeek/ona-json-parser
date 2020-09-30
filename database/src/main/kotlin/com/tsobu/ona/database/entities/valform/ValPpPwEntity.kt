package com.tsobu.ona.database.entities.valform

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_pp_pw")
class ValPpPwEntity : BaseEntity() {
    @Column(name = "problem_weed")
    var problemWeed: String? = null

    @Column(name = "problem_weed_label")
    var problemWeedLabel: String? = null

    @Column(name = "problem_weed_pic")
    var problemWeedPic: String? = null

    @Column(name = "problem_weed_note")
    var problemWeedNote: String? = null

    @Column(name = "problem_weed_cover")
    var problemWeedCover: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_pw")
    var setOfPw: String? = null
}