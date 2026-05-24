package com.practice.dsa.problems.greedy.best_time_to_buy_and_sell_stock_ii;

/**
 * LC 122 - Best Time to Buy and Sell Stock II
 *
 * Beginner idea:
 * Take every upward price difference.
 */
public class LC122BestTimeToBuyAndSellStockIISolver {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
