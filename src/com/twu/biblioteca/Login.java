package com.twu.biblioteca;

public class Login implements LibraryOperation {

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
