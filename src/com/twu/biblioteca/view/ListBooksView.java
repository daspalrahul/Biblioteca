package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.model.Section;


public class ListBooksView extends ListItemsView implements IView {


    public ListBooksView(Console console, Section books) {
        super(console, books);
    }

    @Override
    public String toString() {
        return "List Books View";
    }
}
