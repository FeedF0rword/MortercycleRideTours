package com.BCASKandy.MorterCycleTourPlanner.model;

public class InsuranceInformation {
    private Boolean insuranceVerified = false;

    public Boolean getInsuranceVerified() {
        return insuranceVerified;
    }

    public void setInsuranceVerified(Boolean insuranceVerified) {
        this.insuranceVerified = insuranceVerified;
    }

    @Override
    public String toString() {
        return "InsuranceInformation{" + "insuranceVerified=" + insuranceVerified + '}';
    }

}
