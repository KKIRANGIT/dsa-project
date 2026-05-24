package com.practice.dsa.problems.intervals.insert_interval;

import java.util.ArrayList;
import java.util.List;

/**
 * LC 57 - Insert Interval
 *
 * Beginner idea:
 * Process in three parts:
 * 1. intervals completely before newInterval
 * 2. intervals overlapping newInterval
 * 3. intervals completely after newInterval
 */
public class LC57InsertIntervalSolver {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int index = 0;

        while (index < intervals.length && intervals[index][1] < newInterval[0]) {
            result.add(intervals[index++]);
        }

        while (index < intervals.length && intervals[index][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[index][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[index][1]);
            index++;
        }
        result.add(newInterval);

        while (index < intervals.length) {
            result.add(intervals[index++]);
        }

        return result.toArray(new int[0][]);
    }
}
