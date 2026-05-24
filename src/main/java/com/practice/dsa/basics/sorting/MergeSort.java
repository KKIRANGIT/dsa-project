package com.practice.dsa.basics.sorting;

/**
 * Beginner merge sort reference.
 *
 * Divide the array into halves,
 * sort each half,
 * then merge the sorted halves.
 */
public class MergeSort {
    public void sort(int[] nums) {
        // Temp array helps during merging.
        int[] temp = new int[nums.length];
        sort(nums, temp, 0, nums.length - 1);
    }

    private void sort(int[] nums, int[] temp, int left, int right) {
        // Single element is already sorted.
        if (left >= right) {
            return;
        }

        // Split current range into two halves.
        int mid = left + (right - left) / 2;
        sort(nums, temp, left, mid);
        sort(nums, temp, mid + 1, right);
        // Merge the two sorted halves.
        merge(nums, temp, left, mid, right);
    }

    private void merge(int[] nums, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        // Take smaller front element from left half or right half.
        while (i <= mid && j <= right) {
            temp[k++] = nums[i] <= nums[j] ? nums[i++] : nums[j++];
        }
        // Copy any remaining left-half values.
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        // Copy any remaining right-half values.
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        // Copy merged range back into original array.
        for (int index = left; index <= right; index++) {
            nums[index] = temp[index];
        }
    }
}
