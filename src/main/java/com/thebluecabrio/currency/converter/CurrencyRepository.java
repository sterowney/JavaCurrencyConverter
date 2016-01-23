package com.thebluecabrio.currency.converter;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by stevenrowney on 19/01/2016.
 */
public class CurrencyRepository {

    private static final String NAME_OF_CURRENCY_FILE = "currency.csv";

    protected List<String> readFile() throws IOException, URISyntaxException {
        return Files.readAllLines(Paths.get(ClassLoader.getSystemResource(NAME_OF_CURRENCY_FILE).toURI()));
    }

    public Currency lookupCurrency(String countryCode) throws IOException, URISyntaxException {


        Currency currency = null;
        List<String> rowData;

        for(String row : readFile()) {

            rowData = Arrays.asList(row.split(","));

            if(countryCode.equalsIgnoreCase(rowData.get(2).trim())) {

                currency = new Currency();
                currency.setCountry(rowData.get(0).trim());
                currency.setName(rowData.get(1).trim());
                currency.setCode(rowData.get(2).trim());
                currency.setRate(Double.parseDouble(rowData.get(3).trim()));
            }
        }

        return currency;
    }
}
