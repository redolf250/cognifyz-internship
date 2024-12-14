package com.redolf;

public interface CurrencyConverterService {
    double getExchangeRate(String baseCurrency, String targetCurrency);
    double convertCurrency(double amount, String baseCurrency, String targetCurrency);
}
