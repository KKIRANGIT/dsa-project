package com.practice.dsa.basics.sorting;

import java.util.Arrays;

public class SelectionSortMain {
    public static void main(String[] args) {
        int[] nums = {8, 5, 1, 4, 2};
        new SelectionSort().sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
