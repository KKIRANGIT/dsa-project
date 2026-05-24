package com.practice.dsa.problems.stack.daily_temperatures;

import java.util.Arrays;

public class LC739DailyTemperaturesMain {
    public static void main(String[] args) {
        // Create solver object.
        LC739DailyTemperaturesSolver solver = new LC739DailyTemperaturesSolver();
        // Print how many days each temperature waits for a warmer day.
        System.out.println(Arrays.toString(solver.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
}
