package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;
import com.twu.biblioteca.model.Section;


public class ListBooksView implements IView {

    private Console console;
    private IView userMenuView;
    private Section books;

    public ListBooksView(Console console, IView userMenuView, Section books) {
        this.console = console;
        this.userMenuView = userMenuView;
        this.books = books;
    }

    @Override
    public void draw() {
        console.printOutput(books.listOfAllAvailableLibraryItems());
    }

    @Override
    public IView next(UserMenuDispatcher userMenuDispatcher) {
        return userMenuView;
    }
}
