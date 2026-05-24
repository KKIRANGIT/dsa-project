package com.practice.dsa.problems.intervals.remove_covered_intervals;

import java.util.Arrays;

/**
 * LC 1288 - Remove Covered Intervals
 *
 * Beginner idea:
 * Sort by start ascending and end descending.
 * Then count only intervals whose end pushes farther than previous best end.
 */
public class LC1288RemoveCoveredIntervalsSolver {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(b[1], a[1]);
        });

        int remaining = 0;
        int farthestEnd = 0;

        for (int[] interval : intervals) {
            if (interval[1] > farthestEnd) {
                remaining++;
                farthestEnd = interval[1];
            }
        }

        return remaining;
    }
}
