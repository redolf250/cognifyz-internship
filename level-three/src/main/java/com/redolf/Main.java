package com.redolf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CurrencyConverterServiceImpl service = new CurrencyConverterServiceImpl();
//        System.out.println(service.getExchangeRate("USD","GHS"));
//        System.out.println(service.convertCurrency(1000,"USD","GHS"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("==============Currency Converter Console Service============");

        System.out.print("Enter the base currency (e.g., USD): ");
        String baseCurrency = scanner.next().toUpperCase();
        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.next().toUpperCase();
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        service.convertCurrency(amount, baseCurrency, targetCurrency);
        scanner.close();
    }
}