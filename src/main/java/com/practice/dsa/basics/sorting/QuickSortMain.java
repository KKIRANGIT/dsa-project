package com.practice.dsa.basics.sorting;

import java.util.Arrays;

public class QuickSortMain {
    public static void main(String[] args) {
        // Unsorted sample array.
        int[] nums = {9, 3, 7, 1, 4, 8};
        System.out.println("before = " + Arrays.toString(nums));
        // Create sorter object.
        QuickSort quickSort = new QuickSort();
        // Sort array in place.
        quickSort.sort(nums);

        // Print sorted result after partitioning and recursive sorting.
        System.out.println("sorted = " + Arrays.toString(nums));
    }
}
