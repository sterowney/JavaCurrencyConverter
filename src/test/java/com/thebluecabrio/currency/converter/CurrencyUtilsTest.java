package com.thebluecabrio.currency.converter;

import org.junit.Test;

/**
 * Created by stevenrowney on 19/01/2016.
 */
public class CurrencyUtilsTest {

    @Test(expected = InstantiationError.class)
    public void testInstantiateCurrenctUtils() throws Exception {
        new CurrencyUtils();
    }
}