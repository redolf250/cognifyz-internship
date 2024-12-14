package com.redolf.taskTwo;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class PalindromeArgument implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                Arguments.of("Racecar"),
                Arguments.of("Level"),
                Arguments.of("Rotor"),
                Arguments.of("Civic"),
                Arguments.of("Deified"),
                Arguments.of("Madam"),
                Arguments.of("Refer"),
                Arguments.of("Stats"),
                Arguments.of("Tenet"),
                Arguments.of("Reviver")
        );
    }
}
