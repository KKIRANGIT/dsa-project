package com.practice.dsa.basics.strings;

/**
 * Beginner string reference.
 *
 * Strings are heavily used in interview problems, so these basics show:
 * - reverse a string
 * - check palindrome
 * - count lowercase character frequency
 *
 * Important beginner note:
 * Java strings are immutable, so operations that "change" a string
 * usually work through a char array or StringBuilder internally.
 */
public class StringUtilitiesBasics {
    public String reverse(String text) {
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap mirrored characters and move inward.
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }

    public boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            // If mirrored characters ever differ, the string is not a palindrome.
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public int[] lowercaseFrequency(String text) {
        int[] frequency = new int[26];
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (current >= 'a' && current <= 'z') {
                // 'a' maps to index 0, 'b' to 1, and so on.
                frequency[current - 'a']++;
            }
        }
        return frequency;
    }
}
