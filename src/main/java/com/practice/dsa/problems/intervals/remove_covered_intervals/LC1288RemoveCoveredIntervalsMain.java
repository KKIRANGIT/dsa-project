package com.practice.dsa.problems.intervals.remove_covered_intervals;

public class LC1288RemoveCoveredIntervalsMain {
    public static void main(String[] args) {
        System.out.println(new LC1288RemoveCoveredIntervalsSolver().removeCoveredIntervals(
                new int[][]{{1, 4}, {3, 6}, {2, 8}}
        ));
    }
}
