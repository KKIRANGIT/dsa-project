package com.practice.dsa.problems.heap.kth_largest_element_in_an_array;

import java.util.PriorityQueue;

/**
 * LC 215 - Kth Largest Element in an Array
 *
 * Beginner idea:
 * Keep only the k largest numbers seen so far in a min-heap.
 * The smallest value inside that heap is the kth largest overall.
 */
public class LC215KthLargestElementInAnArraySolver {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            // If more than k numbers are kept, remove the smallest.
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}
