package com.practice.dsa.patterns.sliding_window;

public class PT1FixedWindowTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT1FixedWindowTemplate template = new PT1FixedWindowTemplate();
        // Print maximum sum among all windows of size 3.
        System.out.println(template.maxSumWindow(new int[]{1, 2, 3, 4, 5}, 3));
    }
}
