package com.practice.dsa.basics.sorting;

/**
 * Beginner quick sort reference.
 *
 * Choose a pivot,
 * move smaller values to the left,
 * move larger values to the right,
 * then sort both sides recursively.
 *
 * Important beginner idea:
 * partition does not fully sort the array.
 * It only puts the pivot into its final correct position.
 */
public class QuickSort {
    public void sort(int[] nums) {
        // Sort the full array.
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] nums, int left, int right) {
        // Range of size 0 or 1 is already sorted.
        if (left >= right) {
            return;
        }

        // Partition returns the final correct position of the pivot.
        int pivotIndex = partition(nums, left, right);
        // Sort values left of pivot.
        quickSort(nums, left, pivotIndex - 1);
        // Sort values right of pivot.
        quickSort(nums, pivotIndex + 1, right);
    }

    private int partition(int[] nums, int left, int right) {
        // Choose last element as pivot.
        int pivot = nums[right];
        // smaller marks where the next small-or-equal value should go.
        int smaller = left;

        for (int current = left; current < right; current++) {
            if (nums[current] <= pivot) {
                // Put small values into the left partition.
                swap(nums, smaller, current);
                smaller++;
            }
        }

        // Put pivot after the smaller partition.
        // After this swap:
        // - everything left of smaller is <= pivot
        // - pivot is at index smaller
        // - everything right of smaller is > pivot
        swap(nums, smaller, right);
        return smaller;
    }

    private void swap(int[] nums, int i, int j) {
        // Standard array swap.
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
