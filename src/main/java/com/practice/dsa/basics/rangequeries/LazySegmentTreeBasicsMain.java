package com.practice.dsa.basics.rangequeries;

import java.util.Arrays;

public class LazySegmentTreeBasicsMain {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        LazySegmentTreeBasics tree = new LazySegmentTreeBasics(nums);

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("rangeSum(1, 3) = " + tree.rangeSum(1, 3));
        tree.rangeAdd(1, 3, 10);
        System.out.println("after rangeAdd(1, 3, 10)");
        System.out.println("rangeSum(1, 3) = " + tree.rangeSum(1, 3));
    }
}
