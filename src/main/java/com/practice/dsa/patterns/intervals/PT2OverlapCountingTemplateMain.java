package com.practice.dsa.patterns.intervals;

public class PT2OverlapCountingTemplateMain {
    public static void main(String[] args) {
        PT2OverlapCountingTemplate template = new PT2OverlapCountingTemplate();
        System.out.println(template.removalsToAvoidOverlap(new int[][]{{1, 2}, {2, 3}, {1, 3}}));
    }
}
