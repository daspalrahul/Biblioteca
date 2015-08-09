package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;


public class InvalidUserMenuOptionView implements IView {

    private Console console;
    private IView userMenuView;

    public InvalidUserMenuOptionView(Console console, IView userMenuView) {
        this.console = console;
        this.userMenuView = userMenuView;
    }

    @Override
    public void draw() {
        console.printOutput("That is not a valid option");
    }

    @Override
    public IView next(UserMenuDispatcher userMenuDispatcher) {
        return userMenuView;
    }
}
