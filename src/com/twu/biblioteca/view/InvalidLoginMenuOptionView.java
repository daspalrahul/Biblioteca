package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;

public class InvalidLoginMenuOptionView implements IView {

    Console console;
    IView loginMenuView;

    public InvalidLoginMenuOptionView(Console console, IView loginMenuView) {
        this.console = console;
        this.loginMenuView = loginMenuView;
    }

    @Override
    public void draw() {
        console.printOutput("Select a valid option!");
    }

    @Override
    public IView next() {
        return loginMenuView;
    }
}
