package com.redolf.taskTwo;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        PalindromeCheckerServiceImpl service = new PalindromeCheckerServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();
        if (service.isPalindrome(input)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is NOT a palindrome.");
        }
        scanner.close();
    }
}
