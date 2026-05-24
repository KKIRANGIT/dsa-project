package com.practice.dsa.patterns.binary_search;

/**
 * Beginner lower-bound / upper-bound pattern.
 *
 * lowerBound = first index with value >= target
 * upperBound = first index with value > target
 */
public class PT2LowerUpperBoundTemplate {
    public int lowerBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // left is first valid lower-bound position.
        return left;
    }

    public int upperBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // left is first valid upper-bound position.
        return left;
    }
}
