package com.redolf.taskTwo;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class NotPalindromeArgument implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                Arguments.of("Hello"),
                Arguments.of("World"),
                Arguments.of("Java"),
                Arguments.of("Programming"),
                Arguments.of("OpenAI"),
                Arguments.of("Testing"),
                Arguments.of("Palindrome"),
                Arguments.of("This is a test"),
                Arguments.of("Open the door"),
                Arguments.of("Welcome to the future"),
                Arguments.of("Artificial intelligence"),
                Arguments.of("Let's code"),
                Arguments.of("Happy coding"),
                Arguments.of("Learn something new"),
                Arguments.of("Good morning everyone")
        );
    }
}
