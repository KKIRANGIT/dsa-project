package com.practice.dsa.problems.binary_search.binary_search;

/**
 * LC 704 - Binary Search
 *
 * Beginner idea:
 * The array is sorted, so we can remove half the search space each step.
 * Compare target with the middle value:
 * - equal -> found
 * - smaller -> move left half
 * - bigger -> move right half
 */
public class LC704BinarySearchSolver {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                // Target must be to the right of mid.
                left = mid + 1;
            } else {
                // Target must be to the left of mid.
                right = mid - 1;
            }
        }

        return -1;
    }
}
