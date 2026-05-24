package com.practice.dsa.problems.heap.top_k_frequent_elements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * LC 347 - Top K Frequent Elements
 *
 * Beginner idea:
 * Count frequencies first, then keep only the k best entries in a min heap.
 */
public class LC347TopKFrequentElementsSolver {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((first, second) -> Integer.compare(first[1], second[1]));
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            minHeap.offer(new int[]{entry.getKey(), entry.getValue()});
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] answer = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            answer[i] = minHeap.poll()[0];
        }
        return answer;
    }
}
