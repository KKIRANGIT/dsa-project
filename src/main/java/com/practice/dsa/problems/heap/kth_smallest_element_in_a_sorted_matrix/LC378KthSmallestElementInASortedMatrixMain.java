package com.practice.dsa.problems.heap.kth_smallest_element_in_a_sorted_matrix;

public class LC378KthSmallestElementInASortedMatrixMain {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };

        System.out.println("LC378 = " + new LC378KthSmallestElementInASortedMatrixSolver().kthSmallest(matrix, 8));
    }
}
