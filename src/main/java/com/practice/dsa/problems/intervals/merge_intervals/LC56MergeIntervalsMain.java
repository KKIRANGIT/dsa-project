package com.practice.dsa.problems.intervals.merge_intervals;

import java.util.Arrays;

public class LC56MergeIntervalsMain {
    public static void main(String[] args) {
        // Merge overlapping intervals.
        int[][] answer = new LC56MergeIntervalsSolver().merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        // Print the merged result.
        System.out.println(Arrays.deepToString(answer));
    }
}
