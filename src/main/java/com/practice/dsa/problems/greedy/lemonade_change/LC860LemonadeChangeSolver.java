package com.practice.dsa.problems.greedy.lemonade_change;

/**
 * LC 860 - Lemonade Change
 *
 * Beginner idea:
 * Always prefer giving one 10-dollar bill and one 5-dollar bill for a 20-dollar payment,
 * because 5-dollar bills are more flexible for future customers.
 */
public class LC860LemonadeChangeSolver {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
