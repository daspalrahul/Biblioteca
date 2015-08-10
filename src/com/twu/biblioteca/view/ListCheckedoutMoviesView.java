package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Section;


public class ListCheckedoutMoviesView implements IView {

    private Console console;
    private Section movies;
    private String listCheckedoutMoviesView;

    public ListCheckedoutMoviesView(Console console, Section movies) {
        this.console = console;
        this.movies = movies;
        this.listCheckedoutMoviesView = "List Checkedout Movies View";
    }

    @Override
    public void draw() {
        console.printOutput(movies.listOfAllCheckedOutLibraryItems());
    }

    @Override
    public IView next(ViewDispatcher viewDispatcher) {
        return viewDispatcher.librarianMenuDispatch(listCheckedoutMoviesView);
    }
}
