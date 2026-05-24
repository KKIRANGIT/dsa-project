package com.practice.dsa.basics.heap;

import java.util.Arrays;

public class PriorityQueueBasicsMain {
    public static void main(String[] args) {
        int[] nums = {9, 1, 7, 3, 8};
        PriorityQueueBasics basics = new PriorityQueueBasics();

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("two smallest = " + Arrays.toString(basics.twoSmallest(nums)));
        System.out.println("largest = " + basics.largest(nums));
    }
}
