package com.practice.dsa.designpatterns.concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Read-Write Lock allows many readers at once but restricts writers more strongly.
 *
 * Use this when:
 * - reads are frequent
 * - writes are rare
 * - shared data must stay consistent
 */
public class XP3ReadWriteLockPattern {
    static class ConfigStore {
        private final Map<String, String> config = new HashMap<>();
        private final ReadWriteLock lock = new ReentrantReadWriteLock();

        void put(String key, String value) {
            // Writer needs exclusive access.
            lock.writeLock().lock();
            try {
                config.put(key, value);
            } finally {
                lock.writeLock().unlock();
            }
        }

        String get(String key) {
            // Reader can run concurrently with other readers.
            lock.readLock().lock();
            try {
                return config.get(key);
            } finally {
                lock.readLock().unlock();
            }
        }
    }

    public static void main(String[] args) {
        ConfigStore store = new ConfigStore();
        // Write once, then read back.
        store.put("mode", "production");
        System.out.println(store.get("mode"));
    }
}
