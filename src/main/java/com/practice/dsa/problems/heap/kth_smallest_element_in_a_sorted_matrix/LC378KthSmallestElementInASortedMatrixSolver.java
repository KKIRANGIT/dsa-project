package com.practice.dsa.problems.heap.kth_smallest_element_in_a_sorted_matrix;

import java.util.PriorityQueue;

/**
 * LC 378 - Kth Smallest Element in a Sorted Matrix
 *
 * Beginner idea:
 * Each row is sorted, so start with the first element from every row.
 * Then repeatedly pull the smallest item and push the next item from that row.
 */
public class LC378KthSmallestElementInASortedMatrixSolver {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<State> minHeap = new PriorityQueue<>((first, second) -> Integer.compare(first.value, second.value));

        for (int row = 0; row < matrix.length; row++) {
            minHeap.offer(new State(row, 0, matrix[row][0]));
        }

        for (int count = 1; count < k; count++) {
            State state = minHeap.poll();
            if (state.col + 1 < matrix[state.row].length) {
                minHeap.offer(new State(state.row, state.col + 1, matrix[state.row][state.col + 1]));
            }
        }

        return minHeap.peek().value;
    }

    private static class State {
        private final int row;
        private final int col;
        private final int value;

        private State(int row, int col, int value) {
            this.row = row;
            this.col = col;
            this.value = value;
        }
    }
}
