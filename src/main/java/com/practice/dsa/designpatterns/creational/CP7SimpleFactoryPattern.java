package com.practice.dsa.designpatterns.creational;

/**
 * Simple Factory centralizes object creation in one place.
 *
 * Use this when:
 * - callers should not know which concrete class to instantiate
 * - creation depends on a small input such as a type or config value
 * - subclass-driven factory extension is not needed yet
 *
 * Beginner warning:
 * If the factory keeps growing with too many branches, move toward Factory Method
 * or Abstract Factory instead of turning one class into a giant switch statement.
 */
public class CP7SimpleFactoryPattern {
    interface NotificationSender {
        void send(String message);
    }

    static class EmailSender implements NotificationSender {
        public void send(String message) {
            System.out.println("Email sent: " + message);
        }
    }

    static class SmsSender implements NotificationSender {
        public void send(String message) {
            System.out.println("SMS sent: " + message);
        }
    }

    static class NotificationFactory {
        public static NotificationSender create(String channel) {
            if ("email".equalsIgnoreCase(channel)) {
                return new EmailSender();
            }
            if ("sms".equalsIgnoreCase(channel)) {
                return new SmsSender();
            }
            throw new IllegalArgumentException("Unsupported channel: " + channel);
        }
    }

    public static void main(String[] args) {
        NotificationSender email = NotificationFactory.create("email");
        NotificationSender sms = NotificationFactory.create("sms");

        email.send("Welcome to the platform");
        sms.send("Your OTP is 1234");
    }
}
