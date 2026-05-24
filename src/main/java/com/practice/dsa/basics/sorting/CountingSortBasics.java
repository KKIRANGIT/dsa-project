package com.practice.dsa.basics.sorting;

/**
 * Beginner counting sort reference.
 *
 * This works well when the value range is small.
 *
 * Big idea:
 * instead of comparing values directly,
 * count how many times each value appears.
 */
public class CountingSortBasics {
    public int[] sort(int[] nums, int maxValue) {
        int[] count = new int[maxValue + 1];
        for (int value : nums) {
            // count[value] means how many times this value appears.
            count[value]++;
        }

        int[] sorted = new int[nums.length];
        int index = 0;
        for (int value = 0; value <= maxValue; value++) {
            while (count[value] > 0) {
                // Write the value into the next sorted position.
                sorted[index++] = value;
                count[value]--;
            }
        }

        return sorted;
    }
}
