package com.practice.dsa.basics.dp;

public class KnapsackBasicMain {
    public static void main(String[] args) {
        KnapsackBasic dp = new KnapsackBasic();
        int[] weights = {1, 3, 4, 5};
        int[] values = {1, 4, 5, 7};

        System.out.println("max value = " + dp.maxValue(weights, values, 7));
    }
}
