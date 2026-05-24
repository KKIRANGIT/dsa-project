package com.practice.dsa.designpatterns.creational;

/**
 * Factory Method moves object creation behind a method so clients depend on an abstraction, not a concrete class.
 *
 * Use this when:
 * - the caller should not decide exact implementation classes
 * - object creation rules may change later
 * - subclasses should decide what gets created
 */
public class CP2FactoryMethodPattern {
    // Product interface:
    // all notification objects must support send(...).
    interface Notification {
        void send(String message);
    }

    // Concrete product 1.
    static class EmailNotification implements Notification {
        public void send(String message) {
            System.out.println("Email: " + message);
        }
    }

    // Concrete product 2.
    static class SmsNotification implements Notification {
        public void send(String message) {
            System.out.println("SMS: " + message);
        }
    }

    // Creator base class:
    // subclasses decide which product object should be created.
    static abstract class NotificationCreator {
        protected abstract Notification createNotification();

        public void notifyUser(String message) {
            // Business flow uses the abstract product.
            // It does not know whether the concrete object is email or SMS.
            Notification notification = createNotification();
            notification.send(message);
        }
    }

    // Concrete creator for email notifications.
    static class EmailCreator extends NotificationCreator {
        protected Notification createNotification() {
            return new EmailNotification();
        }
    }

    // Concrete creator for SMS notifications.
    static class SmsCreator extends NotificationCreator {
        protected Notification createNotification() {
            return new SmsNotification();
        }
    }

    public static void main(String[] args) {
        // Caller chooses a creator object, not a notification object directly.
        NotificationCreator creator = new EmailCreator();
        creator.notifyUser("Your report is ready");

        creator = new SmsCreator();
        creator.notifyUser("OTP sent");
    }
}
