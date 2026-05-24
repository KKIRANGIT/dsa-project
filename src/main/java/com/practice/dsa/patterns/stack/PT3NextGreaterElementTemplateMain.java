package com.practice.dsa.patterns.stack;

import java.util.Arrays;

public class PT3NextGreaterElementTemplateMain {
    public static void main(String[] args) {
        PT3NextGreaterElementTemplate template = new PT3NextGreaterElementTemplate();
        System.out.println(Arrays.toString(template.nextGreaterToRight(new int[]{2, 1, 2, 4, 3})));
    }
}
