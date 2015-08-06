package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;


public class LoginMenuView implements IView {

    private Menu menu;
    private Console console;
    private IView quitView;
    private IView invalidOptionView;
    private IView loginView;

    public LoginMenuView(Menu menu, Console console, IView quitView, IView invalidOptionView, IView loginView) {
        this.menu = menu;
        this.console = console;
        this.quitView = quitView;
        this.invalidOptionView = invalidOptionView;
        this.loginView = loginView;
    }

    @Override
    public void draw() {
        console.printOutput(menu.displayLoginMenu());
    }

    @Override
    public IView next() {
        return null;
    }
}
