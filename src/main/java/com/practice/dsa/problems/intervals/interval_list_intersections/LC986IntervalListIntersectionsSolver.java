package com.practice.dsa.problems.intervals.interval_list_intersections;

import java.util.ArrayList;
import java.util.List;

/**
 * LC 986 - Interval List Intersections
 *
 * Beginner idea:
 * Both lists are sorted.
 * Compare the current pair, record overlap if it exists, then advance the interval that ends first.
 */
public class LC986IntervalListIntersectionsSolver {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> intersections = new ArrayList<>();
        int first = 0;
        int second = 0;

        while (first < firstList.length && second < secondList.length) {
            int start = Math.max(firstList[first][0], secondList[second][0]);
            int end = Math.min(firstList[first][1], secondList[second][1]);

            if (start <= end) {
                intersections.add(new int[]{start, end});
            }

            if (firstList[first][1] < secondList[second][1]) {
                first++;
            } else {
                second++;
            }
        }

        return intersections.toArray(new int[0][]);
    }
}
