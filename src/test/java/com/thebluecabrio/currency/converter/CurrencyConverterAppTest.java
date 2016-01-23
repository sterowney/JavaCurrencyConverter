package com.thebluecabrio.currency.converter;

import org.junit.Test;

/**
 * Created by stevenrowney on 19/01/2016.
 */
public class CurrencyConverterAppTest {

    @Test
    public void test_Convert_One_AED_to_AUD() throws Exception {

        CurrencyConverterApp.main(new String[] {"1.00", "AED", "AUD"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_No_arguements() throws Exception {

        CurrencyConverterApp app = new CurrencyConverterApp();
        app.runApp(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Two_arguements() throws Exception {

        CurrencyConverterApp app = new CurrencyConverterApp();
        app.runApp(new String[] {"1", "2"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Four_arguements() throws Exception {

        CurrencyConverterApp app = new CurrencyConverterApp();
        app.runApp(new String[] {"1", "2", "3", "4"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Three_arguements_First_Not_4_In_Length() throws Exception {

        CurrencyConverterApp app = new CurrencyConverterApp();
        app.runApp(new String[] {"1", "2", "3"});
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Three_arguements_First_Not_Double() throws Exception {

        CurrencyConverterApp app = new CurrencyConverterApp();
        app.runApp(new String[] {"abcd", "2", "3"});
    }
}