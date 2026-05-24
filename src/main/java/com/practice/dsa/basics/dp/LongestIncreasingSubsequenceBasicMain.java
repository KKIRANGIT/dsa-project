package com.practice.dsa.basics.dp;

import java.util.Arrays;

public class LongestIncreasingSubsequenceBasicMain {
    public static void main(String[] args) {
        // One valid LIS here is [2, 3, 7, 101].
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        LongestIncreasingSubsequenceBasic dp = new LongestIncreasingSubsequenceBasic();

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("LIS length = " + dp.lisLength(nums));
    }
}
