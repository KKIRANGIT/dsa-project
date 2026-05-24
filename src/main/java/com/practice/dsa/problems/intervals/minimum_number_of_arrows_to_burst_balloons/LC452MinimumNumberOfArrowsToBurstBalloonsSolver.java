package com.practice.dsa.problems.intervals.minimum_number_of_arrows_to_burst_balloons;

import java.util.Arrays;

/**
 * LC 452 - Minimum Number of Arrows to Burst Balloons
 *
 * Beginner idea:
 * Sort by interval end.
 * Shoot one arrow at the earliest possible end,
 * then reuse it while intervals still overlap that point.
 */
public class LC452MinimumNumberOfArrowsToBurstBalloonsSolver {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrows = 1;
        int currentEnd = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > currentEnd) {
                arrows++;
                currentEnd = points[i][1];
            }
        }

        return arrows;
    }
}
