package com.tsobu.ona.database.entities.collect

import com.tsobu.ona.database.entities.BaseEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "collect_leaf_tags_ac_id")
class CollectLeafTagsAcIdEntity : BaseEntity() {
    @Column(name = "section_id")
    var sectionId: String? = null

    @Column(name = "plot_id")
    var plotId: String? = null

    @Column(name = "date_attached")
    var dateAttached: String? = null

    @Column(name = "date_recovered")
    var dateRecovered: String? = null

    @Column(name = "parent_key")
    var parentKey: String? = null

    @Column(name = "control_key")
    var controlKey: String? = null

    @Column(name = "set_of_id")
    var setOfId: String? = null
}