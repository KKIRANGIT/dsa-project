package com.practice.dsa.basics.searching;

/**
 * Beginner binary search reference.
 *
 * exactSearch finds an exact target.
 * lowerBound finds first position where value is >= target.
 */
public class BinarySearchVariants {
    public int exactSearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                // Target must be on right side.
                left = mid + 1;
            } else {
                // Target must be on left side.
                right = mid - 1;
            }
        }

        return -1;
    }

    public int lowerBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                // Need larger values, move left boundary rightward.
                left = mid + 1;
            } else {
                // mid might be the first valid position.
                right = mid;
            }
        }
        // left is the first index with value >= target.
        return left;
    }
}
