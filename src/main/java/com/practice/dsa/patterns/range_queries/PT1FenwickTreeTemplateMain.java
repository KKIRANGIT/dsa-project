package com.practice.dsa.patterns.range_queries;

public class PT1FenwickTreeTemplateMain {
    public static void main(String[] args) {
        PT1FenwickTreeTemplate fenwick = new PT1FenwickTreeTemplate(5);

        fenwick.add(0, 2);
        fenwick.add(1, 4);
        fenwick.add(2, 1);
        fenwick.add(3, 7);
        fenwick.add(4, 3);

        System.out.println("prefixSum(3) = " + fenwick.prefixSum(3));
        System.out.println("rangeSum(1, 3) = " + fenwick.rangeSum(1, 3));
    }
}
