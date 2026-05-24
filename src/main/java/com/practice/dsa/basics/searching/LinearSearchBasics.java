package com.practice.dsa.basics.searching;

/**
 * Beginner linear search reference.
 *
 * This is the simplest search approach and a useful contrast against binary search.
 */
public class LinearSearchBasics {
    public int indexOf(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
