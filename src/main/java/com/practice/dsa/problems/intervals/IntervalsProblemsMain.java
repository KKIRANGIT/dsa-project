package com.practice.dsa.problems.intervals;

import com.practice.dsa.problems.intervals.insert_interval.LC57InsertIntervalSolver;
import com.practice.dsa.problems.intervals.interval_list_intersections.LC986IntervalListIntersectionsSolver;
import com.practice.dsa.problems.intervals.meeting_rooms.LC252MeetingRoomsSolver;
import com.practice.dsa.problems.intervals.meeting_rooms_ii.LC253MeetingRoomsIISolver;
import com.practice.dsa.problems.intervals.merge_intervals.LC56MergeIntervalsSolver;
import com.practice.dsa.problems.intervals.minimum_number_of_arrows_to_burst_balloons.LC452MinimumNumberOfArrowsToBurstBalloonsSolver;
import com.practice.dsa.problems.intervals.non_overlapping_intervals.LC435NonOverlappingIntervalsSolver;
import com.practice.dsa.problems.intervals.remove_covered_intervals.LC1288RemoveCoveredIntervalsSolver;
import com.practice.dsa.problems.intervals.divide_intervals_into_minimum_number_of_groups.LC2406DivideIntervalsIntoMinimumNumberOfGroupsSolver;

import java.util.Arrays;

public class IntervalsProblemsMain {
    public static void main(String[] args) {
        // Run merge-intervals sample.
        System.out.println("LC56  = " + Arrays.deepToString(new LC56MergeIntervalsSolver().merge(
                new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
        // Run insert-interval sample.
        System.out.println("LC57  = " + Arrays.deepToString(new LC57InsertIntervalSolver().insert(
                new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5})));
        // Run non-overlapping-intervals sample.
        System.out.println("LC435 = " + new LC435NonOverlappingIntervalsSolver().eraseOverlapIntervals(
                new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));
        System.out.println("LC452 = " + new LC452MinimumNumberOfArrowsToBurstBalloonsSolver().findMinArrowShots(
                new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}}
        ));
        System.out.println("LC1288 = " + new LC1288RemoveCoveredIntervalsSolver().removeCoveredIntervals(
                new int[][]{{1, 4}, {3, 6}, {2, 8}}
        ));
        System.out.println("LC986 = " + Arrays.deepToString(new LC986IntervalListIntersectionsSolver().intervalIntersection(
                new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}},
                new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}}
        )));
        System.out.println("LC2406 = " + new LC2406DivideIntervalsIntoMinimumNumberOfGroupsSolver().minGroups(
                new int[][]{{5, 10}, {6, 8}, {1, 5}, {2, 3}, {1, 10}}
        ));
        System.out.println("LC252 = " + new LC252MeetingRoomsSolver().canAttendMeetings(
                new int[][]{{0, 30}, {5, 10}, {15, 20}}
        ));
        System.out.println("LC253 = " + new LC253MeetingRoomsIISolver().minMeetingRooms(
                new int[][]{{0, 30}, {5, 10}, {15, 20}}
        ));
    }
}
