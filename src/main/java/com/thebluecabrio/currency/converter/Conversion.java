package com.thebluecabrio.currency.converter;

/**
 * Created by stevenrowney on 19/01/2016.
 */
public class Conversion {

    private String targetCountryCode;
    private String targetCountryName;
    private Double sourceAmount;
    private String targetName;

    public String getTargetCountryCode() {
        return targetCountryCode;
    }

    public void setTargetCountryCode(String targetCountryCode) {
        this.targetCountryCode = targetCountryCode;
    }

    public String getTargetCountryName() {
        return targetCountryName;
    }

    public void setTargetCountryName(String targetCountryName) {
        this.targetCountryName = targetCountryName;
    }

    public void setSourceAmount(Double sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    public double getSourceAmountRounded() {
        return CurrencyUtils.round(sourceAmount);
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getTargetName() {
        return targetName;
    }
}
