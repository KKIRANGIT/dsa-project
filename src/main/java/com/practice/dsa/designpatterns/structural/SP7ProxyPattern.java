package com.practice.dsa.designpatterns.structural;

/**
 * Proxy stands in front of another object and controls access to it.
 *
 * Use this when:
 * - access checks, lazy loading, caching, or remote calls should be wrapped
 * - clients should still use the same interface
 */
public class SP7ProxyPattern {
    // Shared contract used by both real object and proxy.
    interface ReportService {
        void generate();
    }

    static class RealReportService implements ReportService {
        public void generate() {
            System.out.println("Generating heavy report...");
        }
    }

    // Proxy checks access before forwarding to the real object.
    static class SecurityProxy implements ReportService {
        private final ReportService realService;
        private final String role;

        SecurityProxy(ReportService realService, String role) {
            this.realService = realService;
            this.role = role;
        }

        public void generate() {
            if (!"ADMIN".equals(role)) {
                throw new IllegalStateException("Access denied");
            }
            // Delegate only after the extra control logic succeeds.
            realService.generate();
        }
    }

    public static void main(String[] args) {
        ReportService service = new SecurityProxy(new RealReportService(), "ADMIN");
        service.generate();
    }
}
