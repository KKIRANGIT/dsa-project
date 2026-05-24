package com.practice.dsa.problems.intervals.non_overlapping_intervals;

import java.util.Arrays;

/**
 * LC 435 - Non-overlapping Intervals
 *
 * Beginner idea:
 * Sort by end time and greedily keep intervals that finish earliest.
 * That leaves the most room for later intervals.
 */
public class LC435NonOverlappingIntervalsSolver {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int keep = 0;
        int end = Integer.MIN_VALUE;

        for (int[] interval : intervals) {
            if (interval[0] >= end) {
                keep++;
                end = interval[1];
            }
        }

        return intervals.length - keep;
    }
}
