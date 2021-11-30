
package com.tsobu.ona.forms.register;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "end",
    "HHID",
    "_tags",
    "_uuid",
    "start",
    "today",
    "_notes",
    "accept",
    "_edited",
    "_status",
    "_version",
    "deviceid",
    "username",
    "_duration",
    "_xform_id",
    "_attachments",
    "_geolocation",
    "_media_count",
    "_total_media",
    "formhub/uuid",
    "_submitted_by",
    "Hhlocation/lga",
    "_date_modified",
    "Hhlocation/EAEN",
    "Hhlocation/EAID",
    "detailsHH/ageHH",
    "meta/instanceID",
    "Hhlocation/locHH",
    "Hhlocation/state",
    "_submission_time",
    "_xform_id_string",
    "detailsHH/HHtype",
    "_bamboo_dataset_id",
    "detailsHH/genderHH",
    "Hhlocation/geopoint",
    "_media_all_received",
    "detailsHH/phoneNrHH",
    "detailsHH/surNameHH",
    "detailsHH/relationHH",
    "detailsHH/educationHH",
    "detailsHH/firstNameHH",
    "detailsHH/occupationHH",
    "detailsHH/maritalStatusHH",
    "detailsHH/phoneNr2HH",
    "phonenumber"
})
@Generated("jsonschema2pojo")
public class SGRegisterHH {

    @JsonProperty("_id")
    public Integer id;
    @JsonProperty("end")
    public String end;
    @JsonProperty("HHID")
    public String hhid;
    @JsonProperty("_tags")
    public List<Object> tags = new ArrayList<Object>();
    @JsonProperty("_uuid")
    public String uuid;
    @JsonProperty("start")
    public String start;
    @JsonProperty("today")
    public String today;
    @JsonProperty("_notes")
    public List<Object> notes = new ArrayList<Object>();
    @JsonProperty("accept")
    public String accept;
    @JsonProperty("_edited")
    public Boolean edited;
    @JsonProperty("_status")
    public String status;
    @JsonProperty("_version")
    public String version;
    @JsonProperty("deviceid")
    public String deviceid;
    @JsonProperty("username")
    public String username;
    @JsonProperty("_duration")
    public Double duration;
    @JsonProperty("_xform_id")
    public Integer xformId;
    @JsonProperty("_attachments")
    public List<Object> attachments = new ArrayList<Object>();
    @JsonProperty("_geolocation")
    public List<Double> geolocation = new ArrayList<Double>();
    @JsonProperty("_media_count")
    public Integer mediaCount;
    @JsonProperty("_total_media")
    public Integer totalMedia;
    @JsonProperty("formhub/uuid")
    public String formhubUuid;
    @JsonProperty("_submitted_by")
    public String submittedBy;
    @JsonProperty("Hhlocation/lga")
    public String hhlocationLga;
    @JsonProperty("_date_modified")
    public String dateModified;
    @JsonProperty("Hhlocation/EAEN")
    public String hhlocationEAEN;
    @JsonProperty("Hhlocation/EAID")
    public String hhlocationEAID;
    @JsonProperty("detailsHH/ageHH")
    public Integer detailsHHAgeHH;
    @JsonProperty("meta/instanceID")
    public String metaInstanceID;
    @JsonProperty("Hhlocation/locHH")
    public String hhlocationLocHH;
    @JsonProperty("Hhlocation/state")
    public String hhlocationState;
    @JsonProperty("_submission_time")
    public String submissionTime;
    @JsonProperty("_xform_id_string")
    public String xformIdString;
    @JsonProperty("detailsHH/HHtype")
    public String detailsHHHHtype;
    @JsonProperty("_bamboo_dataset_id")
    public String bambooDatasetId;
    @JsonProperty("detailsHH/genderHH")
    public String detailsHHGenderHH;
    @JsonProperty("Hhlocation/geopoint")
    public String hhlocationGeopoint;
    @JsonProperty("_media_all_received")
    public Boolean mediaAllReceived;
    @JsonProperty("detailsHH/phoneNrHH")
    public String detailsHHPhoneNrHH;
    @JsonProperty("detailsHH/surNameHH")
    public String detailsHHSurNameHH;
    @JsonProperty("detailsHH/relationHH")
    public String detailsHHRelationHH;
    @JsonProperty("detailsHH/educationHH")
    public String detailsHHEducationHH;
    @JsonProperty("detailsHH/firstNameHH")
    public String detailsHHFirstNameHH;
    @JsonProperty("detailsHH/occupationHH")
    public String detailsHHOccupationHH;
    @JsonProperty("detailsHH/maritalStatusHH")
    public String detailsHHMaritalStatusHH;
    @JsonProperty("detailsHH/phoneNr2HH")
    public String detailsHHPhoneNr2HH;
    @JsonProperty("phonenumber")
    public String phonenumber;

}
