package com.practice.dsa.patterns.range_queries;

public class PT2SegmentTreeTemplateMain {
    public static void main(String[] args) {
        PT2SegmentTreeTemplate segmentTree = new PT2SegmentTreeTemplate(new int[]{2, 4, 1, 7, 3});

        System.out.println("query(1, 3) = " + segmentTree.query(1, 3));
        segmentTree.update(2, 10);
        System.out.println("query(1, 3) after update = " + segmentTree.query(1, 3));
    }
}
