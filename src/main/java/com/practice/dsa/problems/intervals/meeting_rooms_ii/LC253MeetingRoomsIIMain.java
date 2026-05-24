package com.practice.dsa.problems.intervals.meeting_rooms_ii;

public class LC253MeetingRoomsIIMain {
    public static void main(String[] args) {
        int[][] intervals = {
                {0, 30}, {5, 10}, {15, 20}
        };

        System.out.println("LC253 = " + new LC253MeetingRoomsIISolver().minMeetingRooms(intervals));
    }
}
