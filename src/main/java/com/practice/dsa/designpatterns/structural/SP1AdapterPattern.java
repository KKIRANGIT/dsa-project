package com.practice.dsa.designpatterns.structural;

/**
 * Adapter makes an incompatible class work with the interface your code expects.
 *
 * Use this when:
 * - an old or third-party class has the wrong method shape
 * - you want to wrap legacy code without rewriting it
 */
public class SP1AdapterPattern {
    // Target interface expected by the rest of our application.
    interface PaymentGateway {
        void pay(int amount);
    }

    // Existing class with useful behavior, but wrong method name/interface.
    static class LegacyBankApi {
        void makeTransfer(int amount) {
            System.out.println("Legacy bank transfer: " + amount);
        }
    }

    // Adapter translates our expected interface into the legacy API call.
    static class BankApiAdapter implements PaymentGateway {
        private final LegacyBankApi legacyBankApi;

        BankApiAdapter(LegacyBankApi legacyBankApi) {
            this.legacyBankApi = legacyBankApi;
        }

        public void pay(int amount) {
            // Translate "pay" into the legacy method call shape.
            legacyBankApi.makeTransfer(amount);
        }
    }

    public static void main(String[] args) {
        // Client code uses the new interface and stays unaware of legacy details.
        PaymentGateway gateway = new BankApiAdapter(new LegacyBankApi());
        gateway.pay(500);
    }
}
