package com.practice.dsa.patterns.strings;

/**
 * Beginner Manacher pattern.
 *
 * Use for longest palindromic substring in linear time.
 */
public class PT4ManacherTemplate {
    public int longestPalindromeLength(String s) {
        String transformed = transform(s);
        int[] radius = new int[transformed.length()];
        int center = 0;
        int right = 0;
        int best = 0;

        for (int i = 0; i < transformed.length(); i++) {
            int mirror = 2 * center - i;
            if (i < right) {
                radius[i] = Math.min(right - i, radius[mirror]);
            }

            while (i - radius[i] - 1 >= 0
                    && i + radius[i] + 1 < transformed.length()
                    && transformed.charAt(i - radius[i] - 1) == transformed.charAt(i + radius[i] + 1)) {
                radius[i]++;
            }

            if (i + radius[i] > right) {
                center = i;
                right = i + radius[i];
            }

            best = Math.max(best, radius[i]);
        }

        return best;
    }

    private String transform(String s) {
        StringBuilder builder = new StringBuilder("^");
        for (char ch : s.toCharArray()) {
            builder.append('#').append(ch);
        }
        builder.append("#$");
        return builder.toString();
    }
}
