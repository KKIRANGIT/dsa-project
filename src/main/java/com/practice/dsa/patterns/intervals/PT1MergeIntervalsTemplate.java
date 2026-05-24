package com.practice.dsa.patterns.intervals;

import com.practice.dsa.common.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Beginner merge-intervals pattern.
 *
 * Sort by start, then merge overlapping neighbors.
 */
public class PT1MergeIntervalsTemplate {
    public List<Interval> merge(Interval[] intervals) {
        // Sort by start time.
        Arrays.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        List<Interval> merged = new ArrayList<>();

        for (Interval current : intervals) {
            // If no overlap, start a new merged interval.
            if (merged.isEmpty() || merged.get(merged.size() - 1).end < current.start) {
                merged.add(new Interval(current.start, current.end));
                continue;
            }

            // Otherwise extend the previous merged interval.
            Interval last = merged.get(merged.size() - 1);
            last.end = Math.max(last.end, current.end);
        }

        return merged;
    }
}
