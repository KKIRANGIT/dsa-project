package com.practice.dsa.problems.intervals.divide_intervals_into_minimum_number_of_groups;

public class LC2406DivideIntervalsIntoMinimumNumberOfGroupsMain {
    public static void main(String[] args) {
        int[][] intervals = {
                {5, 10}, {6, 8}, {1, 5}, {2, 3}, {1, 10}
        };

        System.out.println("LC2406 = " + new LC2406DivideIntervalsIntoMinimumNumberOfGroupsSolver().minGroups(intervals));
    }
}
