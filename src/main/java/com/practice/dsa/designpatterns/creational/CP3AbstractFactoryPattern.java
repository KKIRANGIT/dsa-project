package com.practice.dsa.designpatterns.creational;

/**
 * Abstract Factory creates whole families of related objects.
 *
 * Use this when:
 * - one configuration should create matching objects together
 * - UI themes, cloud vendors, or environment-specific families must stay consistent
 */
public class CP3AbstractFactoryPattern {
    // Product family member 1.
    interface Button {
        void render();
    }

    // Product family member 2.
    interface Dialog {
        void render();
    }

    // Light-theme button implementation.
    static class LightButton implements Button {
        public void render() {
            System.out.println("Rendering light button");
        }
    }

    // Dark-theme button implementation.
    static class DarkButton implements Button {
        public void render() {
            System.out.println("Rendering dark button");
        }
    }

    // Light-theme dialog implementation.
    static class LightDialog implements Dialog {
        public void render() {
            System.out.println("Rendering light dialog");
        }
    }

    // Dark-theme dialog implementation.
    static class DarkDialog implements Dialog {
        public void render() {
            System.out.println("Rendering dark dialog");
        }
    }

    // Factory interface for a whole family of related UI objects.
    interface UiFactory {
        Button createButton();
        Dialog createDialog();
    }

    // Concrete factory that keeps the whole UI family in light mode.
    static class LightUiFactory implements UiFactory {
        public Button createButton() {
            return new LightButton();
        }

        public Dialog createDialog() {
            return new LightDialog();
        }
    }

    // Concrete factory that keeps the whole UI family in dark mode.
    static class DarkUiFactory implements UiFactory {
        public Button createButton() {
            return new DarkButton();
        }

        public Dialog createDialog() {
            return new DarkDialog();
        }
    }

    public static void main(String[] args) {
        // One factory choice controls every related object that gets created.
        UiFactory factory = new DarkUiFactory();
        Button button = factory.createButton();
        Dialog dialog = factory.createDialog();

        button.render();
        dialog.render();
    }
}
