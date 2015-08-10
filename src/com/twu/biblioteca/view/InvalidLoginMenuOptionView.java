package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;

public class InvalidLoginMenuOptionView implements IView {

    private Console console;
    private String invalidLoginMenuOptionView;

    public InvalidLoginMenuOptionView(Console console) {
        this.console = console;
        this.invalidLoginMenuOptionView = "Invalid Login Menu Option View";
    }

    @Override
    public void draw() {
        console.printOutput("Select a valid option!");
    }

    @Override
    public IView next(ViewDispatcher viewDispatcher) {
        return viewDispatcher.loginMenuDispatch(invalidLoginMenuOptionView);
    }
}
