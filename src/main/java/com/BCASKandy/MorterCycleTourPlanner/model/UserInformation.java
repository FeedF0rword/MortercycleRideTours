package com.BCASKandy.MorterCycleTourPlanner.model;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;


@Embeddable
public class UserInformation {
    /**
     * Defines the User Information of users
     * Defines the attributes
     * <ul>
     *     <li>FirstName<li/>
     *     <li>Surname<li/>
     *     <li>Address <i>This is an Embedded Class</i> <li/>
     *     <li>Insurance <i>This is an Embedded Class</i><li/>
     *     <li>Medical Information <i>This is an Embedded Class</i><li/>
     *     <li>Emergency Contact FirstName<li/>
     *     <li>Emergency Contact Surname<li/>
     *     <li>Emergency Contact Address <i>This is an Embedded Class</i></li>
     *     <li>Emergency Contact Relationship to the user</li>
     *
     * <ul/>
     * <p>
     *     And getters and setter for each of these attributes.<br>
     *     <br>
     *     toString method returns the User Information as a string value
     * <p/>
     *
     * <p>
     *     AttributeOverrides are used to override the attributes names so that they are unique.
     *     This is done because the Address is shared by user and the emergency Contact
     *
     * <p/>
     */


    private String firstname="";

    private String surname="";

    private Address address = new Address();

    private Insurance insurance = new Insurance();

    private String medicalMd="";

    private String emergencyContactFirstName="";

    private String emergencyContactSurname="";

    private String emergencyContactRelationship="";

    private Address emergencyContactAddress = new Address();


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    //Getting and setting Address
    // This Refers to model/Address Class
    @Embedded
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    //Getting and setting Insurance Information
    // This Refers to model/Insurance Class
    @Embedded
    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String getMedicalMd() {
        return medicalMd;
    }

    public void setMedicalMd(String medicalMd) {
        this.medicalMd = medicalMd;
    }
    //Getting and setting EmergencyContact Information
    public String getEmergencyContactFirstName() {
        return emergencyContactFirstName;
    }

    public void setEmergencyContactFirstName(String emergencyContactFirstName) {
        this.emergencyContactFirstName = emergencyContactFirstName;
    }

    public String getEmergencyContactSurname() {
        return emergencyContactSurname;
    }

    public void setEmergencyContactSurname(String emergencyContactSurname) {
        this.emergencyContactSurname = emergencyContactSurname;
    }

    public String getEmergencyContactRelationship() {
        return emergencyContactRelationship;
    }

    public void setEmergencyContactRelationship(String emergencyContactRelationship) {
        this.emergencyContactRelationship = emergencyContactRelationship;
    }

    // The Following Code is used due to Address is common to User and Emergency contact
    // To have unique columns the column names of the address is overridden
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "number", column = @Column(name = "emergencyNumber"))
            ,
            @AttributeOverride(name = "addressLine1", column = @Column(name = "emergencyAddressLine1"))
            ,
            @AttributeOverride(name = "addressLine2", column = @Column(name = "emergencyAddressLine2"))
            ,
            @AttributeOverride(name = "County", column = @Column(name = "emergencyCounty"))
            ,
            @AttributeOverride(name = "Country", column = @Column(name = "emergencyCountry"))
            ,
            @AttributeOverride(name = "postcode", column = @Column(name = "emergencyPostcode"))
            ,
            @AttributeOverride(name = "latitude", column = @Column(name = "emergencyLatitude"))
            ,
            @AttributeOverride(name = "longitude", column = @Column(name = "emergencyLongitude"))
            ,
            @AttributeOverride(name = "telephone", column = @Column(name = "emergencyTelephone"))
            ,
            @AttributeOverride(name = "mobile", column = @Column(name = "emergencyMobile"))
    })

    public Address getEmergencyContactAddress() {
        return emergencyContactAddress;
    }

    public void setEmergencyContactAddress(Address emergencyContactAddress) {
        this.emergencyContactAddress = emergencyContactAddress;
    }

    //Returns the user Information
    @Override
    public String toString() {
        return "UserInfo{" + "surname=" + surname +
                ", firstname=" + firstname +
                ", address=" + address +
                ", emergencyContactFirstName=" + emergencyContactFirstName +
                ", insurance=" + insurance +
                ", medicalMd=" + medicalMd +
                ", emergencyContactSurname=" + emergencyContactSurname +
                ", emergencyContactAddress=" + emergencyContactAddress +
                ", emergencyContactRelationship=" + emergencyContactRelationship + '}';
    }
}
