package com.thebluecabrio.currency.converter;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by stevenrowney on 19/01/2016.
 */
public class CurrencyConverterApp {

    public static void main(String[] args) throws IOException, URISyntaxException {
        runApp(args);
    }

    protected static void runApp(String[] args) throws IOException, URISyntaxException {

        if(args == null || args.length != 3) {
            throw new IllegalArgumentException("Please provide 3 arguments");
        }

        double source;

        try {

            if(args[0].length() == 4) {

                source = Double.parseDouble(args[0]);

            } else {

                throw new IllegalArgumentException("First parameter should be in the format y.xx");
            }

        } catch(NumberFormatException e) {

            throw new IllegalArgumentException("First parameter should be in the format y.xx");
        }

        CurrencyConverter currencyConverter = new CurrencyConverter();
        Conversion conversion = currencyConverter.convertCurrency(source, args[1], args[2]);


        System.out.println("======== STARTING =========");
        System.out.println(String.format("Source Amount Converted to Target Currency: %s", conversion.getSourceAmountRounded()));
        System.out.println(String.format("Target Country: %s", conversion.getTargetCountryName()));
        System.out.println(String.format("Target Name: %s", conversion.getTargetName()));
        System.out.println("======== FINISHED =========");
    }
}
