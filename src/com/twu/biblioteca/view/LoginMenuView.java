package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;


public class LoginMenuView implements IView {

    private Menu menu;
    private Console console;
    private ViewDispatcher viewDispatcher;


    public LoginMenuView(Menu menu, Console console, ViewDispatcher viewDispatcher) {
        this.menu = menu;
        this.console = console;
        this.viewDispatcher = viewDispatcher;
    }

    @Override
    public void draw() {
        console.printOutput(menu.displayLoginMenu());
    }

    @Override
    public IView next(IView view) {
        return viewDispatcher.convertIntoView(console.getInput());
    }
}
