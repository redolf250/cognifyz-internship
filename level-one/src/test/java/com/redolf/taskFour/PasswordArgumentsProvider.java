package com.redolf.taskFour;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class PasswordArgumentsProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of(
            Arguments.of(8,true,true,true,true),
            Arguments.of(10,true,true,false,true),
            Arguments.of(15,true,false,false,true),
            Arguments.of(5,true,true,false,false)
        );
    }
}
