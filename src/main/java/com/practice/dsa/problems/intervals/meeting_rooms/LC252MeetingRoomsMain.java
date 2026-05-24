package com.practice.dsa.problems.intervals.meeting_rooms;

public class LC252MeetingRoomsMain {
    public static void main(String[] args) {
        int[][] intervals = {
                {0, 30}, {5, 10}, {15, 20}
        };

        System.out.println("LC252 = " + new LC252MeetingRoomsSolver().canAttendMeetings(intervals));
    }
}
