package com.practice.dsa.designpatterns.enterprise;

/**
 * Circuit Breaker stops repeated calls to a failing dependency and fails fast for a while.
 *
 * Use this when:
 * - remote calls are failing repeatedly
 * - continued retries would waste time or overload the dependency
 * - callers need a fast rejection path while the dependency is unhealthy
 *
 * Beginner warning:
 * A circuit breaker does not fix a broken service. It only limits damage and buys
 * the system time to recover.
 */
public class EP7CircuitBreakerPattern {
    enum State {
        CLOSED,
        OPEN
    }

    interface PaymentGateway {
        void charge(int amount);
    }

    static class FlakyGateway implements PaymentGateway {
        private int attempts;

        public void charge(int amount) {
            attempts++;
            if (attempts <= 2) {
                throw new IllegalStateException("Gateway timeout");
            }
            System.out.println("Charged amount: " + amount);
        }
    }

    static class CircuitBreakerGateway implements PaymentGateway {
        private final PaymentGateway delegate;
        private final int failureThreshold;
        private int failureCount;
        private State state = State.CLOSED;

        CircuitBreakerGateway(PaymentGateway delegate, int failureThreshold) {
            this.delegate = delegate;
            this.failureThreshold = failureThreshold;
        }

        public void charge(int amount) {
            if (state == State.OPEN) {
                System.out.println("Circuit open: request rejected immediately");
                return;
            }

            try {
                delegate.charge(amount);
                failureCount = 0;
            } catch (RuntimeException ex) {
                failureCount++;
                System.out.println("Remote call failed: " + ex.getMessage());
                if (failureCount >= failureThreshold) {
                    state = State.OPEN;
                    System.out.println("Circuit moved to OPEN state");
                }
            }
        }
    }

    public static void main(String[] args) {
        PaymentGateway gateway = new CircuitBreakerGateway(new FlakyGateway(), 2);

        gateway.charge(500);
        gateway.charge(500);
        gateway.charge(500);
    }
}
