package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;

public class UserMenuView implements IView {

    private Menu menu;
    private Console console;
    private LoginView loginView;

    public UserMenuView(Menu menu, Console console, LoginView loginView) {
        this.menu = menu;
        this.console = console;
        this.loginView = loginView;
    }

    @Override
    public void draw() {
        console.printOutput(menu.displayOptionMenuList(loginView.getUser()));
    }

    @Override
    public IView next() {
        return null;
    }
}
