package com.redolf.taskTwo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerServiceImplTest {

    private PalindromeCheckerServiceImpl service;

    @BeforeEach
    void setUp() {
        service = new PalindromeCheckerServiceImpl();
    }

    @AfterEach
    void tearDown() {
        service=null;
    }

    @ParameterizedTest
    @ArgumentsSource(PalindromeArgument.class)
    void isPalindrome(String argument) {
        boolean isPalindrome = service.isPalindrome(argument);
        assertTrue(isPalindrome);
    }

    @ParameterizedTest
    @ArgumentsSource(NotPalindromeArgument.class)
    void isNotPalindrome(String argument) {
        boolean isPalindrome = service.isPalindrome(argument);
        assertFalse(isPalindrome);
    }


}