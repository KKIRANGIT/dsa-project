package com.practice.dsa.problems.heap.find_median_from_data_stream;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * LC 295 - Find Median from Data Stream
 *
 * Beginner idea:
 * - max-heap keeps lower half
 * - min-heap keeps upper half
 */
public class LC295FindMedianFromDataStream {
    private final PriorityQueue<Integer> lowerHalf = new PriorityQueue<>(Collections.reverseOrder());
    private final PriorityQueue<Integer> upperHalf = new PriorityQueue<>();

    public void addNum(int num) {
        if (lowerHalf.isEmpty() || num <= lowerHalf.peek()) {
            lowerHalf.offer(num);
        } else {
            upperHalf.offer(num);
        }

        if (lowerHalf.size() > upperHalf.size() + 1) {
            upperHalf.offer(lowerHalf.poll());
        } else if (upperHalf.size() > lowerHalf.size()) {
            lowerHalf.offer(upperHalf.poll());
        }
    }

    public double findMedian() {
        if (lowerHalf.size() == upperHalf.size()) {
            return (lowerHalf.peek() + upperHalf.peek()) / 2.0;
        }
        return lowerHalf.peek();
    }
}
