package com.redolf;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static com.redolf.Utils.*;

public class CurrencyConverterServiceImpl implements CurrencyConverterService{

    @Override
    public double getExchangeRate(String baseCurrency, String targetCurrency) {
        try {
            String urlStr = String.format(URL, API_KEY, baseCurrency);
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new HttpConnectionException("Error: Unable to fetch exchange rates.");
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            conn.disconnect();

            JSONObject json = new JSONObject(content.toString());
            //conversion_rates: from the documentation this contains the conversion rate
            JSONObject rates = json.getJSONObject("conversion_rates");

            if (!rates.has(targetCurrency)) {
                throw new CurrencyNotFoundException("Error: Target currency not found in exchange rates.");
            }
            return rates.getDouble(targetCurrency);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }

    @Override
    public double convertCurrency(double amount, String baseCurrency, String targetCurrency) {
        double rate = getExchangeRate(baseCurrency, targetCurrency);
        if (rate == -1) {
            return 0;
        }
        double convertedAmount = amount * rate;
        System.out.printf("The conversion: %.2f %s = %.2f %s%n", amount, baseCurrency, convertedAmount, targetCurrency);
        return convertedAmount;
    }
}
