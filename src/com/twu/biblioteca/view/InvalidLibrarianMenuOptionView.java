package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;

public class InvalidLibrarianMenuOptionView implements IView {

    private Console console;
    private String invalidLibrarianMenuOptionView;

    public InvalidLibrarianMenuOptionView(Console console) {
        this.console = console;
        this.invalidLibrarianMenuOptionView = "Invalid Librarian Menu Option View";
    }

    @Override
    public void draw() {
        console.printOutput("Select a valid option!");
    }

    @Override
    public IView next(ViewDispatcher viewDispatcher) {
        return viewDispatcher.librarianMenuDispatch(invalidLibrarianMenuOptionView);
    }
}
