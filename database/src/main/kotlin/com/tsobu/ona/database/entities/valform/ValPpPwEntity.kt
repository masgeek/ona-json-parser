package com.tsobu.ona.database.entities.valform

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "val_pp_pw")
class ValPpPwEntity : BaseEntity() {
    @Column(name = "problem_weed")
    private val problemWeed: String? = null

    @Column(name = "problem_weed_label")
    private val problemWeedLabel: String? = null

    @Column(name = "problem_weed_pic")
    private val problemWeedPic: String? = null

    @Column(name = "problem_weed_note")
    private val problemWeedNote: String? = null

    @Column(name = "problem_weed_cover")
    private val problemWeedCover: String? = null

    @Column(name = "parent_key")
    private val parentKey: String? = null

    @Column(name = "control_key")
    private val controlKey: String? = null

    @Column(name = "set_of_pw")
    private val setOfPw: String? = null
}