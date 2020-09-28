package com.tsobu.ona.database.entities.dataval;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "dataval_pp_tz_wa_p2")
public class PpTzWaP2Entity extends com.tsobu.ona.database.entities.BaseEntity implements {

    @Column(name = "index_p2")
    private Integer indexP2;

    @Column(name = "weed_pic_p2")
    private String weedPicP2;

    @Column(name = "weed_cover_p2")
    private String weedCoverP2;

    @Column(name = "cassava_height_p2")
    private String cassavaHeightP2;

    @Column(name = "weeds_height_p2")
    private String weedsHeightP2;

    @Column(name = "parent_key")
    private String parentKey;

    @Column(name = "control_key")
    private String controlKey;

    @Column(name = "set_of_weed_assessment_p2")
    private String setOfWeedAssessmentP2;

}
