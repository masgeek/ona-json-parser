package com.tsobu.ona.database.entities.dataval;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dataval_pp_tz_wa_p5")
@Data
@EqualsAndHashCode(callSuper = true)
public class PpTzWaP5Entity extends com.tsobu.ona.database.entities.BaseEntity implements {

    @Column(name = "index_p5")
    private Integer indexP5;

    @Column(name = "weed_pic_p5")
    private String weedPicP5;

    @Column(name = "weed_cover_p5")
    private String weedCoverP5;

    @Column(name = "cassava_height_p5")
    private String cassavaHeightP5;

    @Column(name = "weeds_height_p5")
    private String weedsHeightP5;

    @Column(name = "parent_key")
    private String parentKey;

    @Column(name = "control_key")
    private String controlKey;

    @Column(name = "set_of_weed_assessment_p5")
    private String setOfWeedAssessmentP5;

}
