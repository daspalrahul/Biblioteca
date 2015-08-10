package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.model.Section;


public class ListMoviesView extends ListItemsView implements IView {


    public ListMoviesView(Console console, Section books) {
        super(console, books);
    }

    @Override
    public String toString() {
        return "List Movies View";
    }
}
