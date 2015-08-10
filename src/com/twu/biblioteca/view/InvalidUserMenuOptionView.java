package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;


public class InvalidUserMenuOptionView implements IView {

    private Console console;
    private String invalidUserMenuOptionView;

    public InvalidUserMenuOptionView(Console console) {
        this.console = console;
        this.invalidUserMenuOptionView = "Invalid User Menu Option View";
    }

    @Override
    public void draw() {
        console.printOutput("That is not a valid option");
    }

    @Override
    public IView next(ViewDispatcher viewDispatcher) {
        return viewDispatcher.userMenuDispatch(invalidUserMenuOptionView);
    }
}
