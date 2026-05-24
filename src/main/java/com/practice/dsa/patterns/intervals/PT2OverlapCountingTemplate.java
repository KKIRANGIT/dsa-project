package com.practice.dsa.patterns.intervals;

import java.util.Arrays;

/**
 * Beginner overlap-counting interval pattern.
 */
public class PT2OverlapCountingTemplate {
    public int removalsToAvoidOverlap(int[][] intervals) {
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
