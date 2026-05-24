package com.practice.dsa.problems.intervals.divide_intervals_into_minimum_number_of_groups;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * LC 2406 - Divide Intervals Into Minimum Number of Groups
 *
 * Beginner idea:
 * This is similar to room allocation.
 * Reuse the group whose ending value is smallest if it no longer overlaps.
 */
public class LC2406DivideIntervalsIntoMinimumNumberOfGroupsSolver {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (first, second) -> Integer.compare(first[0], second[0]));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int[] interval : intervals) {
            if (!minHeap.isEmpty() && minHeap.peek() < interval[0]) {
                minHeap.poll();
            }
            minHeap.offer(interval[1]);
        }

        return minHeap.size();
    }
}
