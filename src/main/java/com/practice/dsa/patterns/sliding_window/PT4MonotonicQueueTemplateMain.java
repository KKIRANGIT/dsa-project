package com.practice.dsa.patterns.sliding_window;

import java.util.Arrays;

public class PT4MonotonicQueueTemplateMain {
    public static void main(String[] args) {
        PT4MonotonicQueueTemplate template = new PT4MonotonicQueueTemplate();
        System.out.println(Arrays.toString(template.windowMaximums(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }
}
