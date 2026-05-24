package com.practice.dsa.problems.sliding_window.best_time_to_buy_and_sell_stock;

public class LC121BestTimeToBuyAndSellStockMain {
    public static void main(String[] args) {
        // Create solver object.
        LC121BestTimeToBuyAndSellStockSolver solver = new LC121BestTimeToBuyAndSellStockSolver();
        // Print the best possible profit.
        System.out.println(solver.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
