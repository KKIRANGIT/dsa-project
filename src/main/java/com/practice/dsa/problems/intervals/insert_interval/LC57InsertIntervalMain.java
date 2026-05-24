package com.practice.dsa.problems.intervals.insert_interval;

import java.util.Arrays;

public class LC57InsertIntervalMain {
    public static void main(String[] args) {
        // Insert a new interval into a sorted interval list.
        int[][] answer = new LC57InsertIntervalSolver().insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5});
        // Print the final intervals.
        System.out.println(Arrays.deepToString(answer));
    }
}
