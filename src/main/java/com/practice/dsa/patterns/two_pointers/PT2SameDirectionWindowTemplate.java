package com.practice.dsa.patterns.two_pointers;

/**
 * Beginner same-direction two-pointer pattern.
 *
 * Use this when both pointers move left-to-right and the left side only catches up.
 */
public class PT2SameDirectionWindowTemplate {
    public int longestNonDecreasingRun(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int left = 0;
        int best = 1;

        for (int right = 1; right < nums.length; right++) {
            if (nums[right] < nums[right - 1]) {
                left = right;
            }
            best = Math.max(best, right - left + 1);
        }

        return best;
    }
}
