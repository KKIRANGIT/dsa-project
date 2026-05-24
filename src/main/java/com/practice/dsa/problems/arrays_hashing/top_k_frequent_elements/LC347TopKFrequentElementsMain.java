package com.practice.dsa.problems.arrays_hashing.top_k_frequent_elements;

import java.util.Arrays;

public class LC347TopKFrequentElementsMain {
    public static void main(String[] args) {
        // Example input array.
        int[] nums = {1, 1, 1, 2, 2, 3};
        // Create solver object.
        LC347TopKFrequentElementsSolver solver = new LC347TopKFrequentElementsSolver();

        // Print the most frequent 2 values.
        System.out.println("answer = " + Arrays.toString(solver.topKFrequent(nums, 2)));
    }
}
