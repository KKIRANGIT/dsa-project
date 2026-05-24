package com.practice.dsa.patterns.range_queries;

public class PT4SparseTableTemplateMain {
    public static void main(String[] args) {
        PT4SparseTableTemplate template = new PT4SparseTableTemplate(new int[]{7, 2, 3, 0, 5, 10, 3, 12, 18});
        System.out.println(template.rangeMin(0, 4));
        System.out.println(template.rangeMin(3, 5));
    }
}
