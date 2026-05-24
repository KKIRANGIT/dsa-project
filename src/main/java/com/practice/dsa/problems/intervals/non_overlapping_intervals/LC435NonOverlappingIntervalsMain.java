package com.practice.dsa.problems.intervals.non_overlapping_intervals;

public class LC435NonOverlappingIntervalsMain {
    public static void main(String[] args) {
        // Print how many intervals must be removed to avoid overlap.
        System.out.println(new LC435NonOverlappingIntervalsSolver().eraseOverlapIntervals(
                new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
    }
}
