package com.practice.dsa.designpatterns.creational;

/**
 * Singleton keeps exactly one shared object instance for the whole application.
 *
 * Use this when:
 * - one shared service object is enough
 * - global coordination matters
 * - creating many copies would be wasteful or confusing
 *
 * Beginner warning:
 * Singleton is easy to overuse. Prefer normal dependency passing unless you truly need one shared instance.
 */
public class CP1SingletonPattern {
    private static class AppLogger {
        // Create the single shared object eagerly.
        // Eager creation keeps the example simple and thread-safe.
        private static final AppLogger INSTANCE = new AppLogger();

        // Private constructor stops other classes from calling new AppLogger().
        private AppLogger() {
        }

        public static AppLogger getInstance() {
            // Everyone receives the same shared object reference.
            return INSTANCE;
        }

        public void log(String message) {
            System.out.println("[LOG] " + message);
        }
    }

    public static void main(String[] args) {
        // Both variables ask for the logger.
        // They should point to the same object in memory.
        AppLogger first = AppLogger.getInstance();
        AppLogger second = AppLogger.getInstance();

        first.log("Application started");
        System.out.println("same instance = " + (first == second));
    }
}
