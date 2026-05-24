package com.practice.dsa.basics.searching;

public class LinearSearchBasicsMain {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40};
        LinearSearchBasics basics = new LinearSearchBasics();

        System.out.println("index of 30 = " + basics.indexOf(nums, 30));
        System.out.println("index of 99 = " + basics.indexOf(nums, 99));
    }
}
