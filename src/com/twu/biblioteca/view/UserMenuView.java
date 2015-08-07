package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;

public class UserMenuView implements IView {

    private Menu menu;
    private Console console;
    private LoginView loginView;
    private UserMenuDispatcher userMenuDispatcher;

    public UserMenuView(Menu menu, Console console, LoginView loginView, UserMenuDispatcher userMenuDispatcher) {
        this.menu = menu;
        this.console = console;
        this.loginView = loginView;
        this.userMenuDispatcher = userMenuDispatcher;
    }

    @Override
    public void draw() {
        console.printOutput(menu.displayOptionMenuList(loginView.getUser()));
    }

    @Override
    public IView next() {
        return userMenuDispatcher.dispatch(console.getInput());
    }
}
