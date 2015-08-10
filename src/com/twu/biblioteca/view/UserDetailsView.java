package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Session;

public class UserDetailsView implements IView {

    private Console console;
    private Session session;
    private String userDetailsView;

    public UserDetailsView(Console console, Session session) {
        this.console = console;
        this.session = session;
        this.userDetailsView = "User Details View";
    }

    @Override
    public void draw() {
        console.printOutput(session.getCurrentUser());
    }

    @Override
    public IView next(ViewDispatcher viewDispatcher) {
        return viewDispatcher.userMenuDispatch(userDetailsView);
    }
}
