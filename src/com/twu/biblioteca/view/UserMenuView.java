package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;
import com.twu.biblioteca.model.Session;

public class UserMenuView implements IView {

    private Menu menu;
    private Console console;
    private Session session;
    private UserMenuDispatcher userMenuDispatcher;

    public UserMenuView(Menu menu, Console console, Session session, UserMenuDispatcher userMenuDispatcher) {
        this.menu = menu;
        this.console = console;
        this.session = session;
        this.userMenuDispatcher = userMenuDispatcher;
    }

    @Override
    public void draw() {
        console.printOutput(menu.displayOptionMenuList(session.getCurrentUser()));
    }

    @Override
    public IView next() {
        return userMenuDispatcher.userMenuDispatch(console.getInput());
    }
}
