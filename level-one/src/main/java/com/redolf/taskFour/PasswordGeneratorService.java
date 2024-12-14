package com.redolf.taskFour;

public interface PasswordGeneratorService {
    String generatePassword(int length,
                            boolean includeNumbers,
                            boolean includeLowercase,
                            boolean includeUppercase,
                            boolean includeSpecialChars);
}
