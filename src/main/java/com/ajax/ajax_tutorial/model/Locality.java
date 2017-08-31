package com.ajax.ajax_tutorial.model;

public class Locality {
    private String zipCode;
    private String locality;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Locality(String zipCode, String locality) {
        this.zipCode = zipCode;
        this.locality = locality;
    }
}
