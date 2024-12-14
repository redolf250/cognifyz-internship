package com.redolf.taskFour;

import java.util.Random;

public class PasswordGeneratorServiceImpl implements PasswordGeneratorService{

    @Override
    public String generatePassword(int length, boolean includeNumbers, boolean includeLowercase, boolean includeUppercase, boolean includeSpecialChars) {

        StringBuilder characterPool = new StringBuilder();

        if (includeNumbers) characterPool.append(Utils.NUMBER);
        if (includeLowercase) characterPool.append(Utils.LOWERCASE);
        if (includeUppercase) characterPool.append(Utils.UPPERCASE);
        if (includeSpecialChars) characterPool.append(Utils.SPECIAL_CHARACTER);

        if (characterPool.isEmpty()) {
            throw new IllegalArgumentException("You must select at least one character type!");
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }
        return password.toString();
    }
}
