package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.LoginAuthenticator;
import com.twu.biblioteca.model.User;

public class LoginView implements IView{

    private Console console;
    private LoginAuthenticator loginAuthenticator;
    private User currentUser;
    private IView loginMenuView;
    private IView userMenuView;
    private IView librarianMenuView;

    public LoginView(Console console, LoginAuthenticator loginAuthenticator, IView loginMenuView, IView userMenuView, IView librarianMenuView) {
        this.console = console;
        this.loginAuthenticator = loginAuthenticator;
        this.currentUser = null;
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
        currentUser = loginAuthenticator.authenticateUser(libraryNumber, password);
    }

    @Override
    public IView next() {
        if (currentUser == null)
            return loginMenuView;
        else if (currentUser.isLibrarian())
            return librarianMenuView;
        else
            return userMenuView;
    }

    public User getUser() {
        return currentUser;
    }
}
