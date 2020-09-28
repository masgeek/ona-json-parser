package com.tsobu.ona.database.entities.dataval;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "dataval_pp_tz_wa_p3")
public class PpTzWaP3Entity extends com.tsobu.ona.database.entities.BaseEntity implements {

    @Column(name = "index_p3")
    private Integer indexP3;

    @Column(name = "weed_pic_p3")
    private String weedPicP3;

    @Column(name = "weed_cover_p3")
    private String weedCoverP3;

    @Column(name = "cassava_height_p3")
    private String cassavaHeightP3;

    @Column(name = "weeds_height_p3")
    private String weedsHeightP3;

    @Column(name = "parent_key")
    private String parentKey;

    @Column(name = "control_key")
    private String controlKey;

    @Column(name = "set_of_weed_assessment_p3")
    private String setOfWeedAssessmentP3;

}
