package com.practice.dsa.patterns.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Beginner top-k heap pattern.
 *
 * Keep only k best candidates using a heap.
 * Here we keep the k smallest values using a max-heap.
 */
public class PT1TopKTemplate {
    public List<Integer> topKSmallest(int[] nums, int k) {
        // Largest among kept values stays on top.
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int num : nums) {
            maxHeap.offer(num);
            // If too many kept, remove the current largest.
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Convert heap contents to list.
        return new ArrayList<>(maxHeap);
    }
}
