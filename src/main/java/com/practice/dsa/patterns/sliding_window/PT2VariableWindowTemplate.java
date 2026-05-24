package com.practice.dsa.patterns.sliding_window;

/**
 * Beginner variable-size sliding-window pattern.
 *
 * Expand right to include more elements.
 * Shrink left when the window becomes invalid.
 */
public class PT2VariableWindowTemplate {
    public int longestOnesAfterFlippingAtMostKZeros(int[] nums, int k) {
        // Left boundary of window.
        int left = 0;
        // Number of zeros currently inside window.
        int zeros = 0;
        // Best valid window length found so far.
        int best = 0;

        for (int right = 0; right < nums.length; right++) {
            // Include current right element.
            if (nums[right] == 0) {
                zeros++;
            }

            // If window breaks the rule, move left until valid again.
            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            // Current window is valid here.
            best = Math.max(best, right - left + 1);
        }

        return best;
    }
}
