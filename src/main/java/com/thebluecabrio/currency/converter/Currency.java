package com.thebluecabrio.currency.converter;

/**
 * Created by stevenrowney on 19/01/2016.
 */
public class Currency {

    private String country;
    private String name;
    private String code;
    private double rate;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
