package com.twu.biblioteca.view;

import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Section;

public class ListCheckedoutBooksView implements IView {

    private Console console;
    private Section books;
    private String listCheckedoutBooksView;

    public ListCheckedoutBooksView(Console console, Section books) {
        this.console = console;
        this.books = books;
        this.listCheckedoutBooksView = "List Checkedout Books View";
    }

    @Override
    public void draw() {
        console.printOutput(books.listOfAllCheckedOutLibraryItems());
    }

    @Override
    public IView next(ViewDispatcher viewDispatcher) {
        return viewDispatcher.librarianMenuDispatch(listCheckedoutBooksView);
    }
}
