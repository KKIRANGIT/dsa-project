package com.practice.dsa.problems.sliding_window.minimum_window_substring;

import java.util.HashMap;
import java.util.Map;

/**
 * LC 76 - Minimum Window Substring
 *
 * Beginner idea:
 * Expand the right side until the window has everything required.
 * Then shrink from the left to make the valid window as small as possible.
 *
 * need   = required character counts
 * window = current character counts in the window
 * have   = how many character requirements are currently satisfied
 */
public class LC76MinimumWindowSubstringSolver {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        Map<Character, Integer> need = new HashMap<>();
        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();
        int have = 0;
        int required = need.size();
        int left = 0;
        int bestStart = 0;
        int bestLength = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char add = s.charAt(right);
            window.put(add, window.getOrDefault(add, 0) + 1);

            // This character now meets its required count exactly.
            if (need.containsKey(add) && window.get(add).intValue() == need.get(add).intValue()) {
                have++;
            }

            // Window is valid, so try to shrink it.
            while (have == required) {
                if (right - left + 1 < bestLength) {
                    bestLength = right - left + 1;
                    bestStart = left;
                }

                char remove = s.charAt(left);
                window.put(remove, window.get(remove) - 1);
                // Removing this character broke one requirement.
                if (need.containsKey(remove) && window.get(remove) < need.get(remove)) {
                    have--;
                }
                left++;
            }
        }

        return bestLength == Integer.MAX_VALUE ? "" : s.substring(bestStart, bestStart + bestLength);
    }
}
