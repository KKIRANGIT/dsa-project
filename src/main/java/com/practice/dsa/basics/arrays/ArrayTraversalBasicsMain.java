package com.practice.dsa.basics.arrays;

import java.util.Arrays;

public class ArrayTraversalBasicsMain {
    public static void main(String[] args) {
        int[] nums = {5, 1, 9, 2, 7};
        ArrayTraversalBasics basics = new ArrayTraversalBasics();

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("sum forward = " + basics.sumForward(nums));
        System.out.println("sum backward = " + basics.sumBackward(nums));
        System.out.println("min = " + basics.findMin(nums));
        System.out.println("max = " + basics.findMax(nums));
    }
}
