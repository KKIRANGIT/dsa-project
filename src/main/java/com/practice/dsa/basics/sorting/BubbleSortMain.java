package com.practice.dsa.basics.sorting;

import java.util.Arrays;

public class BubbleSortMain {
    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 1, 3};
        new BubbleSort().sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
