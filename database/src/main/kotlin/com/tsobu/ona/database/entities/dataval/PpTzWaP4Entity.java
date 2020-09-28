package com.tsobu.ona.database.entities.dataval;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dataval_pp_tz_wa_p4")
@Data
@EqualsAndHashCode(callSuper = true)
public class PpTzWaP4Entity extends com.tsobu.ona.database.entities.BaseEntity implements {

    @Column(name = "index_p4")
    private Integer indexP4;

    @Column(name = "weed_pic_p4")
    private String weedPicP4;

    @Column(name = "weed_cover_p4")
    private String weedCoverP4;

    @Column(name = "cassava_height_p4")
    private String cassavaHeightP4;

    @Column(name = "weeds_height_p4")
    private String weedsHeightP4;

    @Column(name = "parent_key")
    private String parentKey;

    @Column(name = "control_key")
    private String controlKey;

    @Column(name = "set_of_weed_assessment_p4")
    private String setOfWeedAssessmentP4;

}
