package com.practice.dsa.basics.sorting;

import java.util.Arrays;

public class CountingSortBasicsMain {
    public static void main(String[] args) {
        // Small value range is what makes counting sort a good fit here.
        int[] nums = {4, 2, 2, 8, 3, 3, 1};
        int[] sorted = new CountingSortBasics().sort(nums, 8);

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("sorted = " + Arrays.toString(sorted));
    }
}
