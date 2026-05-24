package com.practice.dsa.designpatterns.structural;

/**
 * Null Object replaces null checks with a safe do-nothing implementation.
 *
 * Use this when:
 * - the caller should always receive an object that follows the same contract
 * - "do nothing" is a valid and safe default behavior
 * - repeated null checks are polluting the code
 *
 * Beginner warning:
 * Do not hide real errors with a Null Object. Use it only when silent no-op
 * behavior is genuinely acceptable.
 */
public class SP8NullObjectPattern {
    interface Notifier {
        void send(String message);
    }

    static class EmailNotifier implements Notifier {
        public void send(String message) {
            System.out.println("Email notification: " + message);
        }
    }

    static class NullNotifier implements Notifier {
        public void send(String message) {
            // Intentionally does nothing.
        }
    }

    static class OrderService {
        private final Notifier notifier;

        OrderService(Notifier notifier) {
            this.notifier = notifier;
        }

        public void placeOrder(String itemName) {
            System.out.println("Order placed for " + itemName);
            notifier.send("Order confirmed for " + itemName);
        }
    }

    public static void main(String[] args) {
        OrderService realNotifications = new OrderService(new EmailNotifier());
        OrderService silentNotifications = new OrderService(new NullNotifier());

        realNotifications.placeOrder("Laptop");
        silentNotifications.placeOrder("Notebook");
    }
}
