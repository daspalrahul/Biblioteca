package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Session;

public class LogoutView implements IView {

    private Console console;
    private Session session;
    private String logoutView;

    public LogoutView(Console console, Session session) {
        this.console = console;
        this.session = session;
        this.logoutView = "Logout View";
    }

    @Override
    public void draw() {
        session.unsetCurrentUser();
        console.printOutput("You have successfully logged out!");
    }

    @Override
    public IView next(ViewDispatcher viewDispatcher) {
        return viewDispatcher.userMenuDispatch(logoutView);
    }
}
