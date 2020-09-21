package com.tsobu.ona.database.entities.scoreweedcontrol

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "score_weed_control_ac_wd")
class WdEntity : BaseEntity() {
    var imageLeafArea: String? = null
    var parentKey: String? = null
    var controlKey: String? = null
    var setOfWd: String? = null
}