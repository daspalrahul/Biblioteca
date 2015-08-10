package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Section;


abstract public class ListCheckedoutItemsView implements IView {

    private Console console;
    private Section books;

    public ListCheckedoutItemsView(Console console, Section books) {
        this.console = console;
        this.books = books;
    }

    @Override
    public void draw() {
        console.printOutput(books.listOfAllCheckedOutLibraryItems());
    }

    @Override
    public IView next(ViewDispatcher viewDispatcher) {
        return viewDispatcher.librarianMenuDispatch(this.toString());
    }

    @Override
    abstract public String toString();
}
