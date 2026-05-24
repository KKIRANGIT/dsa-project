package com.practice.dsa.problems.graphs.course_schedule;

public class LC207CourseScheduleMain {
    public static void main(String[] args) {
        int[][] prerequisites = {
                {1, 0},
                {2, 1},
                {3, 2}
        };

        System.out.println("LC207 = " + new LC207CourseScheduleSolver().canFinish(4, prerequisites));
    }
}
