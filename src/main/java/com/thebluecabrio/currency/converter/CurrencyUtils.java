package com.thebluecabrio.currency.converter;

import java.math.BigDecimal;

/**
 * Created by stevenrowney on 19/01/2016.
 */
public final class CurrencyUtils {

    private static final int SCALE = 2;
    private static final int ROUNDING_MODE = BigDecimal.ROUND_HALF_UP;

    protected CurrencyUtils() {
        throw new InstantiationError("Utility class, do not instantiate");
    }

    public static double round(double price) {
        return new BigDecimal(price).setScale(SCALE, ROUNDING_MODE).doubleValue();
    }
}
