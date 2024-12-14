package com.redolf.taskTwo;

public class PalindromeCheckerServiceImpl implements PalindromeCheckerService{
    @Override
    public boolean isPalindrome(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedInput.length() - 1;
        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
