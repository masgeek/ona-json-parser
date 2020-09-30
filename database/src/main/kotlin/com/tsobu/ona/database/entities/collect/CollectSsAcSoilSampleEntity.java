package com.tsobu.ona.database.entities.collect;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "collect_ss_ac_soil_sample")
public class CollectSsAcSoilSampleEntity extends com.tsobu.ona.database.entities.BaseEntity implements {

    @Column(name = "field_id")
    private String fieldId;

    @Column(name = "trial_id")
    private String trialId;

    @Column(name = "plot_id")
    private String plotId;

    @Column(name = "section_id")
    private String sectionId;

    @Column(name = "soil_sample_id")
    private String soilSampleId;

    @Column(name = "placing")
    private String placing;

    @Column(name = "depth")
    private String depth;

    @Column(name = "upper_limit")
    private String upperLimit;

    @Column(name = "lower_limit")
    private String lowerLimit;

    @Column(name = "parent_key")
    private String parentKey;

    @Column(name = "control_key")
    private String controlKey;

    @Column(name = "set_of_soil_sample")
    private String setOfSoilSample;

}
