package com.redolf.taskFour;

import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        PasswordGeneratorServiceImpl service = new PasswordGeneratorServiceImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();

        if (length <= 0) {
            System.out.println("Password length must be a positive number.");
            return;
        }

        // Prompt the user for character type preferences
        System.out.print("Include numbers? (true/false): ");
        boolean includeNumbers = scanner.nextBoolean();

        System.out.print("Include lowercase letters? (true/false): ");
        boolean includeLowercase = scanner.nextBoolean();

        System.out.print("Include uppercase letters? (true/false): ");
        boolean includeUppercase = scanner.nextBoolean();

        System.out.print("Include special characters? (true/false): ");
        boolean includeSpecialChars = scanner.nextBoolean();


        String password = service.generatePassword(length, includeNumbers, includeLowercase, includeUppercase, includeSpecialChars);

        if (!password.isEmpty()) {
            System.out.println("Generated Password: " + password);
        }

        scanner.close();
    }
}
