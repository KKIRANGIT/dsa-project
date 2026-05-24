package com.practice.dsa.patterns.intervals;

import com.practice.dsa.common.Interval;

public class PT3SweepLineTemplateMain {
    public static void main(String[] args) {
        PT3SweepLineTemplate template = new PT3SweepLineTemplate();
        Interval[] intervals = {new Interval(1, 5), new Interval(2, 6), new Interval(4, 7)};
        System.out.println(template.maximumOverlap(intervals));
    }
}
