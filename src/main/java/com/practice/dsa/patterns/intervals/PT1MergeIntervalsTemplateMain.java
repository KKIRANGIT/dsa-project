package com.practice.dsa.patterns.intervals;

import com.practice.dsa.common.Interval;

public class PT1MergeIntervalsTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT1MergeIntervalsTemplate template = new PT1MergeIntervalsTemplate();
        Interval[] intervals = {
                new Interval(1, 3),
                new Interval(2, 6),
                new Interval(8, 10),
                new Interval(15, 18)
        };
        // Print merged intervals.
        System.out.println(template.merge(intervals));
    }
}
