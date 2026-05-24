package com.practice.dsa.problems.sliding_window.longest_substring_without_repeating_characters;

import java.util.HashMap;
import java.util.Map;

/**
 * LC 3 - Longest Substring Without Repeating Characters
 *
 * Beginner idea:
 * Keep a window with no duplicate characters.
 * lastSeen tells us where each character last appeared.
 *
 * If a character repeats inside the current window,
 * move the left side just past the old occurrence.
 */
public class LC3LongestSubstringWithoutRepeatingCharactersSolver {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int left = 0;
        int best = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (lastSeen.containsKey(ch)) {
                // Never move left backward.
                left = Math.max(left, lastSeen.get(ch) + 1);
            }

            lastSeen.put(ch, right);
            // right - left + 1 is the current valid window length.
            best = Math.max(best, right - left + 1);
        }

        return best;
    }
}
