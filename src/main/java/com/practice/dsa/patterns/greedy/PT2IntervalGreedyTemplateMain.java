package com.practice.dsa.patterns.greedy;

import com.practice.dsa.common.Interval;

public class PT2IntervalGreedyTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT2IntervalGreedyTemplate template = new PT2IntervalGreedyTemplate();
        Interval[] intervals = {
                new Interval(1, 2),
                new Interval(2, 3),
                new Interval(3, 4),
                new Interval(1, 3)
        };
        // Print how many intervals must be removed.
        System.out.println("remove = " + template.eraseOverlapCount(intervals));
    }
}
