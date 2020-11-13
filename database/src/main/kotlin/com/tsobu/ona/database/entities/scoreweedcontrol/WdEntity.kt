package com.tsobu.ona.database.entities.scoreweedcontrol

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "score_weed_control_ac_wd")
class WdEntity : BaseEntity() {

    @Column(name = "image_leaf_area")
    var imageLeafArea: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_wd")
    var setOfWd: String? = null
}