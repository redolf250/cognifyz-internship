package com.redolf.taskOne;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class FahrenheitArgumentProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of(
                Arguments.of(-22.0, -30),    // Very cold
                Arguments.of(5.0, -15),      // Cold
                Arguments.of(41.0, 5),       // Cool
                Arguments.of(59.0, 15),      // Mild
                Arguments.of(77.0, 25),      // Warm
                Arguments.of(95.0, 35),      // Hot
                Arguments.of(113.0, 45),     // Very hot
                Arguments.of(131.0, 55),     // Extremely hot
                Arguments.of(176.0, 80),     // Near boiling
                Arguments.of(248.0, 120)     // Above boiling point
        );
    }
}
