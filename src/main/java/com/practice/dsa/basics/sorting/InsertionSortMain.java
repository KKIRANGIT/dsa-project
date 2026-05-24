package com.practice.dsa.basics.sorting;

import java.util.Arrays;

public class InsertionSortMain {
    public static void main(String[] args) {
        int[] nums = {9, 4, 6, 2, 7};
        new InsertionSort().sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
