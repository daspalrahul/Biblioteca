package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.UserMenuDispatcher;
import com.twu.biblioteca.model.Section;


public class ListBooksView implements IView {

    private Console console;
    private Section books;
    private String listBooksView;

    public ListBooksView(Console console, Section books) {
        this.console = console;
        this.books = books;
        this.listBooksView = "List Books View";
    }

    @Override
    public void draw() {
        console.printOutput(books.listOfAllAvailableLibraryItems());
    }

    @Override
    public IView next(UserMenuDispatcher userMenuDispatcher) {
        return userMenuDispatcher.userMenuDispatch(listBooksView);
    }
}
