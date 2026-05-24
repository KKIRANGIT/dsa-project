package com.practice.dsa.designpatterns.enterprise;

import java.util.HashMap;
import java.util.Map;

/**
 * Service Locator stores shared services in a central registry and returns them by key.
 *
 * Use this when:
 * - a project already uses a service registry style
 *
 * Beginner warning:
 * This can hide dependencies, so constructor injection is usually cleaner.
 */
public class EP4ServiceLocatorPattern {
    static class ServiceLocator {
        private static final Map<String, Object> SERVICES = new HashMap<>();

        static void register(String key, Object service) {
            // Save a shared service under a lookup key.
            SERVICES.put(key, service);
        }

        @SuppressWarnings("unchecked")
        static <T> T resolve(String key, Class<T> type) {
            // Retrieve the service later by key.
            return (T) SERVICES.get(key);
        }
    }

    static class AuditService {
        void record(String message) {
            System.out.println("AUDIT: " + message);
        }
    }

    public static void main(String[] args) {
        ServiceLocator.register("audit", new AuditService());
        // Caller pulls dependency from registry when needed.
        AuditService auditService = ServiceLocator.resolve("audit", AuditService.class);
        auditService.record("User logged in");
    }
}
