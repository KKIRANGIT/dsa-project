package com.practice.dsa.patterns.dp;

public class PT1MemoizationTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT1MemoizationTemplate template = new PT1MemoizationTemplate();
        // Print number of ways to climb 6 steps.
        System.out.println(template.climbStairs(6));
    }
}
