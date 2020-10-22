package com.BCASKandy.MorterCycleTourPlanner.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    /**
     * Defines the address to be used for Users, Emergency Contact,Itinerary
     * Should be Embedded inside other entities
     * Defines the attributes
     * <ul>
     *     <li>number<li/>
     *     <li>AddressLine1<li/>
     *     <li>AddressLine2<li/>
     *     <li>City<li/>
     *     <li>Country<li/>
     *     <li>PostCode<li/>
     *     <li>Latitude<li/>
     *     <li>Longitude<li/>
     *     <li>Telephone<li/>
     *     <li>Mobile<li/>
     *
     * <ul/>
     * <p>
     *     And getters and setter for each of these attributes.<br>
     *     toString method returns the address as a string value
     *
     * <p/>
     */

    private String number="";

    private String addressLine1="";

    private String addressLine2="";

    private String City="";

    private String Country="";

    private String postcode="";

    private double latitude=0.0;

    private double longitude=0.0;

    private String telephone="";

    private String mobile="";

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


    @Override
    public String toString() {
        return "Address{" + "number=" + number +
                ", addressLine1=" + addressLine1 +
                ", addressLine2=" + addressLine2 +
                ", City=" + City +
                ", Country=" + Country +
                ", postcode=" + postcode +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", telephone=" + telephone +
                ", mobile=" + mobile + '}';
    }
}
