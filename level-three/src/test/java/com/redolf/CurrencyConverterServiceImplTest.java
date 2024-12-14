package com.redolf;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterServiceImplTest {

    private CurrencyConverterServiceImpl service;

    @BeforeEach
    void setUp() {
        service = new CurrencyConverterServiceImpl();
    }

    @AfterEach
    void tearDown() {
        service=null;
    }

    @Test
    void convertCurrency() {
        double converted = service.convertCurrency(10, "USD", "GHS");
        assertEquals(converted,147.212);
    }

}