package com.thebluecabrio.currency.converter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

/**
 * Created by stevenrowney on 19/01/2016.
 */
public class CurrentConverterTest {

    private CurrencyConverter currencyConverter;

    @Before
    public void setUp() throws Exception {

        currencyConverter = new CurrencyConverter();

    }

    @After
    public void tearDown() throws Exception {

        currencyConverter = null;

    }

    @Test
    public void test_Convert_Currency_UED_to_GBP() throws Exception {

        Conversion aedToGbpConversion = currencyConverter.convertCurrency(1.00, "AED", "GBP");

        assertNotNull("Should return a conversion", aedToGbpConversion);

        assertEquals("Target country code", "GBP", aedToGbpConversion.getTargetCountryCode());
        assertEquals("Target country name", "United Kingdom", aedToGbpConversion.getTargetCountryName());
        assertEquals("Target name", "Pounds", aedToGbpConversion.getTargetName());

        assertEquals("Source amount converted to two decimal places", CurrencyUtils.round(0.14), aedToGbpConversion.getSourceAmountRounded());
    }

    @Test
    public void test_Convert_Currency_AUD_to_GBP() throws Exception {

        Conversion audToGbpConversion = currencyConverter.convertCurrency(1.00, "AUD", "GBP");

        assertNotNull("Should return a conversion", audToGbpConversion);

        assertEquals("Target country code", "GBP", audToGbpConversion.getTargetCountryCode());
        assertEquals("Target country name", "United Kingdom", audToGbpConversion.getTargetCountryName());
        assertEquals("Target name", "Pounds", audToGbpConversion.getTargetName());

        assertEquals("Source amount converted to two decimal places", CurrencyUtils.round(0.66), audToGbpConversion.getSourceAmountRounded());
    }

    @Test
    public void test_Calculate_Currency_Conversion() throws Exception {

        assertEquals("Convert AED to GBP", 7.2104, currencyConverter.calculateConversion(1.00, 7.2104, 1.00));

        assertEquals("Convert AUD to GBP", 1.51239, currencyConverter.calculateConversion(1.00, 1.51239, 1.00));

        assertEquals("Convert BAM to GBP", 2.60565, currencyConverter.calculateConversion(1.00, 2.60565, 1.00));

        assertEquals("Convert BGN to GBP", 2.60948, currencyConverter.calculateConversion(1.00, 2.60948, 1.00));

        assertEquals("Convert GBP to GBP", 1.00, currencyConverter.calculateConversion(1.00, 1.00, 1.00));

        assertEquals("Convert AED to AUD", 0.20975119272162432, currencyConverter.calculateConversion(7.2104, 1.51239, 1.00));

        assertEquals("Convert AUD to AED", 4.767553342722446, currencyConverter.calculateConversion(1.51239, 7.2104, 1.00));

        assertEquals("Convert AUD to AED", 9.535106685444893, currencyConverter.calculateConversion(1.51239, 7.2104, 2.00));
    }

    @Test
    public void test_Convert_Currency_AED_to_AUD() throws Exception {

        Conversion aedToAudConversion = currencyConverter.convertCurrency(21, "AED", "AUD");

        assertEquals("Source amount converted to two decimal places", CurrencyUtils.round(4.40), aedToAudConversion.getSourceAmountRounded());
    }
}