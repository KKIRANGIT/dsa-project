package com.practice.dsa.problems.binary_search.binary_search;

public class LC704BinarySearchMain {
    public static void main(String[] args) {
        // Create solver object.
        LC704BinarySearchSolver solver = new LC704BinarySearchSolver();
        // Search target 9 in the sorted array.
        System.out.println(solver.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }
}
