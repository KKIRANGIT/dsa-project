package com.practice.dsa.patterns.stack;

import java.util.Arrays;

public class PT2MonotonicStackTemplateMain {
    public static void main(String[] args) {
        // Create template helper.
        PT2MonotonicStackTemplate template = new PT2MonotonicStackTemplate();
        // Print next greater values for each position.
        System.out.println(Arrays.toString(template.nextGreaterElements(new int[]{2, 1, 2, 4, 3})));
    }
}
