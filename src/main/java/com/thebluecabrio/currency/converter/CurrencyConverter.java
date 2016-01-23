package com.thebluecabrio.currency.converter;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by stevenrowney on 19/01/2016.
 */
public class CurrencyConverter {

    private CurrencyRepository currencyRepository;

    public CurrencyConverter() {
        this.currencyRepository = new CurrencyRepository();
    }

    public Conversion convertCurrency(double sourceCurrencyAmount, String sourceCountryCode, String targetCountryCode) throws IOException, URISyntaxException {

        Currency sourceCurrency = currencyRepository.lookupCurrency(sourceCountryCode);
        Currency targetCurrency = currencyRepository.lookupCurrency(targetCountryCode);

        Conversion conversion = new Conversion();
        conversion.setTargetCountryCode(targetCountryCode);
        conversion.setTargetCountryName(targetCurrency.getCountry());
        conversion.setTargetName(targetCurrency.getName());
        conversion.setSourceAmount(calculateConversion(sourceCurrency.getRate(), targetCurrency.getRate(), sourceCurrencyAmount));

        return conversion;
    }

    public double calculateConversion(double source, double target, double amount) {
        return (amount / source) * target;
    }
}
