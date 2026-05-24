package com.practice.dsa.patterns.two_pointers;

import java.util.Arrays;

/**
 * Beginner in-place overwrite pattern.
 *
 * Use this for problems like removing duplicates or filtering values in-place.
 */
public class PT4InPlaceOverwriteTemplate {
    public int removeDuplicatesFromSortedArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int write = 1;
        for (int read = 1; read < nums.length; read++) {
            if (nums[read] != nums[write - 1]) {
                nums[write] = nums[read];
                write++;
            }
        }

        return write;
    }
}
