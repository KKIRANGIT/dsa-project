package com.practice.dsa.basics.dp;

import java.util.Arrays;

public class HouseRobberBasicMain {
    public static void main(String[] args) {
        // If we rob adjacent houses, alarms trigger.
        int[] houses = {2, 7, 9, 3, 1};
        HouseRobberBasic dp = new HouseRobberBasic();

        System.out.println("houses = " + Arrays.toString(houses));
        System.out.println("best choice is 2 + 9 + 1 = 12");
        System.out.println("best robbery = " + dp.rob(houses));
    }
}
