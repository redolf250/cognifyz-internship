package com.redolf.taskTwo;

public class PasswordStrengthCheckerServiceImpl implements PasswordStrengthCheckerService{

    @Override
    public String checkPasswordStrength(String password) {
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        String specialCharacters = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (specialCharacters.contains(String.valueOf(c))) {
                hasSpecialChar = true;
            }
        }

        if (password.length() < 8) {
            return "Weak: Password must be at least 8 characters long.";
        } else if (hasUppercase && hasLowercase && hasNumber && hasSpecialChar) {
            return "Strong: Great password!";
        } else if ((hasUppercase || hasLowercase) && hasNumber && hasSpecialChar) {
            return "Moderate: Consider adding more character variety.";
        } else {
            return "Weak: Password should contain uppercase, lowercase, numbers, and special characters.";
        }
    }
}
