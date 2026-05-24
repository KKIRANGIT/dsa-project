package com.practice.dsa.designpatterns.creational;

/**
 * Builder creates complex objects step by step with readable construction code.
 *
 * Use this when:
 * - constructors would need too many parameters
 * - many fields are optional
 * - object creation should read like a checklist
 */
public class CP4BuilderPattern {
    static class ApiClientConfig {
        // Final fields make the finished object immutable after construction.
        private final String host;
        private final int port;
        private final int timeoutSeconds;
        private final boolean sslEnabled;

        private ApiClientConfig(Builder builder) {
            // Builder collects values first.
            // Finished config copies them once here.
            this.host = builder.host;
            this.port = builder.port;
            this.timeoutSeconds = builder.timeoutSeconds;
            this.sslEnabled = builder.sslEnabled;
        }

        static class Builder {
            // Required field.
            private final String host;
            // Optional fields with defaults.
            private int port = 80;
            private int timeoutSeconds = 30;
            private boolean sslEnabled;

            Builder(String host) {
                this.host = host;
            }

            Builder port(int port) {
                // Return this so calls can be chained fluently.
                this.port = port;
                return this;
            }

            Builder timeoutSeconds(int timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            Builder sslEnabled(boolean sslEnabled) {
                this.sslEnabled = sslEnabled;
                return this;
            }

            ApiClientConfig build() {
                // Final step that converts the builder into the real object.
                return new ApiClientConfig(this);
            }
        }

        public String toString() {
            return "ApiClientConfig{host='" + host + "', port=" + port +
                    ", timeoutSeconds=" + timeoutSeconds + ", sslEnabled=" + sslEnabled + "}";
        }
    }

    public static void main(String[] args) {
        // Read the construction like a checklist.
        // That is the main readability benefit of Builder.
        ApiClientConfig config = new ApiClientConfig.Builder("api.example.com")
                .port(443)
                .timeoutSeconds(10)
                .sslEnabled(true)
                .build();

        System.out.println(config);
    }
}
