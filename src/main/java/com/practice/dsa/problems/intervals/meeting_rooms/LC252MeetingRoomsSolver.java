package com.practice.dsa.problems.intervals.meeting_rooms;

import java.util.Arrays;

/**
 * LC 252 - Meeting Rooms
 *
 * Beginner idea:
 * Sort by start time and check whether any meeting starts before the previous one ends.
 */
public class LC252MeetingRoomsSolver {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (first, second) -> Integer.compare(first[0], second[0]));

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }

        return true;
    }
}
