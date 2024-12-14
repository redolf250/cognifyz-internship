package com.redolf.taskFour;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorServiceImplTest {

   private PasswordGeneratorServiceImpl service;
    @BeforeEach
    void setUp() {
        service = new PasswordGeneratorServiceImpl();
    }

    @AfterEach
    void tearDown() {
        service = null;
    }

    @ParameterizedTest
    @ArgumentsSource(PasswordArgumentsProvider.class)
    void generatePassword(int length, boolean number, boolean lowerCase, boolean upperCase, boolean specialChar) {
        String password = service.generatePassword(length, number, lowerCase, upperCase, specialChar);
        assertEquals(password.length(), length);
        assertNotNull(password);
    }

    @Test
    void generatePassword1() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.generatePassword(8, false, false, false, false);
        });
    }
}