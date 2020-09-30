package com.tsobu.ona.database.entities.collect;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "collect_ss_ac")
public class CollectSsAcEntity extends com.tsobu.ona.database.entities.BaseEntity implements {

    @Column(name = "submission_date")
    private LocalDateTime submissionDate;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "today_date")
    private LocalDate todayDate;

    @Column(name = "deviceid")
    private String deviceid;

    @Column(name = "subscriberid")
    private String subscriberid;

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String username;

    @Column(name = "simserial")
    private String simserial;

    @Column(name = "phonenumber")
    private String phonenumber;

    @Column(name = "banner")
    private String banner;

    @Column(name = "intro")
    private String intro;

    @Column(name = "project")
    private String project;

    @Column(name = "country")
    private String country;

    @Column(name = "login")
    private String login;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "surname")
    private String surname;

    @Column(name = "geo_point_latitude")
    private String geoPointLatitude;

    @Column(name = "geo_point_longitude")
    private String geoPointLongitude;

    @Column(name = "geo_point_altitude")
    private String geoPointAltitude;

    @Column(name = "geo_point_accuracy")
    private String geoPointAccuracy;

    @Column(name = "entity_value")
    private String entityValue;

    @Column(name = "repeat_value")
    private String repeatValue;

    @Column(name = "set_of_soil_sample")
    private String setOfSoilSample;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name = "instance_id")
    private String instanceId;

    @Column(name = "control_key")
    private String controlKey;

}
