package com.practice.dsa.problems.stack;

import com.practice.dsa.problems.stack.daily_temperatures.LC739DailyTemperaturesSolver;
import com.practice.dsa.problems.stack.valid_parentheses.LC20ValidParenthesesSolver;

import java.util.Arrays;

/**
 * Beginner topic runner for Stack problems.
 */
public class StackProblemsMain {
    public static void main(String[] args) {
        // Run a valid-parentheses sample.
        System.out.println("LC20  = " + new LC20ValidParenthesesSolver().isValid("({[]})"));
        // Run a daily-temperatures sample.
        System.out.println("LC739 = " + Arrays.toString(new LC739DailyTemperaturesSolver().dailyTemperatures(
                new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
}
