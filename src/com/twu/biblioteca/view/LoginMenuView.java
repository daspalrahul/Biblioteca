package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;


public class LoginMenuView implements IView {

    private Menu menu;
    private Console console;
    private UserMenuDispatcher userMenuDispatcher;


    public LoginMenuView(Menu menu, Console console, UserMenuDispatcher userMenuDispatcher) {
        this.menu = menu;
        this.console = console;
        this.userMenuDispatcher = userMenuDispatcher;
    }

    @Override
    public void draw() {
        console.printOutput(menu.displayLoginMenu());
    }

    @Override
    public IView next() {
        return userMenuDispatcher.loginMenuDispatch(console.getInput());
    }
}
