package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;

public class DisplayWelcomeMessageView implements IView {

    IView loginMenuView;
    Console console;

    public DisplayWelcomeMessageView(IView loginMenuView, Console console) {
        this.loginMenuView = loginMenuView;
        this.console = console;
    }

    @Override
    public void draw() {
        console.printOutput("++++++++++WELCOME++++++++++");
    }

    @Override
    public IView next(IView view) {
        return loginMenuView;
    }
}
