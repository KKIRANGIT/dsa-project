package com.practice.dsa.patterns.sliding_window;

/**
 * Beginner fixed-size sliding-window pattern.
 *
 * Window size stays constant.
 * Add right element, remove left-behind element.
 */
public class PT1FixedWindowTemplate {
    public int maxSumWindow(int[] nums, int k) {
        // Sum of current window.
        int windowSum = 0;
        // Best sum found.
        int best = Integer.MIN_VALUE;

        for (int right = 0; right < nums.length; right++) {
            // Add new right element.
            windowSum += nums[right];

            // Remove element that falls out of the fixed window.
            if (right >= k) {
                windowSum -= nums[right - k];
            }

            // First full window forms when right reaches k - 1.
            if (right >= k - 1) {
                best = Math.max(best, windowSum);
            }
        }

        return best;
    }
}
