package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.LoginAuthenticator;
import com.twu.biblioteca.controller.UserMenuDispatcher;
import com.twu.biblioteca.model.Session;
import com.twu.biblioteca.model.User;

public class LoginView implements IView{

    private Console console;
    private LoginAuthenticator loginAuthenticator;
    private Session session;
    private IView loginMenuView;
    private IView userMenuView;
    private IView librarianMenuView;

    public LoginView(Console console, LoginAuthenticator loginAuthenticator, Session session, IView loginMenuView, IView userMenuView, IView librarianMenuView) {
        this.console = console;
        this.loginAuthenticator = loginAuthenticator;
        this.session = session;
        this.loginMenuView = loginMenuView;
        this.userMenuView = userMenuView;
        this.librarianMenuView = librarianMenuView;
    }

    @Override
    public void draw() {
        console.printOutput("Enter the Library number:");
        String libraryNumber = console.getInput();
        console.printOutput("Enter the password");
        String password = console.getInput();
        session.setCurrentUser(loginAuthenticator.authenticateUser(libraryNumber, password));
    }

    @Override
    public IView next(UserMenuDispatcher userMenuDispatcher) {
        User currentUser = session.getCurrentUser();
        if (currentUser == null)
            return loginMenuView;
        else if (currentUser.isLibrarian())
            return librarianMenuView;
        else
            return userMenuView;
    }

}
