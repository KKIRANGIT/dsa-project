package com.practice.dsa.basics.rangequeries;

import java.util.Arrays;

public class SegmentTreeBasicsMain {
    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 7, 3};
        SegmentTreeBasics tree = new SegmentTreeBasics(nums);

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("rangeSum(1, 3) = " + tree.rangeSum(1, 3));
        tree.update(2, 10);
        System.out.println("after update index 2 -> 10");
        System.out.println("rangeSum(1, 3) = " + tree.rangeSum(1, 3));
    }
}
