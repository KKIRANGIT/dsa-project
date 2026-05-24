package com.practice.dsa.designpatterns.concurrency;

/**
 * Immutable Object avoids synchronization problems by never changing state after construction.
 *
 * Use this when:
 * - data can be created once and shared safely
 * - thread safety should be simple and reliable
 */
public class XP4ImmutableObjectPattern {
    static final class UserSession {
        // Final fields never change after construction.
        private final String userId;
        private final String role;

        UserSession(String userId, String role) {
            this.userId = userId;
            this.role = role;
        }

        String userId() {
            return userId;
        }

        String role() {
            return role;
        }
    }

    public static void main(String[] args) {
        // Immutable object can be shared safely because no later mutation exists.
        UserSession session = new UserSession("u-101", "ADMIN");
        System.out.println(session.userId() + " / " + session.role());
    }
}
