package com.tsobu.ona.database.entities.assign;

import com.tsobu.ona.database.entities.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name = "register_pc")
@EqualsAndHashCode(callSuper = true)
public class RegisterPcEntity extends BaseEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "submission_date")
    private Date submissionDate;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "today_date")
    private LocalDate todayDate;

    @Column(name = "device_id")
    private String deviceId;

    @Column(name = "subscriber_id")
    private String subscriberId;

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String username;

    @Column(name = "simserial")
    private String simserial;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "banner")
    private String banner;

    @Column(name = "intro")
    private String intro;

    @Column(name = "aim")
    private String aim;

    @Column(name = "project_full")
    private String projectFull;

    @Column(name = "project_abbr")
    private String projectAbbr;

    @Column(name = "project_code")
    private String projectCode;

    @Column(name = "project_exist")
    private String projectExist;

    @Column(name = "project_exist_note")
    private String projectExistNote;

    @Column(name = "project_code_exist")
    private String projectCodeExist;

    @Column(name = "project_code_exist_note")
    private String projectCodeExistNote;

    @Column(name = "project")
    private String project;

    @Column(name = "country")
    private String country;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "instance_id")
    private String instanceId;

    @Column(name = "control_key")
    private String controlKey;

}
