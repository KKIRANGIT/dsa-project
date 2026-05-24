package com.practice.dsa.designpatterns.concurrency;

/**
 * Guarded Suspension waits until a condition becomes true before continuing work.
 *
 * Use this when:
 * - one thread must wait for a result prepared by another thread
 * - the waiting thread should pause until a specific state is ready
 *
 * Beginner note:
 * The "guard" is the condition checked inside the while loop.
 * The thread suspends itself until that condition becomes safe.
 */
public class XP5GuardedSuspensionPattern {
    static class ReportBox {
        private String report;

        synchronized void put(String report) {
            // Save the prepared result first.
            this.report = report;
            // Wake up waiting threads because the guarded condition may now be true.
            notifyAll();
        }

        synchronized String take() {
            // Stay suspended until the required state exists.
            while (report == null) {
                try {
                    wait();
                } catch (InterruptedException exception) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException("Interrupted while waiting for report", exception);
                }
            }
            return report;
        }
    }

    public static void main(String[] args) {
        ReportBox box = new ReportBox();

        // Producer thread prepares the result later.
        Thread producer = new Thread(() -> box.put("Quarterly report ready"));
        producer.start();

        // Main thread waits safely until the report is available.
        System.out.println(box.take());
    }
}
