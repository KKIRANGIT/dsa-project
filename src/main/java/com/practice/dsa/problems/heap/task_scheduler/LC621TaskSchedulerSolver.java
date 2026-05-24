package com.practice.dsa.problems.heap.task_scheduler;

/**
 * LC 621 - Task Scheduler
 *
 * Beginner idea:
 * The most frequent task creates the schedule skeleton.
 * Other tasks can fill the idle slots between those copies.
 */
public class LC621TaskSchedulerSolver {
    public int leastInterval(char[] tasks, int n) {
        int[] frequency = new int[26];
        int maxFrequency = 0;

        for (char task : tasks) {
            int count = ++frequency[task - 'A'];
            maxFrequency = Math.max(maxFrequency, count);
        }

        int tasksWithMaxFrequency = 0;
        for (int count : frequency) {
            if (count == maxFrequency) {
                tasksWithMaxFrequency++;
            }
        }

        int frameLength = (maxFrequency - 1) * (n + 1) + tasksWithMaxFrequency;
        return Math.max(tasks.length, frameLength);
    }
}
