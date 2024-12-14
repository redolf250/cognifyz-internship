package com.redolf.taskOne;

public class TemperatureConversionServiceImpl implements TemperatureConversionService{

    @Override
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
