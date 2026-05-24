package com.practice.dsa.problems.tries.map_sum_pairs;

public class LC677MapSumPairsMain {
    public static void main(String[] args) {
        LC677MapSumPairs mapSum = new LC677MapSumPairs();
        mapSum.insert("apple", 3);
        System.out.println("LC677 step1 = " + mapSum.sum("ap"));
        mapSum.insert("app", 2);
        System.out.println("LC677 step2 = " + mapSum.sum("ap"));
    }
}
