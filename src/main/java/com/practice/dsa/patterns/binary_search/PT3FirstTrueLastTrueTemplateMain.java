package com.practice.dsa.patterns.binary_search;

public class PT3FirstTrueLastTrueTemplateMain {
    public static void main(String[] args) {
        boolean[] flags = {false, false, true, true, true};
        PT3FirstTrueLastTrueTemplate template = new PT3FirstTrueLastTrueTemplate();
        System.out.println("firstTrue = " + template.firstTrue(flags));
        System.out.println("lastTrue = " + template.lastTrue(flags));
    }
}
