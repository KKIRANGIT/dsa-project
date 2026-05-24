package com.practice.dsa.problems.heap.kth_largest_element_in_a_stream;

import java.util.PriorityQueue;

/**
 * LC 703 - Kth Largest Element in a Stream
 *
 * Beginner idea:
 * Keep a min-heap of size k.
 * The top is always the kth largest among the values kept so far.
 */
public class LC703KthLargestInAStream {
    private final int k;
    private final PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public LC703KthLargestInAStream(int k, int[] nums) {
        this.k = k;
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
