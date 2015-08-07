package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;

public class InvalidOptionView implements IView {

    Console console;

    public InvalidOptionView(Console console) {
        this.console = console;
    }

    @Override
    public void draw() {
        console.printOutput("Select a valid option!");
    }

    @Override
    public IView next(IView view) {
        return null;
    }
}
