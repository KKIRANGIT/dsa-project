package com.practice.dsa.patterns.greedy;

import com.practice.dsa.common.Interval;

import java.util.Arrays;

/**
 * Beginner greedy interval pattern.
 *
 * Sort by ending time and always keep the interval that ends earliest.
 */
public class PT2IntervalGreedyTemplate {
    public int eraseOverlapCount(Interval[] intervals) {
        // Sort intervals by end value.
        Arrays.sort(intervals, (a, b) -> Integer.compare(a.end, b.end));

        int keep = 0;
        int lastEnd = Integer.MIN_VALUE;

        for (Interval interval : intervals) {
            // Keep interval if it starts after or at last kept end.
            if (interval.start >= lastEnd) {
                keep++;
                lastEnd = interval.end;
            }
        }

        // Remove everything not kept.
        return intervals.length - keep;
    }
}
