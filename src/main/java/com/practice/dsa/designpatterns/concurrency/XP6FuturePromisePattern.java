package com.practice.dsa.designpatterns.concurrency;

import java.util.concurrent.CompletableFuture;

/**
 * Future/Promise represents a result that will be available later.
 *
 * Use this when:
 * - work should happen asynchronously
 * - caller should not block immediately
 * - later steps should run after the result arrives
 *
 * Java note:
 * CompletableFuture is a practical modern way to model this pattern.
 */
public class XP6FuturePromisePattern {
    public static void main(String[] args) {
        // Start background work that returns a value later.
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "user-profile-data");

        // Attach a continuation that runs after the result arrives.
        CompletableFuture<String> formatted = future.thenApply(data -> "Loaded: " + data);

        // Join waits here only when we finally need the result.
        System.out.println(formatted.join());
    }
}
