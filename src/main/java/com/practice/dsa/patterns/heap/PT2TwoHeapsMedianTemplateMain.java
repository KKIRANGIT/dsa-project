package com.practice.dsa.patterns.heap;

public class PT2TwoHeapsMedianTemplateMain {
    public static void main(String[] args) {
        PT2TwoHeapsMedianTemplate template = new PT2TwoHeapsMedianTemplate();
        template.add(1);
        template.add(5);
        template.add(2);
        System.out.println(template.median());
    }
}
