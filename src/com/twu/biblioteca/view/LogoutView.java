package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;
import com.twu.biblioteca.model.Session;

public class LogoutView implements IView {

    private Console console;
    private IView loginMenuView;
    private Session session;

    public LogoutView(Console console, IView loginMenuView, Session session) {
        this.console = console;
        this.loginMenuView = loginMenuView;
        this.session = session;
    }

    @Override
    public void draw() {
        session.unsetCurrentUser();
        console.printOutput("You Have successfully logged out!");
    }

    @Override
    public IView next(UserMenuDispatcher userMenuDispatcher) {
        return loginMenuView;
    }
}
