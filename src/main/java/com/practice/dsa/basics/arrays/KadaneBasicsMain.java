package com.practice.dsa.basics.arrays;

import java.util.Arrays;

public class KadaneBasicsMain {
    public static void main(String[] args) {
        // Best subarray here is [4, -1, 2, 1], which sums to 6.
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        KadaneBasics basics = new KadaneBasics();

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("max subarray sum = " + basics.maxSubarraySum(nums));
    }
}
