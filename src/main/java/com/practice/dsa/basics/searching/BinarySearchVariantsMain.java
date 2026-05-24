package com.practice.dsa.basics.searching;

public class BinarySearchVariantsMain {
    public static void main(String[] args) {
        // Sorted sample array.
        int[] nums = {1, 3, 3, 5, 8};
        // Create search helper.
        BinarySearchVariants search = new BinarySearchVariants();

        // Exact search for 5.
        System.out.println("exact 5   = " + search.exactSearch(nums, 5));
        // Lower bound of 4 should point to value 5.
        System.out.println("lower 4   = " + search.lowerBound(nums, 4));
    }
}
