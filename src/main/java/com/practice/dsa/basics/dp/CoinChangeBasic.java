package com.practice.dsa.basics.dp;

import java.util.Arrays;

/**
 * Beginner minimum-coin DP reference.
 *
 * dp[amount] means:
 * the minimum number of coins needed to build exactly that amount.
 */
public class CoinChangeBasic {
    public int minCoins(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        // amount + 1 acts like "infinity" here because no valid answer
        // can ever need more than amount coins of value 1.
        Arrays.fill(dp, amount + 1);
        // Base case: zero coins are needed to make amount 0.
        dp[0] = 0;

        for (int currentAmount = 1; currentAmount <= amount; currentAmount++) {
            for (int coin : coins) {
                if (coin <= currentAmount) {
                    // Try using this coin as the last coin in the solution.
                    dp[currentAmount] = Math.min(dp[currentAmount], 1 + dp[currentAmount - coin]);
                }
            }
        }

        // If dp[amount] never improved, this amount cannot be formed.
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
