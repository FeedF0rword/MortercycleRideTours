package com.BCASKandy.MorterCycleTourPlanner.model;

import javax.persistence.Embeddable;
import java.util.Date;

@Embeddable
public class Insurance {
    /**
     * Defines the Insurance to be used for Users
     * Should be Embedded inside other entities
     * Defines the attributes
     * <ul>
     *     <li>Insurance Expiry Date<li/>
     *     <li>Insurance Number<li/>
     *
     * <ul/>
     * <p>
     *     And getters and setter for each of these attributes.<br>
     *     toString method returns the Insurance Details as a string value
     *
     * <p/>
     */

    private String insuranceNo="";

    private Date expiry_date;


    public Date getExpiryDate() {
        return expiry_date;
    }

    public void setExpiryDate(Date expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    @Override
    public String toString() {
        return "Insurance{" + "expiryDate=" + expiry_date +
                ", insuranceNo=" + insuranceNo + '}';
    }
}
