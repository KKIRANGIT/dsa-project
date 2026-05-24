package com.practice.dsa.problems.binary_search.search_in_rotated_sorted_array;

/**
 * LC 33 - Search in Rotated Sorted Array
 *
 * Beginner idea:
 * Even after rotation, at least one half is still normally sorted.
 * On each step:
 * 1. detect which half is sorted
 * 2. decide whether target belongs to that half
 * 3. discard the other half
 */
public class LC33SearchInRotatedSortedArraySolver {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted normally.
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // Right half is sorted normally.
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
