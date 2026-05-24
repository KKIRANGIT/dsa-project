package com.practice.dsa.patterns.two_pointers;

/**
 * Beginner opposite-two-pointers pattern.
 *
 * Use this when:
 * - array is sorted
 * - decision depends on sum/comparison from both ends
 */
public class PT1OppositeTwoPointersTemplate {
    public boolean hasPairWithTarget(int[] nums, int target) {
        // Start one pointer at each end.
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            // Compute pair sum from both ends.
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return true;
            }

            // If sum is too small, move left to increase it.
            if (sum < target) {
                left++;
            } else {
                // If sum is too large, move right to decrease it.
                right--;
            }
        }

        return false;
    }
}
