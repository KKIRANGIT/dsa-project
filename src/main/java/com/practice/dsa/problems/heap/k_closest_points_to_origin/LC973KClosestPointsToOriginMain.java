package com.practice.dsa.problems.heap.k_closest_points_to_origin;

import java.util.Arrays;

public class LC973KClosestPointsToOriginMain {
    public static void main(String[] args) {
        // Find the closest point to the origin.
        int[][] answer = new LC973KClosestPointsToOriginSolver().kClosest(new int[][]{{1, 3}, {-2, 2}}, 1);
        // Print the result.
        System.out.println(Arrays.deepToString(answer));
    }
}
