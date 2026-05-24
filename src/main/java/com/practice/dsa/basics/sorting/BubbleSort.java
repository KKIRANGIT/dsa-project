package com.practice.dsa.basics.sorting;

/**
 * Beginner bubble sort reference.
 *
 * Repeatedly swaps adjacent out-of-order values.
 */
public class BubbleSort {
    public void sort(int[] nums) {
        for (int pass = 0; pass < nums.length - 1; pass++) {
            for (int i = 0; i < nums.length - 1 - pass; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
    }
}
