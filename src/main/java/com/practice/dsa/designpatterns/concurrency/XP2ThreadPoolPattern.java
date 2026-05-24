package com.practice.dsa.designpatterns.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Thread Pool reuses worker threads instead of creating a new thread per task.
 *
 * Use this when:
 * - many short tasks must run
 * - thread creation overhead should be reduced
 * - concurrency level should be controlled
 */
public class XP2ThreadPoolPattern {
    public static void main(String[] args) {
        // Pool owns a fixed number of reusable worker threads.
        ExecutorService pool = Executors.newFixedThreadPool(2);
        try {
            // Submit tasks instead of manually creating new Thread objects.
            pool.submit(() -> System.out.println("Task 1 on " + Thread.currentThread().getName()));
            pool.submit(() -> System.out.println("Task 2 on " + Thread.currentThread().getName()));
        } finally {
            // Always shut down the pool when no more work is coming.
            pool.shutdown();
        }
    }
}
