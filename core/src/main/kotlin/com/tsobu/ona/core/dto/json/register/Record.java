
package com.tsobu.ona.core.dto.json.register;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SubmissionDate",
    "formhub-uuid",
    "start",
    "today",
    "deviceid",
    "subscriberid",
    "email",
    "username",
    "simserial",
    "phonenumber",
    "purpose-banner",
    "purpose-intro",
    "Hhlocation-generated_note_name_15",
    "Hhlocation-EAEN",
    "Hhlocation-EAID",
    "Hhlocation-locHH",
    "Hhlocation-state",
    "Hhlocation-lga",
    "Hhlocation-geopoint-Latitude",
    "Hhlocation-geopoint-Longitude",
    "Hhlocation-geopoint-Altitude",
    "Hhlocation-geopoint-Accuracy",
    "detailsHH-generated_note_name_24",
    "detailsHH-firstNameHH",
    "detailsHH-surNameHH",
    "detailsHH-phoneNrHH",
    "detailsHH-phoneNr2HH",
    "detailsHH-genderHH",
    "detailsHH-ageHH",
    "detailsHH-relationHH",
    "detailsHH-maritalStatusHH",
    "detailsHH-HHtype",
    "detailsHH-educationHH",
    "detailsHH-occupationHH",
    "HHID",
    "accept",
    "end",
    "meta-instanceID",
    "KEY"
})
@Generated("jsonschema2pojo")
public class Record {

    @JsonProperty("SubmissionDate")
    public String submissionDate;
    @JsonProperty("formhub-uuid")
    public String formhubUuid;
    @JsonProperty("start")
    public String start;
    @JsonProperty("today")
    public String today;
    @JsonProperty("deviceid")
    public String deviceid;
    @JsonProperty("subscriberid")
    public String subscriberid;
    @JsonProperty("email")
    public String email;
    @JsonProperty("username")
    public String username;
    @JsonProperty("simserial")
    public String simserial;
    @JsonProperty("phonenumber")
    public String phonenumber;
    @JsonProperty("purpose-banner")
    public String purposeBanner;
    @JsonProperty("purpose-intro")
    public String purposeIntro;
    @JsonProperty("Hhlocation-generated_note_name_15")
    public String hhlocationGeneratedNoteName15;
    @JsonProperty("Hhlocation-EAEN")
    public String hhlocationEAEN;
    @JsonProperty("Hhlocation-EAID")
    public String hhlocationEAID;
    @JsonProperty("Hhlocation-locHH")
    public String hhlocationLocHH;
    @JsonProperty("Hhlocation-state")
    public String hhlocationState;
    @JsonProperty("Hhlocation-lga")
    public String hhlocationLga;
    @JsonProperty("Hhlocation-geopoint-Latitude")
    public String hhlocationGeopointLatitude;
    @JsonProperty("Hhlocation-geopoint-Longitude")
    public String hhlocationGeopointLongitude;
    @JsonProperty("Hhlocation-geopoint-Altitude")
    public String hhlocationGeopointAltitude;
    @JsonProperty("Hhlocation-geopoint-Accuracy")
    public String hhlocationGeopointAccuracy;
    @JsonProperty("detailsHH-generated_note_name_24")
    public String detailsHHGeneratedNoteName24;
    @JsonProperty("detailsHH-firstNameHH")
    public String detailsHHFirstNameHH;
    @JsonProperty("detailsHH-surNameHH")
    public String detailsHHSurNameHH;
    @JsonProperty("detailsHH-phoneNrHH")
    public String detailsHHPhoneNrHH;
    @JsonProperty("detailsHH-phoneNr2HH")
    public String detailsHHPhoneNr2HH;
    @JsonProperty("detailsHH-genderHH")
    public String detailsHHGenderHH;
    @JsonProperty("detailsHH-ageHH")
    public String detailsHHAgeHH;
    @JsonProperty("detailsHH-relationHH")
    public String detailsHHRelationHH;
    @JsonProperty("detailsHH-maritalStatusHH")
    public String detailsHHMaritalStatusHH;
    @JsonProperty("detailsHH-HHtype")
    public String detailsHHHHtype;
    @JsonProperty("detailsHH-educationHH")
    public String detailsHHEducationHH;
    @JsonProperty("detailsHH-occupationHH")
    public String detailsHHOccupationHH;
    @JsonProperty("HHID")
    public String hhid;
    @JsonProperty("accept")
    public String accept;
    @JsonProperty("end")
    public String end;
    @JsonProperty("meta-instanceID")
    public String metaInstanceID;
    @JsonProperty("KEY")
    public String key;

}
