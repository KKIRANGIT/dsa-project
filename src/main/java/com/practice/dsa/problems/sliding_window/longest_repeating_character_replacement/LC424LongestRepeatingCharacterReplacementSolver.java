package com.practice.dsa.problems.sliding_window.longest_repeating_character_replacement;

/**
 * LC 424 - Longest Repeating Character Replacement
 *
 * Beginner idea:
 * Inside the current window, we want most characters to be the same.
 * maxFrequency tracks the most common character in the window.
 *
 * If window size - maxFrequency > k, the window needs too many replacements,
 * so we shrink it from the left.
 */
public class LC424LongestRepeatingCharacterReplacementSolver {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxFrequency = 0;
        int best = 0;

        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'A';
            count[index]++;
            maxFrequency = Math.max(maxFrequency, count[index]);

            // Too many off-characters to fix with only k replacements.
            while ((right - left + 1) - maxFrequency > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            best = Math.max(best, right - left + 1);
        }

        return best;
    }
}
