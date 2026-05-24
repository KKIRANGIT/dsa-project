package com.practice.dsa.problems.two_pointers.valid_palindrome;

/**
 * LC 125 - Valid Palindrome
 *
 * Beginner idea:
 * Use one pointer from the left and one from the right.
 * Ignore all characters that are not letters or digits.
 * Compare the cleaned characters one pair at a time.
 */
public class LC125ValidPalindromeSolver {
    public boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            // Skip symbols and spaces from the left side.
            while (left < right && !Character.isLetterOrDigit(text.charAt(left))) {
                left++;
            }
            // Skip symbols and spaces from the right side.
            while (left < right && !Character.isLetterOrDigit(text.charAt(right))) {
                right--;
            }

            // Compare letters case-insensitively.
            if (Character.toLowerCase(text.charAt(left)) != Character.toLowerCase(text.charAt(right))) {
                return false;
            }

            // Move inward after a successful comparison.
            left++;
            right--;
        }

        return true;
    }
}
