package com.practice.dsa.problems.sliding_window.permutation_in_string;

/**
 * LC 567 - Permutation in String
 *
 * Beginner idea:
 * A permutation of s1 must have exactly the same character counts as s1.
 * So we slide a window of length s1.length() across s2
 * and compare the frequency arrays.
 */
public class LC567PermutationInStringSolver {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        for (char ch : s1.toCharArray()) {
            need[ch - 'a']++;
        }

        for (int right = 0; right < s2.length(); right++) {
            window[s2.charAt(right) - 'a']++;

            // Keep the window size equal to s1.length().
            if (right >= s1.length()) {
                window[s2.charAt(right - s1.length()) - 'a']--;
            }

            if (matches(need, window)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] first, int[] second) {
        for (int i = 0; i < 26; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }
        return true;
    }
}
