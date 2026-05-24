package com.practice.dsa.patterns.strings;

import java.util.Arrays;

/**
 * Beginner Z-algorithm pattern.
 *
 * Use this when each position needs the longest prefix match length.
 */
public class PT2ZAlgorithmTemplate {
    public int[] buildZ(String s) {
        int[] z = new int[s.length()];
        int left = 0;
        int right = 0;

        for (int i = 1; i < s.length(); i++) {
            if (i <= right) {
                z[i] = Math.min(right - i + 1, z[i - left]);
            }

            while (i + z[i] < s.length() && s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }

            if (i + z[i] - 1 > right) {
                left = i;
                right = i + z[i] - 1;
            }
        }

        return z;
    }
}
