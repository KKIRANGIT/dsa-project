package com.practice.dsa.patterns.sliding_window;

/**
 * Beginner frequency-window pattern.
 *
 * Use this for string windows where counts of characters matter.
 */
public class PT3FrequencyWindowTemplate {
    public int longestWindowWithAtMostOneDistinctBreak(String s) {
        int[] count = new int[26];
        int left = 0;
        int distinct = 0;
        int best = 0;

        for (int right = 0; right < s.length(); right++) {
            int add = s.charAt(right) - 'a';
            if (count[add] == 0) {
                distinct++;
            }
            count[add]++;

            while (distinct > 2) {
                int remove = s.charAt(left) - 'a';
                count[remove]--;
                if (count[remove] == 0) {
                    distinct--;
                }
                left++;
            }

            best = Math.max(best, right - left + 1);
        }

        return best;
    }
}
