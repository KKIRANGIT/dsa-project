package com.practice.dsa.problems.binary_search.search_in_rotated_sorted_array;

public class LC33SearchInRotatedSortedArrayMain {
    public static void main(String[] args) {
        // Create solver object.
        LC33SearchInRotatedSortedArraySolver solver = new LC33SearchInRotatedSortedArraySolver();
        // Search target 0 in a rotated sorted array.
        System.out.println(solver.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }
}
