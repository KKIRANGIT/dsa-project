package com.practice.dsa.problems.intervals.meeting_rooms_ii;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * LC 253 - Meeting Rooms II
 *
 * Beginner idea:
 * Keep track of the earliest ending meeting.
 * If the next meeting starts after that, we can reuse the same room.
 */
public class LC253MeetingRoomsIISolver {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (first, second) -> Integer.compare(first[0], second[0]));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int[] interval : intervals) {
            if (!minHeap.isEmpty() && minHeap.peek() <= interval[0]) {
                minHeap.poll();
            }
            minHeap.offer(interval[1]);
        }

        return minHeap.size();
    }
}
