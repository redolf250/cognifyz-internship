package com.redolf.taskThree;

public class FileEncryptDecryptServiceImpl implements FileEncryptDecryptService{

    @Override
    public String encrypt(String input, int shift) {
        shift = ((shift % 26) + 26) % 26; // Ensure the shift is between 0 and 25
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append((char) ('a' + (c - 'a' + shift) % 26));
            } else if (Character.isUpperCase(c)) {
                result.append((char) ('A' + (c - 'A' + shift) % 26));
            } else {
                result.append(c); // Non-letter characters remain unchanged
            }
        }
        return result.toString();
    }

    @Override
    public String decrypt(String input, int shift) {
        shift = ((shift % 26) + 26) % 26; // Ensure the shift is between 0 and 25
        return encrypt(input, -shift);    // Decrypt by encrypting with the negative shift
    }
}
