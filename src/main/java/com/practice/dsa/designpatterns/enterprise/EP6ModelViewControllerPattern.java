package com.practice.dsa.designpatterns.enterprise;

/**
 * Model-View-Controller separates:
 * - Model: business data/state
 * - View: presentation
 * - Controller: input handling / coordination
 *
 * Use this when:
 * - UI logic and business data should not be mixed together
 * - user actions should be routed through a clear coordination layer
 *
 * Beginner note:
 * MVC is less about one exact framework implementation
 * and more about keeping responsibilities separate.
 */
public class EP6ModelViewControllerPattern {
    static class UserModel {
        private final String name;

        UserModel(String name) {
            this.name = name;
        }

        String name() {
            return name;
        }
    }

    static class UserView {
        void render(UserModel user) {
            System.out.println("User screen: Hello, " + user.name());
        }
    }

    static class UserController {
        private final UserView view;

        UserController(UserView view) {
            this.view = view;
        }

        void showUser(UserModel user) {
            // Controller decides when and how the view is asked to render the model.
            view.render(user);
        }
    }

    public static void main(String[] args) {
        UserModel model = new UserModel("Alice");
        UserView view = new UserView();
        UserController controller = new UserController(view);

        controller.showUser(model);
    }
}
