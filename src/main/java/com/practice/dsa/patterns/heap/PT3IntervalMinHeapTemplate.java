package com.practice.dsa.patterns.heap;

import com.practice.dsa.common.Interval;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Beginner interval min-heap pattern.
 *
 * Use for meeting-room style problems.
 */
public class PT3IntervalMinHeapTemplate {
    public int minimumRooms(Interval[] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (Interval interval : intervals) {
            if (!minHeap.isEmpty() && minHeap.peek() <= interval.start) {
                minHeap.poll();
            }
            minHeap.offer(interval.end);
        }

        return minHeap.size();
    }
}
