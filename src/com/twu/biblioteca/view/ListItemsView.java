package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Section;


abstract public class ListItemsView implements IView {

    private Console console;
    private Section books;
    protected String itemName;

    public ListItemsView(Console console, Section books) {
        this.console = console;
        this.books = books;
    }

    @Override
    public void draw() {
        console.printOutput(books.listOfAllAvailableLibraryItems());
    }

    @Override
    public IView next(ViewDispatcher viewDispatcher) {
        return viewDispatcher.userMenuDispatch(this.toString());
    }
}
