package com.practice.dsa.patterns.binary_search;

public class PT2LowerUpperBoundTemplateMain {
    public static void main(String[] args) {
        // Sorted sample array.
        int[] nums = {1, 2, 2, 2, 5, 7};
        // Create template helper.
        PT2LowerUpperBoundTemplate template = new PT2LowerUpperBoundTemplate();
        // Print lower bound.
        System.out.println("lowerBound(2) = " + template.lowerBound(nums, 2));
        // Print upper bound.
        System.out.println("upperBound(2) = " + template.upperBound(nums, 2));
    }
}
