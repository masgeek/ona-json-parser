package com.tsobu.ona.database.entities.collect;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "collect_ps_ac_plant_sample")
public class CollectPsAcPlantSampleEntity extends com.tsobu.ona.database.entities.BaseEntity implements {

    @Column(name = "plot_id")
    private String plotId;

    @Column(name = "section_id")
    private String sectionId;

    @Column(name = "plant_id")
    private String plantId;

    @Column(name = "plant_sample_id")
    private String plantSampleId;

    @Column(name = "plant_part")
    private String plantPart;

    @Column(name = "plant_fw")
    private String plantFw;

    @Column(name = "parent_key")
    private String parentKey;

    @Column(name = "control_key")
    private String controlKey;

    @Column(name = "set_of_plant_sample")
    private String setOfPlantSample;

}
