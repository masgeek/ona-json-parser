package com.tsobu.ona.database.entities.collect;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "collect_leaf_tags_ac_id")
public class CollectLeafTagsAcIdEntity extends com.tsobu.ona.database.entities.BaseEntity implements {

    @Column(name = "section_id")
    private String sectionId;

    @Column(name = "plot_id")
    private String plotId;

    @Column(name = "date_attached")
    private String dateAttached;

    @Column(name = "date_recovered")
    private String dateRecovered;

    @Column(name = "parent_key")
    private String parentKey;

    @Column(name = "control_key")
    private String controlKey;

    @Column(name = "set_of_id")
    private String setOfId;

}
