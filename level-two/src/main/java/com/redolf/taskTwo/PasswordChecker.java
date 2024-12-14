package com.redolf.taskTwo;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        PasswordStrengthCheckerServiceImpl service = new PasswordStrengthCheckerServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password to check its strength: ");
        String password = scanner.nextLine();
        String strengthFeedback = service.checkPasswordStrength(password);
        System.out.println(strengthFeedback);
        scanner.close();
    }
}
