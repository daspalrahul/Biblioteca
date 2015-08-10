package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;


public class LoginMenuView implements IView {

    private Menu menu;
    private Console console;

    public LoginMenuView(Menu menu, Console console) {
        this.menu = menu;
        this.console = console;
    }

    @Override
    public void draw() {
        console.printOutput(menu.displayLoginMenu());
    }

    @Override
    public IView next(ViewDispatcher viewDispatcher) {
        return viewDispatcher.loginMenuDispatch(console.getInput());
    }
}
