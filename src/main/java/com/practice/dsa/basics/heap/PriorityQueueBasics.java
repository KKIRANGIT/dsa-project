package com.practice.dsa.basics.heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Beginner Java PriorityQueue reference.
 *
 * This complements the custom heap implementations by showing standard library usage.
 */
public class PriorityQueueBasics {
    public int[] twoSmallest(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int value : nums) {
            minHeap.offer(value);
        }

        return new int[]{minHeap.poll(), minHeap.poll()};
    }

    public int largest(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int value : nums) {
            maxHeap.offer(value);
        }
        return maxHeap.peek();
    }
}
