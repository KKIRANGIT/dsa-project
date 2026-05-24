package com.practice.dsa.problems.arrays_hashing.top_k_frequent_elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LC 347 - Top K Frequent Elements
 *
 * Beginner idea:
 * 1. Count how many times each number appears.
 * 2. Put numbers into "buckets" based on frequency.
 * 3. Read the buckets from high frequency to low frequency.
 */
public class LC347TopKFrequentElementsSolver {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }

        // Put each number into the bucket that matches its frequency.
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            buckets.get(entry.getValue()).add(entry.getKey());
        }

        int[] answer = new int[k];
        int index = 0;

        // Start from the highest frequency bucket.
        for (int count = buckets.size() - 1; count >= 0 && index < k; count--) {
            for (int value : buckets.get(count)) {
                answer[index++] = value;
                if (index == k) {
                    return answer;
                }
            }
        }
        return answer;
    }
}
