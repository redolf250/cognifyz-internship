package com.redolf.taskOne;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionServiceImpTest {

    private TemperatureConversionServiceImpl service;

    @BeforeEach
    void setUp() {
        service = new TemperatureConversionServiceImpl();
    }

    @AfterEach
    void tearDown() {
        service=null;
    }

    @ParameterizedTest
    @ArgumentsSource(CelsiusArgumentProvider.class)
    void celsiusToFahrenheit(double celsius, double fahrenheit) {
        double result = service.celsiusToFahrenheit(celsius);
        assertEquals(result, fahrenheit);
    }

    @ParameterizedTest
    @ArgumentsSource(FahrenheitArgumentProvider.class)
    void fahrenheitToCelsius(double fahrenheit,double celsius) {
        double result = service.fahrenheitToCelsius(fahrenheit);
        assertEquals(result, celsius);
    }
}