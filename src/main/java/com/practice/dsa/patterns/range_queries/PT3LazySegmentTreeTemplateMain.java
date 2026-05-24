package com.practice.dsa.patterns.range_queries;

public class PT3LazySegmentTreeTemplateMain {
    public static void main(String[] args) {
        PT3LazySegmentTreeTemplate tree = new PT3LazySegmentTreeTemplate(new int[]{1, 2, 3, 4, 5});
        System.out.println(tree.rangeSum(1, 3));
        tree.rangeAdd(1, 3, 2);
        System.out.println(tree.rangeSum(1, 3));
    }
}
