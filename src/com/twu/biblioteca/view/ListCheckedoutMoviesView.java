package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.model.Section;


public class ListCheckedoutMoviesView extends ListCheckedoutItemsView implements IView {


    public ListCheckedoutMoviesView(Console console, Section books) {
        super(console, books);
    }

    @Override
    public String toString() {
        return "List Checkedout Movies View";
    }
}
