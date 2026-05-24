package com.practice.dsa.problems.heap.ipo;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * LC 502 - IPO
 *
 * Beginner idea:
 * At each step, add every project we can currently afford into a max heap by profit.
 * Then choose the most profitable affordable project.
 */
public class LC502IPOSolver {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int[][] projects = new int[profits.length][2];
        for (int i = 0; i < profits.length; i++) {
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }

        Arrays.sort(projects, (first, second) -> Integer.compare(first[0], second[0]));
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((first, second) -> Integer.compare(second, first));

        int projectIndex = 0;
        int currentCapital = w;

        for (int chosen = 0; chosen < k; chosen++) {
            while (projectIndex < projects.length && projects[projectIndex][0] <= currentCapital) {
                maxHeap.offer(projects[projectIndex][1]);
                projectIndex++;
            }

            if (maxHeap.isEmpty()) {
                break;
            }

            currentCapital += maxHeap.poll();
        }

        return currentCapital;
    }
}
