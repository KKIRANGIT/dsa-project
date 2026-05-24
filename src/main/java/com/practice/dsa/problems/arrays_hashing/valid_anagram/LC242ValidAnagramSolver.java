package com.practice.dsa.problems.arrays_hashing.valid_anagram;

/**
 * LC 242 - Valid Anagram
 *
 * Beginner idea:
 * Two strings are anagrams when they contain the same letters
 * with the same counts.
 *
 * We count characters from the first string and cancel them out
 * using the second string.
 */
public class LC242ValidAnagramSolver {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            // Add the current character from s.
            counts[s.charAt(i) - 'a']++;
            // Remove the current character from t.
            counts[t.charAt(i) - 'a']--;
        }

        // If every count returns to zero, the strings match perfectly.
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
