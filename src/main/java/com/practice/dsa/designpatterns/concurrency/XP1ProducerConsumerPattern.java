package com.practice.dsa.designpatterns.concurrency;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Producer-Consumer separates work creation from work processing through a shared buffer.
 *
 * Use this when:
 * - one part of the system produces tasks
 * - another part consumes them
 * - speed of producing and processing differs
 */
public class XP1ProducerConsumerPattern {
    static class TaskQueue {
        private final Queue<String> queue = new ArrayDeque<>();

        synchronized void produce(String task) {
            // Add a task, then wake waiting consumers.
            queue.offer(task);
            notifyAll();
        }

        synchronized String consume() {
            while (queue.isEmpty()) {
                try {
                    // Consumer waits until some producer adds work.
                    wait();
                } catch (InterruptedException exception) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException("Interrupted while waiting", exception);
                }
            }
            return queue.poll();
        }
    }

    public static void main(String[] args) {
        TaskQueue queue = new TaskQueue();
        // This demo runs sequentially for clarity,
        // but the pattern is meant for producer and consumer threads.
        queue.produce("email-job");
        System.out.println("consumed = " + queue.consume());
    }
}
