package com.practice.dsa.problems.stack.daily_temperatures;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * LC 739 - Daily Temperatures
 *
 * Beginner idea:
 * The stack stores indexes of days whose warmer answer is not known yet.
 * The temperatures at those indexes stay in decreasing order.
 *
 * When a warmer day appears, it resolves one or more older days.
 */
public class LC739DailyTemperaturesSolver {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {
            // Resolve older colder days using today's warmer temperature.
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int previousDay = stack.pop();
                answer[previousDay] = i - previousDay;
            }
            // Today now waits for its own future warmer day.
            stack.push(i);
        }

        return answer;
    }
}
