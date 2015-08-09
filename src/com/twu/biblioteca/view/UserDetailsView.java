package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;
import com.twu.biblioteca.model.Session;

public class UserDetailsView implements IView {

    private Console console;
    private IView userMenuView;
    private Session session;

    public UserDetailsView(Console console, IView userMenuView, Session session) {
        this.console = console;
        this.userMenuView = userMenuView;
        this.session = session;
    }

    @Override
    public void draw() {
        console.printOutput(session.getCurrentUser());
    }

    @Override
    public IView next(UserMenuDispatcher userMenuDispatcher) {
        return userMenuView;
    }
}
