package com.practice.dsa.basics.arrays;

import java.util.Arrays;

public class TwoDimensionalPrefixSumMain {
    public static void main(String[] args) {
        // Query target:
        // rectangle from (1,1) to (2,2) contains values 5, 6, 8, 9.
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        TwoDimensionalPrefixSum prefixSum = new TwoDimensionalPrefixSum();
        int[][] prefix = prefixSum.buildPrefix(grid);

        System.out.println("grid = " + Arrays.deepToString(grid));
        System.out.println("prefix = " + Arrays.deepToString(prefix));
        System.out.println("sum of rectangle [(1,1) to (2,2)] = " + prefixSum.rectangleSum(prefix, 1, 1, 2, 2));
    }
}
