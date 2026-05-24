package com.practice.dsa.designpatterns.behavioral;

/**
 * Chain of Responsibility passes a request through a chain until one handler processes it.
 *
 * Use this when:
 * - several handlers may accept or reject a request
 * - sender should not know the exact final handler
 */
public class BP6ChainOfResponsibilityPattern {
    static abstract class Approver {
        private Approver next;

        Approver setNext(Approver next) {
            // Link handlers together in chain order.
            this.next = next;
            return next;
        }

        void approve(int amount) {
            // Current handler first checks whether it can process the request.
            if (canApprove(amount)) {
                System.out.println(getClass().getSimpleName() + " approved " + amount);
            } else if (next != null) {
                // Pass the request forward when current handler cannot process it.
                next.approve(amount);
            } else {
                System.out.println("No approver found for " + amount);
            }
        }

        protected abstract boolean canApprove(int amount);
    }

    static class TeamLead extends Approver {
        protected boolean canApprove(int amount) {
            return amount <= 1_000;
        }
    }

    static class Manager extends Approver {
        protected boolean canApprove(int amount) {
            return amount <= 10_000;
        }
    }

    public static void main(String[] args) {
        // Build chain: TeamLead -> Manager.
        Approver lead = new TeamLead();
        lead.setNext(new Manager());
        lead.approve(700);
        lead.approve(8_000);
    }
}
