package com.practice.dsa.patterns.heap;

import com.practice.dsa.common.Interval;

public class PT3IntervalMinHeapTemplateMain {
    public static void main(String[] args) {
        PT3IntervalMinHeapTemplate template = new PT3IntervalMinHeapTemplate();
        Interval[] intervals = {new Interval(0, 30), new Interval(5, 10), new Interval(15, 20)};
        System.out.println(template.minimumRooms(intervals));
    }
}
