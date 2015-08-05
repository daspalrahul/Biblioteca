package com.twu.biblioteca.operation;

import com.twu.biblioteca.controller.LoginAuthenticator;
import com.twu.biblioteca.model.User;
import com.twu.biblioteca.view.View;

public class Login implements com.twu.biblioteca.operation.LibraryOperation {

    View view;
    LoginAuthenticator loginAuthenticator;

    public Login(View view, LoginAuthenticator loginAuthenticator) {
        this.view = view;
        this.loginAuthenticator = loginAuthenticator;
    }

    @Override
    public void execute() {
        String libraryNumber = view.getUserInput();
        String password = view.getUserInput();
        User user = loginAuthenticator.authenticateUser(libraryNumber, password);
        if (user == null) {
            view.displayUnsuccessfulLoginMessage();
        } else {
            view.successfulLogin(user);
        }
    }
}
