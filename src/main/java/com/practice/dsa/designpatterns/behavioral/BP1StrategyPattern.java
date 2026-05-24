package com.practice.dsa.designpatterns.behavioral;

/**
 * Strategy swaps algorithms at runtime behind one interface.
 *
 * Use this when:
 * - several algorithms solve the same job
 * - if/else chains are growing
 * - behavior should be selected dynamically
 */
public class BP1StrategyPattern {
    // Strategy interface:
    // all payment algorithms must implement the same operation.
    interface PaymentStrategy {
        void pay(int amount);
    }

    static class CardPayment implements PaymentStrategy {
        public void pay(int amount) {
            System.out.println("Paid by card: " + amount);
        }
    }

    static class UpiPayment implements PaymentStrategy {
        public void pay(int amount) {
            System.out.println("Paid by UPI: " + amount);
        }
    }

    static class CheckoutService {
        private PaymentStrategy strategy;

        void setStrategy(PaymentStrategy strategy) {
            // Switch the algorithm at runtime.
            this.strategy = strategy;
        }

        void checkout(int amount) {
            // Service delegates behavior to the chosen strategy.
            strategy.pay(amount);
        }
    }

    public static void main(String[] args) {
        CheckoutService checkout = new CheckoutService();
        checkout.setStrategy(new CardPayment());
        checkout.checkout(1200);
        checkout.setStrategy(new UpiPayment());
        checkout.checkout(800);
    }
}
