package com.practice.dsa.patterns.intervals;

import com.practice.dsa.common.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Beginner sweep-line interval pattern.
 */
public class PT3SweepLineTemplate {
    public int maximumOverlap(Interval[] intervals) {
        List<int[]> events = new ArrayList<>();

        for (Interval interval : intervals) {
            events.add(new int[]{interval.start, 1});
            events.add(new int[]{interval.end, -1});
        }

        Collections.sort(events, (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));

        int current = 0;
        int best = 0;
        for (int[] event : events) {
            current += event[1];
            best = Math.max(best, current);
        }

        return best;
    }
}
