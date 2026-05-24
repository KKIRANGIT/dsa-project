package com.practice.dsa.designpatterns.structural;

/**
 * Facade provides one simple entry point over a more complicated subsystem.
 *
 * Use this when:
 * - many small subsystem calls usually happen together
 * - callers should not know subsystem details
 */
public class SP5FacadePattern {
    // Subsystem part 1.
    static class InventoryService {
        boolean inStock(String item) {
            return true;
        }
    }

    // Subsystem part 2.
    static class PaymentService {
        void charge(int amount) {
            System.out.println("Charged amount: " + amount);
        }
    }

    // Subsystem part 3.
    static class ShippingService {
        void ship(String item) {
            System.out.println("Shipped item: " + item);
        }
    }

    // Facade exposes one simple operation that orchestrates the subsystems.
    static class OrderFacade {
        private final InventoryService inventory = new InventoryService();
        private final PaymentService payment = new PaymentService();
        private final ShippingService shipping = new ShippingService();

        void placeOrder(String item, int amount) {
            if (!inventory.inStock(item)) {
                throw new IllegalStateException("Item unavailable");
            }
            // Caller does not need to know the subsystem call sequence.
            payment.charge(amount);
            shipping.ship(item);
        }
    }

    public static void main(String[] args) {
        new OrderFacade().placeOrder("Laptop", 60000);
    }
}
