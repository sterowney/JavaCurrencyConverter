package com.thebluecabrio.currency.converter;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by stevenrowney on 19/01/2016.
 */
public class CurrencyRepositoryTest {

    @Test
    public void test_Read_File() throws Exception {

        CurrencyRepository currencyRepository = new CurrencyRepository();
        List<String> conversionFile = currencyRepository.readFile();

        assertNotNull("File is read successfully and not null", conversionFile);
        assertEquals("Document has 5 entries", 5, conversionFile.size());
    }

    @Test
    public void test_Lookup_AED() throws Exception {

        CurrencyRepository currencyRepository = new CurrencyRepository();
        Currency currency = currencyRepository.lookupCurrency("AED");

        assertNotNull("Returns a currency", currency);
        assertEquals("AED currency should be", 7.2104, currency.getRate(), 0);

        assertEquals("United Arab Emirates", currency.getCountry());
        assertEquals("Dirhams", currency.getName());
        assertEquals("AED", currency.getCode());
    }

    @Test
    public void test_Lookup_AUD() throws Exception {

        CurrencyRepository currencyRepository = new CurrencyRepository();
        Currency currency = currencyRepository.lookupCurrency("AUD");

        assertNotNull("Returns a currency", currency);
        assertEquals("AUD currency should be", 1.51239, currency.getRate(), 0);

        assertEquals("Australia", currency.getCountry());
        assertEquals("Dollars", currency.getName());
        assertEquals("AUD", currency.getCode());
    }

    @Test
    public void test_Lookup_BAM() throws Exception {

        CurrencyRepository currencyRepository = new CurrencyRepository();
        Currency currency = currencyRepository.lookupCurrency("BAM");

        assertNotNull("Returns a currency", currency);
        assertEquals("BAM currency should be", 2.60565, currency.getRate(), 0);

        assertEquals("Bosnia and Herzegovina", currency.getCountry());
        assertEquals("Convertible Marka", currency.getName());
        assertEquals("BAM", currency.getCode());
    }

    @Test
    public void test_Lookup_BGN() throws Exception {

        CurrencyRepository currencyRepository = new CurrencyRepository();
        Currency currency = currencyRepository.lookupCurrency("BGN");

        assertNotNull("Returns a currency", currency);
        assertEquals("BGN currency should be", 2.60948, currency.getRate(), 0);

        assertEquals("Bulgaria", currency.getCountry());
        assertEquals("Leva", currency.getName());
        assertEquals("BGN", currency.getCode());
    }

    @Test
    public void test_Lookup_GBP() throws Exception {

        CurrencyRepository currencyRepository = new CurrencyRepository();
        Currency currency = currencyRepository.lookupCurrency("GBP");

        assertNotNull("Returns a currency", currency);
        assertEquals("GBP currency should be", 1.0, currency.getRate(), 0);

        assertEquals("United Kingdom", currency.getCountry());
        assertEquals("Pounds", currency.getName());
        assertEquals("GBP", currency.getCode());
    }
}