package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.model.Section;


public class ListCheckedoutBooksView extends ListCheckedoutItemsView implements IView {


    public ListCheckedoutBooksView(Console console, Section books) {
        super(console, books);
    }

    @Override
    public String toString() {
        return "List Checkedout Books View";
    }
}
