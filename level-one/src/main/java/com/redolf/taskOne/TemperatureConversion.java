package com.redolf.taskOne;

import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {

        TemperatureConversionServiceImpl service = new TemperatureConversionServiceImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double tempValue = scanner.nextDouble();

        System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit): ");
        String unit = scanner.next().trim().toUpperCase();

        if (unit.equals("C")) {
            double converted = service.celsiusToFahrenheit(tempValue);
            System.out.printf("%.2f°C is equal to %.2f°F.%n", tempValue, converted);
        } else if (unit.equals("F")) {
            double converted = service.fahrenheitToCelsius(tempValue);
            System.out.printf("%.2f°F is equal to %.2f°C.%n", tempValue, converted);
        } else {
            System.out.println("Invalid unit. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }

        scanner.close();
    }
}
