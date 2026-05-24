package com.practice.dsa.problems.heap.top_k_frequent_elements;

import java.util.Arrays;

public class LC347TopKFrequentElementsMain {
    public static void main(String[] args) {
        System.out.println("LC347 = " + Arrays.toString(
                new LC347TopKFrequentElementsSolver().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}
