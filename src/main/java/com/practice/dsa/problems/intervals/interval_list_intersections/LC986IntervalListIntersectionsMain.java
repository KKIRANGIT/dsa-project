package com.practice.dsa.problems.intervals.interval_list_intersections;

import java.util.Arrays;

public class LC986IntervalListIntersectionsMain {
    public static void main(String[] args) {
        int[][] first = {
                {0, 2}, {5, 10}, {13, 23}, {24, 25}
        };
        int[][] second = {
                {1, 5}, {8, 12}, {15, 24}, {25, 26}
        };

        System.out.println("LC986 = " + Arrays.deepToString(new LC986IntervalListIntersectionsSolver().intervalIntersection(first, second)));
    }
}
