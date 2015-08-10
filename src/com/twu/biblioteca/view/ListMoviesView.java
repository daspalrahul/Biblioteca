package com.twu.biblioteca.view;


import com.twu.biblioteca.Console;
import com.twu.biblioteca.controller.ViewDispatcher;
import com.twu.biblioteca.model.Section;


public class ListMoviesView implements IView {

    private Console console;
    private Section movies;
    private String listMoviesView;

    public ListMoviesView(Console console, Section movies) {
        this.console = console;
        this.movies = movies;
        this.listMoviesView = "List Movies View";
    }

    @Override
    public void draw() {
        console.printOutput(movies.listOfAllAvailableLibraryItems());
    }

    @Override
    public IView next(ViewDispatcher viewDispatcher) {
        return viewDispatcher.userMenuDispatch(listMoviesView);
    }
}
