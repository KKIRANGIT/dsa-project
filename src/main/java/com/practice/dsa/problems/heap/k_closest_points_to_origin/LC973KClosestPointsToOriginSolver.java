package com.practice.dsa.problems.heap.k_closest_points_to_origin;

import java.util.PriorityQueue;

/**
 * LC 973 - K Closest Points to Origin
 *
 * Beginner idea:
 * Keep only the k closest points seen so far.
 * A max-heap lets us remove the farthest point whenever the heap grows too large.
 */
public class LC973KClosestPointsToOriginSolver {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(distance(b), distance(a)));

        for (int[] point : points) {
            maxHeap.offer(point);
            // Remove the farthest point if we are keeping too many.
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] answer = new int[k][2];
        for (int i = 0; i < k; i++) {
            answer[i] = maxHeap.poll();
        }
        return answer;
    }

    private int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
