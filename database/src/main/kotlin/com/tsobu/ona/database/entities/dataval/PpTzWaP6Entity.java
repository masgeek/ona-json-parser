package com.tsobu.ona.database.entities.dataval;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dataval_pp_tz_wa_p6")
@Data
@EqualsAndHashCode(callSuper = true)
public class PpTzWaP6Entity extends com.tsobu.ona.database.entities.BaseEntity implements {

    @Column(name = "index_p6")
    private Integer indexP6;

    @Column(name = "weed_pic_p6")
    private String weedPicP6;

    @Column(name = "weed_cover_p6")
    private String weedCoverP6;

    @Column(name = "cassava_height_p6")
    private String cassavaHeightP6;

    @Column(name = "weeds_height_p6")
    private String weedsHeightP6;

    @Column(name = "parent_key")
    private String parentKey;

    @Column(name = "control_key")
    private String controlKey;

    @Column(name = "set_of_weed_assessment_p6")
    private String setOfWeedAssessmentP6;

}
