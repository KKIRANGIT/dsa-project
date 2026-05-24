package com.practice.dsa.patterns.range_queries;

/**
 * Beginner sparse-table pattern.
 *
 * Use for static range minimum queries when updates do not happen.
 */
public class PT4SparseTableTemplate {
    private int[][] table;
    private int[] log;

    public PT4SparseTableTemplate(int[] nums) {
        int n = nums.length;
        log = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            log[i] = log[i / 2] + 1;
        }

        int maxPower = log[n] + 1;
        table = new int[maxPower][n];

        System.arraycopy(nums, 0, table[0], 0, n);

        for (int power = 1; power < maxPower; power++) {
            for (int i = 0; i + (1 << power) <= n; i++) {
                table[power][i] = Math.min(table[power - 1][i], table[power - 1][i + (1 << (power - 1))]);
            }
        }
    }

    public int rangeMin(int left, int right) {
        int length = right - left + 1;
        int power = log[length];
        return Math.min(table[power][left], table[power][right - (1 << power) + 1]);
    }
}
