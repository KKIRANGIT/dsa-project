package com.practice.dsa.basics.sorting;

import java.util.Arrays;

public class MergeSortMain {
    public static void main(String[] args) {
        // Unsorted sample array.
        int[] nums = {5, 1, 8, 3, 2};
        // Create sorter object.
        MergeSort mergeSort = new MergeSort();
        // Sort the array in place.
        mergeSort.sort(nums);

        // Print sorted array.
        System.out.println("sorted = " + Arrays.toString(nums));
    }
}
