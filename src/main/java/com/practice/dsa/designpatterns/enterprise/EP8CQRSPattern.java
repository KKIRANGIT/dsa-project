package com.practice.dsa.designpatterns.enterprise;

import java.util.HashMap;
import java.util.Map;

/**
 * CQRS separates write operations from read operations so each side can evolve independently.
 *
 * Use this when:
 * - commands and queries have different complexity or scaling needs
 * - write-side validation is heavy but read-side views should stay simple and fast
 * - one shared model is becoming awkward for both reads and writes
 *
 * Beginner warning:
 * CQRS adds duplication and coordination cost. Do not use it for simple CRUD screens.
 */
public class EP8CQRSPattern {
    static class OrderWriteService {
        private final Map<Integer, String> orderStore;

        OrderWriteService(Map<Integer, String> orderStore) {
            this.orderStore = orderStore;
        }

        public void placeOrder(int orderId, String status) {
            System.out.println("Command side: validating and storing order " + orderId);
            orderStore.put(orderId, status);
        }
    }

    static class OrderReadService {
        private final Map<Integer, String> orderStore;

        OrderReadService(Map<Integer, String> orderStore) {
            this.orderStore = orderStore;
        }

        public String getOrderSummary(int orderId) {
            return "Query side: order " + orderId + " is " + orderStore.get(orderId);
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> orderStore = new HashMap<>();
        OrderWriteService writeService = new OrderWriteService(orderStore);
        OrderReadService readService = new OrderReadService(orderStore);

        writeService.placeOrder(101, "CREATED");
        System.out.println(readService.getOrderSummary(101));
    }
}
