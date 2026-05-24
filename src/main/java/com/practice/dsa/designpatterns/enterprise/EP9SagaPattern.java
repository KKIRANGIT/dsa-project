package com.practice.dsa.designpatterns.enterprise;

/**
 * Saga coordinates a multi-step workflow using local actions plus compensating rollback steps.
 *
 * Use this when:
 * - one business operation spans multiple services
 * - a single atomic transaction across all systems is not realistic
 * - each successful step needs a matching compensation if a later step fails
 *
 * Beginner warning:
 * Saga gives eventual consistency, not instant atomic consistency. Compensation must
 * be designed carefully or data can drift.
 */
public class EP9SagaPattern {
    static class InventoryService {
        void reserve(String item) {
            System.out.println("Inventory reserved for " + item);
        }

        void release(String item) {
            System.out.println("Inventory released for " + item);
        }
    }

    static class PaymentService {
        void charge(int amount) {
            throw new IllegalStateException("Payment failed");
        }

        void refund(int amount) {
            System.out.println("Payment refunded: " + amount);
        }
    }

    static class ShippingService {
        void createShipment(String item) {
            System.out.println("Shipment created for " + item);
        }

        void cancelShipment(String item) {
            System.out.println("Shipment cancelled for " + item);
        }
    }

    static class OrderSaga {
        private final InventoryService inventoryService = new InventoryService();
        private final PaymentService paymentService = new PaymentService();
        private final ShippingService shippingService = new ShippingService();

        void placeOrder(String item, int amount) {
            boolean inventoryReserved = false;
            boolean paymentCharged = false;
            boolean shipmentCreated = false;

            inventoryService.reserve(item);
            inventoryReserved = true;

            try {
                paymentService.charge(amount);
                paymentCharged = true;
                shippingService.createShipment(item);
                shipmentCreated = true;
                System.out.println("Order completed");
            } catch (RuntimeException ex) {
                System.out.println("Saga failed: " + ex.getMessage());
                if (shipmentCreated) {
                    shippingService.cancelShipment(item);
                }
                if (paymentCharged) {
                    paymentService.refund(amount);
                }
                if (inventoryReserved) {
                    inventoryService.release(item);
                }
            }
        }
    }

    public static void main(String[] args) {
        OrderSaga saga = new OrderSaga();
        saga.placeOrder("Headphones", 2500);
    }
}
