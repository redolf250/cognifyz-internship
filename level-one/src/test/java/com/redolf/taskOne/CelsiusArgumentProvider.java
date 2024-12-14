package com.redolf.taskOne;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CelsiusArgumentProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of(
                Arguments.of(-40, -40.0),    // -40 degrees is the same in both scales
                Arguments.of(-10, 14.0),     // Below freezing
                Arguments.of(0, 32.0),       // Freezing point
                Arguments.of(10, 50.0),      // Cool temperature
                Arguments.of(20, 68.0),      // Mild temperature
                Arguments.of(25, 77.0),      // Room temperature
                Arguments.of(30, 86.0),      // Warm weather
                Arguments.of(37, 98.6),      // Body temperature
                Arguments.of(50, 122.0),     // Hot temperature
                Arguments.of(100, 212.0)     // Boiling point of water
        );
    }
}
