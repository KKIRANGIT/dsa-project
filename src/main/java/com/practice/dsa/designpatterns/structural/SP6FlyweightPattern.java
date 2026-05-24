package com.practice.dsa.designpatterns.structural;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight shares immutable intrinsic state across many logical objects.
 *
 * Use this when:
 * - many objects repeat the same internal state
 * - memory usage matters
 */
public class SP6FlyweightPattern {
    // Shared intrinsic state object.
    static class CharacterStyle {
        private final String fontName;

        CharacterStyle(String fontName) {
            this.fontName = fontName;
        }

        void draw(char value, int row) {
            System.out.println("Drawing '" + value + "' with font " + fontName + " at row " + row);
        }
    }

    static class StyleFactory {
        // Cache shared flyweight objects by key.
        private final Map<String, CharacterStyle> cache = new HashMap<>();

        CharacterStyle getStyle(String fontName) {
            // Reuse an existing shared object when possible.
            return cache.computeIfAbsent(fontName, CharacterStyle::new);
        }
    }

    public static void main(String[] args) {
        StyleFactory factory = new StyleFactory();
        CharacterStyle style = factory.getStyle("Monospace");
        style.draw('A', 1);
        factory.getStyle("Monospace").draw('B', 2);
    }
}
